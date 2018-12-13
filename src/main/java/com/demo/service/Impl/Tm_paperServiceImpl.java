package com.demo.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.Tm_paperMapper;
import com.demo.model.Paper_class;
import com.demo.model.Tm_paper;
import com.demo.service.interfaces.Tm_paperService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class Tm_paperServiceImpl implements Tm_paperService {

	@Autowired
	Tm_paperMapper tm_paperMapper;

	public PageInfo<Tm_paper> findtm_paper(Tm_paper tm_paper) {
		// TODO Auto-generated method stub
		//配置分页数据
		Integer startrow=tm_paper.getStartrow();
		Integer pagesize=tm_paper.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);
		
		List <Tm_paper> paperlist = tm_paperMapper.findtm_paper(tm_paper);
		PageInfo<Tm_paper> pageInfo = new PageInfo<Tm_paper>(paperlist);
		
		return pageInfo;
	}

	@Override
	public List<Map> findcategoryname() {
		// TODO Auto-generated method stub
		List <Map> list= tm_paperMapper.findcategoryname();
		return list;
	}

	@Override
	public Integer addtm_paper(Tm_paper tm_paper) {
		// TODO Auto-generated method stub
		tm_paperMapper.addtm_paper(tm_paper);
		
		Integer[] cid = tm_paper.getLn_bid();
		if (null != cid && cid.length > 0) {
			for (Integer c : cid) {
				Paper_class pc = new Paper_class();
				pc.setLn_buid(c);
				pc.setLn_type(0);
				pc.setLn_pid(tm_paper.getP_id());
				this.addpaper_class(pc);
			}
		}
		
		return tm_paper.getP_id();
	}

	@Override
	public void addpaper_class(Paper_class paper_class) {
		// TODO Auto-generated method stub
			tm_paperMapper.addpaper_class(paper_class);
	}

	@Override
	public List<Map> findcnameandcid() {
		// TODO Auto-generated method stub
		return tm_paperMapper.findcnameandcid();
	}

	@Override
	public Integer deltm_paperbyid(Integer p_id) {
		// TODO Auto-generated method stub
		return tm_paperMapper.deltm_paperbyid(p_id);
	}

	@Override
	public Tm_paper findtm_paperbypid(Integer p_id) {
		// TODO Auto-generated method stub
		return tm_paperMapper.findtm_paperbypid(p_id);
	}

	@Override
	public Integer updatetmpaper(Tm_paper tm_paper) {
		// TODO Auto-generated method stub
		tm_paperMapper.updatetmpaper(tm_paper);
		Integer ln_pid = tm_paper.getP_id();
		Integer[] cid = tm_paper.getLn_bid();
		if (null != cid && cid.length > 0) {
			this.delpaper_classbyid(ln_pid);
			for (Integer c : cid) {
				Paper_class pc = new Paper_class();
				pc.setLn_buid(c);
				pc.setLn_type(0);
				pc.setLn_pid(tm_paper.getP_id());
				this.addpaper_class(pc);
			}
		}
		return tm_paper.getP_id();
	}

	@Override
	public Integer delpaper_classbyid(Integer ln_pid) {
		// TODO Auto-generated method stub
		return tm_paperMapper.delpaper_classbyid(ln_pid);
	}
}
