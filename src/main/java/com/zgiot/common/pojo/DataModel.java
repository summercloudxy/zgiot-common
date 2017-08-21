package com.zgiot.common.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class DataModel implements Serializable, Cloneable {
    // 物体分类code
    @JSONField(name="tcc")
    private String thingCategoryCode;
    // 物体code
    @JSONField(name="tc")
    private String thingCode;
    // 指标分类code
    @JSONField(name="mcc")
    private String metricCategoryCode;
    // 指标code
    @JSONField(name="mc")
    private String metricCode;
    // 值
    @JSONField(name="v")
    private Object value;
    // 值产生的时间戳
    @JSONField(name="dt")
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
