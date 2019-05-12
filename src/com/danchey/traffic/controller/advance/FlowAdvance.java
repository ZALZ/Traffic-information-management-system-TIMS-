package com.danchey.traffic.controller.advance;

import java.util.Date;

public class FlowAdvance {
	private Integer page;

	private Integer minId;
	private Integer maxId;

	private Date minsurveytime;
	private Date maxsurveytime;

	private Date mincreatetime;
	private Date maxcreatetime;

	private Date minupdatetime;
	private Date maxupdatetime;
    
    private String name;

	private String creater;

	private String investigator;
	
	private Integer intersectionId;
	
    private Integer mintotal;
    private Integer maxtotal;

    private Integer minviolation;
    private Integer maxviolation;

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

	public Integer getMintotal() {
		return mintotal;
	}

	public void setMintotal(Integer mintotal) {
		this.mintotal = mintotal;
	}

	public Integer getMaxtotal() {
		return maxtotal;
	}

	public void setMaxtotal(Integer maxtotal) {
		this.maxtotal = maxtotal;
	}

	public Integer getMinviolation() {
		return minviolation;
	}

	public void setMinviolation(Integer minviolation) {
		this.minviolation = minviolation;
	}

	public Integer getMaxviolation() {
		return maxviolation;
	}

	public void setMaxviolation(Integer maxviolation) {
		this.maxviolation = maxviolation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIntersectionId() {
		return intersectionId;
	}

	public void setIntersectionId(Integer intersectionId) {
		this.intersectionId = intersectionId;
	}

}
