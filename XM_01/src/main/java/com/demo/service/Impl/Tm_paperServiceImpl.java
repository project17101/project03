package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.Tm_paperMapper;
import com.demo.model.Tm_paper;
import com.demo.service.interfaces.Tm_paperService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class Tm_paperServiceImpl implements Tm_paperService {

	@Autowired
	Tm_paperMapper tm_paperMapper;

	public PageInfo<Tm_paper> findtm_paper(Tm_paper tm_paper) {
		// TODO Auto-generated method stub
		//配置分页数据
		Integer startrow=tm_paper.getStartrow();
		Integer pagesize=tm_paper.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);
		
		List <Tm_paper> paperlist = tm_paperMapper.findtm_paper(tm_paper);
		PageInfo<Tm_paper> pageInfo = new PageInfo<Tm_paper>(paperlist);
		
		return pageInfo;
	}
}
