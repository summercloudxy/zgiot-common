package com.zgiot.common.constants;

public class FilterPressConstants {
    public static final short STAGE_LOOSEN = 512; //压滤阶段-松开

    public static final short STAGE_TAKEN = 1024; //压滤阶段-取板

    public static final short STAGE_PULL = 2048; //压滤阶段-拉板

    public static final short STAGE_PRESS = 8192; //压滤阶段-压紧

    public static final short STAGE_FEEDING = -32768; //压滤阶段-进料

    public static final short STAGE_FEED_OVER = 1; //压滤阶段-进料结束

    public static final short STAGE_BLOW = 16; //压滤阶段-吹风

    public static final short STAGE_CYCLE = 32; //压滤阶段-循环等待

    public static final short FEED_OVER_TIME = 1; //按照时间判断触发进料结束

    public static final short FEED_OVER_CURRENT = 2; //按照电流判断触发进料结束
}
