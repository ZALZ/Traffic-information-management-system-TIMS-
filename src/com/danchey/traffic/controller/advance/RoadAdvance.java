package com.danchey.traffic.controller.advance;

import java.math.BigDecimal;
import java.util.Date;

public class RoadAdvance {
	private Integer page;
	
	private Integer minId;
	private Integer maxId;

    private Date minsurveytime;
    private Date maxsurveytime;

    private Date mincreatetime;
    private Date maxcreatetime;

    private Date minupdatetime;
    private Date maxupdatetime;
    private String creater;
    private String investigator;
    private String roadname;
    private BigDecimal minlength;
    private BigDecimal maxlength;

    private BigDecimal minincline;
    private BigDecimal maxincline;

    private String section;

    private BigDecimal minmotorwaywidth;
    private BigDecimal maxmotorwaywidth;

    private BigDecimal minsuperwaywidth;
    private BigDecimal maxsuperwaywidth;

    private BigDecimal minpavementwidth;
    private BigDecimal maxpavementwidth;

    private BigDecimal minmedianwidth;
    private BigDecimal maxmedianwidth;

    private BigDecimal minsidesseparatebeltwidth;
    private BigDecimal maxsidesseparatebeltwidth;

    private BigDecimal minredlinewidth;
    private BigDecimal maxredlinewidth;

    private String start;
    private String end;
    private Integer roadlevelId;
	private Integer roadBedId;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getMinId() {
		return minId;
	}

	public void setMinId(Integer minId) {
		this.minId = minId;
	}

	public Integer getMaxId() {
		return maxId;
	}

	public void setMaxId(Integer maxId) {
		this.maxId = maxId;
	}



	public Date getMinsurveytime() {
		return minsurveytime;
	}

	public void setMinsurveytime(Date minsurveytime) {
		this.minsurveytime = minsurveytime;
	}

	public Date getMaxsurveytime() {
		return maxsurveytime;
	}

	public void setMaxsurveytime(Date maxsurveytime) {
		this.maxsurveytime = maxsurveytime;
	}



	public Date getMincreatetime() {
		return mincreatetime;
	}

	public void setMincreatetime(Date mincreatetime) {
		this.mincreatetime = mincreatetime;
	}





	public Date getMinupdatetime() {
		return minupdatetime;
	}

	public void setMinupdatetime(Date minupdatetime) {
		this.minupdatetime = minupdatetime;
	}

	public Date getMaxupdatetime() {
		return maxupdatetime;
	}

	public void setMaxupdatetime(Date maxupdatetime) {
		this.maxupdatetime = maxupdatetime;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getInvestigator() {
		return investigator;
	}

	public void setInvestigator(String investigator) {
		this.investigator = investigator;
	}

	public String getRoadname() {
		return roadname;
	}

	public void setRoadname(String roadname) {
		this.roadname = roadname;
	}



	public BigDecimal getMinlength() {
		return minlength;
	}

	public void setMinlength(BigDecimal minlength) {
		this.minlength = minlength;
	}

	public BigDecimal getMaxlength() {
		return maxlength;
	}

	public void setMaxlength(BigDecimal maxlength) {
		this.maxlength = maxlength;
	}



	public BigDecimal getMinincline() {
		return minincline;
	}

	public void setMinincline(BigDecimal minincline) {
		this.minincline = minincline;
	}

	public BigDecimal getMaxincline() {
		return maxincline;
	}

	public void setMaxincline(BigDecimal maxincline) {
		this.maxincline = maxincline;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public BigDecimal getMinmotorwaywidth() {
		return minmotorwaywidth;
	}

	public void setMinmotorwaywidth(BigDecimal minmotorwaywidth) {
		this.minmotorwaywidth = minmotorwaywidth;
	}

	public BigDecimal getMaxmotorwaywidth() {
		return maxmotorwaywidth;
	}

	public void setMaxmotorwaywidth(BigDecimal maxmotorwaywidth) {
		this.maxmotorwaywidth = maxmotorwaywidth;
	}



	public BigDecimal getMinsuperwaywidth() {
		return minsuperwaywidth;
	}

	public void setMinsuperwaywidth(BigDecimal minsuperwaywidth) {
		this.minsuperwaywidth = minsuperwaywidth;
	}

	public BigDecimal getMaxsuperwaywidth() {
		return maxsuperwaywidth;
	}

	public void setMaxsuperwaywidth(BigDecimal maxsuperwaywidth) {
		this.maxsuperwaywidth = maxsuperwaywidth;
	}


	public BigDecimal getMinpavementwidth() {
		return minpavementwidth;
	}

	public void setMinpavementwidth(BigDecimal minpavementwidth) {
		this.minpavementwidth = minpavementwidth;
	}

	public BigDecimal getMaxpavementwidth() {
		return maxpavementwidth;
	}

	public void setMaxpavementwidth(BigDecimal maxpavementwidth) {
		this.maxpavementwidth = maxpavementwidth;
	}



	public BigDecimal getMinmedianwidth() {
		return minmedianwidth;
	}

	public void setMinmedianwidth(BigDecimal minmedianwidth) {
		this.minmedianwidth = minmedianwidth;
	}

	public BigDecimal getMaxmedianwidth() {
		return maxmedianwidth;
	}

	public void setMaxmedianwidth(BigDecimal maxmedianwidth) {
		this.maxmedianwidth = maxmedianwidth;
	}



	public BigDecimal getMinsidesseparatebeltwidth() {
		return minsidesseparatebeltwidth;
	}

	public void setMinsidesseparatebeltwidth(BigDecimal minsidesseparatebeltwidth) {
		this.minsidesseparatebeltwidth = minsidesseparatebeltwidth;
	}

	public BigDecimal getMaxsidesseparatebeltwidth() {
		return maxsidesseparatebeltwidth;
	}

	public void setMaxsidesseparatebeltwidth(BigDecimal maxsidesseparatebeltwidth) {
		this.maxsidesseparatebeltwidth = maxsidesseparatebeltwidth;
	}


	public BigDecimal getMinredlinewidth() {
		return minredlinewidth;
	}

	public void setMinredlinewidth(BigDecimal minredlinewidth) {
		this.minredlinewidth = minredlinewidth;
	}

	public BigDecimal getMaxredlinewidth() {
		return maxredlinewidth;
	}

	public void setMaxredlinewidth(BigDecimal maxredlinewidth) {
		this.maxredlinewidth = maxredlinewidth;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Integer getRoadlevelId() {
		return roadlevelId;
	}

	public void setRoadlevelId(Integer roadlevelId) {
		this.roadlevelId = roadlevelId;
	}

	public Date getMaxcreatetime() {
		return maxcreatetime;
	}

	public void setMaxcreatetime(Date maxcreatetime) {
		this.maxcreatetime = maxcreatetime;
	}

	public Integer getRoadBedId() {
		return roadBedId;
	}

	public void setRoadBedId(Integer roadBedId) {
		this.roadBedId = roadBedId;
	}
	
	

}
