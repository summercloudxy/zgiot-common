package com.zgiot.common.pojo;

import java.util.Date;

public final class DataModelWrapper {
    private final DataModel dataModel;

    public DataModelWrapper(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    public String getThingCategory() {
        return dataModel.getThingCategoryCode();
    }

    public String getThingCode() {
        return dataModel.getThingCode();
    }

    public String getMetricCategoryCode() {
        return dataModel.getMetricCategoryCode();
    }

    public String getMetricCode() {
        return dataModel.getMetricCode();
    }

    public String getValue() {
        return dataModel.getValue();
    }

    public Date getDataTimeStamp() {
        return dataModel.getDataTimeStamp();
    }

    public String getPreValue() {
        return dataModel.getPreValue();
    }
}
