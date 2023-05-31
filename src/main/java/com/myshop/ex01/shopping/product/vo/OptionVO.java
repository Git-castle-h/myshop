package com.myshop.ex01.shopping.product.vo;

import org.springframework.stereotype.Component;

@Component("OptionVO")
public class OptionVO {
	private String p_id;
	private String p_name;
	private String p_option;
	private String p_price;
	
	
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
	public String getP_option() {
		return p_option;
	}
	public void setP_option(String p_option) {
		this.p_option = p_option;
	}
	public String getP_price() {
		return p_price;
	}
	public void setP_price(String p_price) {
		this.p_price = p_price;
	}
	
	
}
