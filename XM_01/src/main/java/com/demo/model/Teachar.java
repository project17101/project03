package com.demo.model;

public class Teachar extends PageBean{
	
	private Integer id;
	private String name;
	private String education; 
	private String career; 
	//头衔 1高级讲师2首席讲师
	private Integer  is_star; 
	private String  pic_path;
	//状态:0正常1删除
	private Integer  status; 
	private String  create_time; 
	private String  update_time; 
	private Integer  subject_id; 
	private Integer  sort ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public Integer getIs_star() {
		return is_star;
	}
	public void setIs_star(Integer is_star) {
		this.is_star = is_star;
	}
	public String getPic_path() {
		return pic_path;
	}
	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public Integer getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
}
