package com.zgiot.common.constants;

/**
 * @author wangwei
 */
public class BellowsConstants {
    /**
     * 系统常量
     */
    public static final String SYS = "sys";

    /**
     * 自动操作
     */
    public static final String TYPE_AUTO = "AUTO";
    /**
     * 手动操作
     */
    public static final String TYPE_MANUAL = "MANUAL";


    public static final String TRUE = "true";

    public static final String FALSE = "false";



    /**
     * 低压空压机压力正常
     */
    public static final double PRESSURE_NORMAL = 1.0;
    /**
     * 低压空压机压力过高
     */
    public static final double PRESSURE_HIGH = 2.0;
    /**
     * 低压空压机压力过低
     */
    public static final double PRESSURE_LOW = 0.0;

    /**
     * 低压空压机智能模式
     */
    public static final String CP_INTELLIGENT = "CP_INTELLIGENT";



    /**
     * 低压空压机压力状态
     */
    public static final String METRIC_PRESSURE_STATE = "CP_V";

    /**
     * 空压机压力
     */
    public static final String METRIC_PRESSURE = "PRESS_CUR";
}
