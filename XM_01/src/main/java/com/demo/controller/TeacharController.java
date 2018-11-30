package com.demo.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Sys_subject;
import com.demo.model.Teachar;
import com.demo.service.interfaces.TeacharService;
import com.github.pagehelper.PageInfo;

@Controller
public class TeacharController {

	@Autowired
	TeacharService teacharService;
	
	@RequestMapping("findteachar")
	public @ResponseBody Map<String , Object> findteachar(Teachar teachar){
		System.out.println("123456789");
		PageInfo<Teachar> pageinfo = teacharService.findteachar(teachar);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;
	}
	
	@RequestMapping("delteachar")
	public @ResponseBody Integer delteachar(Integer ID){
		return teacharService.delteachar(ID);
	}
	
	@RequestMapping("toaddteacharfindbig")
	public @ResponseBody List<Sys_subject> toadd(){
		
		List<Sys_subject> biglist =teacharService.toaddteacharfindbig();
		return biglist;
	}
	
	@RequestMapping("toaddteacharfindsmall")
	public @ResponseBody List<Sys_subject> toaddsecound(String subject_id ){
		
		List<Sys_subject> smalllist =teacharService.toaddteacharfindsmall(subject_id);
		return smalllist;
	}
	@RequestMapping("addteachar")
	public @ResponseBody Integer addteachar(Teachar teachar){

		teacharService.addteachar(teachar);
		return null;
	}
}
