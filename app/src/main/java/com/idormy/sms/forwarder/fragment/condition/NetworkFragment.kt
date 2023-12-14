package com.idormy.sms.forwarder.fragment.condition

import android.annotation.SuppressLint
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.idormy.sms.forwarder.R
import com.idormy.sms.forwarder.core.BaseFragment
import com.idormy.sms.forwarder.databinding.FragmentTasksConditionNetworkBinding
import com.idormy.sms.forwarder.entity.task.NetworkSetting
import com.idormy.sms.forwarder.utils.KEY_BACK_DATA_CONDITION
import com.idormy.sms.forwarder.utils.KEY_BACK_DESCRIPTION_CONDITION
import com.idormy.sms.forwarder.utils.KEY_EVENT_DATA_CONDITION
import com.idormy.sms.forwarder.utils.KEY_TEST_CONDITION
import com.idormy.sms.forwarder.utils.TASK_CONDITION_NETWORK
import com.idormy.sms.forwarder.utils.XToastUtils
import com.jeremyliao.liveeventbus.LiveEventBus
import com.xuexiang.xaop.annotation.SingleClick
import com.xuexiang.xpage.annotation.Page
import com.xuexiang.xrouter.annotation.AutoWired
import com.xuexiang.xrouter.launcher.XRouter
import com.xuexiang.xui.utils.CountDownButtonHelper
import com.xuexiang.xui.widget.actionbar.TitleBar

@Page(name = "Network")
@Suppress("PrivatePropertyName")
class NetworkFragment : BaseFragment<FragmentTasksConditionNetworkBinding?>(), View.OnClickListener {

    private val TAG: String = NetworkFragment::class.java.simpleName
    var titleBar: TitleBar? = null
    private var mCountDownHelper: CountDownButtonHelper? = null

    @JvmField
    @AutoWired(name = KEY_EVENT_DATA_CONDITION)
    var eventData: String? = null

    override fun initArgs() {
        XRouter.getInstance().inject(this)
    }

    override fun viewBindingInflate(
        inflater: LayoutInflater,
        container: ViewGroup,
    ): FragmentTasksConditionNetworkBinding {
        return FragmentTasksConditionNetworkBinding.inflate(inflater, container, false)
    }

    override fun initTitle(): TitleBar? {
        titleBar = super.initTitle()!!.setImmersive(false).setTitle(R.string.task_network)
        return titleBar
    }

    /**
     * 初始化控件
     */
    override fun initViews() {
        //测试按钮增加倒计时，避免重复点击
        mCountDownHelper = CountDownButtonHelper(binding!!.btnTest, 3)
        mCountDownHelper!!.setOnCountDownListener(object : CountDownButtonHelper.OnCountDownListener {
            override fun onCountDown(time: Int) {
                binding!!.btnTest.text = String.format(getString(R.string.seconds_n), time)
            }

            override fun onFinished() {
                binding!!.btnTest.text = getString(R.string.test)
            }
        })

        binding!!.rgNetworkState.setOnCheckedChangeListener { _, checkedId ->
            Log.d(TAG, "rgNetworkState checkedId:$checkedId")
            binding!!.layoutDataSimSlot.visibility = if (checkedId == R.id.rb_net_mobile) View.VISIBLE else View.GONE
            binding!!.layoutWifiSsid.visibility = if (checkedId == R.id.rb_net_wifi) View.VISIBLE else View.GONE
        }

        Log.d(TAG, "initViews eventData:$eventData")
        if (eventData != null) {
            val settingVo = Gson().fromJson(eventData, NetworkSetting::class.java)
            Log.d(TAG, "initViews settingVo:$settingVo")
            binding!!.rgNetworkState.check(settingVo.getNetworkStateCheckId())
            binding!!.rgDataSimSlot.check(settingVo.getDataSimSlotCheckId())
            binding!!.etWifiSsid.setText(settingVo.wifiSsid)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun initListeners() {
        binding!!.btnTest.setOnClickListener(this)
        binding!!.btnDel.setOnClickListener(this)
        binding!!.btnSave.setOnClickListener(this)
        LiveEventBus.get(KEY_TEST_CONDITION, String::class.java).observe(this) {
            mCountDownHelper?.finish()

            if (it == "success") {
                XToastUtils.success("测试通过", 30000)
            } else {
                XToastUtils.error(it, 30000)
            }
        }
    }

    @SingleClick
    override fun onClick(v: View) {
        try {
            when (v.id) {
                R.id.btn_test -> {
                    mCountDownHelper?.start()
                    Thread {
                        try {
                            val settingVo = checkSetting()
                            Log.d(TAG, settingVo.toString())
                            LiveEventBus.get(KEY_TEST_CONDITION, String::class.java).post("success")
                        } catch (e: Exception) {
                            LiveEventBus.get(KEY_TEST_CONDITION, String::class.java).post(e.message.toString())
                            e.printStackTrace()
                        }
                    }.start()
                    return
                }

                R.id.btn_del -> {
                    popToBack()
                    return
                }

                R.id.btn_save -> {
                    val settingVo = checkSetting()
                    val intent = Intent()
                    intent.putExtra(KEY_BACK_DESCRIPTION_CONDITION, settingVo.description)
                    intent.putExtra(KEY_BACK_DATA_CONDITION, Gson().toJson(settingVo))
                    setFragmentResult(TASK_CONDITION_NETWORK, intent)
                    popToBack()
                    return
                }
            }
        } catch (e: Exception) {
            XToastUtils.error(e.message.toString(), 30000)
            e.printStackTrace()
        }
    }

    //检查设置
    private fun checkSetting(): NetworkSetting {
        val networkStateCheckId = binding!!.rgNetworkState.checkedRadioButtonId
        val dataSimSlotCheckId = binding!!.rgDataSimSlot.checkedRadioButtonId
        val wifiSsid = binding!!.etWifiSsid.text.toString().trim()
        return NetworkSetting(networkStateCheckId, dataSimSlotCheckId, wifiSsid)
    }
}