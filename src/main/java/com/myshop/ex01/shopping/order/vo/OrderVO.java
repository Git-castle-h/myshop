package com.myshop.ex01.shopping.order.vo;

import org.springframework.stereotype.Component;

@Component("OrderVO")
public class OrderVO {
	
	private String m_id;
	private String p_id;
	private String o_id;
	private String p_option;
	private String p_name;
	private String p_price;
	private String o_status;
	private String o_number;
	private String o_address1;
	private String o_address2;
	private String o_address3;
	
	
	
	public String getO_id() {
		return o_id;
	}
	public void setO_id(String o_id) {
		this.o_id = o_id;
	}
	public String getO_number() {
		return o_number;
	}
	public void setO_number(String o_number) {
		this.o_number = o_number;
	}
	public String getO_address1() {
		return o_address1;
	}
	public void setO_address1(String o_address1) {
		this.o_address1 = o_address1;
	}
	public String getO_address2() {
		return o_address2;
	}
	public void setO_address2(String o_address2) {
		this.o_address2 = o_address2;
	}
	public String getO_address3() {
		return o_address3;
	}
	public void setO_address3(String o_address3) {
		this.o_address3 = o_address3;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getP_option() {
		return p_option;
	}
	public void setP_option(String p_option) {
		this.p_option = p_option;
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
	public String getO_status() {
		return o_status;
	}
	public void setO_status(String o_status) {
		this.o_status = o_status;
	}
	
	
	

}
