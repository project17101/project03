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
	 * ��ȡ���й��ͼ��Ϣ
	 * @return
	 */
	public PageInfo<EduWebsiteImages> findAdImgAll(EduWebsiteImages ewi);

}
