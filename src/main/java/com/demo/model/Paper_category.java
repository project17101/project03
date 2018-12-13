package com.demo.model;

public class Paper_category extends PageBean{
	
	private Integer c_id;
	private String  c_name;
	private String  c_remark;
	private Integer c_status ;
	private String  c_poster ;
	private String  c_createdate;
	private String c_modifyor ;
	private String c_modifydate ;
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_remark() {
		return c_remark;
	}
	public void setC_remark(String c_remark) {
		this.c_remark = c_remark;
	}
	public Integer getC_status() {
		return c_status;
	}
	public void setC_status(Integer c_status) {
		this.c_status = c_status;
	}
	public String getC_poster() {
		return c_poster;
	}
	public void setC_poster(String c_poster) {
		this.c_poster = c_poster;
	}
	public String getC_createdate() {
		return c_createdate;
	}
	public void setC_createdate(String c_createdate) {
		this.c_createdate = c_createdate;
	}
	public String getC_modifyor() {
		return c_modifyor;
	}
	public void setC_modifyor(String c_modifyor) {
		this.c_modifyor = c_modifyor;
	}
	public String getC_modifydate() {
		return c_modifydate;
	}
	public void setC_modifydate(String c_modifydate) {
		this.c_modifydate = c_modifydate;
	}
	@Override
	public String toString() {
		return "Paper_category [c_id=" + c_id + ", c_name=" + c_name + ", c_remark=" + c_remark + ", c_status="
				+ c_status + ", c_poster=" + c_poster + ", c_createdate=" + c_createdate + ", c_modifyor=" + c_modifyor
				+ ", c_modifydate=" + c_modifydate + "]";
	}
	
	
	
	

}
