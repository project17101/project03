package com.demo.service.interfaces;

import com.demo.model.Teachar;
import com.github.pagehelper.PageInfo;

public interface TeacharService {
	
	
	public PageInfo<Teachar> findteachar(Teachar teachar);
	

}
