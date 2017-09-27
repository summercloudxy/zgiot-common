package com.zgiot.common.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataModel implements Serializable, Cloneable {
    // 物体分类code
    @JSONField(name = "tcc")
    private String thingCategoryCode;
    // 物体code
    @JSONField(name = "tc")
    private String thingCode;
    // 指标分类code
    @JSONField(name = "mcc")
    private String metricCategoryCode;
    // 指标code
    @JSONField(name = "mc")
    private String metricCode;
    // 值
    @JSONField(name = "v")
    private String value;

    private String preValue; // 上次值的缓存

    private Object valueObj;

    // 值产生的时间戳
    @JSONField(name = "dt")
    private Date dataTimeStamp;

    public DataModel(String thingCategoryCode, String thingCode, String metricCategoryCode
            , String metricCode, String value, Date dataTimeStamp) {
        this.thingCategoryCode = thingCategoryCode;
        this.thingCode = thingCode;
        this.metricCategoryCode = metricCategoryCode;
        this.metricCode = metricCode;
        this.value = value;
        this.dataTimeStamp = dataTimeStamp;
    }

    public DataModel() {
    }

    public String getPreValue() {
        return preValue;
    }

    public void setPreValue(String preValue) {
        this.preValue = preValue;
    }

    @Override
    public DataModel clone() {
        try {
            return (DataModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param valueType  to get metric first, then get value type from metric
     */
    public void initValueByType(String valueType) {
        if (this.valueObj == null) {
            this.valueObj = parseValueFromString(this.getValue(), valueType);
        }
    }

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getDataTimeStamp() {
        return dataTimeStamp;
    }

    public void setDataTimeStamp(Date dataTimeStamp) {
        this.dataTimeStamp = dataTimeStamp;
    }

    public static Object parseValueFromString(String valueStr, String valueType) {
        switch (valueType) {
            case MetricModel.VALUE_TYPE_BOOL:
                return Boolean.valueOf(valueStr);
            case MetricModel.VALUE_TYPE_SHORT:
                return Short.valueOf(valueStr);
            case MetricModel.VALUE_TYPE_FLOAT:
                return Float.valueOf(valueStr);
            // DINT is not used for sending cmd so far
        }

        return valueStr;
    }

    public static String genKey(String thingCode, String metricCode) {
        return thingCode + "_" + metricCode;
    }

    public Object getValueObj() {
        return valueObj;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return "DataModel{" +
                "tcc='" + thingCategoryCode + '\'' +
                ", tc='" + thingCode + '\'' +
                ", mcc='" + metricCategoryCode + '\'' +
                ", mc='" + metricCode + '\'' +
                ", value=" + value +
                ", date=" + sdf.format(dataTimeStamp) +
                ", ts=" + dataTimeStamp.getTime() +
                '}';
    }
}
