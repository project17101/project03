package com.demo.model;

public class Login_log extends PageBean {
	
	private Integer log_id; 
	private String login_time; 
	private String ip; 
	private Integer user_id; 
	private String os_name; 
	private String user_agent;
	public Integer getLog_id() {
		return log_id;
	}
	public void setLog_id(Integer log_id) {
		this.log_id = log_id;
	}
	public String getLogin_time() {
		return login_time;
	}
	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getOs_name() {
		return os_name;
	}
	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}
	public String getUser_agent() {
		return user_agent;
	}
	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}
	@Override
	public String toString() {
		return "Login_log [log_id=" + log_id + ", login_time=" + login_time + ", ip=" + ip + ", user_id=" + user_id
				+ ", os_name=" + os_name + ", user_agent=" + user_agent + "]";
	}
}
