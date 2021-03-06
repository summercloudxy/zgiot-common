package com.zgiot.common.constants;

/**
 * 订阅常量
 *
 * @author jys
 */
public class SubscriptionConstants {


    public static final String RUN_STATE_STOP = "待机";

    public static final String RUN_STATE_START_1 = "true";
    public static final String RUN_STATE_STOP_0 = "false";

    public static final String LOAD_STATE_LOAD = "加载";
    public static final String LOAD_STATE_UNLOAD = "卸载";
    public static final String LOAD_STATE_LOAD_1 = "true";
    public static final String LOAD_STATE_LOAD_0 = "false";

    public static final String FAULT = "故障";
    public static final String FAULT_1 = "true";

    public static final String ASH_CONTENT = "灰分";

    public static final String SULFUR_CONTENT = "硫分";

    public static final String MOISTURE_CONTENT = "水分";

    public static final String ASH_CONTENT_CLEAN_COAL_SCOPE = "10.2-10.8";//精煤灰分范围
    public static final String ASH_CONTENT_MIXED_COAL_SCOPE = "23.5-25";//混煤灰分范围

    public static final String SULFUR_CONTENT_SCOPE = "0.65-0.8";//硫分范围

    public static final String MOISTURE_CONTENT_SCOPE = "0-10";//水分范围

    public static final String FLAG_UP = "UP";//箭头向上
    public static final String FLAG_DOWN = "DOWN";//箭头向下

    public static final String METRIC_NAME_CT_C = "班"; //班
    public static final String METRIC_NAME_CT_D = "日"; //日
    public static final String METRIC_NAME_CT_M = "月"; //月
    public static final String METRIC_NAME_CT_Y = "年"; //年
    public static final String METRIC_NAME_CT_T = "总"; //总


    public static final String UNIT_T = "t";//单位t

    public static final String UNIT_THOUSAND_T = "万t";//单位万t
    public static final String RAW_COAL = "原煤";
    public static final String CLEAN_COAL = "精煤";
    public static final String MIXED_COAL = "混煤";
    public static final String SLURRY = "煤泥";
    public static final String WASTE_ROCK = "矸石";

    public static final String CLEAN_COAL_551 = "551生产精煤";//化验数据表中的target
    public static final String MIXE_COAL_552 = "552生产洗混煤";//化验数据表中的target


    public static final String SELECT_ONE = "1";//已选择

    public static final String SELECT_ZERO = "0";//未选择

    public static final String DATE_TYPE_HOUR = "1";//近一小时

    public static final String DATE_TYPE_DAY = "2";//当天

    public static final String DATE_TYPE_WEEK = "3";//近一周

    public static final String DATE_TYPE_MONTH = "4";//近一个月

    public static final String CHART_TYPE = "1";//图形
    public static final String LIST_TYPE = "2";//列表

    public static final String ASSAY_AAD_NAME = "灰分";

    public static final String CLEAN_COAL_AVG_551 = "551生产精煤平均";//化验数据表中的target

    public static final String MIXED_COAL_AVG_552 = "552生产洗混煤平均";//化验数据表中的target

    public static final String WHITE_SHIFT = "白班";

    public static final String NIGHT_SHIFT = "夜班";

    public static final int WHITE_SHIFT_BEGIN = 8;
    public static final int WHITE_SHIFT_END = 18;
    public static final int NIGHT_SHIFT_BEGIN = 20;
    public static final int NIGHT_SHIFT_END = 6;

    public static final String WASH_RAW_COAL = "入洗原煤";//化验数据表中的target
    public static final String FILTERPRESS_SLURRY = "压滤煤泥";//化验数据表中的target

    public static final int SYSTEM_ONE = 1;
    public static final int SYSTEM_TWO = 2;

    public static final String TCS_ORE_FINE = "TCS精矿";//化验数据表中的target
    public static final String TCS_ORE_CRUDE = "TCS尾矿";//化验数据表中的target

    public static final String ORE_FINE = "精矿";
    public static final String ORE_CRUDE = "尾矿";

    public static final String CLEAN_WAREHOUSE = "精煤仓";
    public static final String MIXED_WAREHOUSE = "混煤仓";
    public static final String COAL_8 = "8#煤";
    public static final String COAL_13 = "13#煤";
    public static final String SLURRY_WAREHOUSE = "库存煤泥";

    public static final String TERM_ONE = "一期";
    public static final String TERM_TWO = "二期";

}
