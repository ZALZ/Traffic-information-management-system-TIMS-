package com.danchey.traffic.pojo;

public class Ramptype {
    private Integer id;

    private String rampType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRampType() {
        return rampType;
    }

    public void setRampType(String rampType) {
        this.rampType = rampType == null ? null : rampType.trim();
    }
}