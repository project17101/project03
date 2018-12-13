package com.demo.mapper;

import java.util.List;

import com.demo.model.Paper_category;

public interface Paper_categoryMapper {
	
	//查询所有的试卷分类
	public List<Paper_category> findallcategory(Paper_category category);
	
	//添加一个分类
	public void addpaper(Paper_category category);
	
	//删除一个分类
	public Integer delpaper(Integer c_id);
	
	//根据id查询一个分类进行修改
	public Paper_category toupcategory(Integer c_id);
	
	//修改
	public Integer upcategory(Paper_category category);

}
