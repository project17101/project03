package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.EduWebsiteImages;
import com.demo.model.EduWebsiteImagesType;
import com.demo.service.interfaces.EduWebsiteImagesService;
import com.github.pagehelper.PageInfo;

/**
 * @author ZHAIYIBAO
 *	媒锟斤拷锟斤拷锟斤拷锟�
 */
@Controller
public class MediaAdSys {
	
	@Autowired
	EduWebsiteImagesService ewiService;
	
	/**
	 * @return
	 */
	@RequestMapping(value="adimg",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> findAdImgAll(EduWebsiteImages ewi){
		
		System.out.println("ewi:"+ewi.toString());
		PageInfo<EduWebsiteImages> pageInfo = ewiService.findAdImgAll(ewi);
		System.out.println("pageInfo:"+pageInfo.toString());
		Map map=new HashMap<String, Object>();
		map.put("rows", pageInfo.getList());
		map.put("total", pageInfo.getTotal());
		System.out.println("map:"+map.toString());
		return map;
	}
	@RequestMapping(value="adimg/{image_id}",method=RequestMethod.DELETE)
	@ResponseBody
	public void delAdImgById(@PathVariable Integer image_id){
		System.out.println("img:del:"+image_id);
		ewiService.delAdImgById(image_id);
	}
	@RequestMapping(value="adimg", produces="text/html",method=RequestMethod.DELETE)
	@ResponseBody
	public void delAdImgByIds(String ids){
		System.out.println("img:del:"+ids);
		String[] ss = ids.split(",");
		for(String image_id:ss){
			ewiService.delAdImgById(Integer.parseInt(image_id));
			
		}
	}
	
	
	
	
	
	
	/**
	 * @return
	 * 鑾峰彇鎵�鏈夊箍鍛婂浘鐗�
	 */
	@RequestMapping(value="imgtype",method=RequestMethod.GET)
	@ResponseBody
	public List<EduWebsiteImagesType> findAdImgTypeAll(){
		List<EduWebsiteImagesType> list = ewiService.findAdImgTypeAll();
		System.out.println("list:"+list.toString());
		return list;
	}
	@RequestMapping(value="imgtype/{type_id}",method=RequestMethod.DELETE)
	@ResponseBody
	public void delAdImgTypeById(@PathVariable Integer type_id){
		ewiService.delAdImgTypeById(type_id);;
		System.out.println("list:del:"+type_id);
	}
	@RequestMapping(value="imgtype",method=RequestMethod.PUT)
	@ResponseBody
	public void AddAdImgType(){
		EduWebsiteImagesType ewit = new EduWebsiteImagesType();
		ewit.setType_name("新建图片类型");
		ewiService.AddAdImgType(ewit);;;
		System.out.println("list:add:"+ewit);
	}
	
	
}
