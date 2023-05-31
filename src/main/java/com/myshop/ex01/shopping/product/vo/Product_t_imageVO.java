package com.myshop.ex01.shopping.product.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("Product_t_imageVO")
public class Product_t_imageVO {
	
	private String p_id;
	private String p_name;
	private String p_price;
	private Date p_image_t_date;
	private String p_image_t_type;
	private String p_image_t_id;
	private String p_image_t_name;
	
	
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
	public Date getP_image_t_date() {
		return p_image_t_date;
	}
	public void setP_image_t_date(Date p_image_t_date) {
		this.p_image_t_date = p_image_t_date;
	}
	public String getP_image_t_type() {
		return p_image_t_type;
	}
	public void setP_image_t_type(String p_image_t_type) {
		this.p_image_t_type = p_image_t_type;
	}
	public String getP_image_t_id() {
		return p_image_t_id;
	}
	public void setP_image_t_id(String p_image_t_id) {
		this.p_image_t_id = p_image_t_id;
	}
	public String getP_image_t_name() {
		return p_image_t_name;
	}
	public void setP_image_t_name(String p_image_t_name) {
		this.p_image_t_name = p_image_t_name;
	}

	
}
