package com.demo.model;

public class Role {
	private Integer role_id; 
	private String  role_name; 
	private String  create_time;
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + ", create_time=" + create_time + "]";
	}
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
}
