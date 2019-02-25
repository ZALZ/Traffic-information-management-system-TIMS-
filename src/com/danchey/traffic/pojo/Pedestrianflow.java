package com.danchey.traffic.pojo;

import java.util.Date;

public class Pedestrianflow {
    private Integer id;

    private Date createtime;

    private Date updatetime;

    private String creater;

    private String investigator;

    private Short total;

    private Short violation;

    private Short number;

    private Date surveytime;

    private Integer intersectionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Short getTotal() {
        return total;
    }

    public void setTotal(Short total) {
        this.total = total;
    }

    public Short getViolation() {
        return violation;
    }

    public void setViolation(Short violation) {
        this.violation = violation;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Date getSurveytime() {
        return surveytime;
    }

    public void setSurveytime(Date surveytime) {
        this.surveytime = surveytime;
    }

    public Integer getIntersectionId() {
        return intersectionId;
    }

    public void setIntersectionId(Integer intersectionId) {
        this.intersectionId = intersectionId;
    }
}