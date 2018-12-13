package com.demo.service.interfaces;

import java.util.List;

import com.demo.model.EduWebsiteImages;
import com.demo.model.EduWebsiteImagesType;
import com.github.pagehelper.PageInfo;

/**
 * @author ZHAIYIBAO
 *	
 */
public interface EduWebsiteImagesService {
	
	/**
	 * 查询所有广告图片
	 * @return
	 */
	public PageInfo<EduWebsiteImages> findAdImgAll(EduWebsiteImages ewi);
	
	//public List<EduWebsiteImages> findAdImgAllf(EduWebsiteImages ewi);
	
	public void delAdImgById(Integer image_id);
	
	public void addImg(EduWebsiteImages ewi);
	
	public EduWebsiteImages getImgById(Integer image_id);
	
	
	
	
	
	
	
	
	/**
	 * @param ewi
	 * @return
	 * 
	 */
	public List<EduWebsiteImagesType> findAdImgTypeAll();
	
	public void AddAdImgType(EduWebsiteImagesType ewit);
	
	public void delAdImgTypeById(Integer type_id);
	
	public void upAdImgTypeById(EduWebsiteImagesType ewit);

}
