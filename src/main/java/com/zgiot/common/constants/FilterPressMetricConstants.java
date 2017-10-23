package com.zgiot.common.constants;

import com.zgiot.common.annotation.KepServerMapping;
import org.springframework.stereotype.Component;

import static com.zgiot.common.annotation.KepServerMapping.*;

/**
 * 压滤用metric
 */
@Component
public class FilterPressMetricConstants {

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_ONLY, position = "40001")
    public static final String STAGE = "STAGE"; //压滤机阶段

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.8")
    public static final String WATER_FWD = "WATER_FWD"; //水洗前移

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.9")
    public static final String WATER_BWD = "WATER_BWD"; //水洗后移

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.11")
    public static final String SHOWER_UP = "SHOWER_UP"; //喷头上移

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.10")
    public static final String SHOWER_DWN = "SHOWER_DWN"; //喷头下移

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.12")
    public static final String PAUSE = "PAUSE"; //暂停

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.13")
    public static final String FAULT = "FAULT"; //故障信号

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.14")
    public static final String SCRAPER_UP = "SCRAPER_UP"; //刮板启动

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.15")
    public static final String RL_PUMP_UP = "RL_PUMP_UP"; //进料泵启动点

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.2")
    public static final String LOOSE_LMT0 = "LOOSE_LMT0"; //松开限位0

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.3")
    public static final String CAR_LMT0 = "CAR_LMT0"; //小车限位0

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40003.13")
    public static final String AUTO = "AUTO"; //手动/自动

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40005.4")
    public static final String LOCAL = "LOCAL"; //远程就地按钮

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.5")
    public static final String PRESS_ULMT = "PRESS_ULMT"; //压紧上限

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40002.6")
    public static final String PRESS_LLMT = "PRESS_LLMT"; //压紧下限

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40003.14")
    public static final String PRESS_LMT = "PRESS_LMT"; //压紧限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40003.15")
    public static final String JL_PUMP_UP = "JL_PUMP_UP"; //进料泵运行信号

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40003.0")
    public static final String TRS_UP = "TRS_UP"; //输送机运行信号

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40003.2")
    public static final String JL_ULMT = "JL_ULMT"; //进料上限

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40003.3")
    public static final String PRS_LLMT = "PRS_LLMT"; //压榨下限

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40003.4")
    public static final String CAR_LMT1 = "CAR_LMT1"; //小车限位1

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40003.5")
    public static final String PRS_ULMT = "PRS_ULMT"; //压榨上限

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40003.7")
    public static final String LOOSE_LMT1 = "LOOSE_LMT1"; //松开限位1

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.12")
    public static final String JL_OLMT0 = "JL_OLMT0"; //进料阀0开限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.13")
    public static final String JL_CLMT0 = "JL_CLMT0"; //进料阀0关限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.14")
    public static final String JL_OLMT1 = "JL_OLMT1"; //进料阀1开限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.15")
    public static final String JL_CLMT1 = "JL_CLMT1"; //进料阀1关限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.0")
    public static final String YZ_OLMT = "YZ_OLMT"; //压榨阀开限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.1")
    public static final String YZ_CLMT = "YZ_CLMT"; //压榨阀关限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.2")
    public static final String FK_OLMT = "FK_OLMT"; //放空阀开限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.3")
    public static final String FK_CLMT = "FK_CLMT"; //放空阀关限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.4")
    public static final String CF_OLMT = "CF_OLMT"; //吹风阀开限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.5")
    public static final String CF_CLMT = "CF_CLMT"; //吹风阀关限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.6")
    public static final String HL_OLMT = "HL_OLMT"; //回流阀开限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40004.7")
    public static final String HL_CLMT = "HL_CLMT"; //回流阀关限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40005.8")
    public static final String FILTER = "FILTER"; //过滤/水洗

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40005.13")
    public static final String WT_FW_LMT = "WT_FW_LMT"; //水洗后移限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40005.14")
    public static final String WT_BW_LMT = "WT_BW_LMT"; //水洗前移限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40005.15")
    public static final String SW_DWN_LMT = "SW_DWN_LMT"; //喷头下移限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40005.0")
    public static final String SW_UP_LMT = "SW_UP_LMT"; //喷头上移限位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40005.1")
    public static final String XB_CHK = "XB_CHK"; //洗布检测点

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40005.2")
    public static final String XB_TRSF = "XB_TRSF"; //洗布转换点

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40005.3")
    public static final String XB_END = "XB_END"; //洗布结束点

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.8")
    public static final String PRS_OTMOUT = "PRS_OTMOUT"; //压榨阀打开超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.0")
    public static final String PRS_CTMOUT = "PRS_CTMOUT"; //压榨阀关闭超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.10")
    public static final String PK_OTMOUT = "PK_OTMOUT"; //排空阀打开超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.11")
    public static final String PK_CTMOUT = "PK_CTMOUT"; //排空阀关闭超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.12")
    public static final String CF_OTMOUT = "CF_OTMOUT"; //吹风阀打开超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.13")
    public static final String CF_CTMOUT = "CF_CTMOUT"; //吹风阀关闭超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.14")
    public static final String HL_OTMOUT = "HL_OTMOUT"; //回流阀打开超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.15")
    public static final String HL_CTMOUT = "HL_CTMOUT"; //回流阀关闭超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.2")
    public static final String PK_TMOUT = "PK_TMOUT"; //排空超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.3")
    public static final String CF_TMOUT = "CF_TMOUT"; //吹风超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.4")
    public static final String JL_OTMOUT0 = "JL_OTMOUT0"; //进料阀0打开超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.5")
    public static final String JL_CTMOUT0 = "JL_CTMOUT0"; //进料阀0关闭超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.6")
    public static final String JL_OTMOUT1 = "JL_OTMOUT1"; //进料阀1打开超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40006.7")
    public static final String JL_CTMOUT1 = "JL_CTMOUT1"; //进料阀1关闭超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.8")
    public static final String FB_OTMOUT = "FB_OTMOUT"; //翻板打开超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.9")
    public static final String SK_TMOUT = "SK_TMOUT"; //松开超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.10")
    public static final String QB_TMOUT = "QB_TMOUT"; //取板超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.11")
    public static final String LB_TMOUT = "LB_TMOUT"; //拉板超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.12")
    public static final String FB_CTMOUT = "FB_CTMOUT"; //翻板关闭超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.13")
    public static final String YJ_TMOUT = "YJ_TMOUT"; //压紧超时或超限

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.14")
    public static final String JL_TMOUT = "JL_TMOUT"; //进料超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.15")
    public static final String YZ_TMOUT = "YZ_TMOUT"; //压榨超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.0")
    public static final String SK_FRBD = "SK_FRBD"; //存在压榨压力，禁止松开

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.1")
    public static final String START_FRBD = "START_FRBD"; //存在压榨压力或小车未到位，禁止启动

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.2")
    public static final String WTFW_TMOUT = "WTFW_TMOUT"; //水洗前移超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.3")
    public static final String WTBW_TMOUT = "WTBW_TMOUT"; //水洗后移超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.4")
    public static final String SWDW_TMOUT = "SWDW_TMOUT"; //喷头下移超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40007.5")
    public static final String SWUP_TMOUT = "SWUP_TMOUT"; //喷头上移超时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40008.8")
    public static final String T1_RCD = "T1_RCD"; //一队记录

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40008.9")
    public static final String T2_RCD = "T2_RCD"; //二队记录

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40008.10")
    public static final String T3_RCD = "T3_RCD"; //三队纪录

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_ONLY, position = "40009")
    public static final String CRT_TIMER = "CRT_TIMER"; //当前计时

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_ONLY, position = "40010")
    public static final String PRC_TIMER = "PRC_TIMER"; //过程计时

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_ONLY, position = "40011")
    public static final String T1_COUNT = "T1_COUNT"; //一队过滤次数

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_ONLY, position = "40012")
    public static final String T2_COUNT = "T2_COUNT"; //二队过滤次数

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_ONLY, position = "40013")
    public static final String T3_COUNT = "T3_COUNT"; //三队过滤次数

    @KepServerMapping(dataType = DATATYPE_DINT, rwType = READ_ONLY, position = "40014[2]")
    public static final String TOTL_COUNT = "TOTL_COUNT"; //总记录

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40017")
    public static final String JL_DELAY = "JL_DELAY"; //进料延时

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40018")
    public static final String YZ_DELAY = "YZ_DELAY"; //压榨延时

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40019")
    public static final String YZ_DL_TIME = "YZ_DL_TIME"; //压榨延时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40020")
    public static final String CF_TIME = "CF_TIME"; //吹风时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40021")
    public static final String FIRST_QB_S_TIME = "1QB_S_TIME"; //首次取板高速时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40022")
    public static final String QB_S_TIME = "QB_S_TIME"; //取板高速时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40023")
    public static final String LB_S_TIME = "LB_S_TIME"; //拉板高速时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40024")
    public static final String LB_SR_TIME = "LB_SR_TIME"; //拉板高速返回时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40025")
    public static final String XHDD_TIME = "XHDD_TIME"; //循环等待时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40026")
    public static final String SW_ST_TIME = "SW_ST_TIME"; //喷头下方停留时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40027")
    public static final String SW_SW_TIME = "SW_SW_TIME"; //喷头上移喷水时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40028")
    public static final String SK_TO_TIME = "SK_TO_TIME"; //松开超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40029")
    public static final String QB_TO_TIME = "QB_TO_TIME"; //取板超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40030")
    public static final String LB_TO_TIME = "LB_TO_TIME"; //拉板超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40031")
    public static final String YJ_TO_TIME = "YJ_TO_TIME"; //压紧超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40032")
    public static final String JL_TO_TIME = "JL_TO_TIME"; //进料超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40033")
    public static final String YZ_TO_TIME = "YZ_TO_TIME"; //压榨超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40034")
    public static final String PK_TO_TIME = "PK_TO_TIME"; //排空超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40035")
    public static final String CF_TO_TIME = "CF_TO_TIME"; //吹风超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40036")
    public static final String JL_TO_TM0 = "JL_TO_TM0"; //进料阀0动作超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40037")
    public static final String JL_TO_TM1 = "JL_TO_TM1"; //进料阀1动作超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40038")
    public static final String YZ_TO_TM = "YZ_TO_TM"; //压榨阀动作超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40039")
    public static final String PK_TO_TM = "PK_TO_TM"; //排空阀动作超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40040")
    public static final String CF_TO_TM = "CF_TO_TM"; //吹风阀动作超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40041")
    public static final String HL_TO_TM = "HL_TO_TM"; //回流阀动作超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40042")
    public static final String SXF_TO_TM = "SXF_TO_TM"; //水洗架前移超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40043")
    public static final String SXB_TO_TM = "SXB_TO_TM"; //水洗架后移超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40044")
    public static final String SWD_TO_TM = "SWD_TO_TM"; //喷头下移超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40045")
    public static final String SWU_TO_TM = "SWU_TO_TM"; //喷头上移超时时间

    @KepServerMapping(dataType = DATATYPE_SHORT, rwType = READ_WRITE, position = "40046")
    public static final String GY_TIME = "GY_TIME"; //高压卸荷时间

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.0")
    public static final String SYS_ALARM = "SYS_ALARM"; //系统报警选择

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.1")
    public static final String CONTROL = "CONTROL"; //控制选择

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.2")
    public static final String GATE_ALARM = "GATE_ALARM"; //阀门报警选择

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.3")
    public static final String SCR_BLK = "SCR_BLK"; //刮板闭锁

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.4")
    public static final String TOTL_CLR = "TOTL_CLR"; //总记录清零

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.5")
    public static final String T1_CLR = "T1_CLR"; //一队清零

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.6")
    public static final String T2_CLR = "T2_CLR"; //二队清零

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.7")
    public static final String T3_CLR = "T3_CLR"; //三队清零

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.8")
    public static final String LOOSE = "LOOSE"; //远程手动松开

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.9")
    public static final String TAKE = "TAKE"; //远程手动取板

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.10")
    public static final String PULL = "PULL"; //远程手动拉板

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.11")
    public static final String PRESS = "PRESS"; //远程手动压紧

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.12")
    public static final String FEED = "FEED"; //远程手动进料

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.13")
    public static final String SQUEEZE = "SQUEEZE"; //远程手动压榨

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.14")
    public static final String BLOW = "BLOW"; //远程手动吹风

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40048.15")
    public static final String RESET = "RESET"; //远程报警复位

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40049.0")
    public static final String RUN = "RUN"; //远程启动

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40049.1")
    public static final String S_PAUSE = "S_PAUSE"; //远程暂停

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40049.2")
    public static final String STOP = "STOP"; //远程停止

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40049.3")
    public static final String R_AUTO = "R_AUTO"; //远程手动/自动

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40049.4")
    public static final String FEED_OVER = "FEED_OVER"; //进料结束

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40049.5")
    public static final String T1_CHOOSE = "T1_CHOOSE"; //一队选择

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40049.6")
    public static final String T2_CHOOSE = "T2_CHOOSE"; //二队选择

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_WRITE, position = "40049.7")
    public static final String T3_CHOOSE = "T3_CHOOSE"; //三队选择

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.9")
    public static final String RO_LOOSE= "RO_LOOSE"; //压滤阶段-松开

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.10")
    public static final String RO_TAKEN = "RO_TAKEN"; //压滤阶段-取板

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.11")
    public static final String RO_PULL = "RO_PULL"; //压滤阶段-拉板

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.13")
    public static final String RO_PRESS = "RO_PRESS"; //压滤阶段-压紧

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.15")
    public static final String RO_FEEDING = "RO_FEEDING"; //压滤阶段-进料

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.0")
    public static final String RO_FEED_OVER = "RO_FEED_OVER"; //压滤阶段-进料结束

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.4")
    public static final String RO_BLOW = "RO_BLOW"; //压滤阶段-吹风

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.3")
    public static final String RO_EMPTYING = "RO_EMPTYING"; //压滤阶段-放空

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.1")
    public static final String RO_SQUEEZE = "RO_SQUEEZE"; //压滤阶段-压榨

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.2")
    public static final String RO_SQUEEZE_OVER = "RO_SQUEEZE_OVER"; //压滤阶段-压榨延时

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.14")
    public static final String RO_HOLD_PRESS = "RO_HOLD_PRESS"; //压滤阶段-保压

    @KepServerMapping(dataType = DATATYPE_BOOL, rwType = READ_ONLY, position = "40001.5")
    public static final String RO_CYCLE = "RO_CYCLE"; //压滤阶段-循环等待

    public static final String FEED_ASUM = "FEED_ASUM"; //进料结束系统判断

    public static final String UNLOAD_SEQ = "UNLOAD_SEQ"; //卸料次序

    public static final String PLATE_CNT = "PLATE_CNT"; //压滤机当前板数

    public static final String PLATE_TTL = "PLATE_TTL"; //压滤机总板数

    public static String FEED_PUMP_CURRENT = "CURRENT";//压滤机入料泵电流
}
