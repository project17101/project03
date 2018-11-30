package com.demo.model;

/**
 * @author ZHAIYIBAO
 *	图片类型表
 */
public class EduWebsiteImagesType {
	
	private Integer type_id;	//类型ID
	private String type_name;	//类型名
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	@Override
	public String toString() {
		return "EduWebsiteImagesType [type_id=" + type_id + ", type_name=" + type_name + "]";
	}

	
}
