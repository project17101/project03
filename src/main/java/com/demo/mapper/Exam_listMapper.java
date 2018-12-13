package com.demo.mapper;

import java.util.List;
import java.util.Map;

import com.demo.model.Exam_db;
import com.demo.model.Exam_list;
import com.demo.model.Exam_options;


public interface Exam_listMapper {
	
	//查询试题管理的所有数据
	public List<Map> findallexan_list(Exam_list list);
	
	//查询所属题库
	public List<Exam_db> findexam();
	
	//删除试题
	public Integer delexam_list(Integer id);
	
	//添加试题和选项
	public Integer addExam_list(Exam_list list);
	public void addExam_options(Exam_options ooptions);
	public void updateExam_list(Exam_list list);
	
}
