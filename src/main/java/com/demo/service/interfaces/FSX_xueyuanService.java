package com.demo.service.interfaces;

import java.util.List;
import java.util.Map;

import com.demo.model.FSX_xueyuan;
import com.demo.model.FSX_xueyuanchengji;
import com.demo.model.PageBean;
import com.github.pagehelper.PageInfo;

public interface FSX_xueyuanService {
    
	public PageInfo<FSX_xueyuan> xueyuan(FSX_xueyuan fsx_xueyuan);
	public List<Map> xialakuang();
	public void upedate(FSX_xueyuan xueyuan);
	
	public void djie(FSX_xueyuan xueyuan);
	
	public PageInfo<FSX_xueyuanchengji> chengji(FSX_xueyuanchengji fsx);
	
	public List<FSX_xueyuanchengji> shijuan();
}
