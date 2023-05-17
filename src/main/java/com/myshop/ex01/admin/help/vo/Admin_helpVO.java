package com.myshop.ex01.admin.help.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("Admin_helpVO")
public class Admin_helpVO {
	private String m_id;
	private String admin_id;
	private String h_number;
	private Date h_image_date;
	private String h_image_type;
	private String h_image_id;
	private String h_image_name;
	
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getH_number() {
		return h_number;
	}
	public void setH_number(String h_number) {
		this.h_number = h_number;
	}
	public Date getH_image_date() {
		return h_image_date;
	}
	public void setH_image_date(Date h_image_date) {
		this.h_image_date = h_image_date;
	}
	public String getH_image_type() {
		return h_image_type;
	}
	public void setH_image_type(String h_image_type) {
		this.h_image_type = h_image_type;
	}
	public String getH_image_id() {
		return h_image_id;
	}
	public void setH_image_id(String h_image_id) {
		this.h_image_id = h_image_id;
	}
	public String getH_image_name() {
		return h_image_name;
	}
	public void setH_image_name(String h_image_name) {
		this.h_image_name = h_image_name;
	}
	
	
}
