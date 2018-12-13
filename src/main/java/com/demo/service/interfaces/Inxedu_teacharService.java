package com.demo.service.interfaces;

import java.util.List;
import java.util.Map;

import com.demo.model.Teachar;

public interface Inxedu_teacharService {
	
	public List<Map> findallsubject();
	
	public List<Teachar> findallteachar(Integer subject_id);
	
	public Teachar findallteacharbyid(Integer id);

}
