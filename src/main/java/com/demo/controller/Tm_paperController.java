package com.demo.controller;

import java.util.HashMap;
import java.util.List;
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
		PageInfo<Tm_paper> pageinfo = tm_paparService.findtm_paper(tm_paper);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;
	}
	
	@RequestMapping("findcategoryname")
	public @ResponseBody List<Map> findcategoryname(){
		List <Map> mlist = tm_paparService.findcategoryname();

		return mlist;
	}
	
	@RequestMapping("addtm_paper")
	public @ResponseBody Map addpaper(Tm_paper tm_paper) {
		System.out.println("------------------"+tm_paper);
		if (null == tm_paper.getP_pass_score()) {
			tm_paper.setP_pass_score(60);
		}
		if (tm_paper.getP_total_score() == null) {
			tm_paper.setP_total_score(100);
		}
		tm_paparService.addtm_paper(tm_paper);
		Map map = new HashMap<>();
		map.put("code", "1"); // 返回给前台代表添加成功
		return map;
	}
	
	
	@RequestMapping("initcategory")
	public @ResponseBody List<Map> findcnameandcid(){
		List<Map> mlist= tm_paparService.findcnameandcid();
		return mlist;
	}
	
	@RequestMapping("deltm_paperbyid")
	public @ResponseBody Integer deltm_paperbyid(Integer p_id){
		System.out.println("------------------进入删除");
		return tm_paparService.deltm_paperbyid(p_id);
	}
	
	@RequestMapping("tm_papertoupdate")
	public @ResponseBody Tm_paper findtm_paperbypid(Integer p_id){
		return tm_paparService.findtm_paperbypid(p_id);
	}
	
	@RequestMapping("updatetmpaper")
	public @ResponseBody String updatetmpaper(Tm_paper tm_paper){
		if (null == tm_paper.getP_pass_score()) {
			tm_paper.setP_pass_score(60);
		}
		if (tm_paper.getP_total_score() == null) {
			tm_paper.setP_total_score(100);
		}
		tm_paparService.updatetmpaper(tm_paper);
		return null;
	}

}
