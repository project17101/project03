package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.model.Edu_article;
import com.demo.model.Edu_article_content;

public interface Edu_article_Mapper {
	public List<Edu_article> findEdu_article();

	public List<Edu_article> findEdu_article(Edu_article edu_article);
	
	public Integer addEdu_article(Edu_article edu_article);
	public Integer addEdu_article_content(Edu_article_content edu_article_content);
	/**
	 * 删除和批量删除
	* @Title: delEdu_article
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param ARTICLE_ID
	* @param @return    参数
	* @return Integer    返回类型
	* @throws
	 */
	public Integer delEdu_article(@Param("ARTICLE_ID")Integer[] ARTICLE_ID);
	
	/**
	 * 到修改页面
	* @Title: toupdEdu_article
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param ARTICLE_ID
	* @param @return    参数
	* @return List<Edu_article>    返回类型
	* @throws
	 */
	public Edu_article toupdEdu_article(@Param("ARTICLE_ID")Integer ARTICLE_ID);
	
	public Integer updEdu_article(Edu_article edu_article);
	public Integer updEdu_article_content(Edu_article_content edu_article_content);
}
