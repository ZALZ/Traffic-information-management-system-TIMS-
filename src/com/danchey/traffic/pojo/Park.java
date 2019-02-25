package com.danchey.traffic.pojo;

import java.util.Date;

public class Park {
    private Integer id;

    private Date surveytime;

    private Date createtime;

    private Date updatetime;

    private String creater;

    private String investigator;

    private String name;

    private String area;

    private Integer catability;

    private String classification;

    private String businessstatus;

    private Integer parktypeId;

    private String coordinate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSurveytime() {
        return surveytime;
    }

    public void setSurveytime(Date surveytime) {
        this.surveytime = surveytime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getParktypeId() {
        return parktypeId;
    }

    public void setParktypeId(Integer parktypeId) {
        this.parktypeId = parktypeId;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }
}