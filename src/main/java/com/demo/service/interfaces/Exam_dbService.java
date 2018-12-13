package com.demo.service.interfaces;

import java.util.List;
import java.util.Map;

import com.demo.model.Exam_db;
import com.github.pagehelper.PageInfo;

public interface Exam_dbService {
	
	public PageInfo<Exam_db> findalldb(Exam_db db);
	
	public void addexam_db(Exam_db db);
	
	public Integer delexam_db(Integer id);
	
	public Exam_db toupexam_db(Integer id);

	public void upexam_db(Exam_db db);
	
	public List<Map> todbing(Integer id);
	
	public Map tobin(Integer id);

}
