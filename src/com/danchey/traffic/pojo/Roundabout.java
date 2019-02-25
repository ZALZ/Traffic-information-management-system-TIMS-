package com.danchey.traffic.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Roundabout {
    private Integer id;

    private Date surveytime;

    private Date createtime;

    private Date updatetime;

    private String creater;

    private String investigator;

    private String name;

    private Integer intonumber;

    private BigDecimal radius;

    private BigDecimal turningwidth;

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

    public Integer getIntonumber() {
        return intonumber;
    }

    public void setIntonumber(Integer intonumber) {
        this.intonumber = intonumber;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
    }

    public BigDecimal getTurningwidth() {
        return turningwidth;
    }

    public void setTurningwidth(BigDecimal turningwidth) {
        this.turningwidth = turningwidth;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }
}