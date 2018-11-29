package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
