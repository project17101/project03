package com.demo.mapper;

import java.util.List;

import com.demo.model.Course_tuijian;
import com.demo.model.edu_website_course;



public interface CourseMapper {
	/**
	 * 查询推荐课程列表
	 * @param tj
	 * @return
	 */
   public List<Course_tuijian> findCourseTJ(Course_tuijian tj);
   
   /**
    * 查询模糊查询的下拉框
    * @return
    */
   public List<edu_website_course> findcourse_lx();
   
   /**
    * 删除推荐课程
    */
   public Integer deleteTJ(Integer id);
}
