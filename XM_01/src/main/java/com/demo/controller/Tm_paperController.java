package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Tm_paper;
import com.demo.service.interfaces.Tm_paperService;
import com.github.pagehelper.PageInfo;

@Controller
public class Tm_paperController {

	@Autowired
	Tm_paperService tm_paparService;
	
	
	@RequestMapping("find_tm_all")
	public @ResponseBody Map<String , Object> findtm_paper(Tm_paper tm_paper){
		System.out.println("-----------------------------------");
		System.out.println(tm_paper.toString());
		PageInfo<Tm_paper> pageinfo = tm_paparService.findtm_paper(tm_paper);
		System.out.println(pageinfo.toString());
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;
	}
}
