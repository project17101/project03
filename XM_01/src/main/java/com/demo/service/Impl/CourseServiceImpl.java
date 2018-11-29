package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.CourseMapper;
import com.demo.model.Course_tuijian;
import com.demo.model.edu_website_course;
import com.demo.service.interfaces.CourseServcie;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CourseServiceImpl implements CourseServcie {

	@Autowired
	CourseMapper courseMapper;
	@Override
	public PageInfo<Course_tuijian> findCourseTJ(Course_tuijian tj) {
		// TODO Auto-generated method stub
		Integer startrow=tj.getStartrow();
		Integer pagesize=tj.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);
		List<Course_tuijian> tjlist=courseMapper.findCourseTJ(tj);
		PageInfo<Course_tuijian> pageinfo=new PageInfo<>(tjlist); 

		return pageinfo;
	}
	@Override
	public List<edu_website_course> findcourse_lx() {
		// TODO Auto-generated method stub
		return courseMapper.findcourse_lx();
	}
	@Override
	public Integer deleteTJ(Integer id) {
		return courseMapper.deleteTJ(id);
	}

}
