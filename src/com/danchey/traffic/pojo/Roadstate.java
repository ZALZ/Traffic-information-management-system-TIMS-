package com.danchey.traffic.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Roadstate {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String creater;

    private String investigator;

    private String roadName;

    private String roadType;

    private BigDecimal length;

    private BigDecimal incline;

    private String sectionForm;

    private BigDecimal motorwayWidth;

    private BigDecimal superWayWidth;

    private BigDecimal pavementWidth;

    private BigDecimal medianWidth;

    private BigDecimal sidesSeparateBeltWidth;

    private BigDecimal redLineWidth;

    private String start;

    private String end;

    private Integer roadbedTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getInvestigator() {
        return investigator;
    }

    public void setInvestigator(String investigator) {
        this.investigator = investigator == null ? null : investigator.trim();
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName == null ? null : roadName.trim();
    }

    public String getRoadType() {
        return roadType;
    }

    public void setRoadType(String roadType) {
        this.roadType = roadType == null ? null : roadType.trim();
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getIncline() {
        return incline;
    }

    public void setIncline(BigDecimal incline) {
        this.incline = incline;
    }

    public String getSectionForm() {
        return sectionForm;
    }

    public void setSectionForm(String sectionForm) {
        this.sectionForm = sectionForm == null ? null : sectionForm.trim();
    }

    public BigDecimal getMotorwayWidth() {
        return motorwayWidth;
    }

    public void setMotorwayWidth(BigDecimal motorwayWidth) {
        this.motorwayWidth = motorwayWidth;
    }

    public BigDecimal getSuperWayWidth() {
        return superWayWidth;
    }

    public void setSuperWayWidth(BigDecimal superWayWidth) {
        this.superWayWidth = superWayWidth;
    }

    public BigDecimal getPavementWidth() {
        return pavementWidth;
    }

    public void setPavementWidth(BigDecimal pavementWidth) {
        this.pavementWidth = pavementWidth;
    }

    public BigDecimal getMedianWidth() {
        return medianWidth;
    }

    public void setMedianWidth(BigDecimal medianWidth) {
        this.medianWidth = medianWidth;
    }

    public BigDecimal getSidesSeparateBeltWidth() {
        return sidesSeparateBeltWidth;
    }

    public void setSidesSeparateBeltWidth(BigDecimal sidesSeparateBeltWidth) {
        this.sidesSeparateBeltWidth = sidesSeparateBeltWidth;
    }

    public BigDecimal getRedLineWidth() {
        return redLineWidth;
    }

    public void setRedLineWidth(BigDecimal redLineWidth) {
        this.redLineWidth = redLineWidth;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end == null ? null : end.trim();
    }

    public Integer getRoadbedTypeId() {
        return roadbedTypeId;
    }

    public void setRoadbedTypeId(Integer roadbedTypeId) {
        this.roadbedTypeId = roadbedTypeId;
    }
}