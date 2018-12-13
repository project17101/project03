package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Icon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Icon_user;
import com.demo.model.Login_log;
import com.demo.model.Role;
import com.demo.service.interfaces.Icon_userService;
import com.github.pagehelper.PageInfo;

@Controller
public class Icon_userController {

	@Autowired
	Icon_userService icon_userService;
	
	@RequestMapping("findIcon")
	public @ResponseBody Map<String , Object> findIcon(Icon_user icon){
		PageInfo<Icon_user> pageinfo = icon_userService.findIcon(icon);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;
	}
	
	@RequestMapping("deluser")
	public @ResponseBody Integer deluser(Integer user_id){
		return icon_userService.deluser(user_id);
		
	}
	
	@RequestMapping("toadduser")
	public @ResponseBody List<Role> toadduser(){
		List<Role> rlist= icon_userService.toadduser();
		return rlist;
	}
	
	@RequestMapping("adduser")
	public @ResponseBody Integer adduser(Icon_user user){

		icon_userService.adduser(user);
		return null;
	}
	
	@RequestMapping("toupuser")
	public @ResponseBody Map<String , Object> toupsuer(Integer user_id){
		
		Icon_user user=icon_userService.toupsuser(user_id);
		System.out.println(user);
		List<Role> rlist= icon_userService.toadduser();
		Map<String ,Object> map =new HashMap<String, Object>();
		map.put("user", user);
		map.put("rlist", rlist);
		return map;
	}
	@RequestMapping("updateuser")
	public @ResponseBody Integer updateuserbyid(Icon_user user){
		System.out.println("进入修改"+user);
		icon_userService.updateuserbyid(user);
		return null;
	}
	
	@RequestMapping("findlogbyid")
	public @ResponseBody Map<String , Object> findlogbyid(Login_log log){
		System.out.println("-------------------");
		PageInfo<Login_log> pageinfo = icon_userService.findlogbyid(log);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;
	}
	
	@RequestMapping("icon_user/updatestatus")
	public @ResponseBody Integer updatestatus(Icon_user user){
		System.out.println(user+"-------------------------------------");
		Integer result = icon_userService.upuserstatus(user);
		return result;
	}
}
