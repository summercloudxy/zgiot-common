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
    public static final String PRODUCT_INSPECT_ONE_POINT45_TO1_POINT8 = "ONE_POINT45_TO1_POINT8";
    public static final String PRODUCT_INSPECT_POSITIVE50MM = "POSITIVE50MM";
    public static final String PRODUCT_INSPECT_NEGATIVE50MM = "NEGATIVE50MM";
    public static final String PRODUCT_INSPECT_DENSITY = "PRODUCT_INSPECT_DENSITY"; //生产检查密度

    public static final String PRODUCT_INSPECT_POSITIVE1_POINT45_AVG = "POSITIVE1_POINT45_AVG";
    public static final String PRODUCT_INSPECT_NEGATIVE1_POINT45_AVG = "NEGATIVE1_POINT45_AVG";
    public static final String PRODUCT_INSPECT_POSITIVE1_POINT8_AVG = "POSITIVE1_POINT8_AVG";
    public static final String PRODUCT_INSPECT_NEGATIVE1_POINT8_AVG = "NEGATIVE1_POINT8_AVG";
    public static final String PRODUCT_INSPECT_ONE_POINT45_TO1_POINT8_AVG = "ONE_POINT45_TO1_POINT8_AVG";
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
    public static final String CT_D = "CT_D"; //日累计带煤量
    public static final String CT_M = "CT_M"; //月累计带煤量
    public static final String CT_Y = "CT_Y"; //年累计带煤量
    public static final String CT_T = "CT_T"; //总累计带煤量
    public static final String ASH = "ASH"; //在线测灰
    public static final String FL = "FL"; //当前流量
    public static final String CURRENT = "CURRENT";//电流
    public static final String PLATE_CNT = "PLATE_CNT";//压滤机当前板数
    public static final String RUN_STATE = "RUN_STATE";//运行状态
    public static final String LOAD_STAT = "LOAD_STATE";//加载状态
    public static final String FAULT = "FAULT";//故障信号
    public static final String PRESS_CUR = "PRESS_CUR";//当前压力

    public static final String COAL_8_DEVICE = "COAL_8_DEVICE";//8#煤设备
    public static final String COAL_13_DEVICE = "COAL_13_DEVICE";//13#煤设备

    public static final String AMOUNT = "AMOUNT";// 存储量(煤仓库存)
    public static final String TAP_CLOSE = "TAP_CLOSE";//关到位
    public static final String TAP_OPEN = "TAP_OPEN";//开到位
    public static final String MEDDLE = "Meddle";//人工干预

    public static final String PARAMETER_COND = "Parameter_Cond";//启动参数条件


    public static final String LOCAL = "LOCAL ";//就地切换按钮

    public static final String LEVEL_LOCK = "LEVEL_LOCK ";//液位选择联锁

    public static final String START_CMD = "START_CMD ";//集控启动

    public static final String STOP_CMD = "STOP_CMD ";//集控停止

    public static final String JJ_TIME = "JJ_TIME ";//已加介时间

    public static final String JJ_RE_TIME = "JJ_RE_TIME ";//加介剩余时间

    public static final String QUICKMIX = "QUICKMIX";//快速配介

    public static final String JJ_ADD = "JJ_ADD";//合介桶加介

    public static final String LE_PJ_SET = "LE_PJ_SET";//配介液位设定

    public static final String LE_ZD_SET = "LE_ZD_SET";//最低液位设定

    public static final String ADDING = "ADDING";//（合介桶）加介中

    public static final String MIXING = "MIXING";//（合介桶）已触发加介，等待配介

    public static final String DSFL = "DSFL";//顶水流量


    public static final String MEDIUM_DOSING = "MEDIUM_DOSING";//合介桶加介


}
