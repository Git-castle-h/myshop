package com.myshop.ex01.shopping.help.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("HelpVO")
public class HelpVO {
	private String m_id;
	private String h_number;
	private String h_title;
	private String h_category;
	private String h_product_name;
	private String h_context;
	private String h_answer_title;
	private String h_answer_context;
	private String h_status;
	public String getH_status() {
		return h_status;
	}
	public void setH_status(String h_status) {
		this.h_status = h_status;
	}
	private Date h_date;
	private String admin_id;
	
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getH_number() {
		return h_number;
	}
	public void setH_number(String h_number) {
		this.h_number = h_number;
	}
	public String getH_title() {
		return h_title;
	}
	public void setH_title(String h_title) {
		this.h_title = h_title;
	}
	public String getH_category() {
		return h_category;
	}
	public void setH_category(String h_category) {
		this.h_category = h_category;
	}
	public String getH_product_name() {
		return h_product_name;
	}
	public void setH_product_name(String h_product_name) {
		this.h_product_name = h_product_name;
	}
	public String getH_context() {
		return h_context;
	}
	public void setH_context(String h_context) {
		this.h_context = h_context;
	}
	public String getH_answer_title() {
		return h_answer_title;
	}
	public void setH_answer_title(String h_answer_title) {
		this.h_answer_title = h_answer_title;
	}
	public String getH_answer_context() {
		return h_answer_context;
	}
	public void setH_answer_context(String h_answer_context) {
		this.h_answer_context = h_answer_context;
	}
	public Date getH_date() {
		return h_date;
	}
	public void setH_date(Date h_date) {
		this.h_date = h_date;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	
	

	
	
}
