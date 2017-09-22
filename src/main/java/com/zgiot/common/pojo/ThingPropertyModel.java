package com.zgiot.common.pojo;

public class ThingPropertyModel {
    public static final String PROP_TYPE_BASE = "BASE";
    public static final String PROP_TYPE_DISP = "DISP";
    private String thingCode;
    private String propType;
    private String propKey;
    private String propValue;

    public String getPropKey() {
        return propKey;
    }

    public String getPropValue() {
        return propValue;
    }

    public String getThingCode() {
        return thingCode;
    }

    public void setThingCode(String thingCode) {
        this.thingCode = thingCode;
    }

    public void setPropType(String propType) {
        this.propType = propType;
    }

    public void setPropKey(String propKey) {
        this.propKey = propKey;
    }

    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }

    public String getPropType() {
        return propType;
    }
}
