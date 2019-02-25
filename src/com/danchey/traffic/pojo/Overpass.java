package com.danchey.traffic.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Overpass {
    private Integer id;

    private Date surveytime;

    private Date createtime;

    private Date updatetime;

    private String creater;

    private String investigator;

    private String name;

    private Boolean hasadd;

    private BigDecimal radius;

    private BigDecimal longitudinalgrade;

    private String disturbance;

    private Boolean hasstation;

    private Integer ramptypeId;

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

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }
}