package com.danchey.traffic.service;

import java.util.List;

import org.springframework.ui.Model;

import com.danchey.traffic.pojo.RoadStateQueryVo;

public interface RoadStateQueryVoService {
	//��ѯ����
	public List<RoadStateQueryVo> selectAll();
	//��ѯ������¼
	public RoadStateQueryVo selectByRoadId(int id);
	//ͨ����·�ȼ���ѯ
	public List<RoadStateQueryVo> selectByRoadLevelId(Integer id);
	//ͨ��·�����Ͳ�ѯ
	public List<RoadStateQueryVo> selectByRoadBedTypelId(Integer id);
	
	public List<RoadStateQueryVo> selectByPage(Integer page,Model model);
	
}
