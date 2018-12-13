package com.demo.model;

public class Exam_db extends PageBean {

	private Integer id; 
	private String  dname; 
	private Integer status; 
	private String  remark; 
	private Integer adminid; 
	private String  cdate ;
	private Integer d_nums; 
	
	@Override
	public String toString() {
		return "Exam_db [id=" + id + ", dname=" + dname + ", status=" + status + ", remark=" + remark + ", adminid="
				+ adminid + ", cdate=" + cdate + ", d_nums=" + d_nums + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getAdminid() {
		return adminid;
	}
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public Integer getD_nums() {
		return d_nums;
	}
	public void setD_nums(Integer d_nums) {
		this.d_nums = d_nums;
	}

}
