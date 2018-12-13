package com.demo.mapper;

import java.util.List;
import java.util.Map;

import com.demo.model.Exam_db;

public interface Exam_dbMapper {
	
	//查询所有数据
	public List<Exam_db> findalldb();
	
	//添加一条数据
	public void addexam_db(Exam_db db);
	
	//删除一条数据
	public Integer delexam_db(Integer id);
	
	//到修改
	public Exam_db toupexam_db(Integer id);
	
	//根据id修改一条数据
	public void upexam_db(Exam_db db);
	
	//根据id查询饼状图数据
	public List<Map> todbing(Integer id);
	public Map tobin(Integer id);

}
