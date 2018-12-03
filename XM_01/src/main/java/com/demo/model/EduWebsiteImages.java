package com.demo.model;

/**
 * @author ZHAIYIBAO
 *	bannerͼ����
 */
public class EduWebsiteImages extends PageBean {

	private Integer image_id;	//
	private String image_url;	//ͼƬ��ַ
	private String link_address;	//ͼ���ӵ�ַ
	private String title;		//ͼ����
	private Integer type_id;	//ͼƬ����
	private Integer series_number;	//���к�
	private String preview_url;	//����ͼƬ��ַ
	private String color;		//����ɫ
	private String describe;	//ͼƬ���� 
	
	private String type_name;
	
	
	
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public Integer getImage_id() {
		return image_id;
	}
	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getLink_address() {
		return link_address;
	}
	public void setLink_address(String link_address) {
		this.link_address = link_address;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public Integer getSeries_number() {
		return series_number;
	}
	public void setSeries_number(Integer series_number) {
		this.series_number = series_number;
	}
	public String getPreview_url() {
		return preview_url;
	}
	public void setPreview_url(String preview_url) {
		this.preview_url = preview_url;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	@Override
	public String toString() {
		return "EduWebsiteImages [image_id=" + image_id + ", image_url=" + image_url + ", link_address=" + link_address
				+ ", title=" + title + ", type_id=" + type_id + ", series_number=" + series_number + ", preview_url="
				+ preview_url + ", color=" + color + ", describe=" + describe + ", type_name=" + type_name + "]";
	}
	
	
	
	

}
