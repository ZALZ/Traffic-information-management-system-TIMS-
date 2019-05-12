package com.danchey.traffic.controller.advance;

import java.math.BigDecimal;
import java.util.Date;

public class OverpassAdvance {
	private Integer page;

	private Integer minId;
	private Integer maxId;

	private Date minsurveytime;
	private Date maxsurveytime;

	private Date mincreatetime;
	private Date maxcreatetime;

	private Date minupdatetime;
	private Date maxupdatetime;
	
	private String disturbance;

	private String creater;

	private String investigator;
	
    private String name;
    
    private Boolean hasadd;

    private BigDecimal minradius;
    private BigDecimal maxradius;

    private BigDecimal minlongitudinalgrade;
    private BigDecimal maxlongitudinalgrade;

    private Boolean hasstation;

    private Integer ramptypeId;

    private String coordinate;

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

	public Date getMaxcreatetime() {
		return maxcreatetime;
	}

	public void setMaxcreatetime(Date maxcreatetime) {
		this.maxcreatetime = maxcreatetime;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getHasadd() {
		return hasadd;
	}

	public void setHasadd(Boolean hasadd) {
		this.hasadd = hasadd;
	}

	public BigDecimal getMinradius() {
		return minradius;
	}

	public void setMinradius(BigDecimal minradius) {
		this.minradius = minradius;
	}

	public BigDecimal getMaxradius() {
		return maxradius;
	}

	public void setMaxradius(BigDecimal maxradius) {
		this.maxradius = maxradius;
	}

	public BigDecimal getMinlongitudinalgrade() {
		return minlongitudinalgrade;
	}

	public void setMinlongitudinalgrade(BigDecimal minlongitudinalgrade) {
		this.minlongitudinalgrade = minlongitudinalgrade;
	}

	public BigDecimal getMaxlongitudinalgrade() {
		return maxlongitudinalgrade;
	}

	public void setMaxlongitudinalgrade(BigDecimal maxlongitudinalgrade) {
		this.maxlongitudinalgrade = maxlongitudinalgrade;
	}

	public Boolean getHasstation() {
		return hasstation;
	}

	public void setHasstation(Boolean hasstation) {
		this.hasstation = hasstation;
	}

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	public Integer getRamptypeId() {
		return ramptypeId;
	}

	public void setRamptypeId(Integer ramptypeId) {
		this.ramptypeId = ramptypeId;
	}

	public String getDisturbance() {
		return disturbance;
	}

	public void setDisturbance(String disturbance) {
		this.disturbance = disturbance;
	}

}
