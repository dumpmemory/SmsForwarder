@file:Suppress("unused", "DEPRECATION")

package com.idormy.sms.forwarder.utils

import com.idormy.sms.forwarder.R
import com.xuexiang.xpage.enums.CoreAnim
import com.xuexiang.xpage.model.PageInfo
import com.xuexiang.xui.utils.ResUtils.getString

object Worker {
    const val sendMsgInfo = "send_msg_info"
    const val sendLogId = "send_log_id"
    const val sendSbnId = "send_sbn_id"
    const val updateLogs = "update_logs"
    const val ruleId = "rule_id"
    const val rule = "rule"
    const val senderIndex = "sender_index"
    const val msgId = "msg_id"
}

object TaskWorker {
    const val taskId = "task_id"
    const val task = "task"
    const val taskActions = "task_actions"
    const val conditionType = "condition_type"
    const val msgInfo = "msg_info"
}

//初始化相关
const val IS_FIRST_OPEN_KEY = "is_first_open_key"
const val IS_AGREE_PRIVACY_KEY = "is_agree_privacy_key"

//数据库
const val DATABASE_NAME = "sms_forwarder.db"
const val PACKAGE_NAME = "com.idormy.sms.forwarder"

//通用设置
const val SP_ENABLE_SMS = "enable_sms"

const val SP_ENABLE_PHONE = "enable_phone"
const val SP_ENABLE_CALL_TYPE_1 = "enable_call_type_1"
const val SP_ENABLE_CALL_TYPE_2 = "enable_call_type_2"
const val SP_ENABLE_CALL_TYPE_3 = "enable_call_type_3"
const val SP_ENABLE_CALL_TYPE_4 = "enable_call_type_4"
const val SP_ENABLE_CALL_TYPE_5 = "enable_call_type_5"
const val SP_ENABLE_CALL_TYPE_6 = "enable_call_type_6"

const val SP_ENABLE_APP_NOTIFY = "enable_app_notify"
const val SP_ENABLE_CANCEL_APP_NOTIFY = "enable_cancel_app_notify"
const val SP_CANCEL_EXTRA_APP_NOTIFY = "cancel_extra_app_notify_list"
const val SP_ENABLE_NOT_USER_PRESENT = "enable_not_user_present"

const val SP_ENABLE_SMS_COMMAND = "enable_sms_command"
const val SP_SMS_COMMAND_SAFE_PHONE = "sms_command_safe_phone"

const val ENABLE_LOAD_APP_LIST = "enable_load_app_list"
const val ENABLE_LOAD_USER_APP_LIST = "enable_load_user_app_list"
const val ENABLE_LOAD_SYSTEM_APP_LIST = "enable_load_system_app_list"

const val SP_DUPLICATE_MESSAGES_LIMITS = "duplicate_messages_limits"
const val SP_SILENT_PERIOD_START = "silent_period_start"
const val SP_SILENT_PERIOD_END = "silent_period_end"
const val SP_AUTO_CLEAN_LOGS_DAYS = "auto_clean_logs_days"

const val SP_ENABLE_EXCLUDE_FROM_RECENTS = "enable_exclude_from_recents"
const val SP_ENABLE_PLAY_SILENCE_MUSIC = "enable_play_silence_music"
const val SP_ENABLE_ONE_PIXEL_ACTIVITY = "enable_one_pixel_activity"

const val SP_REQUEST_RETRY_TIMES = "request_retry_times"
const val SP_REQUEST_DELAY_TIME = "request_delay_time"
const val SP_REQUEST_TIMEOUT = "request_timeout"

const val SP_NOTIFY_CONTENT = "notify_content"
const val SP_EXTRA_DEVICE_MARK = "extra_device_mark"
const val SP_SUBID_SIM1 = "subid_sim1"
const val SP_SUBID_SIM2 = "subid_sim2"
const val SP_EXTRA_SIM1 = "extra_sim1"
const val SP_EXTRA_SIM2 = "extra_sim2"
const val SP_SIM_STATE_RECEIVER = "enable_sim_state_receiver"
const val SP_ENABLE_SMS_TEMPLATE = "enable_sms_template"
const val SP_SMS_TEMPLATE = "sms_template"

const val SP_ENABLE_HELP_TIP = "enable_help_tip"
const val SP_PURE_CLIENT_MODE = "enable_pure_client_mode"
const val SP_PURE_TASK_MODE = "enable_pure_task_mode"
const val SP_LOCATION_TAG = "enable_location_tag"

const val SP_ENABLE_CACTUS = "enable_cactus"
const val CACTUS_TIMER = "cactus_timer"
const val CACTUS_LAST_TIMER = "cactus_last_timer"
const val CACTUS_DATE = "cactus_date"
const val CACTUS_END_DATE = "cactus_end_date"

//OkHttp 请求超时时间
const val REQUEST_TIMEOUT_SECONDS = 5

//规则相关
const val STATUS_ON = 1
const val STATUS_OFF = 0
const val FILED_TRANSPOND_ALL = "transpond_all"
const val FILED_PHONE_NUM = "phone_num"
const val FILED_CALL_TYPE = "call_type"
const val FILED_PACKAGE_NAME = "package_name"
const val FILED_UID = "uid"
const val FILED_MSG_CONTENT = "msg_content"
const val FILED_INFORM_CONTENT = "inform_content"
const val FILED_MULTI_MATCH = "multi_match"
const val CHECK_IS = "is"
const val CHECK_CONTAIN = "contain"
const val CHECK_NOT_CONTAIN = "notcontain"
const val CHECK_START_WITH = "startwith"
const val CHECK_END_WITH = "endwith"
const val CHECK_NOT_IS = "notis"
const val CHECK_REGEX = "regex"
const val CHECK_SIM_SLOT_ALL = "ALL"
const val CHECK_SIM_SLOT_1 = "SIM1"
const val CHECK_SIM_SLOT_2 = "SIM2"

//发送通道执行逻辑：ALL=全部执行, UntilFail=失败即终止, UntilSuccess=成功即终止
const val SENDER_LOGIC_ALL = "ALL"
const val SENDER_LOGIC_UNTIL_FAIL = "UntilFail"
const val SENDER_LOGIC_UNTIL_SUCCESS = "UntilSuccess"
const val SENDER_LOGIC_RETRY = "Retry"
val TYPE_MAP = object : HashMap<String, String>() {
    init {
        put("sms", getString(R.string.rule_sms))
        put("call", getString(R.string.rule_call))
        put("app", getString(R.string.rule_app))
    }
}
val FILED_MAP = object : HashMap<String, String>() {
    init {
        put("transpond_all", getString(R.string.rule_transpond_all))
        put("phone_num", getString(R.string.rule_phone_num))
        put("msg_content", getString(R.string.rule_msg_content))
        put("multi_match", getString(R.string.rule_multi_match))
        put("package_name", getString(R.string.rule_package_name))
        put("inform_content", getString(R.string.rule_inform_content))
        put("call_type", getString(R.string.rule_call_type))
        put("uid", getString(R.string.rule_uid))
    }
}
val CHECK_MAP = object : HashMap<String, String>() {
    init {
        put("is", getString(R.string.rule_is))
        put("notis", getString(R.string.rule_notis))
        put("contain", getString(R.string.rule_contain))
        put("startwith", getString(R.string.rule_startwith))
        put("endwith", getString(R.string.rule_endwith))
        put("notcontain", getString(R.string.rule_notcontain))
        put("regex", getString(R.string.rule_regex))
    }
}
val SIM_SLOT_MAP = object : HashMap<String, String>() {
    init {
        put("ALL", getString(R.string.rule_all))
        put("SIM1", "SIM1")
        put("SIM2", "SIM2")
    }
}
val FORWARD_STATUS_MAP = object : HashMap<Int, String>() {
    init {
        put(0, getString(R.string.failed))
        put(1, getString(R.string.processing))
        put(2, getString(R.string.success))
    }
}
val BARK_LEVEL_MAP = mapOf(
    "active" to getString(R.string.bark_level_active),
    "timeSensitive" to getString(R.string.bark_level_timeSensitive),
    "passive" to getString(R.string.bark_level_passive)
)
val BARK_ENCRYPTION_ALGORITHM_MAP = mapOf(
    "none" to getString(R.string.bark_encryption_algorithm_none),
    "AES128/CBC/PKCS7Padding" to "AES128/CBC/PKCS7Padding",
    "AES128/ECB/PKCS7Padding" to "AES128/ECB/PKCS7Padding",
    "AES192/CBC/PKCS7Padding" to "AES192/CBC/PKCS7Padding",
    "AES192/ECB/PKCS7Padding" to "AES192/ECB/PKCS7Padding",
    "AES256/CBC/PKCS7Padding" to "AES256/CBC/PKCS7Padding",
    "AES256/ECB/PKCS7Padding" to "AES256/ECB/PKCS7Padding",
)

//通话类型：1.来电挂机 2.去电挂机 3.未接来电 4.来电提醒 5.来电接通 6.去电拨出
val CALL_TYPE_MAP = mapOf(
    //"0" to getString(R.string.unknown_call),
    "1" to getString(R.string.incoming_call_ended),
    "2" to getString(R.string.outgoing_call_ended),
    "3" to getString(R.string.missed_call),
    "4" to getString(R.string.incoming_call_received),
    "5" to getString(R.string.incoming_call_answered),
    "6" to getString(R.string.outgoing_call_started),
)

//发送通道
const val TYPE_DINGTALK_GROUP_ROBOT = 0
const val TYPE_EMAIL = 1
const val TYPE_BARK = 2
const val TYPE_WEBHOOK = 3
const val TYPE_WEWORK_ROBOT = 4
const val TYPE_WEWORK_AGENT = 5
const val TYPE_SERVERCHAN = 6
const val TYPE_TELEGRAM = 7
const val TYPE_SMS = 8
const val TYPE_FEISHU = 9
const val TYPE_PUSHPLUS = 10
const val TYPE_GOTIFY = 11
const val TYPE_DINGTALK_INNER_ROBOT = 12
const val TYPE_FEISHU_APP = 13
const val TYPE_URL_SCHEME = 14
const val TYPE_SOCKET = 15
var SENDER_FRAGMENT_LIST = listOf(
    PageInfo(
        getString(R.string.dingtalk_robot),
        "com.idormy.sms.forwarder.fragment.senders.DingtalkGroupRobotFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_dingtalk
    ),
    PageInfo(
        getString(R.string.email),
        "com.idormy.sms.forwarder.fragment.senders.EmailFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_email
    ),
    PageInfo(
        getString(R.string.bark),
        "com.idormy.sms.forwarder.fragment.senders.BarkFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_bark
    ),
    PageInfo(
        getString(R.string.webhook),
        "com.idormy.sms.forwarder.fragment.senders.WebhookFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_webhook
    ),
    PageInfo(
        getString(R.string.wework_robot),
        "com.idormy.sms.forwarder.fragment.senders.WeworkRobotFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_wework_robot
    ),
    PageInfo(
        getString(R.string.wework_agent),
        "com.idormy.sms.forwarder.fragment.senders.WeworkAgentFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_wework_agent
    ),
    PageInfo(
        getString(R.string.server_chan),
        "com.idormy.sms.forwarder.fragment.senders.ServerchanFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_serverchan
    ),
    PageInfo(
        getString(R.string.telegram),
        "com.idormy.sms.forwarder.fragment.senders.TelegramFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_telegram
    ),
    PageInfo(
        getString(R.string.sms_menu),
        "com.idormy.sms.forwarder.fragment.senders.SmsFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_sms
    ),
    PageInfo(
        getString(R.string.feishu),
        "com.idormy.sms.forwarder.fragment.senders.FeishuFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_feishu
    ),
    PageInfo(
        getString(R.string.pushplus),
        "com.idormy.sms.forwarder.fragment.senders.PushplusFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_pushplus
    ),
    PageInfo(
        getString(R.string.gotify),
        "com.idormy.sms.forwarder.fragment.senders.GotifyFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_gotify
    ),
    PageInfo(
        getString(R.string.dingtalk_inner_robot),
        "com.idormy.sms.forwarder.fragment.senders.DingtalkInnerRobotFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_dingtalk_inner
    ),
    PageInfo(
        getString(R.string.feishu_app),
        "com.idormy.sms.forwarder.fragment.senders.FeishuAppFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_feishu_app
    ),
    PageInfo(
        getString(R.string.url_scheme),
        "com.idormy.sms.forwarder.fragment.senders.UrlSchemeFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_url_scheme
    ),
    PageInfo(
        getString(R.string.socket),
        "com.idormy.sms.forwarder.fragment.senders.SocketFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_socket
    ),
)

//前台服务
const val FRONT_NOTIFY_ID = 0x1010
const val NOTIFICATION_ID = 101
const val FRONT_CHANNEL_ID = "com.idormy.sms.forwarder"
const val FRONT_CHANNEL_NAME = "SmsForwarder Foreground Service"

//Frp内网穿透
const val FRPC_LIB_DOWNLOAD_URL = "https://xupdate.ppps.cn/uploads/%s/%s/libgojni.so"
const val FRPC_LIB_VERSION = "0.47.0"
const val EVENT_FRPC_UPDATE_CONFIG = "EVENT_FRPC_UPDATE_CONFIG"
const val EVENT_FRPC_DELETE_CONFIG = "EVENT_FRPC_DELETE_CONFIG"
const val EVENT_FRPC_RUNNING_ERROR = "EVENT_FRPC_RUNNING_ERROR"
const val EVENT_FRPC_RUNNING_SUCCESS = "EVENT_FRPC_RUNNING_SUCCESS"
const val INTENT_FRPC_EDIT_FILE = "INTENT_FRPC_EDIT_FILE"
const val INTENT_FRPC_APPLY_FILE = "INTENT_FRPC_APPLY_FILE"

//来电监听
const val ACTION_CALL_IN = "android.intent.action.PHONE_STATE"
const val ACTION_CALL_OUT = "android.intent.action.NEW_OUTGOING_CALL"
const val EXTRA_PHONE_NUMBER = "android.intent.extra.PHONE_NUMBER"

//Markdown 查看页面
const val KEY_TITLE = "key_title"
const val KEY_URL = "key_url"

//吐司监听
const val EVENT_TOAST_SUCCESS = "key_toast_success"
const val EVENT_TOAST_ERROR = "key_toast_error"

//主页监听时间
const val EVENT_UPDATE_LOGS_TYPE = "key_logs_type"
const val EVENT_UPDATE_RULE_TYPE = "key_rules_type"
const val EVENT_UPDATE_TASK_TYPE = "key_tasks_type"

const val KEY_SENDER_ID = "key_sender_id"
const val KEY_SENDER_TYPE = "key_sender_type"
const val KEY_SENDER_CLONE = "key_sender_clone"
const val KEY_SENDER_TEST = "key_sender_test"

const val KEY_RULE_ID = "key_rule_id"
const val KEY_RULE_TYPE = "key_rule_type"
const val KEY_RULE_CLONE = "key_rule_clone"

const val KEY_TASK_ID = "key_task_id"
const val KEY_TASK_TYPE = "key_task_type"
const val KEY_TASK_CLONE = "key_task_clone"

const val EVENT_LOAD_APP_LIST = "EVENT_LOAD_APP_LIST"

const val EVENT_KEY_SIM_SLOT = "EVENT_KEY_SIM_SLOT"
const val EVENT_KEY_PHONE_NUMBERS = "EVENT_KEY_PHONE_NUMBERS"

//在线升级URL
const val KEY_UPDATE_URL = "https://xupdate.ppps.cn/update/checkVersion"

//HttpServer相关
const val ENABLE_HTTP_SERVER = "enable_http_server"
const val HTTP_SERVER_PORT = 5000
const val HTTP_SERVER_TIME_OUT = 10
const val HTTP_SERVER_NOTIFY_ID = 0x1011
const val HTTP_SERVER_CHANNEL_ID = "http_server_notification_channel"
const val HTTP_SERVER_CHANNEL_NAME = "Http-Server Service"
const val START_ACTION = "start"
const val STOP_ACTION = "stop"
const val HTTP_SUCCESS_CODE: Int = 200
const val HTTP_FAILURE_CODE: Int = 500
const val SP_ENABLE_SERVER = "enable_server"
const val SP_ENABLE_SERVER_AUTORUN = "enable_server_autorun"
const val SP_SERVER_SAFETY_MEASURES = "server_safety_measures"
const val SP_SERVER_SIGN_KEY = "server_sign_key"
const val SP_SERVER_TIME_TOLERANCE = "server_time_tolerance"
const val SP_SERVER_SM4_KEY = "server_sm4_key"
const val SP_SERVER_PUBLIC_KEY = "server_public_key"
const val SP_SERVER_PRIVATE_KEY = "server_private_key"
const val SP_SERVER_WEB_PATH = "server_web_path"
const val SP_ENABLE_API_CLONE = "enable_api_clone"
const val SP_ENABLE_API_SMS_SEND = "enable_api_sms_send"
const val SP_ENABLE_API_SMS_QUERY = "enable_api_sms_query"
const val SP_ENABLE_API_CALL_QUERY = "enable_api_call_query"
const val SP_ENABLE_API_CONTACT_QUERY = "enable_api_contact_query"
const val SP_ENABLE_API_CONTACT_ADD = "enable_api_contact_add"
const val SP_ENABLE_API_BATTERY_QUERY = "enable_api_battery_query"
const val SP_ENABLE_API_WOL = "enable_api_wol"
const val SP_ENABLE_API_LOCATION = "enable_api_location"
const val SP_API_LOCATION_CACHE = "api_location_cache"
const val SP_WOL_HISTORY = "wol_history"
const val SP_SERVER_ADDRESS = "server_address"
const val SP_SERVER_HISTORY = "server_history"
const val SP_SERVER_CONFIG = "server_config"
const val SP_CLIENT_SAFETY_MEASURES = "client_safety_measures"
const val SP_CLIENT_SIGN_KEY = "client_sign_key"

var CLIENT_FRAGMENT_LIST = listOf(
    PageInfo(
        getString(R.string.api_clone),
        "com.idormy.sms.forwarder.fragment.client.CloneFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_api_clone
    ),
    PageInfo(
        getString(R.string.api_sms_query),
        "com.idormy.sms.forwarder.fragment.client.SmsQueryFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_api_sms_query
    ),
    PageInfo(
        getString(R.string.api_sms_send),
        "com.idormy.sms.forwarder.fragment.client.SmsSendFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_api_sms_send
    ),
    PageInfo(
        getString(R.string.api_call_query),
        "com.idormy.sms.forwarder.fragment.client.CallQueryFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_api_call_query
    ),
    PageInfo(
        getString(R.string.api_contact_query),
        "com.idormy.sms.forwarder.fragment.client.ContactQueryFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_api_contact_query
    ),
    PageInfo(
        getString(R.string.api_contact_add),
        "com.idormy.sms.forwarder.fragment.client.ContactAddFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_api_contact_add
    ),
    PageInfo(
        getString(R.string.api_wol),
        "com.idormy.sms.forwarder.fragment.client.WolSendFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_api_wol
    ),
    PageInfo(
        getString(R.string.api_location),
        "com.idormy.sms.forwarder.fragment.client.LocationFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_api_location
    ),
    PageInfo(
        getString(R.string.api_battery_query),
        "com.idormy.sms.forwarder.fragment.client.BatteryQueryFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.icon_api_battery_query
    ),
)

//自动任务
const val MAX_SETTING_NUM = 5 //最大条件/动作设置条数
const val KEY_TEST_CONDITION = "key_test_condition"
const val KEY_EVENT_DATA_CONDITION = "event_data_condition"
const val KEY_BACK_CODE_CONDITION = 1000
const val KEY_BACK_DATA_CONDITION = "back_data_condition"
const val KEY_BACK_DESCRIPTION_CONDITION = "back_description_condition"

const val KEY_TEST_ACTION = "key_test_action"
const val KEY_EVENT_DATA_ACTION = "event_data_action"
const val KEY_BACK_CODE_ACTION = 2000
const val KEY_BACK_DATA_ACTION = "back_data_action"
const val KEY_BACK_DESCRIPTION_ACTION = "back_description_action"

//注意：TASK_CONDITION_XXX 枚举值 等于 TASK_CONDITION_FRAGMENT_LIST 索引加上 KEY_BACK_CODE_CONDITION，不可改变
const val TASK_CONDITION_CRON = 1000
const val TASK_CONDITION_BATTERY = 1001
const val TASK_CONDITION_CHARGE = 1002
const val TASK_CONDITION_NETWORK = 1003
const val TASK_CONDITION_SIM = 1004
var TASK_CONDITION_FRAGMENT_LIST = listOf(
    PageInfo(
        getString(R.string.task_cron),
        "com.idormy.sms.forwarder.fragment.condition.CronFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.auto_task_icon_custom_time,
    ),
    PageInfo(
        getString(R.string.task_battery),
        "com.idormy.sms.forwarder.fragment.condition.BatteryFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.auto_task_icon_battery
    ),
    PageInfo(
        getString(R.string.task_charge),
        "com.idormy.sms.forwarder.fragment.condition.ChargeFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.auto_task_icon_charge
    ),
    PageInfo(
        getString(R.string.task_network),
        "com.idormy.sms.forwarder.fragment.condition.NetworkFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.auto_task_icon_network
    ),
    PageInfo(
        getString(R.string.task_sim),
        "com.idormy.sms.forwarder.fragment.condition.SimFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.auto_task_icon_sim
    ),
)

//注意：TASK_ACTION_XXX 枚举值 等于 TASK_ACTION_FRAGMENT_LIST 索引加上 KEY_BACK_CODE_ACTION，不可改变
const val TASK_ACTION_SENDSMS = 2000
const val TASK_ACTION_NOTIFICATION = 2001
const val TASK_ACTION_FRPC = 2002
const val TASK_ACTION_HTTPSERVER = 2003
var TASK_ACTION_FRAGMENT_LIST = listOf(
    PageInfo(
        getString(R.string.task_sendsms),
        "com.idormy.sms.forwarder.fragment.action.SendSmsFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.auto_task_icon_sms
    ),
    PageInfo(
        getString(R.string.task_notification),
        "com.idormy.sms.forwarder.fragment.action.NotificationFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.auto_task_icon_sender,
    ),
    PageInfo(
        getString(R.string.task_frpc),
        "com.idormy.sms.forwarder.fragment.action.FrpcFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.auto_task_icon_frpc
    ),
    PageInfo(
        getString(R.string.task_server),
        "com.idormy.sms.forwarder.fragment.action.HttpServerFragment",
        "{\"\":\"\"}",
        CoreAnim.slide,
        R.drawable.auto_task_icon_http_server
    ),
)

const val SP_BATTERY_INFO = "battery_info"
const val SP_BATTERY_STATUS = "battery_status"
const val SP_BATTERY_LEVEL = "battery_level"
const val SP_BATTERY_PCT = "battery_pct"
const val SP_BATTERY_PLUGGED = "battery_plugged"

const val SP_NETWORK_STATE = "network_state"
const val SP_DATA_SIM_SLOT = "data_sim_slot"
const val SP_WIFI_SSID = "wifi_ssid"
const val SP_IPV4 = "ipv4"
const val SP_IPV6 = "ipv6"