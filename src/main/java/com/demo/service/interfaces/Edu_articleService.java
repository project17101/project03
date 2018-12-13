package com.demo.service.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.model.Edu_article;
import com.demo.model.Edu_article_content;

public interface Edu_articleService {
	public List<Edu_article> findEdu_article();

	public List<Edu_article> findEdu_article(Edu_article edu_article);
	
	public Integer addEdu_article(Edu_article edu_article);
	public Integer addEdu_article_content(Edu_article_content edu_article_content);
	
	/**
	 * 鍒犻櫎鍜屾壒閲忓垹闄�
	* @Title: delEdu_article
	* @Description: TODO(杩欓噷鐢ㄤ竴鍙ヨ瘽鎻忚堪杩欎釜鏂规硶鐨勪綔鐢�)
	* @param @param ARTICLE_ID
	* @param @return聽聽聽聽鍙傛暟
	* @return Integer聽聽聽聽杩斿洖绫诲瀷
	* @throws
	 */
	public Integer delEdu_article(Integer[] aRTICLE_ID);
	
	/*
	 * 鍒颁慨鏀�
	 */
	public Edu_article toupdEdu_article(@Param("ARTICLE_ID")Integer ARTICLE_ID);

	public Integer updEdu_article(Edu_article edu_article);
	public Integer updEdu_article_content(Edu_article_content edu_article_content);
	}
