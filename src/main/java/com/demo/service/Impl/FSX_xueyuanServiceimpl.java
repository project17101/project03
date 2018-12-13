package com.demo.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.FSX_xueyuanmapper;
import com.demo.model.FSX_xueyuan;
import com.demo.model.FSX_xueyuanchengji;
import com.demo.model.PageBean;
import com.demo.service.interfaces.FSX_xueyuanService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class FSX_xueyuanServiceimpl implements FSX_xueyuanService{
     
	@Autowired
	FSX_xueyuanmapper mapper;
	
	 
	public PageInfo<FSX_xueyuan> xueyuan(FSX_xueyuan fsx_xueyuan) {
		Integer startrow=fsx_xueyuan.getStartrow();
		Integer pagesize=fsx_xueyuan.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);
		List<FSX_xueyuan> list=mapper.xueyuan(fsx_xueyuan);
		
		PageInfo<FSX_xueyuan> pageinfo=new PageInfo<FSX_xueyuan>(list);
		// TODO Auto-generated method stub
		return pageinfo;
	}

	 
	public List<Map> xialakuang() {
		
		return mapper.xialakuang();
	}

	 
	public void upedate(FSX_xueyuan xueyuan) {
		mapper.upedate(xueyuan);
		
	}

	 
	public void djie(FSX_xueyuan xueyuan) {
		mapper.djie(xueyuan);
	}

	 
	public PageInfo<FSX_xueyuanchengji> chengji(FSX_xueyuanchengji fsx) {
		Integer startrow=fsx.getStartrow();
		Integer pagesize=fsx.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);
		List<FSX_xueyuanchengji> list=mapper.chengji(fsx);
		PageInfo<FSX_xueyuanchengji> pageinfo=new PageInfo<FSX_xueyuanchengji>(list);
		return pageinfo;
	}

	 
	public List<FSX_xueyuanchengji> shijuan() {
		// TODO Auto-generated method stub
		return mapper.shijuan();
	}


	

}
