package com.zgiot.common.pojo;

import java.io.Serializable;

public class ThingModel implements Serializable, Cloneable {

    public static final String TYPE_DEVICE = "D";

    private int id;
    private int parentThingId;
    private String thingCode;
    private String thingName;
    private String thingShortName;
    private String thingType1Code;
    private String thingType2Code;
    private String thingType3Code;

    public String getShortName() {
        return thingShortName;
    }

    public void setShortName(String shortName) {
        this.thingShortName = shortName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentThingId() {
        return parentThingId;
    }

    public void setParentThingId(int parentThingId) {
        this.parentThingId = parentThingId;
    }

    public String getThingCode() {
        return thingCode;
    }

    public void setThingCode(String thingCode) {
        this.thingCode = thingCode;
    }

    public String getThingName() {
        return thingName;
    }

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    public String getThingType1Code() {
        return thingType1Code;
    }

    public void setThingType1Code(String thingType1Code) {
        this.thingType1Code = thingType1Code;
    }

    public String getThingType2Code() {
        return thingType2Code;
    }

    public void setThingType2Code(String thingType2Code) {
        this.thingType2Code = thingType2Code;
    }

    public String getThingType3Code() {
        return thingType3Code;
    }

    public void setThingType3Code(String thingType3Code) {
        this.thingType3Code = thingType3Code;
    }

    @Override
    public String toString() {
        return "ThingModel{" +
                "id=" + id +
                ", parentThingId=" + parentThingId +
                ", thingCode='" + thingCode + '\'' +
                ", thingName='" + thingName + '\'' +
                ", shortName='" + thingName + '\'' +
                ", thingType1Code='" + thingType1Code + '\'' +
                ", thingType2Code='" + thingType2Code + '\'' +
                ", thingType3Code='" + thingType3Code + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
