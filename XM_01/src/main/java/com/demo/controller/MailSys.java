package com.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Edu_emailsend_history;
import com.demo.service.interfaces.MailManagerService;
import com.demo.until.checkUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author ZHAIYIBAO
 * 邮件管理
 */
@Controller
public class MailSys { 
	
	@Autowired
	MailManagerService mms;
	
	/**
	 * @param emh
	 * @return
	 * 查询所有邮件发送记录
	 */
	@RequestMapping(value="mail",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> findEMHAll(Edu_emailsend_history emh){
		/*PageHelper.startPage(emh.getStartrow(), emh.getPagesize());*/
		System.out.println("emh:"+emh);
		PageHelper.startPage(1,5);
		List<Edu_emailsend_history> list = mms.findEMHAll(emh);
		PageInfo<Edu_emailsend_history> pageInfo = new PageInfo<Edu_emailsend_history>(list);
		System.out.println("pageInfo:"+pageInfo.toString());
		Map map=new HashMap<String, Object>();
		map.put("rows", pageInfo.getList());
		map.put("total", pageInfo.getTotal());
		System.out.println("map:"+map.toString());
		return map;
	}
	
	@RequestMapping(value="mail/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public void delMailById(@PathVariable Integer id){
		mms.delMailById(id);
	}
	
	@RequestMapping(value="mail/{id}",method=RequestMethod.POST)
	@ResponseBody
	public Edu_emailsend_history findEmailById(@PathVariable Integer id){
		Edu_emailsend_history eeh = mms.findEmailById(id);
		System.out.println("eeh:"+eeh.toString());
		return eeh;
	}
	
	@RequestMapping(value="email",method=RequestMethod.POST)
	@ResponseBody
	public Map addEmail(Edu_emailsend_history eeh){
		SimpleDateFormat df = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		eeh.setUser_id(1);
		if (eeh.getCreate_time()==null) {
			eeh.setCreate_time(new Date());
		}
		if (eeh.getSend_time()==null) {
			eeh.setSend_time(new Date());
		}
		Map<String, Object> returnMap = checkUtils.checkEmail(eeh.getEmail());
		boolean flag = (boolean) returnMap.get("flag");
		if(flag){
			System.out.println("添加邮件");
			mms.addEmail(eeh);
		}else{
			System.out.println("false");
		}
		System.out.println("returnMap:"+returnMap.toString());
		//mms.addEmail(eeh);
		return returnMap;
	}
	
}
