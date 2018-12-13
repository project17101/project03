package com.demo.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Edu_article;
import com.demo.model.Edu_article_content;
import com.demo.service.interfaces.Edu_articleService;

@Controller
public class Edu_articleController {

	@Autowired
	Edu_articleService edu_articleService;
	
	/**
	 * 鍏ㄩ儴鏌ヨ
	* @Title: articlelist
	* @Description: TODO(杩欓噷鐢ㄤ竴鍙ヨ瘽鎻忚堪杩欎釜鏂规硶鐨勪綔鐢�)
	* @param @return聽聽聽聽鍙傛暟
	* @return List<Edu_article>聽聽聽聽杩斿洖绫诲瀷
	* @throws
	 */
	@RequestMapping(value="list",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<Edu_article> articlelist(){
		List<Edu_article> elist = edu_articleService.findEdu_article();
		System.out.println(elist);
		return elist;
	}
	
	/*
	 * 鍒颁慨鏀�
	 */
	@RequestMapping(value="toupd/ARTICLE_ID",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Edu_article articletoupd(Integer ARTICLE_ID){
		Edu_article elist = edu_articleService.toupdEdu_article(ARTICLE_ID);
		System.out.println("      杩涘叆Controller鍒颁慨鏀�            +++++++++++      "+elist);
		return elist;
	}
	/**
	 * 寮�濮嬩慨鏀�
	* @Title: articleupd
	* @Description: TODO(杩欓噷鐢ㄤ竴鍙ヨ瘽鎻忚堪杩欎釜鏂规硶鐨勪綔鐢�)
	* @param @param edu_article
	* @param @return聽聽聽聽鍙傛暟
	* @return Integer聽聽聽聽杩斿洖绫诲瀷
	* @throws
	 */
	@RequestMapping(value="upd/article_ID",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Integer articleupd(HttpServletRequest request,Edu_article_content edu_article_content,Edu_article edu_article,String title,
			String showImage, String source, String author, 
			String type, Integer clickNum,  Integer sort , String content,Integer article_ID){
		edu_article.setARTICLE_ID(new Integer(request.getParameter("article_ID")));
		edu_article.setARTICLE_TYPE(type);
		edu_article.setAUTHOR(author);
		edu_article.setCLICK_NUM(clickNum);
		edu_article.setCONTENT(content);//鏂囩珷
		edu_article.setIMAGE_URL(showImage);
		edu_article.setSORT(sort);
		edu_article.setSOURCE(source);
		edu_article.setTITLE(title);
		System.out.println("showImage        "+showImage);
//		edu_article_content.setCONTENT(content);
//		edu_articleService.updEdu_article_content(edu_article_content);
//		System.out.println(" xiugai  kaishi     conten           "+edu_article_content);
		return edu_articleService.updEdu_article(edu_article);
	}
	
	/**
	 * 妯＄硦鏌ヨ
	* @Title: articlelist
	* @Description: TODO(杩欓噷鐢ㄤ竴鍙ヨ瘽鎻忚堪杩欎釜鏂规硶鐨勪綔鐢�)
	* @param @param author
	* @param @param article_TYPE
	* @param @param time_start
	* @param @param time_end
	* @param @param edu_article
	* @param @return聽聽聽聽鍙傛暟
	* @return List<Edu_article>聽聽聽聽杩斿洖绫诲瀷
	* @throws
	 */
	@RequestMapping(value="list/edu_article",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public  List<Edu_article> articlelist(String author,String article_TYPE,String time_start,String time_end ,Edu_article edu_article) {
		System.out.println(time_start+"=="+time_end);
		edu_article.setAUTHOR(author);
		edu_article.setSOURCE(author);
		edu_article.setTITLE(author);	
		edu_article.setTime_end(time_end);
		edu_article.setTime_start(time_start);
		edu_article.setARTICLE_TYPE(article_TYPE);
		System.out.println(edu_article);			
		List<Edu_article> llist = edu_articleService.findEdu_article(edu_article);
		System.out.println(llist);
		return llist;
	}
	
	
	/**
	 * 鐗涢�肩殑鍒犻櫎鍜屾壒閲忓垹闄�
	* @Title: articledel
	* @Description: TODO(杩欓噷鐢ㄤ竴鍙ヨ瘽鎻忚堪杩欎釜鏂规硶鐨勪綔鐢�)
	* @param @param ARTICLE_ID
	* @param @param request
	* @param @return聽聽聽聽鍙傛暟
	* @return Integer聽聽聽聽杩斿洖绫诲瀷
	* @throws
	 */
	@RequestMapping(value="del/ARTICLE_ID",method=RequestMethod.POST)
	@ResponseBody
	public Integer articledel(Integer[] ARTICLE_ID,HttpServletRequest request){
		System.out.println("鍒犻櫎浠庡墠鍙板緱鍒扮殑鍊�      "+ARTICLE_ID);
		return edu_articleService.delEdu_article(ARTICLE_ID);
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	@ResponseBody
	public Integer articleadd(HttpServletRequest request,Edu_article_content edu_article_content,Edu_article edu_article,String TITLE,
			String SUMMARY, String KEY_WORD, String IMAGE_URL, String SOURCE, String AUTHOR, String LINK,String PUBLISH_TIME,
			String ARTICLE_TYPE, Integer CLICK_NUM, Integer PRAISE_COUNT, Integer COMMENT_NUM, Integer SORT , String CONTENT){
		System.out.println("--------------------123123123123123-------");
		edu_article.setARTICLE_TYPE(request.getParameter("ARTICLE_TYPE"));
		System.out.println("鏁版嵁绫诲瀷          "+request.getParameter("ARTICLE_TYPE"));
		edu_article.setAUTHOR(request.getParameter("AUTHOR"));
		edu_article.setCLICK_NUM(new Integer(request.getParameter("CLICK_NUM")));
		edu_article.setIMAGE_URL(request.getParameter("IMAGE_URL"));     
	//	edu_article.setKEY_WORD(request.getParameter("KEY_WORD"));
	//	edu_article.setLINK(request.getParameter("LINK"));
	//	edu_article.setPRAISE_COUNT(new Integer(request.getParameter("PRAISE_COUNT")));
		edu_article.setSORT(new Integer(request.getParameter("SORT")));
		edu_article.setSOURCE(request.getParameter("SOURCE"));
		edu_article.setSUMMARY(request.getParameter("SUMMARY"));
		edu_article.setTITLE(request.getParameter("TITLE"));
	//	edu_article.setPUBLISH_TIME(PUBLISH_TIME);   now()
		edu_article.setCONTENT(CONTENT);
		System.out.println("娣诲姞浠庡墠鍙板緱鍒扮殑鍊�1111111111111      "+edu_article);
		edu_articleService.addEdu_article_content(edu_article_content);	
		return edu_articleService.addEdu_article(edu_article);		
	}
}
