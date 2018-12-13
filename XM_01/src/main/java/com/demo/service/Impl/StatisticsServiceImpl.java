package com.demo.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.StatisticsMapper;
import com.demo.model.Edu_statistics_day;
import com.demo.service.interfaces.StatisticsService;

@Service
public class StatisticsServiceImpl implements StatisticsService {
	
	@Autowired
	StatisticsMapper sm;

	/**
	 * 查询网站统计数据(带模糊查询)
	 */
	@Override
	public List<Edu_statistics_day> findESD(Edu_statistics_day esd) {
		// TODO Auto- methgeneratedod stub
		return sm.findESD(esd);
	}

	@Override
	public Map getline(Edu_statistics_day esd) {
		// TODO Auto-generated method stub
		
		List categories = new ArrayList();
		List datas = new ArrayList();
		List<Map> list = sm.getline(esd);
		System.out.println("list:"+list.toString());
		for(Map m : list){
			categories.add(m.get("cdate"));
			datas.add(m.get("sumsis"));
		}
		Map<String,List> mlist = new HashMap<String,List>();
		mlist.put("categories", categories);
		mlist.put("datas", datas);
		
		return mlist;
	}

	@Override
	public void delStatistics(Edu_statistics_day esd) {
		// TODO Auto-generated method stub
		sm.delStatistics(esd);
	}

}
