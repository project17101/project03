package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.EduWebsiteImages;
import com.demo.service.interfaces.EduWebsiteImagesService;
import com.github.pagehelper.PageInfo;

/**
 * @author ZHAIYIBAO
 *	ý�������
 */
@Controller
public class MediaAdSys {
	
	@Autowired
	EduWebsiteImagesService ewiService;
	
	/**
	 * @return
	 */
	@RequestMapping(value="adimg")
	@ResponseBody
	public Map<String, Object> findAdImgAll(EduWebsiteImages ewi){
		
		PageInfo<EduWebsiteImages> pageInfo = ewiService.findAdImgAll(ewi);
		System.out.println("pageInfo:"+pageInfo.toString());
		Map map=new HashMap<String, Object>();
		map.put("rows", pageInfo.getList());
		map.put("total", pageInfo.getTotal());
		System.out.println("map:"+map.toString());
		
		
		return map;
	}
	
	
	
	
	
	
	
	
}
