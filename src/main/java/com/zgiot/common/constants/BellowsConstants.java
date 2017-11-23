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

    public static final int YES = 1;
    public static final int NO = 0;

    /**
     * 压力状态监测设备号
     */
    public static final String PRESSURE_THING_CODE = "SYS_SB";

    /**
     * 低压空压机
     */
    public static final String CP_TYPE_LOW = "low";
    /**
     * 高压空压机
     */
    public static final String CP_TYPE_HIGH = "high";

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
     * 管道压力
     */
    public static final String METRIC_PRESSURE = "PRESS_CUR";

    /**
     * 阀门分组
     */
    public static final String VALVE_TEAM = "TEAM";

    /**
     * 阀门智能操作
     */
    public static final String VALVE_INTELLIGENT = "INTELLIGENT";

    /**
     * 阀门需要重新分组
     */
    public static final String VALVE_CHANGED = "V_CHANGED";

    /**
     * 阀门每组最大个数
     */
    public static final String VALVE_MAX_COUNT = "V_MAX";

    /**
     * 阀门鼓风等待时间（分钟）
     */
    public static final String VALVE_WAIT_MINUTE = "V_WAIT_MIN";

    /**
     * 阀门每组鼓风时间（分钟）
     */
    public static final String VALVE_RUN_MINUTE = "V_RUN_MIN";

    /**
     * 泵频率限制
     */
    public static final String VALVE_SPEED_LIMIT = "V_SPEED_LIMIT";


    /**
     * 阀门-块煤系统
     */
    public static final String VALVE_TYPE_LUMP = "块煤系统";

    /**
     * 阀门-末煤主洗系统
     */
    public static final String VALVE_TYPE_MAIN_WASH = "末煤主洗系统";

    /**
     * 阀门-末煤再洗系统
     */
    public static final String VALVE_TYPE_REWASH = "末煤再洗系统";

    /**
     * 阀门分组-块煤
     */
    public static final String VALVE_TEAM_LUMP = "LUMP";
    /**
     * 阀门分组-末煤
     */
    public static final String VALVE_TEAM_SLACK = "SLACK";

    /**
     * 阀门分组状态-等待
     */
    public static final String VALVE_STATUS_WAIT = "WAIT";
    /**
     * 阀门分组状态-运行中
     */
    public static final String VALVE_STATUS_RUNNING = "RUNNING";
    /**
     * 阀门分组状态-已执行
     */
    public static final String VALVE_STATUS_EXECUTED = "EXECUTED";

    /**
     * 智能鼓风阶段-不需要鼓风
     */
    public static final String BLOW_STAGE_NONE = "none";

    /**
     * 智能鼓风阶段-等待阶段
     */
    public static final String BLOW_STAGE_WAIT = "wait";

    /**
     * 智能鼓风阶段-鼓风阶段
     */
    public static final String BLOW_STAGE_RUN = "run";
}
