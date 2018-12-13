package com.demo.service.interfaces;

import java.util.List;

import com.demo.model.Sys_subject;
import com.demo.model.Teachar;
import com.github.pagehelper.PageInfo;

public interface TeacharService {
	
	
	public PageInfo<Teachar> findteachar(Teachar teachar);
	
	public Integer delteachar(Integer id);
	
	public List<Sys_subject> toaddteacharfindbig();

	public List<Sys_subject> toaddteacharfindsmall(String  parent_id);
	
	public void addteachar(Teachar teachar);
	
	public List<Teachar> toupset(Integer id);
	
	public void upteachar(Teachar teachar);
	

}
