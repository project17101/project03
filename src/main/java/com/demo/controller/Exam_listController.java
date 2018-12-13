package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Exam_db;
import com.demo.model.Exam_list;
import com.demo.model.Exam_options;
import com.demo.service.interfaces.Exam_listService;
import com.demo.until.JsonUtils;
import com.github.pagehelper.PageInfo;

@Controller
public class Exam_listController {
	
	@Autowired
	Exam_listService exam_listService;

	@RequestMapping("findallexan_list")
	public @ResponseBody Map<String , Object> findExam_list(Exam_list list){
		PageInfo<Map> pageinfo = exam_listService.findallexan_list(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;
	}
	
	@RequestMapping("finddname")
	public @ResponseBody List<Exam_db> finddname(){
		List <Exam_db> dlist=exam_listService.findexam();
		return dlist;
	}
	
	@RequestMapping("delexam_list")
	public @ResponseBody Integer delexam_list(Integer id){
		System.out.println("---------------------+进入删除"+id);
		return exam_listService.delexam_list(id);
	}
	
	@RequestMapping("addexam_list")
	public @ResponseBody Integer addexam_list(Exam_list list, HttpServletRequest request,String q_key){
		exam_listService.addExam_list(list);
		
		String[] q_options = request.getParameterValues("q_options");
		String[] arr = { "A", "B", "C", "D" };
		
		if (list.getQtype() == 1) {
			for (int i = 0; i < q_options.length; i++) {
				Exam_options option = new Exam_options();
				option.setQid(list.getId());
				option.setOpt(arr[i]);
				option.setSoption(JsonUtils.fs(q_options[i]));
				exam_listService.addExam_options(option);
			}
			//String q_key = request.getParameter("q_key");
			list.setSkey(q_key);
		}
		if (list.getQtype() == 2) {
			for (int i = 0; i < q_options.length; i++) {
				Exam_options option = new Exam_options();
				option.setQid(list.getId());
				option.setOpt(arr[i]);
				option.setSoption(q_options[i]);
				exam_listService.addExam_options(option);
			}
			String[] q_keys = request.getParameterValues("q_key");
			String keys = "";
			for (int i = 0; i < q_keys.length; i++) {
				keys += q_keys[i] + ",";
			}
			if (keys.length() > 0) {
				keys = keys.substring(0, keys.length() - 1);
			}
			list.setSkey(keys);
		}
		exam_listService.updateExam_list(list);
		return null;
	}
}
