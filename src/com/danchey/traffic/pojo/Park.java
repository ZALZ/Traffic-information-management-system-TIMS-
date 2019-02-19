package com.danchey.traffic.pojo;

import java.util.Date;

public class Park {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String creater;

    private String investigator;

    private String area;

    private Integer catability;

    private String classification;

    private String businessstatus;

    private Boolean issign;

    private Integer parktypeId;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getCatability() {
        return catability;
    }

    public void setCatability(Integer catability) {
        this.catability = catability;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification == null ? null : classification.trim();
    }

    public String getBusinessstatus() {
        return businessstatus;
    }

    public void setBusinessstatus(String businessstatus) {
        this.businessstatus = businessstatus == null ? null : businessstatus.trim();
    }

    public Boolean getIssign() {
        return issign;
    }

    public void setIssign(Boolean issign) {
        this.issign = issign;
    }

    public Integer getParktypeId() {
        return parktypeId;
    }

    public void setParktypeId(Integer parktypeId) {
        this.parktypeId = parktypeId;
    }
}