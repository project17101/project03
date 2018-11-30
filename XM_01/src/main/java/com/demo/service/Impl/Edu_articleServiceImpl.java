package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.Edu_article_Mapper;
import com.demo.model.Edu_article;
import com.demo.model.Edu_article_content;
import com.demo.service.interfaces.Edu_articleService;

@Service
public class Edu_articleServiceImpl implements Edu_articleService {
	
	@Autowired
	Edu_article_Mapper edu_article_Mapper;

	public List<Edu_article> findEdu_article(Edu_article edu_article) {
		// TODO Auto-generated method stub
		System.out.println("棣栧厛杩涘叆Edu_articleServiceImpl");
		return edu_article_Mapper.findEdu_article(edu_article);
	}

	/**
	 * 鍒犻櫎鍜屾壒閲忓垹闄�
	* @Title: delEdu_article
	* @Description: TODO(杩欓噷鐢ㄤ竴鍙ヨ瘽鎻忚堪杩欎釜鏂规硶鐨勪綔鐢�)
	* @param @param ARTICLE_ID
	* @param @return聽聽聽聽鍙傛暟
	* @return Integer聽聽聽聽杩斿洖绫诲瀷
	* @throws
	 */
	public Integer delEdu_article(Integer[] ARTICLE_ID) {
		// TODO Auto-generated method stub	
		return edu_article_Mapper.delEdu_article(ARTICLE_ID);
	}

	public List<Edu_article> findEdu_article() {
		// TODO Auto-generated method stub
		return edu_article_Mapper.findEdu_article();
	}

	public Integer addEdu_article(Edu_article edu_article) {
		// TODO Auto-generated method stub
		return edu_article_Mapper.addEdu_article(edu_article);
	}	
	public Integer addEdu_article_content(Edu_article_content edu_article_content) {
		// TODO Auto-generated method stub
		return edu_article_Mapper.addEdu_article_content(edu_article_content);
	}
	
	
	public Edu_article toupdEdu_article(Integer ARTICLE_ID) {
		// TODO Auto-generated method stub
		return edu_article_Mapper.toupdEdu_article(ARTICLE_ID);
	}

	public Integer updEdu_article(Edu_article edu_article) {
		// TODO Auto-generated method stub
		return edu_article_Mapper.updEdu_article(edu_article);
	}

	public Integer updEdu_article_content(Edu_article_content edu_article_content) {
		// TODO Auto-generated method stub
		return edu_article_Mapper.updEdu_article_content(edu_article_content);
	}

}
