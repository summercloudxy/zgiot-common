package com.zgiot.common.constants;

public class GlobalConstants {
    public static final String API_VERSION = "/v1";
    public static final String API = "/api";
    public static final int INVALID_VALUE_INT = -1;
    public static final String REQUEST_ID_HEADER_KEY = "X-Request-Id";
    public static final String REQUEST_MOCK_EXP = "X-Mock-Expect";

    public static final short STATE_STOPPED = 1;//设备状态-待机
    public static final short STATE_RUNNING = 2;//设备状态-运行
    public static final short STATE_FAULT = 4;//设备状态-故障
    public static final short STATE_REVERSING = 8;//设备状态-反转
    public static final String SYSTEM_TWO = "二期";
    public static final short STATE_BREAK = 20;//设备状态-断电
    public static final String SYSTEM_ONE = "一期";
    //系统后缀
    public static final String SYSTEM_01 = "01";
    public static final String SYSTEM_02 = "02";

    // 用户信息
    public static final String USER_ID = "userId";
    public static final String USER_UUID = "userUuid";
    public static final String USER_LOGINNAME = "userLoginName";
    public static final String PLATFORM_CLIENT_ID = "platformClientId";


}

