package com.zgiot.common.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataModel implements Serializable, Cloneable {

    public static final String METRIC_DATA_TYPE = "mdt";
    public static final String THING_CODE = "tc";
    public static final String METRIC_CATEGORY_CODE = "mcc";
    public static final String METRIC_CODE = "mc";
    public static final String VALUE = "v";
    public static final String DATA_TIMESTAMP = "dt";

    // 物体分类code
    @JSONField(name = METRIC_DATA_TYPE)
    private String metricDataType;
    // 物体code
    @JSONField(name = THING_CODE)
    private String thingCode;
    // 指标分类code
    @JSONField(name = METRIC_CATEGORY_CODE, serialize = false)
    private String metricCategoryCode;
    // 指标code
    @JSONField(name = METRIC_CODE)
    private String metricCode;
    // 值
    @JSONField(name = VALUE)
    private String value;

    @JSONField(serialize = false)
    private String preValue; // 上次值的缓存
    @JSONField(serialize = false)
    private Object valueObj;

    // 值产生的时间戳
    @JSONField(name = DATA_TIMESTAMP)
    private Date dataTimeStamp;

    public DataModel(String metricDataType, String thingCode, String metricCategoryCode
            , String metricCode, String value, Date dataTimeStamp) {
        this.metricDataType = metricDataType;
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
     * @param valueType to get metric first, then get value type from metric
     */
    public void initValueByType(String valueType) {
        if (this.valueObj == null) {
            this.valueObj = parseValueFromString(this.getValue(), valueType);
        }
    }

    public String getMetricDataType() {
        return metricDataType;
    }

    public void setMetricDataType(String metricDataType) {
        this.metricDataType = metricDataType;
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

    public void setValueObj(Object valueObj) {
        this.valueObj = valueObj;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return "DataModel{" +
                "mdt=`" + metricDataType  +
                "`, tc=`" + thingCode  +
                "`, mcc=`" + metricCategoryCode  +
                "`, mc=`" + metricCode  +
                "`, value=`" + value +
                "`, date=`" + (dataTimeStamp == null ? "" : sdf.format(dataTimeStamp)) +
                "`, ts=`" + (dataTimeStamp == null ? "" : dataTimeStamp.getTime()) +
                "`}";
    }
}
