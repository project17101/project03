package com.demo.service.interfaces;

import java.util.List;
import java.util.Map;

import com.demo.model.Edu_statistics_day;

public interface StatisticsService {
	
	public List<Edu_statistics_day> findESD(Edu_statistics_day esd);
	
	public Map getline(Edu_statistics_day esd);
	
	public void delStatistics(Edu_statistics_day esd);

}
