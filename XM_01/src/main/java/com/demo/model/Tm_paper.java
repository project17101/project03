package com.demo.model;

public class Tm_paper extends PageBean {
	
	private String p_id; 
	private String p_name; 
	@Override
	public String toString() {
		return "Tm_paper [p_id=" + p_id + ", p_name=" + p_name + ", p_cid=" + p_cid + ", p_status=" + p_status
				+ ", p_starttime=" + p_starttime + ", p_endtime=" + p_endtime + ", p_duration=" + p_duration
				+ ", p_showtime=" + p_showtime + ", p_total_score=" + p_total_score + ", p_pass_score=" + p_pass_score
				+ ", p_question_order=" + p_question_order + ", p_papertype=" + p_papertype + ", p_remark=" + p_remark
				+ ", p_data=" + p_data + ", p_poster=" + p_poster + ", p_createdate=" + p_createdate + ", p_modifyor="
				+ p_modifyor + ", p_modifydate=" + p_modifydate + ", p_showkey=" + p_showkey + ", p_showmode="
				+ p_showmode + "]";
	}
	private String p_cid; 
	private Integer p_status; //试卷状态，1正常可用，0不可???
	private String p_starttime; 
	private String p_endtime; 
	private Integer p_duration; 
	private String p_showtime; 
	private Integer p_total_score;
	private Integer p_pass_score; 
	private String p_question_order; //0正常，1随机'	
	private Integer p_papertype; //0普通试卷，1随机生成试卷'
	private String p_remark; 
	private Integer p_data; 
	private String p_poster;
	private String p_createdate; 
	private String p_modifyor; 
	private String p_modifydate; 
	private Integer p_showkey; 
	private Integer p_showmode ;
	

	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_cid() {
		return p_cid;
	}
	public void setP_cid(String p_cid) {
		this.p_cid = p_cid;
	}
	public Integer getP_status() {
		return p_status;
	}
	public void setP_status(Integer p_status) {
		this.p_status = p_status;
	}
	public String getP_starttime() {
		return p_starttime;
	}
	public void setP_starttime(String p_starttime) {
		this.p_starttime = p_starttime;
	}
	public String getP_endtime() {
		return p_endtime;
	}
	public void setP_endtime(String p_endtime) {
		this.p_endtime = p_endtime;
	}
	public Integer getP_duration() {
		return p_duration;
	}
	public void setP_duration(Integer p_duration) {
		this.p_duration = p_duration;
	}
	public String getP_showtime() {
		return p_showtime;
	}
	public void setP_showtime(String p_showtime) {
		this.p_showtime = p_showtime;
	}
	public Integer getP_total_score() {
		return p_total_score;
	}
	public void setP_total_score(Integer p_total_score) {
		this.p_total_score = p_total_score;
	}
	public Integer getP_pass_score() {
		return p_pass_score;
	}
	public void setP_pass_score(Integer p_pass_score) {
		this.p_pass_score = p_pass_score;
	}

	public String getP_question_order() {
		return p_question_order;
	}
	public void setP_question_order(String p_question_order) {
		this.p_question_order = p_question_order;
	}
	public Integer getP_papertype() {
		return p_papertype;
	}
	public void setP_papertype(Integer p_papertype) {
		this.p_papertype = p_papertype;
	}
	public String getP_remark() {
		return p_remark;
	}
	public void setP_remark(String p_remark) {
		this.p_remark = p_remark;
	}
	public Integer getP_data() {
		return p_data;
	}
	public void setP_data(Integer p_data) {
		this.p_data = p_data;
	}
	public String getP_poster() {
		return p_poster;
	}
	public void setP_poster(String p_poster) {
		this.p_poster = p_poster;
	}
	public String getP_createdate() {
		return p_createdate;
	}
	public void setP_createdate(String p_createdate) {
		this.p_createdate = p_createdate;
	}
	public String getP_modifyor() {
		return p_modifyor;
	}
	public void setP_modifyor(String p_modifyor) {
		this.p_modifyor = p_modifyor;
	}
	public String getP_modifydate() {
		return p_modifydate;
	}
	public void setP_modifydate(String p_modifydate) {
		this.p_modifydate = p_modifydate;
	}
	public Integer getP_showkey() {
		return p_showkey;
	}
	public void setP_showkey(Integer p_showkey) {
		this.p_showkey = p_showkey;
	}
	public Integer getP_showmode() {
		return p_showmode;
	}
	public void setP_showmode(Integer p_showmode) {
		this.p_showmode = p_showmode;
	}
	
}
