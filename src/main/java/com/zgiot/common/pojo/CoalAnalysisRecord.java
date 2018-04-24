package com.zgiot.common.pojo;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 煤质化验记录
 */
public class CoalAnalysisRecord implements ReportFormsRecord {
    private Integer id;
    /**
     * 样本
     */
    private String sample;
    /**
     * 灰分
     */
    private Double aad;
    /**
     * 水分
     */
    private Double mt;
    /**
     * 硫份
     */
    private Double stad;
    /**
     * 发热量
     */
    private Double qnetar;
    /**
     * 化验时间
     */
    private Date time;
    /**
     * 化验项目
     */
    private String target;
    /**
     * 平均分选密度
     */
    private Double avgDensity;
    /**
     * 平均顶水流量
     */
    private Double avgFlow;
    /**
     * 系统  一期/二期
     */
    private Integer system;
    /**
     * 具体密度与顶水流量信息
     */
    private List<DensityAndFlowInfo> densityAndFlowInfos;

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

    public List<DensityAndFlowInfo> getDensityAndFlowInfos() {
        return densityAndFlowInfos;
    }

    public void setDensityAndFlowInfos(List<DensityAndFlowInfo> densityAndFlowInfos) {
        this.densityAndFlowInfos = densityAndFlowInfos;
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

    @Override
    public String toString() {
        return "CoalAnalysisRecord{" +
                "id=" + id +
                ", sample='" + sample + '\'' +
                ", aad=" + aad +
                ", mt=" + mt +
                ", stad=" + stad +
                ", qnetar=" + qnetar +
                ", time=" + time +
                ", target='" + target + '\'' +
                ", avgDensity=" + avgDensity +
                ", avgFlow=" + avgFlow +
                ", system=" + system +
                ", densityAndFlowInfos=" + densityAndFlowInfos +
                '}';
    }
}
