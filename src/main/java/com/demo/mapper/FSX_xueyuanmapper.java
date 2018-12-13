package com.demo.mapper;

import java.util.List;
import java.util.Map;

import com.demo.model.FSX_xueyuan;
import com.demo.model.FSX_xueyuanchengji;
import com.github.pagehelper.PageInfo;

public interface FSX_xueyuanmapper {
	public List<FSX_xueyuan> xueyuan(FSX_xueyuan xueyuan);
	public List<Map> xialakuang();
	public void upedate(FSX_xueyuan xueyuan);
	
	public void djie(FSX_xueyuan xueyuan);
	
	public List<FSX_xueyuanchengji> chengji(FSX_xueyuanchengji fsx);
	
	public List<FSX_xueyuanchengji> shijuan();

}
