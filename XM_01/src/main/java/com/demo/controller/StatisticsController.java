package com.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Edu_statistics_day;
import com.demo.service.interfaces.StatisticsService;

/**
 * @author ZHAIYIBAO
 *	统计
 */
@Controller
public class StatisticsController {
	
	@Autowired
	StatisticsService ss;
	
	/**
	 * @param esd
	 * @return
	 * 	生成统计图
	 */
	@RequestMapping(value="statist",method=RequestMethod.POST)
	@ResponseBody
	public Map findEsd(Edu_statistics_day esd){
		System.out.println("esd:"+esd.toString());
		Map map = ss.getline(esd);
		System.out.println("map:"+map.toString());
		return map;
	}
	
	@RequestMapping(value="statist",method=RequestMethod.DELETE)
	@ResponseBody
	public void delStatistics(Edu_statistics_day esd){
		System.out.println("del esd:"+esd);
		ss.delStatistics(esd);
	}
}
