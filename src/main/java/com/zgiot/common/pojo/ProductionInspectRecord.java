package com.zgiot.common.pojo;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ProductionInspectRecord implements ReportFormsRecord {
    private Integer id;
    /**
     * 样本
     */
    private String sample;
    private Double positive1Point45;
    private Double negative1Point45;
    private Double positive1Point8;
    private Double negative1Point8;
    private Double onePoint45To1Point8;
    private Double positive50mm;
    private Double negative50mm;
    /**
     * 化验时间
     */
    private Date time;
    /**
     * 化验密度
     */
    private String target;
    /**
     * 平均分选密度
     */
    private Double avgDensity;
    private Double avgFlow;

    /**
     * 系统  一期/二期
     */
    private Integer system;
    /**
     * 具体密度与顶水流量信息
     */
    private List<DensityAndFlowInfo> densityAndFlowInfos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public Double getPositive1Point45() {
        return positive1Point45;
    }

    public void setPositive1Point45(Double positive1Point45) {
        this.positive1Point45 = positive1Point45;
    }

    public Double getNegative1Point45() {
        return negative1Point45;
    }

    public void setNegative1Point45(Double negative1Point45) {
        this.negative1Point45 = negative1Point45;
    }

    public Double getPositive1Point8() {
        return positive1Point8;
    }

    public void setPositive1Point8(Double positive1Point8) {
        this.positive1Point8 = positive1Point8;
    }

    public Double getNegative1Point8() {
        return negative1Point8;
    }

    public void setNegative1Point8(Double negative1Point8) {
        this.negative1Point8 = negative1Point8;
    }

    public Double getOnePoint45To1Point8() {
        return onePoint45To1Point8;
    }

    public void setOnePoint45To1Point8(Double onePoint45To1Point8) {
        this.onePoint45To1Point8 = onePoint45To1Point8;
    }

    public Double getPositive50mm() {
        return positive50mm;
    }

    public void setPositive50mm(Double positive50mm) {
        this.positive50mm = positive50mm;
    }

    public Double getNegative50mm() {
        return negative50mm;
    }

    public void setNegative50mm(Double negative50mm) {
        this.negative50mm = negative50mm;
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

    public List<DensityAndFlowInfo> getDensityAndFlowInfos() {
        return densityAndFlowInfos;
    }

    public void setDensityAndFlowInfos(List<DensityAndFlowInfo> densityAndFlowInfos) {
        this.densityAndFlowInfos = densityAndFlowInfos;
    }

    public boolean isEmpty() {
        return positive1Point45 == null &&
                negative1Point45 == null &&
                positive1Point8 == null &&
                negative1Point8 == null &&
                onePoint45To1Point8 == null &&
                positive50mm == null &&
                negative50mm == null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductionInspectRecord that = (ProductionInspectRecord) o;
        return Objects.equals(sample, that.sample) &&
                Objects.equals(positive1Point45, that.positive1Point45) &&
                Objects.equals(negative1Point45, that.negative1Point45) &&
                Objects.equals(positive1Point8, that.positive1Point8) &&
                Objects.equals(negative1Point8, that.negative1Point8) &&
                Objects.equals(onePoint45To1Point8, that.onePoint45To1Point8) &&
                Objects.equals(positive50mm, that.positive50mm) &&
                Objects.equals(negative50mm, that.negative50mm) &&
                Objects.equals(time, that.time) &&
                Objects.equals(target, that.target);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sample, positive1Point45, negative1Point45, positive1Point8, negative1Point8, onePoint45To1Point8, positive50mm, negative50mm, time, target);
    }

    @Override
    public Double getAvgFlow() {
        return avgFlow;
    }

    public void setAvgFlow(Double avgFlow) {
        this.avgFlow = avgFlow;
    }

    @Override
    public String toString() {
        return "ProductionInspectRecord{" +
                "id=" + id +
                ", sample='" + sample + '\'' +
                ", positive1Point45=" + positive1Point45 +
                ", negative1Point45=" + negative1Point45 +
                ", positive1Point8=" + positive1Point8 +
                ", negative1Point8=" + negative1Point8 +
                ", onePoint45To1Point8=" + onePoint45To1Point8 +
                ", positive50mm=" + positive50mm +
                ", negative50mm=" + negative50mm +
                ", time=" + time +
                ", target='" + target + '\'' +
                ", avgDensity=" + avgDensity +
                ", avgFlow=" + avgFlow +
                ", system=" + system +
                ", densityAndFlowInfos=" + densityAndFlowInfos +
                '}';
    }
}
