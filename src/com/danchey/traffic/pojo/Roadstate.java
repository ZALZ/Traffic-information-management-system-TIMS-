package com.danchey.traffic.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Roadstate {
    private Integer id;

    private Date surveytime;

    private Date createtime;

    private Date updatetime;

    private String creater;

    private String investigator;

    private String roadname;

    private BigDecimal length;

    private BigDecimal incline;

    private String section;

    private BigDecimal motorwaywidth;

    private BigDecimal superwaywidth;

    private BigDecimal pavementwidth;

    private BigDecimal medianwidth;

    private BigDecimal sidesseparatebeltwidth;

    private BigDecimal redlinewidth;

    private String start;

    private String end;

    private Integer roadlevelId;

    private Integer roadbedtypeId;

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

    public String getRoadname() {
        return roadname;
    }

    public void setRoadname(String roadname) {
        this.roadname = roadname == null ? null : roadname.trim();
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getIncline() {
        return incline;
    }

    public void setIncline(BigDecimal incline) {
        this.incline = incline;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section == null ? null : section.trim();
    }

    public BigDecimal getMotorwaywidth() {
        return motorwaywidth;
    }

    public void setMotorwaywidth(BigDecimal motorwaywidth) {
        this.motorwaywidth = motorwaywidth;
    }

    public BigDecimal getSuperwaywidth() {
        return superwaywidth;
    }

    public void setSuperwaywidth(BigDecimal superwaywidth) {
        this.superwaywidth = superwaywidth;
    }

    public BigDecimal getPavementwidth() {
        return pavementwidth;
    }

    public void setPavementwidth(BigDecimal pavementwidth) {
        this.pavementwidth = pavementwidth;
    }

    public BigDecimal getMedianwidth() {
        return medianwidth;
    }

    public void setMedianwidth(BigDecimal medianwidth) {
        this.medianwidth = medianwidth;
    }

    public BigDecimal getSidesseparatebeltwidth() {
        return sidesseparatebeltwidth;
    }

    public void setSidesseparatebeltwidth(BigDecimal sidesseparatebeltwidth) {
        this.sidesseparatebeltwidth = sidesseparatebeltwidth;
    }

    public BigDecimal getRedlinewidth() {
        return redlinewidth;
    }

    public void setRedlinewidth(BigDecimal redlinewidth) {
        this.redlinewidth = redlinewidth;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end == null ? null : end.trim();
    }

    public Integer getRoadlevelId() {
        return roadlevelId;
    }

    public void setRoadlevelId(Integer roadlevelId) {
        this.roadlevelId = roadlevelId;
    }

    public Integer getRoadbedtypeId() {
        return roadbedtypeId;
    }

    public void setRoadbedtypeId(Integer roadbedtypeId) {
        this.roadbedtypeId = roadbedtypeId;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

	@Override
	public String toString() {
		return "Roadstate [id=" + id + ", surveytime=" + surveytime + ", createtime=" + createtime + ", updatetime="
				+ updatetime + ", creater=" + creater + ", investigator=" + investigator + ", roadname=" + roadname
				+ ", length=" + length + ", incline=" + incline + ", section=" + section + ", motorwaywidth="
				+ motorwaywidth + ", superwaywidth=" + superwaywidth + ", pavementwidth=" + pavementwidth
				+ ", medianwidth=" + medianwidth + ", sidesseparatebeltwidth=" + sidesseparatebeltwidth
				+ ", redlinewidth=" + redlinewidth + ", start=" + start + ", end=" + end + ", roadlevelId="
				+ roadlevelId + ", roadbedtypeId=" + roadbedtypeId + ", coordinate=" + coordinate + "]";
	}
}