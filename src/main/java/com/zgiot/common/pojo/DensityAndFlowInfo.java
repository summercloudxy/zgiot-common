package com.zgiot.common.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DensityAndFlowInfo {
    private String thingCode;
    private Double density;
    private Double flow;
    @JsonIgnore
    private Integer analysisId;
    @JsonIgnore
    private Integer inspectId;

    public String getThingCode() {
        return thingCode;
    }

    public void setThingCode(String thingCode) {
        this.thingCode = thingCode;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Double getFlow() {
        return flow;
    }

    public void setFlow(Double flow) {
        this.flow = flow;
    }

    public Integer getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(Integer analysisId) {
        this.analysisId = analysisId;
    }

    public Integer getInspectId() {
        return inspectId;
    }

    public void setInspectId(Integer inspectId) {
        this.inspectId = inspectId;
    }
}
