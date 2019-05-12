package com.danchey.traffic.pojo;

import java.util.Date;
import java.util.List;

public class CounterAndLocation {
	private Date surveyTime;
	
	private double percent;
	
	private String location;
	
	private Integer InersectionId;

	public Date getSurveyTime() {
		return surveyTime;
	}

	public void setSurveyTime(Date surveyTime) {
		this.surveyTime = surveyTime;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getInersectionId() {
		return InersectionId;
	}

	public void setInersectionId(Integer inersectionId) {
		InersectionId = inersectionId;
	}
	
	
}
