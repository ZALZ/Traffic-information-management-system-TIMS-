package com.danchey.traffic.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Roundabout {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String creater;

    private String investigator;

    private String name;

    private BigDecimal radius;

    private String turningdivided;

    private BigDecimal turningwidth;

    private Boolean isseparate;

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

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
    }

    public String getTurningdivided() {
        return turningdivided;
    }

    public void setTurningdivided(String turningdivided) {
        this.turningdivided = turningdivided == null ? null : turningdivided.trim();
    }

    public BigDecimal getTurningwidth() {
        return turningwidth;
    }

    public void setTurningwidth(BigDecimal turningwidth) {
        this.turningwidth = turningwidth;
    }

    public Boolean getIsseparate() {
        return isseparate;
    }

    public void setIsseparate(Boolean isseparate) {
        this.isseparate = isseparate;
    }
}