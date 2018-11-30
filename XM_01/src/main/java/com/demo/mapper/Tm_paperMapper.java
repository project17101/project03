package com.demo.mapper;

import java.util.List;

import com.demo.model.Tm_paper;

public interface Tm_paperMapper {

	//查询所有的试卷列表 
	public List<Tm_paper> findtm_paper(Tm_paper tm_paper);
}
