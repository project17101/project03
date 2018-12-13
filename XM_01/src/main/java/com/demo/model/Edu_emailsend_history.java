package com.demo.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author ZHAIYIBAO
 *	邮件发送记录
 */
public class Edu_emailsend_history extends PageBean {
	
	private Integer id; //
	private String email; //
	private Integer user_id; //
	private String title; //邮箱标题
	private String content; //邮箱正文
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") 
	private Date create_time; //创建时间
	private Date send_time; //定时发送时间
	private Integer status; //1 已发送 2 未发送
	private Integer type; //1 普通 2 定时
	
	private String login_name;  //操作人名称
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@DateTimeFormat(pattern="YYYY-MM-dd")
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getSend_time() {
		return send_time;
	}
	public void setSend_time(Date send_time) {
		this.send_time = send_time;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	@Override
	public String toString() {
		return "Edu_emailsend_history [id=" + id + ", email=" + email + ", user_id=" + user_id + ", title=" + title
				+ ", content=" + content + ", create_time=" + create_time + ", send_time=" + send_time + ", status="
				+ status + ", type=" + type + ", login_name=" + login_name + "]";
	}

	
}
