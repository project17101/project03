package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.TeacharMapper;
import com.demo.model.Sys_subject;
import com.demo.model.Teachar;
import com.demo.service.interfaces.TeacharService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class TeacharServiceeImpl implements TeacharService {

	@Autowired
	TeacharMapper teacharMapper;
	
	
	public PageInfo<Teachar> findteachar(Teachar teachar) {
		// TODO Auto-generated method stub
		Integer startrow=teachar.getStartrow();
		Integer pagesize=teachar.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);

		List<Teachar> list=teacharMapper.findteachar(teachar);
		PageInfo<Teachar> pageInfo=new PageInfo<Teachar>(list);
		return pageInfo ;
	}


	public Integer delteachar(Integer id) {
		// TODO Auto-generated method stub
		return teacharMapper.delteachar(id);
	}


	public List<Sys_subject> toaddteacharfindbig() {
		// TODO Auto-generated method stub
		return teacharMapper.toaddteacharfindbig();
	}


	public List<Sys_subject> toaddteacharfindsmall(String parent_id) {
		// TODO Auto-generated method stub
		return teacharMapper.toaddteacharfindsmall(parent_id);
	}


	public void addteachar(Teachar teachar) {
		// TODO Auto-generated method stub
		teacharMapper.addteachar(teachar);
	}


	public List<Teachar> toupset(Integer id) {
		// TODO Auto-generated method stub
		return teacharMapper.toupset( id);
	}


	public void upteachar(Teachar teachar) {
		// TODO Auto-generated method stub
		teacharMapper.upteachar(teachar);
	}




}
