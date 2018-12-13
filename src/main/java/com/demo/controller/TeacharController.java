package com.demo.controller;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.demo.model.Sys_subject;
import com.demo.model.Teachar;
import com.demo.service.interfaces.TeacharService;
import com.github.pagehelper.PageInfo;


@Controller
public class TeacharController {
	@Value("${host}")
	private String host; 
	@Value("${userName}")
    private String userName;
	@Value("${userPwd}")
    private String userPwd;
	@Value("${basePath}")
    private String basePath;
	@Value("${port}")
    private int port;


	@Autowired
	TeacharService teacharService;
	
	@RequestMapping("findteachar")
	public @ResponseBody Map<String , Object> findteachar(Teachar teachar){
		PageInfo<Teachar> pageinfo = teacharService.findteachar(teachar);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;
	}
	
	@RequestMapping("delteachar")
	public @ResponseBody Integer delteachar(Integer ID){
		return teacharService.delteachar(ID);
	}
	
	@RequestMapping("toaddteacharfindbig")
	public @ResponseBody List<Sys_subject> toadd(){
		
		List<Sys_subject> biglist =teacharService.toaddteacharfindbig();
		return biglist;
	}
	
	@RequestMapping("toaddteacharfindsmall")
	public @ResponseBody List<Sys_subject> toaddsecound(String subject_id ){
		
		List<Sys_subject> smalllist =teacharService.toaddteacharfindsmall(subject_id);
		return smalllist;
	}
	@RequestMapping(value="addteachar", method=RequestMethod.POST,produces="text/html;charset=utf-8")
	public @ResponseBody Integer addteachar(Teachar teachar,@RequestParam(value="file", required=false) MultipartFile file,HttpServletRequest request) throws IOException{
			//获取文件后缀
			String originalName = file.getOriginalFilename();
			String path=request.getRealPath("upload");
			String suffix = originalName.substring(originalName.lastIndexOf("."));
			//根据时间戳生成文件名
			String fileName = String.valueOf(System.currentTimeMillis())+(int)((Math.random()*9+1)*100000)+suffix;
			File file1=new File(path+"//"+fileName);			
			try {
				FileUtils.copyInputStreamToFile(file.getInputStream(),file1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			teachar.setPic_path("upload	/"+fileName);
			teacharService.addteachar(teachar);
			return null;
	}
	@RequestMapping("toupset")
	public @ResponseBody Map<String , Object> toupset(Integer ID , String subject_id){

		//根据id查询要修改的数据信息
		List<Teachar> tlist=teacharService.toupset(ID);
		//二级菜单
		List<Sys_subject> biglist =teacharService.toaddteacharfindbig();
		Map <String , Object> map=new HashMap<String, Object>();
		map.put("tlist", tlist);
		map.put("biglist", biglist);
		return map;
	}
	
	@RequestMapping(value="upsetteachar", method=RequestMethod.POST,produces="text/html;charset=utf-8")
	public @ResponseBody Integer upsetteachar(Teachar teachar,@RequestParam(value="file", required=false) MultipartFile file,HttpServletRequest request) throws IOException{
		String originalName = file.getOriginalFilename();
		String path=request.getRealPath("upload");
		File file1=new File(path+"//"+originalName);			
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(),file1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		teachar.setPic_path(file.getOriginalFilename());
		teacharService.upteachar(teachar);
		return null;	
	}
}
