package com.demo.model;

import org.springframework.web.multipart.MultipartFile;

public class Teachar extends PageBean{
	//文件上传所以需要字段
	private MultipartFile imgfile;

	private Integer id;
	private String name;
	private String namet;
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
	private String start_time;
	private String end_time;
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
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
	public MultipartFile getImgfile() {
		return imgfile;
	}
	public void setImgfile(MultipartFile imgfile) {
		this.imgfile = imgfile;
	}
	public String getNamet() {
		return namet;
	}
	public void setNamet(String namet) {
		this.namet = namet;
	}
	@Override
	public String toString() {
		return "Teachar [imgfile=" + imgfile + ", id=" + id + ", name=" + name + ", namet=" + namet + ", education="
				+ education + ", career=" + career + ", is_star=" + is_star + ", pic_path=" + pic_path + ", status="
				+ status + ", create_time=" + create_time + ", update_time=" + update_time + ", subject_id="
				+ subject_id + ", sort=" + sort + ", start_time=" + start_time + ", end_time=" + end_time + "]";
	}
}
