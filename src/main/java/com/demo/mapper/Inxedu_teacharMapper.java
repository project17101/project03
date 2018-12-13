package com.demo.mapper;

import java.util.List;
import java.util.Map;

import com.demo.model.Teachar;

public interface Inxedu_teacharMapper {

	//查询所有课程分类
	public List<Map> findallsubject();
	
	//查询所有的教师分类
	public List<Teachar> findallteachar(Map<String,Integer> map);
	
	//根据id查询教师的详细信息
	public Teachar findallteacharbyid(Integer id);
}
