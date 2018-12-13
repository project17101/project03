package com.demo.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.FunctionMapper;
import com.demo.service.interfaces.FunctionService;
@Service
public class FunctionServiceimpl implements FunctionService {

	@Autowired
	FunctionMapper functionMapper;
	
	public List<Map> findMenu(String role_id) {
		// TODO Auto-generated method stub
		return functionMapper.findMenu(role_id);
	}


}
