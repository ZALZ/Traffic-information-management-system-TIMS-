package com.danchey.traffic.pojo;

import java.util.Date;

public class Normalintersection {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String creater;

    private String investigator;

    private String name;

    private Integer intoNumber;

    private Integer intoWidth;

    private Integer areaId;

    private Integer controlId;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIntoNumber() {
        return intoNumber;
    }

    public void setIntoNumber(Integer intoNumber) {
        this.intoNumber = intoNumber;
    }

    public Integer getIntoWidth() {
        return intoWidth;
    }

    public void setIntoWidth(Integer intoWidth) {
        this.intoWidth = intoWidth;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getControlId() {
        return controlId;
    }

    public void setControlId(Integer controlId) {
        this.controlId = controlId;
    }
}