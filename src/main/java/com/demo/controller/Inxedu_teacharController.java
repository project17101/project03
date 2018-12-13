package com.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Teachar;
import com.demo.service.interfaces.Inxedu_teacharService;

@Controller
public class Inxedu_teacharController {

	@Autowired
	Inxedu_teacharService inxedu_teacharService;
	
	@RequestMapping("findallsubject")
	public @ResponseBody List<Map> findallsubject(){
		List<Map> list = inxedu_teacharService.findallsubject();
		return list;
	}
	
	@RequestMapping("findallteachar")
	public @ResponseBody List<Teachar> findallteachar(Integer subject_id){
		List<Teachar> list = inxedu_teacharService.findallteachar(subject_id);
		return list;
	}
	
	@RequestMapping("findallteacharbyid")
	public @ResponseBody Teachar findallteacharbyid(Integer id){
		System.out.println("------------------"+id);
		Teachar teachar = inxedu_teacharService.findallteacharbyid(id);
		System.out.println(teachar);
		return teachar;
	}
}
