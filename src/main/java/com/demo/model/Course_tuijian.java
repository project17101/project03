package com.demo.model;

public class Course_tuijian extends PageBean{
	private Integer id;
	private String course_name;//课程名称
	private String name;//推荐分类
	private Integer order_num;//排序值
	private String is_avaliable;//课程状态
	private String class_id;
	
	public String getClass_id() {
		return class_id;
	}
	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOrder_num() {
		return order_num;
	}
	public void setOrder_num(Integer order_num) {
		this.order_num = order_num;
	}
	public String getIs_avaliable() {
		return is_avaliable;
	}
	public void setIs_avaliable(String is_avaliable) {
		this.is_avaliable = is_avaliable;
	}
	
}
