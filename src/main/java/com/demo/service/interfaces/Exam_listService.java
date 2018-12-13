package com.demo.service.interfaces;


import java.util.List;
import java.util.Map;

import com.demo.model.Exam_db;
import com.demo.model.Exam_list;
import com.demo.model.Exam_options;
import com.github.pagehelper.PageInfo;

public interface Exam_listService {

	public PageInfo<Map> findallexan_list(Exam_list list);
	
	public List<Exam_db> findexam();
	
	public Integer delexam_list(Integer id);
	
	
	public Integer addExam_list(Exam_list list);
	public void addExam_options(Exam_options ooptions);
	public void updateExam_list(Exam_list list);
	
}
