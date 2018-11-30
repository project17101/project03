package com.demo.service.interfaces;

import com.demo.model.Tm_paper;
import com.github.pagehelper.PageInfo;

public interface Tm_paperService {
	
	public PageInfo<Tm_paper> findtm_paper(Tm_paper tm_paper);

}
