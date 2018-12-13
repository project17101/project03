package com.demo.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author ZHAIYIBAO
 *	网站统计日数据
 */
public class Edu_statistics_day {
	
	private Integer id;   //
	private Date statistics_time;   //统计日期
	private Integer login_num;   //登录人数（活跃人数 ）
	private Date create_time;   //生成时间
	private Integer registered_num;   //注册人数
	private Integer video_viewing_num;   //每日播放视频数
	private Integer daily_user_number;   //每日用户数
	private Integer daily_course_number;   //每日课程数
	
	//------------ 条件查询参数--------------
	private String stype;   //统计类型
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date start_time;  //开始统计时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date end_time;	  //结束统计时间
	//-------------------------------------
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStatistics_time() {
		return statistics_time;
	}
	public void setStatistics_time(Date statistics_time) {
		this.statistics_time = statistics_time;
	}
	public Integer getLogin_num() {
		return login_num;
	}
	public void setLogin_num(Integer login_num) {
		this.login_num = login_num;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Integer getRegistered_num() {
		return registered_num;
	}
	public void setRegistered_num(Integer registered_num) {
		this.registered_num = registered_num;
	}
	public Integer getVideo_viewing_num() {
		return video_viewing_num;
	}
	public void setVideo_viewing_num(Integer video_viewing_num) {
		this.video_viewing_num = video_viewing_num;
	}
	public Integer getDaily_user_number() {
		return daily_user_number;
	}
	public void setDaily_user_number(Integer daily_user_number) {
		this.daily_user_number = daily_user_number;
	}
	public Integer getDaily_course_number() {
		return daily_course_number;
	}
	public void setDaily_course_number(Integer daily_course_number) {
		this.daily_course_number = daily_course_number;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	@Override
	public String toString() {
		return "Edu_statistics_day [id=" + id + ", statistics_time=" + statistics_time + ", login_num=" + login_num
				+ ", create_time=" + create_time + ", registered_num=" + registered_num + ", video_viewing_num="
				+ video_viewing_num + ", daily_user_number=" + daily_user_number + ", daily_course_number="
				+ daily_course_number + ", stype=" + stype + ", start_time=" + start_time + ", end_time=" + end_time
				+ "]";
	}
	
	

}
