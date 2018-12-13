package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Course_tuijian;
import com.demo.model.edu_website_course;
import com.demo.service.interfaces.CourseServcie;
import com.github.pagehelper.PageInfo;

@Controller
public class CourseController {
 @Autowired
 CourseServcie courseServcie;
 
 @RequestMapping(value="tjlist")
 
 public @ResponseBody Map<String,Object> CourseTJ(Course_tuijian tj){
	 PageInfo<Course_tuijian> pageinfo=courseServcie.findCourseTJ(tj);
	 Map<String,Object> map=new HashMap<String,Object>();
	 map.put("total", pageinfo.getTotal());
	 map.put("rows", pageinfo.getList());
	return map; 
 }
 
 @RequestMapping(value="lxlist")
 @ResponseBody
 public List<edu_website_course> CourseLX(){
	 List<edu_website_course> lxlist=courseServcie.findcourse_lx();
	 return lxlist;
 }
 
 @RequestMapping(value="deltuijian",method=RequestMethod.DELETE)
 @ResponseBody
 public Integer delTJ(Integer id){
	 return courseServcie.deleteTJ(id);
 }
}
