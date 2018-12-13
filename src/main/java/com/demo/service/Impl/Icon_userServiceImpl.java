package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.Icon_userMapper;
import com.demo.model.Icon_user;
import com.demo.model.Login_log;
import com.demo.model.Role;
import com.demo.service.interfaces.Icon_userService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class Icon_userServiceImpl implements Icon_userService{
	
	@Autowired
	Icon_userMapper icon_userMapper;
	
	
	public PageInfo<Icon_user> findIcon(Icon_user icon) {
		// TODO Auto-generated method stub
		//分页
		Integer startrow=icon.getStartrow();
		Integer pagesize=icon.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);
		
		List<Icon_user> list=icon_userMapper.findIcon(icon);
		PageInfo<Icon_user> pageInfo=new PageInfo<Icon_user>(list);
		return pageInfo;
	}


	public Integer deluser(Integer user_id) {
		return icon_userMapper.deluser(user_id);
	}


	public List<Role> toadduser() {
		// TODO Auto-generated method stub
		return icon_userMapper.toadduser();
	}


	public void adduser(Icon_user user) {
		// TODO Auto-generated method stub
		icon_userMapper.adduser(user);
	}


	public Icon_user toupsuser(Integer userid) {
		// TODO Auto-generated method stub
		return icon_userMapper.toupsuser(userid);
	}


	public void updateuserbyid(Icon_user user) {
		// TODO Auto-generated method stub
		icon_userMapper.updateuserbyid(user);
	}


	public PageInfo<Login_log> findlogbyid(Login_log log) {
		// TODO Auto-generated method stub
				//分页
				Integer startrow=log.getStartrow();
				Integer pagesize=log.getPagesize();
				PageHelper.offsetPage(startrow, pagesize);
				
				List<Login_log> list=icon_userMapper.findlogbyid(log.getUser_id());
				PageInfo<Login_log> pageinfo= new PageInfo<Login_log>(list);
		return pageinfo;
	}


	@Override
	public Integer upuserstatus(Icon_user icon) {
		// TODO Auto-generated method stub
		return icon_userMapper.upuserstatus(icon);
	}


}
