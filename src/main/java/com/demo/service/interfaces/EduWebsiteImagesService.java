package com.demo.service.interfaces;

import java.util.List;

import com.demo.model.EduWebsiteImages;
import com.github.pagehelper.PageInfo;

/**
 * @author ZHAIYIBAO
 *	
 */
public interface EduWebsiteImagesService {
	
	/**
	 * 获取所有广告图信息
	 * @return
	 */
	public PageInfo<EduWebsiteImages> findAdImgAll(EduWebsiteImages ewi);

}
