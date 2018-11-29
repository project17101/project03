package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.TeacharMapper;
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

		List<Teachar> list=teacharMapper.findteachar();
		PageInfo<Teachar> pageInfo=new PageInfo<Teachar>(list);
		return pageInfo ;
	}

}
