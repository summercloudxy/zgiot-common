package com.zgiot.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class DataModel implements Serializable, Cloneable {
    // 物体分类code
    private String thingCategoryCode;
    // 物体code
    private String thingCode;
    // 指标分类code
    private String metricCategoryCode;
    // 指标code
    private String metricCode;
    // 值
    private Object value;
    // 值产生的时间戳
    private Date dataTimeStamp;


    public String getThingCategoryCode() {
        return thingCategoryCode;
    }

    public void setThingCategoryCode(String thingCategoryCode) {
        this.thingCategoryCode = thingCategoryCode;
    }

    public String getThingCode() {
        return thingCode;
    }

    public void setThingCode(String thingCode) {
        this.thingCode = thingCode;
    }

    public String getMetricCategoryCode() {
        return metricCategoryCode;
    }

    public void setMetricCategoryCode(String metricCategoryCode) {
        this.metricCategoryCode = metricCategoryCode;
    }

    public String getMetricCode() {
        return metricCode;
    }

    public void setMetricCode(String metricCode) {
        this.metricCode = metricCode;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Date getDataTimeStamp() {
        return dataTimeStamp;
    }

    public void setDataTimeStamp(Date dataTimeStamp) {
        this.dataTimeStamp = dataTimeStamp;
    }
}
