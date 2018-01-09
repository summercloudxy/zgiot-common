package com.zgiot.common.constants;

public class MetricCodes {

    public static final String CURRENT_0 = "CR0";
    public static final String CURRENT_1 = "CR1";
    public static final String CURRENT_2 = "CR2";
    public static final String LOCAL_BUTTON = "LR0"; // 集控就地按钮

    // 化验相关
    public static final String ASSAY_AAD = "AAD"; // 灰分
    public static final String ASSAY_MT = "MT"; // 水分
    public static final String ASSAY_STAD = "STAD"; // 硫分
    public static final String ASSAY_QNETAR = "QNETAR"; // 发热量

    public static final String STATE = "STATE"; // 设备状态
    public static final String RESET = "FRESET"; // 故障复位
    public static final String ALERT_CONFIRM = "ACK"; // 报警确认
    public static final String WARNING = "WARNING"; // 报警

    public static final String CURRENT_DENSITY = "MD"; // 当前密度
    public static final String SETTED_DENSITY = "MD_SET"; // 设定密度
    public static final String FLUCTUANT_DENSITY = "DENSITY_FLU"; // 密度波动值

    public static final String CURRENT_LEVEL_M = "LEVEL"; // 当前液位（m）
    public static final String SETTED_HIGH_LEVEL = "LE_H_SET"; // 设定高液位
    public static final String SETTED_LOW_LEVEL = "LE_L_SET"; // 设定低液位
    public static final String PRE_STOP_SETTED_HIGH_LEVEL = "PRE_STOP_DENSITY_HIGH_SET"; // 停车前设定高液位
    public static final String PROPORTIONAL_VALVE_OPENING = "PRE_READ"; // 比例阀开度
    public static final String PROPORTIONAL_SETTED_HIGH_VALVE_OPENING = "VALVE_HIGH_SET"; // 高开度设定
    public static final String PROPORTIONAL_SETTED_LOW_VALVE_OPENING = "VALVE_LOW_SET"; // 低开度设定
    public static final String PRE_STOP_PROPORTIONAL_SETTED_LOW_VALVE_OPENING = "PRE_STOP_VALVE_SET"; // 停车前开度设定

    public static final String INTELLIGENT_CONTROL = "I_CONTROL"; // 智能控制
    public static final String MODE_CHOOSE = "MODE_CHOOSE"; // 模式选择 ： 停车前、正常

    public static final String DENSITY_CONTROL_NOTIFY_ADD_MEDIUM = "DENSITY_CONTROL_ADDMEDIUM"; //提示加介
    public static final String DENSITY_CONTROL_NOTIFY_HIGH_DENSTIY_ALERT = "DENSITY_CONTROL_ALERT"; //提示高密度高液位报警
    public static final String DENSTIY_CONTROL_NOTIFY_BACK_FLOW = "DENSTIY_CONTROL_BACKFLOW"; //提示回流

}
