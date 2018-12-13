package com.demo.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.Exam_listMapper;
import com.demo.model.Exam_db;
import com.demo.model.Exam_list;
import com.demo.model.Exam_options;
import com.demo.service.interfaces.Exam_listService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class Exam_listServiceImpl implements Exam_listService{
	@Autowired
	Exam_listMapper exam_listMapper;

	@Override
	public PageInfo<Map> findallexan_list(Exam_list list) {
		// TODO Auto-generated method stub
		//分页
		Integer startrow=list.getStartrow();
		Integer pagesize=list.getPagesize();
		PageHelper.offsetPage(startrow, pagesize);
		
		List<Map> llist = exam_listMapper.findallexan_list(list);
		 PageInfo<Map> pageinfo = new PageInfo<>(llist);
		return pageinfo;
	}

	@Override
	public List<Exam_db> findexam() {
		// TODO Auto-generated method stub
		return exam_listMapper.findexam();
	}

	@Override
	public Integer delexam_list(Integer id) {
		// TODO Auto-generated method stub
		return exam_listMapper.delexam_list(id);
	}


	@Override
	public Integer addExam_list(Exam_list list) {
		// TODO Auto-generated method stub
		return exam_listMapper.addExam_list(list);
	}

	@Override
	public void addExam_options(Exam_options ooptions) {
		// TODO Auto-generated method stub
		exam_listMapper.addExam_options(ooptions);
	}

	@Override
	public void updateExam_list(Exam_list list) {
		// TODO Auto-generated method stub
		exam_listMapper.updateExam_list(list);
	}




}
