package com.demo.mapper;

import java.util.List;

import com.demo.model.Teachar;

public interface TeacharMapper {

	//查询所有的教师列表   按条件
	public List<Teachar> findteachar(Teachar teachar);
	
	//根据id删除一条数据
	public Integer delteachar(Integer id);
	
}
