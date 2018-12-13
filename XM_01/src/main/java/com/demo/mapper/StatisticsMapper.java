package com.demo.mapper;

import java.util.List;
import java.util.Map;

import com.demo.model.Edu_statistics_day;

public interface StatisticsMapper {
	
	/**
	 * @param esd
	 * @return
	 * 查询网站统计数据(带模糊查询)
	 */
	public List<Edu_statistics_day> findESD(Edu_statistics_day esd);
	
	public List<Map> getline(Edu_statistics_day esd);
	
	/**
	 * @param esd
	 * 	删除 start_time 和 end_time 之间的统计数据
	 */
	public void delStatistics(Edu_statistics_day esd);

}
