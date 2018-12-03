package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.EduWebsiteImagesMapper;
import com.demo.model.EduWebsiteImages;
import com.demo.model.EduWebsiteImagesType;
import com.demo.service.interfaces.EduWebsiteImagesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class EduWebsiteImagesServiceImpl implements EduWebsiteImagesService {

	@Autowired
	EduWebsiteImagesMapper ewiMapper;

	public PageInfo<EduWebsiteImages> findAdImgAll(EduWebsiteImages ewi) {
		// TODO Auto-generated method stub
		Integer startrow=ewi.getStartrow();
		Integer pagesize=ewi.getPagesize();
		
		/*PageHelper.offsetPage(startrow, pagesize);
		List<FSX_xueyuan> list=mapper.xueyuan();
		PageInfo<FSX_xueyuan> pageinfo=new PageInfo<FSX_xueyuan>(list);*/
		
		PageHelper.startPage(startrow,pagesize);
		List<EduWebsiteImages> list = ewiMapper.findAdImgAll(ewi);
		/*PageHelper.startPage(ewi.getStartrow(), ewi.getPagesize());*/
		System.out.println("startrow:"+startrow+" ,pagesize:"+pagesize);
		PageInfo<EduWebsiteImages> pageInfo = new PageInfo<EduWebsiteImages>(list);
		return pageInfo;
	}
	@Override
	public void delAdImgById(Integer image_id) {
		// TODO Auto-generated method stub
		ewiMapper.delAdImgById(image_id);
	}
	
	
	
	

	/* (non-Javadoc)
	 * @see com.demo.service.interfaces.EduWebsiteImagesService#findAdImgTypeAll()
	 * 鑾峰彇鎵�鏈夊箍鍛婄被鍨�
	 */
	@Override
	public List<EduWebsiteImagesType> findAdImgTypeAll() {
		// TODO Auto-generated method stub
		return ewiMapper.findAdImgTypeAll();
	}

	@Override
	public void AddAdImgType(EduWebsiteImagesType ewit) {
		// TODO Auto-generated method stub
		ewiMapper.AddAdImgType(ewit);
	}

	@Override
	public void delAdImgTypeById(Integer type_id) {
		// TODO Auto-generated method stub
		ewiMapper.delAdImgTypeById(type_id);
	}

	@Override
	public void upAdImgTypeById(EduWebsiteImagesType ewit) {
		// TODO Auto-generated method stub
		ewiMapper.upAdImgTypeById(ewit);
	}






}
