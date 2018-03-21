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
    public static final String ASSAY_DENSITY = "ASSAY_DENSITY"; //煤质化验密度
    public static final String ASSAY_FLOW = "ASSAY_FLOW"; //煤质化验流量
    public static final String ASSAY_SAMPLE = "ASSAY_SAMPLE"; //化验设备
    public static final String ASSAY_DATA = "ASSAY_DATA"; //化验数据

    public static final String ASSAY_AAD_AVG = "AAD_AVG"; // 班平均灰分
    public static final String ASSAY_MT_AVG = "MT_AVG"; // 班平均水分
    public static final String ASSAY_STAD_AVG = "STAD_AVG"; // 班平均硫分
    public static final String ASSAY_QNETAR_AVG = "QNETAR_AVG"; // 班平均发热量
    public static final String ASSAY_DENSITY_AVG = "ASSAY_DENSITY_AVG"; //班平均密度
    public static final String ASSAY_FLOW_AVG = "ASSAY_FLOW_AVG"; //班平均流量

    public static final String PRODUCT_INSPECT_POSITIVE1_POINT45 = "POSITIVE1_POINT45";
    public static final String PRODUCT_INSPECT_NEGATIVE1_POINT45 = "NEGATIVE1_POINT45";
    public static final String PRODUCT_INSPECT_POSITIVE1_POINT8 = "POSITIVE1_POINT8";
    public static final String PRODUCT_INSPECT_NEGATIVE1_POINT8 = "NEGATIVE1_POINT8";
    public static final String PRODUCT_INSPECT_ONE_POINT45_TO1_POINT8 = "ONE_POINT45_TO1_POINT8" ;
    public static final String PRODUCT_INSPECT_POSITIVE50MM = "POSITIVE50MM";
    public static final String PRODUCT_INSPECT_NEGATIVE50MM = "NEGATIVE50MM";
    public static final String PRODUCT_INSPECT_DENSITY = "PRODUCT_INSPECT_DENSITY"; //生产检查密度

    public static final String PRODUCT_INSPECT_POSITIVE1_POINT45_AVG = "POSITIVE1_POINT45_AVG";
    public static final String PRODUCT_INSPECT_NEGATIVE1_POINT45_AVG = "NEGATIVE1_POINT45_AVG";
    public static final String PRODUCT_INSPECT_POSITIVE1_POINT8_AVG = "POSITIVE1_POINT8_AVG";
    public static final String PRODUCT_INSPECT_NEGATIVE1_POINT8_AVG = "NEGATIVE1_POINT8_AVG";
    public static final String PRODUCT_INSPECT_ONE_POINT45_TO1_POINT8_AVG = "ONE_POINT45_TO1_POINT8_AVG" ;
    public static final String PRODUCT_INSPECT_POSITIVE50MM_AVG = "POSITIVE50MM_AVG";
    public static final String PRODUCT_INSPECT_NEGATIVE50MM_AVG = "NEGATIVE50MM_AVG";
    public static final String PRODUCT_INSPECT_DENSITY_AVG = "PRODUCT_INSPECT_DENSITY_AVG"; //生产检查密度

    public static final String PRODUCT_INSPECT_SAMPLE = "PRODUCT_INSPECT_SAMPLE"; //生产检查设备
    public static final String PRODUCT_INSPECT_DATA = "PRODUCT_INSPECT_DATA"; //生产检查数据

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

    public static final String COAL_CAP = "COAL_CAP"; //瞬时带煤量
    public static final String CT_C = "CT_C"; //班累计带煤量
    public static final String CT_M = "CT_M"; //月累计带煤量
    public static final String ASH = "ASH"; //在线测灰
    public static final String FL = "FL"; //当前流量

}
