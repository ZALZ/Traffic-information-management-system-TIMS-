package com.danchey.traffic.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Overpass {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String creater;

    private String investigator;

    private String name;

    private Boolean hasadd;

    private BigDecimal radius;

    private BigDecimal longitudinalgrade;

    private String disturbance;

    private Boolean hasstation;

    private Integer ramptypeId;

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

    public Boolean getHasadd() {
        return hasadd;
    }

    public void setHasadd(Boolean hasadd) {
        this.hasadd = hasadd;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
    }

    public BigDecimal getLongitudinalgrade() {
        return longitudinalgrade;
    }

    public void setLongitudinalgrade(BigDecimal longitudinalgrade) {
        this.longitudinalgrade = longitudinalgrade;
    }

    public String getDisturbance() {
        return disturbance;
    }

    public void setDisturbance(String disturbance) {
        this.disturbance = disturbance == null ? null : disturbance.trim();
    }

    public Boolean getHasstation() {
        return hasstation;
    }

    public void setHasstation(Boolean hasstation) {
        this.hasstation = hasstation;
    }

    public Integer getRamptypeId() {
        return ramptypeId;
    }

    public void setRamptypeId(Integer ramptypeId) {
        this.ramptypeId = ramptypeId;
    }
}