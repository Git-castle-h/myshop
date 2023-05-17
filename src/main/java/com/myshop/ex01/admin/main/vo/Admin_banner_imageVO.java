package com.myshop.ex01.admin.main.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("Admin_banner_imageVO")
public class Admin_banner_imageVO {
	
	private String banner_name;
	private String banner_image_type;
	private String banner_image_id;
	private String banner_image_name;
	private Date banner_image_date;
	
	
	public String getBanner_name() {
		return banner_name;
	}
	public void setBanner_name(String banner_name) {
		this.banner_name = banner_name;
	}
	public String getBanner_image_type() {
		return banner_image_type;
	}
	public void setBanner_image_type(String banner_image_type) {
		this.banner_image_type = banner_image_type;
	}
	public String getBanner_image_id() {
		return banner_image_id;
	}
	public void setBanner_image_id(String banner_image_id) {
		this.banner_image_id = banner_image_id;
	}
	public String getBanner_image_name() {
		return banner_image_name;
	}
	public void setBanner_image_name(String banner_image_name) {
		this.banner_image_name = banner_image_name;
	}
	public Date getBanner_image_date() {
		return banner_image_date;
	}
	public void setBanner_image_date(Date banner_image_date) {
		this.banner_image_date = banner_image_date;
	}
	
	
}
