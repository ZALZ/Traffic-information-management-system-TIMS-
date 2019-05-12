package com.danchey.traffic.service;

import com.danchey.traffic.pojo.TrafficUser;

public interface UserService {
	
	Boolean checkUser(TrafficUser user);
	
	Boolean regist(TrafficUser user);

}
