package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Exam_db;
import com.demo.service.interfaces.Exam_dbService;
import com.github.pagehelper.PageInfo;

@Controller 
public class Exam_dbController {

	@Autowired
	Exam_dbService exam_dbService;
	
	
	@RequestMapping("findalldb")
	public @ResponseBody Map<String , Object> findalldb(Exam_db db){
		PageInfo<Exam_db> pageinfo = exam_dbService.findalldb(db);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;
	}
	
	@RequestMapping("addexam_db")
	public @ResponseBody Integer addexam_db(Exam_db db){
		exam_dbService.addexam_db(db);
		return null;
	}
	
	@RequestMapping("delexam_db")
	public @ResponseBody Integer delexam_db(Integer id){

		return exam_dbService.delexam_db(id);
	}
	
	@RequestMapping("toupexam_db")
	public @ResponseBody Exam_db toupexam_db(Integer id){
		
		return exam_dbService.toupexam_db(id);
	}
	
	@RequestMapping("upexam_db")
	public @ResponseBody Integer upexam_db(Exam_db db){
		exam_dbService.upexam_db(db);
		return null;
	}
	
	@RequestMapping("findtobing")
	public @ResponseBody List<Map> tobing(Integer id ){
		List<Map> map = exam_dbService.todbing(id);
		return  map;
	}
}
