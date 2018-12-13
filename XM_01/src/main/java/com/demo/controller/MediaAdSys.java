package com.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
	 * 	查询所有广告图片
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
	/**
	 * @param image_id
	 * 	根据id删除广告图片
	 */
	@RequestMapping(value="adimg/{image_id}",method=RequestMethod.DELETE)
	@ResponseBody
	public void delAdImgById(@PathVariable Integer image_id){
		System.out.println("img:del:"+image_id);
		ewiService.delAdImgById(image_id);
	}
	/**
	 * @param ids
	 * 批量删除广告
	 */
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
	 * @param ewi
	 * @param file
	 * 	添加广告图片
	 */
	@RequestMapping(value="adimga",method=RequestMethod.POST,produces="text/html;charset=utf-8")
	@ResponseBody
	public Map addImg(EduWebsiteImages ewi,@RequestParam(value="file", required=false)MultipartFile file
			,HttpServletRequest request,@RequestParam(value="file1", required=false)MultipartFile file1){
		Map map = new HashMap<>();
		System.out.println("ewi:"+ewi.toString());
		String fname = file.getOriginalFilename();
		String fname1 = file1.getOriginalFilename();
		System.out.println("fname:"+fname);
		System.out.println("fname1:"+fname1);
		String type = file.getContentType();
		long size = file.getSize();
		System.out.println("fname:"+fname+",type:"+type+",size:"+size+",  "+file.getName());
		
		String path = request.getRealPath("upload");
		File nfile = new File(path+"//"+fname);
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), nfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException............");
			map.put("message", "图片上传失败！");
			e.printStackTrace();
			return map;
		}
		File nfile1 = new File(path+"//"+fname1);
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), nfile1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			map.put("message", "缩略图上传失败！");
			e.printStackTrace();
			return map;
		}
		String urlPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/upload/"+fname;
		String urlPath1 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/upload/"+fname1;
		System.out.println("上传成功,path:"+path+",a="+urlPath);
		ewi.setImage_url(urlPath);
		ewi.setPreview_url(urlPath1);
		System.out.println("ewiup:"+ewi.toString());
		map.put("message", "添加成功");
		return map;
	}
	
	
	
	
	@RequestMapping(value="adimgaa",method=RequestMethod.POST,produces="text/html;charset=utf-8")
	public @ResponseBody Map addImg(EduWebsiteImages ewi,
			@RequestParam(value="file1", required=false)MultipartFile file1,
			@RequestParam(value="file2", required=false)MultipartFile file2,
			HttpServletRequest request){
		System.out.println("ewiup:"+ewi.toString());
		Map jsoninfo = new HashMap<>();
		
		String filename1 = file1.getOriginalFilename();
		String filename2 = file2.getOriginalFilename();
		
		String path=request.getRealPath("upload");
		File file = new File(path+"//"+filename1);
		File nfile = new File(path+"//"+filename2);
		
		try {
			FileUtils.copyInputStreamToFile(file1.getInputStream(),file);
			FileUtils.copyInputStreamToFile(file2.getInputStream(),nfile);
		} catch (IOException e) {
			jsoninfo.put("error", "文件上传失败");
			System.out.println("上传失败");
			e.printStackTrace();
		}
		String urlPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/upload/"+filename1;
		String urlPath1 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/upload/"+filename2;
		ewi.setImage_url(urlPath);
		ewi.setPreview_url(urlPath1);
		System.out.println("文件上传成功");
		jsoninfo.put("message", "文件上传成功");
		ewiService.addImg(ewi);
		jsoninfo.put("message", "图片添加成功");
		return jsoninfo;
	}
	@RequestMapping(value="/{image_id}/adimg",method=RequestMethod.POST)
	@ResponseBody
	public EduWebsiteImages getImgById(@PathVariable Integer image_id){
		System.out.println("image_id:"+image_id);
		return ewiService.getImgById(image_id);
		
	}
	
	
	
	
	
	
	
	/**
	 * @return
	 * 获取所有图片类型
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
	/**
	 * 新建图片类型
	 */
	@RequestMapping(value="imgtype",method=RequestMethod.POST)
	@ResponseBody
	public void AddAdImgType(){
		EduWebsiteImagesType ewit = new EduWebsiteImagesType();
		ewit.setType_name("新建图片类型");
		System.out.println("list:add:"+ewit);
		ewiService.AddAdImgType(ewit);;;
	}
	@RequestMapping(value="imgtype/{type_id}/{type_name}",method=RequestMethod.PUT)
	@ResponseBody
	public void upAdImgType(@PathVariable("type_id") Integer type_id,
							@PathVariable("type_name") String type_name){
		EduWebsiteImagesType ewit = new EduWebsiteImagesType();
		ewit.setType_id(type_id);
		ewit.setType_name(type_name);
		ewiService.upAdImgTypeById(ewit);
	}
	
	
}
