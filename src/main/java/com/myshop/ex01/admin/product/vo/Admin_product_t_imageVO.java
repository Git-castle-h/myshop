package com.myshop.ex01.admin.product.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("Admin_product_t_imageVO")
public class Admin_product_t_imageVO {
	
	private String p_id;
	private String p_name;
	private String p_price;
	private Date p_t_image_date;
	private String p_t_image_type;
	private String p_t_image_id;
	private String p_t_image_name;
	
	
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
	public Date getP_t_image_date() {
		return p_t_image_date;
	}
	public void setP_t_image_date(Date p_t_image_date) {
		this.p_t_image_date = p_t_image_date;
	}
	public String getP_t_image_type() {
		return p_t_image_type;
	}
	public void setP_t_image_type(String p_t_image_type) {
		this.p_t_image_type = p_t_image_type;
	}
	public String getP_t_image_id() {
		return p_t_image_id;
	}
	public void setP_t_image_id(String p_t_image_id) {
		this.p_t_image_id = p_t_image_id;
	}
	public String getP_t_image_name() {
		return p_t_image_name;
	}
	public void setP_t_image_name(String p_t_image_name) {
		this.p_t_image_name = p_t_image_name;
	}


	
}
