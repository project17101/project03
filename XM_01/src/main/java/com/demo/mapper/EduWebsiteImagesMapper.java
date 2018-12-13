package com.demo.mapper;

import java.util.List;

import com.demo.model.EduWebsiteImages;
import com.demo.model.EduWebsiteImagesType;



public interface EduWebsiteImagesMapper {
	
	/**
	 * 获取所有广告图信息
	 * @return
	 */
	public List<EduWebsiteImages> findAdImgAll(EduWebsiteImages ewi);
	/**
	 * 根据ID删除广告图
	 * @param image_id
	 */
	public void delAdImgById(Integer image_id);
	
	/**
	 * @param ewi
	 * 新建广告图
	 */
	public void addImg(EduWebsiteImages ewi);
	
	/**
	 * @param ewi
	 * 	根据id查询广告图信息
	 */
	public EduWebsiteImages getImgById(Integer image_id);
	
	
	
	
	
	
	
	
	
	/**
	 * 获取所有广告图类型
	 * @return
	 */
	public List<EduWebsiteImagesType> findAdImgTypeAll();
	/**
	 * 添加广告图类型
	 * @return
	 */
	public void AddAdImgType(EduWebsiteImagesType ewit);
	/**
	 * 删除广告图类型
	 * @return
	 */
	public void delAdImgTypeById(Integer type_id);
	/**
	 * 修改广告图类型名称
	 * @return
	 */
	public void upAdImgTypeById(EduWebsiteImagesType ewit);

}
