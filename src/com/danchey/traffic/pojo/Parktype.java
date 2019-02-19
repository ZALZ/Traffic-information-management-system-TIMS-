package com.danchey.traffic.pojo;

public class Parktype {
    private Integer id;

    private String parkType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParkType() {
        return parkType;
    }

    public void setParkType(String parkType) {
        this.parkType = parkType == null ? null : parkType.trim();
    }
}