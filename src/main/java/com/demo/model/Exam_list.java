package com.demo.model;

import java.util.List;


public class Exam_list extends PageBean {

	private Integer id;
	//1单选，2多选，3填空，4判断，5问答
	private Integer qtype;
	//非常容易1  比较容易2  常规3  较难4  非常难5
	private Integer qlevel;//试题难度
	private String  qfrom;//试题来源
	private String  content;//试题题干
	private String postdate;//创建日期 
	private String  skey;//答案
	private String keydesc;//试题解析
	private Integer status;//试题状态
	private Integer dbid;
	private Integer adminid;
	private String  dname;
	private List<Exam_options> list;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQtype() {
		return qtype;
	}
	public void setQtype(Integer qtype) {
		this.qtype = qtype;
	}
	public Integer getQlevel() {
		return qlevel;
	}
	public void setQlevel(Integer qlevel) {
		this.qlevel = qlevel;
	}
	public String getQfrom() {
		return qfrom;
	}
	public void setQfrom(String qfrom) {
		this.qfrom = qfrom;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public String getSkey() {
		return skey;
	}
	public void setSkey(String skey) {
		this.skey = skey;
	}
	public String getKeydesc() {
		return keydesc;
	}
	public void setKeydesc(String keydesc) {
		this.keydesc = keydesc;
	}
	public List<Exam_options> getList() {
		return list;
	}
	public void setList(List<Exam_options> list) {
		this.list = list;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getDbid() {
		return dbid;
	}
	public void setDbid(Integer dbid) {
		this.dbid = dbid;
	}
	public Integer getAdminid() {
		return adminid;
	}
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Exam_list [id=" + id + ", qtype=" + qtype + ", qlevel=" + qlevel + ", qfrom=" + qfrom + ", content="
				+ content + ", postdate=" + postdate + ", skey=" + skey + ", keydesc=" + keydesc + ", status=" + status
				+ ", dbid=" + dbid + ", adminid=" + adminid + ", dname=" + dname + ", list=" + list + "]";
	}

	

}
