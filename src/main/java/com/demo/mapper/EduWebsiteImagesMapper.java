package com.demo.mapper;

import java.util.List;

import com.demo.model.EduWebsiteImages;

public interface EduWebsiteImagesMapper {
	
	/**
	 * 获取所有广告图信息
	 * @return
	 */
	public List<EduWebsiteImages> findAdImgAll();

}
