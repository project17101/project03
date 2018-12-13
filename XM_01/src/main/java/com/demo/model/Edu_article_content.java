package com.demo.model;

public class Edu_article_content {
	  private Integer ARTICLE_ID; //int(11) DEFAULT '0' COMMENT 'ндубID',
	  private String CONTENT; //text COMMENT 'ндубдзхщ'
	public Integer getARTICLE_ID() {
		return ARTICLE_ID;
	}
	public void setARTICLE_ID(Integer aRTICLE_ID) {
		ARTICLE_ID = aRTICLE_ID;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	  
}
