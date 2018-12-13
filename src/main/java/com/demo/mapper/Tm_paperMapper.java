package com.demo.mapper;

import java.util.List;
import java.util.Map;

import com.demo.model.Paper_class;
import com.demo.model.Tm_paper;

public interface Tm_paperMapper {

	//查询所有的试卷列表 
	public List<Tm_paper> findtm_paper(Tm_paper tm_paper);
	
	//获取试卷的分类
	public List<Map> findcategoryname();
	
	//添加试卷表
	public Integer addtm_paper(Tm_paper tm_paper);
	//添加试卷班级表
	public void addpaper_class(Paper_class paper_class);
	
	//查询试卷分类
	public List<Map> findcnameandcid(); 
	
	//根据id删除一条试卷信息
	public Integer deltm_paperbyid(Integer p_id);
	
	//根据id查询修改
	public Tm_paper findtm_paperbypid(Integer p_id);
	
	//修改一条数据
	public Integer updatetmpaper(Tm_paper tm_paper);
	
	//删除试卷班级信息
	public Integer delpaper_classbyid(Integer ln_pid);
}
