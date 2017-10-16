package com.zgiot.common.enums;

public enum MetricDataTypeEnum {
    METRIC_DATA_TYPE_OK("OK"),
    METRIC_DATA_TYPE_ERROR("ERR");

    private String name;

    MetricDataTypeEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
