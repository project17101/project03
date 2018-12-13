package com.demo.service.interfaces;

import java.util.List;

import com.demo.model.Course_tuijian;
import com.demo.model.edu_website_course;
import com.github.pagehelper.PageInfo;

public interface CourseServcie {
	 public PageInfo<Course_tuijian> findCourseTJ(Course_tuijian tj);
	 public List<edu_website_course> findcourse_lx();
	 public Integer deleteTJ(Integer id);
}
