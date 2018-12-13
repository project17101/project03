package com.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.service.Impl.FunctionServiceimpl;

@Controller
public class FunctionController {

	@Autowired
	FunctionServiceimpl functionServiceimpl;
	
	@RequestMapping(value="menu")
	public @ResponseBody List<Map> findMenu(String role_id) {
		List list = functionServiceimpl.findMenu(role_id);
		return list;
	}
}
