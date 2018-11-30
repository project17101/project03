package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.EduWebsiteImagesMapper;
import com.demo.model.EduWebsiteImages;
import com.demo.service.interfaces.EduWebsiteImagesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class EduWebsiteImagesServiceImpl implements EduWebsiteImagesService {

	@Autowired
	EduWebsiteImagesMapper ewiMapper;

	public PageInfo<EduWebsiteImages> findAdImgAll(EduWebsiteImages ewi) {
		// TODO Auto-generated method stub
		List<EduWebsiteImages> list = ewiMapper.findAdImgAll();
		Integer startrow=ewi.getStartrow();
		Integer pagesize=ewi.getPagesize();
		/*PageHelper.startPage(ewi.getStartrow(), ewi.getPagesize());*/
		PageHelper.startPage(startrow, pagesize);
		PageInfo<EduWebsiteImages> pageInfo = new PageInfo<EduWebsiteImages>(list);
		return pageInfo;
	}
	
	

}
