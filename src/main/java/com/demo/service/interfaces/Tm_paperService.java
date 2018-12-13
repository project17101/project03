package com.demo.service.interfaces;

import java.util.List;
import java.util.Map;

import com.demo.model.Paper_class;
import com.demo.model.Tm_paper;
import com.github.pagehelper.PageInfo;

public interface Tm_paperService {
	
	public PageInfo<Tm_paper> findtm_paper(Tm_paper tm_paper);
	
	public List<Map> findcategoryname();
	
	public Integer addtm_paper(Tm_paper tm_paper);
	
	public void addpaper_class(Paper_class paper_class);
	
	public List<Map> findcnameandcid();
	
	public Integer deltm_paperbyid(Integer p_id);
	
	public Tm_paper findtm_paperbypid(Integer p_id);
	
	public Integer updatetmpaper(Tm_paper tm_paper);
	
	public Integer delpaper_classbyid(Integer ln_pid);

}
