package com.demo.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.Inxedu_teacharMapper;
import com.demo.model.Teachar;
import com.demo.service.interfaces.Inxedu_teacharService;


@Service
public class Inxedu_teacharServiceImpl implements Inxedu_teacharService {

	@Autowired
	Inxedu_teacharMapper inxedu_teacharMapper;
	
	
	@Override
	public List<Map> findallsubject() {
		// TODO Auto-generated method stub
		return inxedu_teacharMapper.findallsubject();
	}


	@Override
	public List<Teachar> findallteachar(Integer subject_id) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("subject_id", subject_id);
		// TODO Auto-generated method stub
		return inxedu_teacharMapper.findallteachar(map);
	}


	@Override
	public Teachar findallteacharbyid(Integer id) {
		// TODO Auto-generated method stub
		return inxedu_teacharMapper.findallteacharbyid(id);
	}

}
