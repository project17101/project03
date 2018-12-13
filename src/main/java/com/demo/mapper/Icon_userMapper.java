package com.demo.mapper;

import java.util.List;

import com.demo.model.Icon_user;
import com.demo.model.Login_log;
import com.demo.model.Role;

public interface Icon_userMapper {

	//查询所有的用户数据
	public List<Icon_user> findIcon(Icon_user icon);
	
	//根据id删除一条用户信息
	public Integer deluser(Integer user_id);
	
	//到添加页面
	public List<Role> toadduser();
	
	//添加一条用户信息 
	public void adduser(Icon_user user);
	
	//到修改页面
	public Icon_user toupsuser(Integer userid);
	
	//修改
	public void updateuserbyid(Icon_user icon);
	
	//根据user_id查询日志记录
	public List<Login_log> findlogbyid(Integer user_id);
	
	//根据id修改用户状态
	public Integer upuserstatus(Icon_user icon);
}
