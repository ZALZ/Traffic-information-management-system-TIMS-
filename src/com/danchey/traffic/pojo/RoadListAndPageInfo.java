package com.danchey.traffic.pojo;

import java.util.List;

import com.github.pagehelper.PageInfo;

public class RoadListAndPageInfo {
	
	private List<Roadstate> roadList;
	private PageInfo pageInfo;
	public List<Roadstate> getRoadList() {
		return roadList;
	}
	public void setRoadList(List<Roadstate> roadList) {
		this.roadList = roadList;
	}
	public PageInfo getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	public RoadListAndPageInfo(List<Roadstate> roadList, PageInfo pageInfo) {
		super();
		this.roadList = roadList;
		this.pageInfo = pageInfo;
	}

}
