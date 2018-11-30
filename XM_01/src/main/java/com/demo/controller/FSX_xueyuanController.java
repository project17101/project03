package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.FSX_xueyuan;
import com.demo.model.FSX_xueyuanchengji;
import com.demo.model.PageBean;
import com.demo.service.interfaces.FSX_xueyuanService;
import com.github.pagehelper.PageInfo;

@Controller
public class FSX_xueyuanController {
  
	@Autowired
	FSX_xueyuanService xueyuanservice;
	
	@RequestMapping(value="xueyuanliebiao",method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> xueyuanquanbu(FSX_xueyuan fsx_xueyuan){
	
		
		PageInfo<FSX_xueyuan> pageinfo=xueyuanservice.xueyuan(fsx_xueyuan);
		
		Map map=new HashMap<>();
		map.put("rows", pageinfo.getList());
		map.put("total", pageinfo.getTotal());
		
	
		return map;
	} 
	
	@RequestMapping(value="banji",method=RequestMethod.POST)
	public @ResponseBody List<Map> banji(FSX_xueyuan fsx_xueyuan){
		
		List<Map> list=xueyuanservice.xialakuang();
		
		
		return list;
	}
	@RequestMapping(value="uppassword")
	public @ResponseBody Integer update(FSX_xueyuan fsx_xueyuan){
		System.out.println("-----------------ÐÞ¸ÄÃÜÂë");
		xueyuanservice.upedate(fsx_xueyuan);
		return 0;
	}
	
	@RequestMapping(value="djie")
	public @ResponseBody Integer djie(FSX_xueyuan fsx_xueyuan){
		System.out.println(fsx_xueyuan.getUser_id()+fsx_xueyuan.getIs_avalible()+"------------------------¶³½á");
		xueyuanservice.djie(fsx_xueyuan);
		return 0;
	}
	
	
	@RequestMapping(value="xueyuanchengji",method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> chengji(FSX_xueyuanchengji fsx){
		PageInfo<FSX_xueyuanchengji> pageinfo=xueyuanservice.chengji(fsx);
		
		Map map=new HashMap<>();
		map.put("rows", pageinfo.getList());
		map.put("total", pageinfo.getTotal());
		return map;
	} 
	@RequestMapping(value="shijuan")
	public @ResponseBody List<FSX_xueyuanchengji> shijuan(){
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!ÊÔ¾í");
		List<FSX_xueyuanchengji> list=xueyuanservice.shijuan();
		return list;
	}
	

}
