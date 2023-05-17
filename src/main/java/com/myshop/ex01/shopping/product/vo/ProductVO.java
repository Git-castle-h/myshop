package com.myshop.ex01.shopping.product.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("ProductVO")
public class ProductVO {

	private String p_id;
	private String p_name;
	private String p_price;
	private String p_detail_title;
	private String p_detail_context;
	private String p_recommend;
	private String admin_id;
	private Date p_date;
	private String p_category;
	
	
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_price() {
		return p_price;
	}
	public void setP_price(String p_price) {
		this.p_price = p_price;
	}
	public String getP_detail_title() {
		return p_detail_title;
	}
	public void setP_detail_title(String p_detail_title) {
		this.p_detail_title = p_detail_title;
	}
	public String getP_detail_context() {
		return p_detail_context;
	}
	public void setP_detail_context(String p_detail_context) {
		this.p_detail_context = p_detail_context;
	}
	public String getP_recommend() {
		return p_recommend;
	}
	public void setP_recommend(String p_recommend) {
		this.p_recommend = p_recommend;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public Date getP_date() {
		return p_date;
	}
	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}
	public String getP_category() {
		return p_category;
	}
	public void setP_category(String p_category) {
		this.p_category = p_category;
	}
	
	
}
