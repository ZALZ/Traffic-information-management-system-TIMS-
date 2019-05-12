package com.danchey.traffic.controller.advance;

import java.math.BigDecimal;
import java.util.Date;

public class NormalAdvanceAttr {
	private Integer page;

	private Integer id;
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
	
    private String name;

    private Integer minIntonumber;
    private Integer maxIntonumber;

    private BigDecimal maxIntowidth;
    private BigDecimal minIntowidth;
    private Integer areatypeId;

    private Integer controltypeId;

    private String coordinate;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getMinIntonumber() {
		return minIntonumber;
	}

	public void setMinIntonumber(Integer minIntonumber) {
		this.minIntonumber = minIntonumber;
	}

	public Integer getMaxIntonumber() {
		return maxIntonumber;
	}

	public void setMaxIntonumber(Integer maxIntonumber) {
		this.maxIntonumber = maxIntonumber;
	}

	public BigDecimal getMaxIntowidth() {
		return maxIntowidth;
	}

	public void setMaxIntowidth(BigDecimal maxIntowidth) {
		this.maxIntowidth = maxIntowidth;
	}

	public BigDecimal getMinIntowidth() {
		return minIntowidth;
	}

	public void setMinIntowidth(BigDecimal minIntowidth) {
		this.minIntowidth = minIntowidth;
	}

	public Integer getAreatypeId() {
		return areatypeId;
	}

	public void setAreatypeId(Integer areatypeId) {
		this.areatypeId = areatypeId;
	}

	public Integer getControltypeId() {
		return controltypeId;
	}

	public void setControltypeId(Integer controltypeId) {
		this.controltypeId = controltypeId;
	}

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

}
