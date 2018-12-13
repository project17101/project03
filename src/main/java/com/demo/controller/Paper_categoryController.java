package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Paper_category;
import com.demo.service.interfaces.Paper_categoryService;
import com.github.pagehelper.PageInfo;

@Controller
public class Paper_categoryController {
	
	@Autowired
	Paper_categoryService paper_categortService;

	
	@RequestMapping("findallcategory")
	public @ResponseBody Map<String , Object> findallcategory(Paper_category category){
		PageInfo<Paper_category> pageinfo = paper_categortService.findallcategory(category);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;
	}
	
	@RequestMapping("addcategory")
	public @ResponseBody String addcategory(Paper_category category){
		paper_categortService.addpaper(category);
		return null;
	}
	
	@RequestMapping("delcategory")
	public @ResponseBody Integer delcategory(Integer c_id){
		
		return paper_categortService.delpaper(c_id);
	}
	
	@RequestMapping("toupcategory")
	public @ResponseBody Paper_category toupcategory (Integer c_id){
		Paper_category paper_category=paper_categortService.toupcategory(c_id);
		return paper_category;
	}
	
	@RequestMapping("upcategory")
	public @ResponseBody Integer upcategory(Paper_category category){
		return paper_categortService.upcategory(category);
	}
}
