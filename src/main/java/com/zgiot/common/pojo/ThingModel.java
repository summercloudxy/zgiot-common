package com.zgiot.common.pojo;

import java.io.Serializable;

public class ThingModel implements Serializable, Cloneable {
    public static final String CATEGORY_DEVICE = "DVC";
    public static final String CATEGORY_SYSTEM = "SYS";
    public static final String CATEGORY_ERROR = "ERR";

    private String categoryCode;
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}
