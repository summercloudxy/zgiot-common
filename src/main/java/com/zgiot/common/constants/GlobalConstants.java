package com.zgiot.common.constants;

public class GlobalConstants {
    public static final String API_VERSION = "/V_1.0";
    public static final int INVALID_VALUE_INT = -1;
    public static final String REQUEST_ID_HEADER_KEY = "X-Request-Id";

    public static final short STATE_STOPPED = 1;//设备状态-待机
    public static final short STATE_RUNNING = 2;//设备状态-运行
    public static final short STATE_FAULT = 4;//设备状态-故障
    public static final short STATE_REVERSING = 8;//设备状态-反转
}

