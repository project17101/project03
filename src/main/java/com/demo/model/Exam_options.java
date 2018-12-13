package com.demo.model;

public class Exam_options {
	
	private int qid;//选项对应的试题
	private String opt; //选项对应的字母
	private String soption;  //选项的内容
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getOpt() {
		return opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}
	public String getSoption() {
		return soption;
	}
	public void setSoption(String soption) {
		this.soption = soption;
	}

}
