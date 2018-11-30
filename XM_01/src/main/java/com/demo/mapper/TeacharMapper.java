package com.demo.mapper;

import java.util.List;

import com.demo.model.Sys_subject;
import com.demo.model.Teachar;

public interface TeacharMapper {

	//查询所有的教师列表   按条件
	public List<Teachar> findteachar(Teachar teachar);
	
	//根据id删除一条数据
	public Integer delteachar(Integer id);
	
	//到添加页面
	//查询一级模态框
	public List<Sys_subject> toaddteacharfindbig();
	//查询二级模态框
	public List<Sys_subject> toaddteacharfindsmall(String parent_id);
	
	//添加一条数据
	public void addteachar(Teachar teachar);
	
}
