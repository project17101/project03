package com.demo.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.Exam_dbMapper;
import com.demo.model.Exam_db;
import com.demo.service.interfaces.Exam_dbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class Exam_dbServiceImpl implements Exam_dbService {
	
	@Autowired
	Exam_dbMapper exam_dbMapper;

	@Override
	public PageInfo<Exam_db> findalldb(Exam_db db) {
		// TODO Auto-generated method stub
		//分页
		Integer startrow=db.getStartrow();
		Integer pagesize=db.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);
		
		List<Exam_db> dblist = exam_dbMapper.findalldb();
		 PageInfo<Exam_db> pageinfo = new PageInfo<>(dblist);
		return pageinfo;
	}

	@Override
	public void addexam_db(Exam_db db) {
		// TODO Auto-generated method stub
		exam_dbMapper.addexam_db(db);
	}

	@Override
	public Integer delexam_db(Integer id) {
		// TODO Auto-generated method stub
		return exam_dbMapper.delexam_db(id);
	}

	@Override
	public Exam_db toupexam_db(Integer id) {
		// TODO Auto-generated method stub
		return exam_dbMapper.toupexam_db(id);
	}

	@Override
	public void upexam_db(Exam_db db) {
		// TODO Auto-generated method stub
		exam_dbMapper.upexam_db(db);
	}

	@Override
	public List<Map> todbing(Integer id) {
		// TODO Auto-generated method stub
		List<Map> map = exam_dbMapper.todbing(id);
		map.add(this.exam_dbMapper.tobin(id));
		
		return map;
	}

	@Override
	public Map tobin(Integer id) {
		// TODO Auto-generated method stub
		return exam_dbMapper.tobin(id);
	}

}
