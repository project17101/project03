package com.demo.service.interfaces;

import com.demo.model.Paper_category;
import com.github.pagehelper.PageInfo;

public interface Paper_categoryService {
	
	//查询所有的试卷分类
	public PageInfo<Paper_category> findallcategory(Paper_category category);
	
	public void addpaper(Paper_category category);
	
	public Integer delpaper(Integer c_id);
	
	public Paper_category toupcategory(Integer c_id);
	
	public Integer upcategory(Paper_category category);

}
