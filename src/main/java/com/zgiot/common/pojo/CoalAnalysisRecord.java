package com.zgiot.common.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * 煤质化验记录
 */
public class CoalAnalysisRecord {
    private Integer id;

    private String sample;

    private Double aad;

    private Double mt;

    private Double stad;

    private Double qnetar;

    private Date time;

    private String target;

    private Double avgDensity;

    private Double avgFlow;

    private Integer system;

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public Double getAad() {
        return aad;
    }

    public void setAad(Double aad) {
        this.aad = aad;
    }

    public Double getMt() {
        return mt;
    }

    public void setMt(Double mt) {
        this.mt = mt;
    }

    public Double getStad() {
        return stad;
    }

    public void setStad(Double stad) {
        this.stad = stad;
    }

    public Double getQnetar() {
        return qnetar;
    }

    public void setQnetar(Double qnetar) {
        this.qnetar = qnetar;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Double getAvgFlow() {
        return avgFlow;
    }

    public void setAvgFlow(Double avgFlow) {
        this.avgFlow = avgFlow;
    }

    public Double getAvgDensity() {
        return avgDensity;
    }

    public void setAvgDensity(Double avgDensity) {
        this.avgDensity = avgDensity;
    }

    public Integer getSystem() {
        return system;
    }

    public void setSystem(Integer system) {
        this.system = system;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoalAnalysisRecord that = (CoalAnalysisRecord) o;
        return Objects.equals(sample, that.sample) &&
                Objects.equals(aad, that.aad) &&
                Objects.equals(mt, that.mt) &&
                Objects.equals(stad, that.stad) &&
                Objects.equals(qnetar, that.qnetar) &&
                Objects.equals(time, that.time) &&
                Objects.equals(target, that.target);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sample, aad, mt, stad, qnetar, time, target);
    }


}
