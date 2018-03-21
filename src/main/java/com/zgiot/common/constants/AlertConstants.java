package com.zgiot.common.constants;

/**
 * Created by xiayun on 2017/9/25.
 */
public class AlertConstants {
    public static final String STAGE_NOT_VERIFY = "NOT_VERIFY"; // 未核实、已发起
    public static final String STAGE_VERIFIED = "VERIFIED"; // 已核实、已评级
    public static final String STAGE_UNTREATED = "UNTREATED"; // 未处理
    public static final String STAGE_REQUEST_REPAIR = "REQUEST_REPAIR"; // 申请维修
    public static final String STAGE_REPAIRING = "REPAIRING"; // 维修中
    public static final String STAGE_REPAIRED = "REPAIRED"; // 维修结束
    public static final String STAGE_RELEASE = "RELEASE"; // 报警解除
    public static final String STAGE_UNRELEASE = "UNRELEASE"; //所有未解除阶段

    public static final short TYPE_FAULT = 0; // 故障类报警
    public static final short TYPE_PARAM = 1; // 参数类报警
    public static final short TYPE_PROTECT = 2; // 保护类报警
    public static final short TYPE_USER = 3; // 人工类报警

    public static final short SOURCE_SYSTEM = 0; // 系统生成报警
    public static final short SOURCE_USER = 1; // 人工生成报警

    public static final short IS_REPAIR = 1; // 发起维修
    public static final short DIS_REPAIR = 0; // 未发起维修
    public static final short IS_MANUAL_INTERVENTION = 1; // 人工干预
    public static final short DIS_MANUAL_INTERVENTION = 0; // 未人工干预
    public static final short IS_RECOVERY = 1; // 已恢复
    public static final short DIS_RECOVERY = 0; // 未恢复

    public static final String REPORTER_SYSTEM = "系统"; // 报警发起人：系统

    public static final short LEVEL_10 = 10;
    public static final short LEVEL_20 = 20;
    public static final short LEVEL_30 = 30;

    public static final short MESSAGE_TYPE_REQ_VERIFY = 0; //核实报警（调度）
    public static final short MESSAGE_TYPE_VERIFIED = 1; //已核实报警存在（岗位）
    public static final short MESSAGE_TYPE_NOT_FOUND = 2; //未发现报警存在（岗位）
    public static final short MESSAGE_TYPE_REQ_REPAIR = 3; //申请维修（岗位）
    public static final short MESSAGE_TYPE_ASSIGN_REPAIR = 4; //下达维修（调度）
    public static final short MESSAGE_TYPE_RECOMMENDED_SHIELDING = 5; //建议屏蔽（岗位）
    public static final short MESSAGE_TYPE_REQ_SCENE_CONFIRM = 6; //现场确认（调度）
    public static final short MESSAGE_TYPE_SCENE_CONFIRM_RELEASE = 7; //现场确认报警解除（岗位）
    public static final short MESSAGE_TYPE_SCENE_CONFIRM_DIS_RELEASE = 8; //现场确认报警未解除（岗位）
    public static final short MESSAGE_TYPE_REPAIR_START = 9; //开始维修（岗位）
    public static final short MESSAGE_TYPE_REPAIR_END = 10; //结束维修（岗位）
    public static final short MESSAGE_TYPE_OTHER = 11; //其他
    public static final short MESSAGE_TYPE_NEW_ALERT = 12; //生成报警（岗位）
    public static final short MESSAGE_TYPE_SET_LEVEL = 13; //设置报警等级（调度）
    public static final short MESSAGE_REQ_RESET = 14; //申请复位（岗位）
    public static final short MESSAGE_RESET = 15; //复位（调度）
    public static final short MESSAGE_TYPE_REQ_FEEDBACK = 16; //请求反馈

    public static final String PERMISSION_POSTWORKER = "alarm:staff"; //岗位工权限
    public static final String PERMISSION_DISPATCHER = "alarm:dispatch"; //调度权限

    public static final int FEEDBACK_TYPE_IMAGE = 0;
    public static final int FEEDBACK_TYPE_VIDEO = 1;

    private AlertConstants() {
    }
}
