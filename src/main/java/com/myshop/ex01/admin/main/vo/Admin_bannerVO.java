package com.myshop.ex01.admin.main.vo;

import org.springframework.stereotype.Component;

@Component("Admin_bannerVO")
public class Admin_bannerVO {
	private String banner_name;
	private String banner_title;
	private String banner_detail;
	private String banner_link;	
	private String banner_color;
	
	

	public String getBanner_name() {
		return banner_name;
	}
	public void setBanner_name(String banner_name) {
		this.banner_name = banner_name;
	}
	public String getBanner_title() {
		return banner_title;
	}
	public void setBanner_title(String banner_title) {
		this.banner_title = banner_title;
	}
	public String getBanner_detail() {
		return banner_detail;
	}
	public void setBanner_detail(String banner_detail) {
		this.banner_detail = banner_detail;
	}
	public String getBanner_link() {
		return banner_link;
	}
	public void setBanner_link(String banner_link) {
		this.banner_link = banner_link;
	}
	public String getBanner_color() {
		return banner_color;
	}
	public void setBanner_color(String banner_color) {
		this.banner_color = banner_color;
	}
	
}
