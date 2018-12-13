package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.Paper_categoryMapper;
import com.demo.model.Paper_category;
import com.demo.model.Teachar;
import com.demo.service.interfaces.Paper_categoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class Paper_categoryServiceImpl implements Paper_categoryService {

	@Autowired
	Paper_categoryMapper paper_cotegoryMapper;

	@Override
	public PageInfo<Paper_category> findallcategory(Paper_category category) {
		// TODO Auto-generated method stub
		Integer startrow=category.getStartrow();
		Integer pagesize=category.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);
		
		List<Paper_category> list=paper_cotegoryMapper.findallcategory(category);
		PageInfo<Paper_category> pageInfo=new PageInfo<Paper_category>(list);
		return pageInfo;
	}

	@Override
	public void addpaper(Paper_category category) {
		// TODO Auto-generated method stub
		paper_cotegoryMapper.addpaper(category);
	}

	@Override
	public Integer delpaper(Integer c_id) {
		// TODO Auto-generated method stub
		return paper_cotegoryMapper.delpaper(c_id);
	}

	@Override
	public Paper_category toupcategory(Integer c_id) {
		// TODO Auto-generated method stub
		return paper_cotegoryMapper.toupcategory(c_id);
	}

	@Override
	public Integer upcategory(Paper_category category) {
		// TODO Auto-generated method stub
		return paper_cotegoryMapper.upcategory(category);
	}
	

}
