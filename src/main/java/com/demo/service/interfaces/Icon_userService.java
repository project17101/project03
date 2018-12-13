package com.demo.service.interfaces;

import java.util.List;

import com.demo.model.Icon_user;
import com.demo.model.Login_log;
import com.demo.model.Role;
import com.github.pagehelper.PageInfo;

public interface Icon_userService {

	public PageInfo<Icon_user> findIcon(Icon_user icon);
	
	public Integer deluser(Integer user_id);
	
	public List<Role> toadduser();
	
	public void adduser(Icon_user user);
	
	public Icon_user toupsuser(Integer userid);
	
	public void updateuserbyid(Icon_user icon);
	
	public PageInfo<Login_log> findlogbyid(Login_log log);
	
	public Integer upuserstatus(Icon_user icon);
}
