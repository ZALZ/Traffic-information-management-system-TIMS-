package com.danchey.traffic.pojo;

import com.danchey.traffic.pojo.Alltype;
import com.danchey.traffic.pojo.Roadstate;

public class RoadStateQueryVo {
	
	private Roadstate roadstate;
	private Alltype roadLevel;
	private Alltype roadBedType;
	
	public Roadstate getRoadstate() {
		return roadstate;
	}
	public void setRoadstate(Roadstate roadstate) {
		this.roadstate = roadstate;
	}
	public Alltype getRoadLevel() {
		return roadLevel;
	}
	public void setRoadLevel(Alltype roadLevel) {
		this.roadLevel = roadLevel;
	}
	public Alltype getRoadBedType() {
		return roadBedType;
	}
	public void setRoadBedType(Alltype roadBedType) {
		this.roadBedType = roadBedType;
	}
	public RoadStateQueryVo(Roadstate roadstate, Alltype roadLevel, Alltype roadBedType) {
		super();
		this.roadstate = roadstate;
		this.roadLevel = roadLevel;
		this.roadBedType = roadBedType;
	}
	
	

}
