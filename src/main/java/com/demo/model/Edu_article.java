package com.demo.model;

public class Edu_article {
	private Integer ARTICLE_ID;// '文章ID',
	private String TITLE;//  varchar(100) DEFAULT NULL COMMENT '文章标题',
	private String    SUMMARY;//  varchar(200) DEFAULT NULL COMMENT '文章摘要',
	private String    KEY_WORD;//  varchar(50) DEFAULT NULL COMMENT '文章关键字',
	private String    IMAGE_URL;//  varchar(100) DEFAULT NULL COMMENT '文章图片URL',
	private String    SOURCE;//  varchar(50) DEFAULT NULL COMMENT '文章来源',
	private String    AUTHOR;//  varchar(10) DEFAULT NULL COMMENT '文章作者',
	private String    CREATE_TIME;//  timestamp NULL DEFAULT NULL COMMENT '文章创建时间',
	private String    PUBLISH_TIME;//  timestamp NULL DEFAULT NULL COMMENT '文章发布时间',
	private String    time_start;//  timestamp NULL DEFAULT NULL COMMENT '文章创建开始时间',
	private String    time_end;//  timestamp NULL DEFAULT NULL COMMENT '文章创建结束时间',
	private String    LINK;//  varchar(100) DEFAULT NULL COMMENT '文章访问链接',
	private String    ARTICLE_TYPE;//  tinyint(4) DEFAULT '0' COMMENT '文章类型 2文章',
	private Integer    CLICK_NUM;//  int(11) DEFAULT '0' COMMENT '文章点击量',
	private Integer    PRAISE_COUNT;//  int(11) DEFAULT '0' COMMENT '点赞数量',
	private Integer    COMMENT_NUM;//  int(11) DEFAULT '0' COMMENT '评论数',
	private Integer    SORT;// int(11) DEFAULT '0' COMMENT '排序值',
	private String     CONTENT ;// content内容
	
	@Override
	public String toString() {
		return "Edu_article [ARTICLE_ID=" + ARTICLE_ID + ", TITLE=" + TITLE + ", SUMMARY=" + SUMMARY + ", KEY_WORD="
				+ KEY_WORD + ", IMAGE_URL=" + IMAGE_URL + ", SOURCE=" + SOURCE + ", AUTHOR=" + AUTHOR + ", CREATE_TIME="
				+ CREATE_TIME + ", PUBLISH_TIME=" + PUBLISH_TIME + ", LINK=" + LINK + ", ARTICLE_TYPE=" + ARTICLE_TYPE
				+ ", CLICK_NUM=" + CLICK_NUM + ", PRAISE_COUNT=" + PRAISE_COUNT + ", COMMENT_NUM=" + COMMENT_NUM
				+ ", SORT=" + SORT + "]";
	}

	public Integer getARTICLE_ID() {
		return ARTICLE_ID;
	}

	public void setARTICLE_ID(Integer aRTICLE_ID) {
		ARTICLE_ID = aRTICLE_ID;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getSUMMARY() {
		return SUMMARY;
	}

	public void setSUMMARY(String sUMMARY) {
		SUMMARY = sUMMARY;
	}

	public String getKEY_WORD() {
		return KEY_WORD;
	}

	public void setKEY_WORD(String kEY_WORD) {
		KEY_WORD = kEY_WORD;
	}

	public String getIMAGE_URL() {
		return IMAGE_URL;
	}

	public void setIMAGE_URL(String iMAGE_URL) {
		IMAGE_URL = iMAGE_URL;
	}

	public String getSOURCE() {
		return SOURCE;
	}

	public void setSOURCE(String sOURCE) {
		SOURCE = sOURCE;
	}

	public String getAUTHOR() {
		return AUTHOR;
	}

	public void setAUTHOR(String aUTHOR) {
		AUTHOR = aUTHOR;
	}

	public String getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(String cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	public String getPUBLISH_TIME() {
		return PUBLISH_TIME;
	}

	public void setPUBLISH_TIME(String pUBLISH_TIME) {
		PUBLISH_TIME = pUBLISH_TIME;
	}

	public String getTime_start() {
		return time_start;
	}

	public void setTime_start(String time_start) {
		this.time_start = time_start;
	}

	public String getTime_end() {
		return time_end;
	}

	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}

	public String getLINK() {
		return LINK;
	}

	public void setLINK(String lINK) {
		LINK = lINK;
	}

	public String getARTICLE_TYPE() {
		return ARTICLE_TYPE;
	}

	public void setARTICLE_TYPE(String aRTICLE_TYPE) {
		ARTICLE_TYPE = aRTICLE_TYPE;
	}

	public Integer getCLICK_NUM() {
		return CLICK_NUM;
	}

	public void setCLICK_NUM(Integer cLICK_NUM) {
		CLICK_NUM = cLICK_NUM;
	}

	public Integer getPRAISE_COUNT() {
		return PRAISE_COUNT;
	}

	public void setPRAISE_COUNT(Integer pRAISE_COUNT) {
		PRAISE_COUNT = pRAISE_COUNT;
	}

	public Integer getCOMMENT_NUM() {
		return COMMENT_NUM;
	}

	public void setCOMMENT_NUM(Integer cOMMENT_NUM) {
		COMMENT_NUM = cOMMENT_NUM;
	}

	public Integer getSORT() {
		return SORT;
	}

	public void setSORT(Integer sORT) {
		SORT = sORT;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}


}
