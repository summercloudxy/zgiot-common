package com.zgiot.common.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.util.StringUtils;

import java.util.Date;

public final class DataModelWrapper {
    private final DataModel dataModel;

    public DataModelWrapper(DataModel dataModel) {
        this.dataModel = dataModel;
    }
    @JSONField(serialize = false)
    public String getMetricDataType() {
        return dataModel.getMetricDataType();
    }
    @JSONField(name = "tc")
    public String getThingCode() {
        return dataModel.getThingCode();
    }
    @JSONField(serialize = false)
    public String getMetricCategoryCode() {
        return dataModel.getMetricCategoryCode();
    }
    @JSONField(name = "mc")
    public String getMetricCode() {
        return dataModel.getMetricCode();
    }
    @JSONField(name = "v")
    public String getValue() {
        if(dataModel != null){
            return dataModel.getValue();
        }else{
           return null;
        }
    }
    @JSONField(name = "dt")
    public Date getDataTimeStamp() {
        return dataModel.getDataTimeStamp();
    }

    public String getPreValue() {
        return dataModel.getPreValue();
    }

    public boolean isEmpty(){
        if(dataModel == null){
            return true ;
        }else{
            return StringUtils.isEmpty(dataModel.getThingCode());
        }
    }
}
