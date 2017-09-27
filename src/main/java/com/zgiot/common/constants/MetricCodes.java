package com.zgiot.common.constants;

public class MetricCodes {

    public static final String CURRENT_0="CR0";
    public static final String CURRENT_1="CR1";
    public static final String CURRENT_2="CR2";
    public static final String LOCAL_BUTTON="LR0"; // 集控就地按钮

    // 化验相关
    public static final String ASSAY_AAD ="AAD"; // 灰分
    public static final String ASSAY_MT ="MT"; // 水分
    public static final String ASSAY_STAD ="STAD"; // 硫分
    public static final String ASSAY_QNETAR ="QNETAR"; // 发热量

    /**
     * 以前在FilterPressMetricConstants中，现在移到GlobalConstants中，因为在
     * FilterPressManager中onDataSourceChange方法会出现metricCode为state状态的非压滤设备，
     * 在deviceHolder.get（thingCode）时找不到非压滤设备，会出现FilterPress空指针异常
     */
    public static final String STATE = "STATE"; //状态

}
