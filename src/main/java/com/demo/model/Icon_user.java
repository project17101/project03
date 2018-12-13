package com.demo.model;

public class Icon_user extends PageBean{
	private Integer user_id; 
	private String login_name; 
	private String login_pwd;
	private String user_name;
	//状态.0: 正常,1:冻结,2：删除
	private Integer status;
	private String last_login_time;
	private Integer last_login_ip;
	private String create_time;
	private String email; 
	private String tel; 
	private Integer role_id;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getLogin_pwd() {
		return login_pwd;
	}
	public void setLogin_pwd(String login_pwd) {
		this.login_pwd = login_pwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Integer getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "Icon_user [user_id=" + user_id + ", login_name=" + login_name + ", login_pwd=" + login_pwd
				+ ", user_name=" + user_name + ", status=" + status + ", last_login_time=" + last_login_time
				+ ", last_login_ip=" + last_login_ip + ", create_time=" + create_time + ", email=" + email + ", tel="
				+ tel + ", role_id=" + role_id + "]";
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
	}
	public Integer getLast_login_ip() {
		return last_login_ip;
	}
	public void setLast_login_ip(Integer last_login_ip) {
		this.last_login_ip = last_login_ip;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
}
