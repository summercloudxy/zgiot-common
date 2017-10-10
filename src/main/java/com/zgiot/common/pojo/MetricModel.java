package com.zgiot.common.pojo;

import java.io.Serializable;

public class MetricModel implements Serializable, Cloneable {
    public static final String CATEGORY_SIGNAL = "SIG"; // 信号 signal
    public static final String CATEGORY_ASSAY = "ASSAY"; // 化验数据
    
    public static final String VALUE_TYPE_SHORT = "SHT";
    public static final String VALUE_TYPE_FLOAT = "FLT";
    public static final String VALUE_TYPE_BOOL = "BOO";

    public static final String VALUE_UNIT_PERCENT = "%";
    public static final String VALUE_UNIT_METER = "m"; // 米
    public static final String VALUE_UNIT_A = "A"; // 安
    public static final String VALUE_UNIT_MA = "MA"; // 毫安

    private int id;
    private String metricCategoryCode;
    private String metricName;
    private String metricCode;
    private String metricType1Code;
    private String metricType2Code;
    private String metricType3Code;
    private String valueType;
    private String valueUnit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMetricCategoryCode() {
        return metricCategoryCode;
    }

    public void setMetricCategoryCode(String metricCategoryCode) {
        this.metricCategoryCode = metricCategoryCode;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public String getMetricCode() {
        return metricCode;
    }

    public void setMetricCode(String metricCode) {
        this.metricCode = metricCode;
    }

    public String getMetricType1Code() {
        return metricType1Code;
    }

    public void setMetricType1Code(String metricType1Code) {
        this.metricType1Code = metricType1Code;
    }

    public String getMetricType2Code() {
        return metricType2Code;
    }

    public void setMetricType2Code(String metricType2Code) {
        this.metricType2Code = metricType2Code;
    }

    public String getMetricType3Code() {
        return metricType3Code;
    }

    public void setMetricType3Code(String metricType3Code) {
        this.metricType3Code = metricType3Code;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }

    @Override
    public String toString() {
        return "MetricModel{" +
                "id=" + id +
                ", metricCategoryCode='" + metricCategoryCode + '\'' +
                ", metricName='" + metricName + '\'' +
                ", metricCode='" + metricCode + '\'' +
                ", metricType1Code='" + metricType1Code + '\'' +
                ", metricType2Code='" + metricType2Code + '\'' +
                ", metricType3Code='" + metricType3Code + '\'' +
                ", valueType='" + valueType + '\'' +
                ", valueUnit='" + valueUnit + '\'' +
                '}';
    }
}
