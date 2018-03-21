package com.zgiot.common.pojo;

import java.util.Date;

public interface ReportFormsRecord {

    String getSample();

    String getTarget();

    Date getTime();

    Integer getSystem();

    Integer getId();

    Double getAvgDensity();

    Double getAvgFlow();

    void setAvgDensity(Double value);

    void setAvgFlow(Double value);

    void setId(Integer id);


}
