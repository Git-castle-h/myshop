package com.myshop.ex01.shopping.member.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("MemberVO")
public class MemberVO {
	
	private String m_id;
	private String m_email;
	private String m_password;
	
	private String m_address1;
	private String m_address2;
	private String m_address3;
	
	private String m_tel1;
	private String m_tel2;
	
	private String m_gender;
	private Date m_b_day;
	private String m_job;
	private String m_recommend;
	private String m_agree1;
	private String m_agree2;
	private String m_agree3;
	private Date m_join_date;
	
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_password() {
		return m_password;
	}
	public void setM_password(String m_password) {
		this.m_password = m_password;
	}
	public String getM_address1() {
		return m_address1;
	}
	public void setM_address1(String m_address1) {
		this.m_address1 = m_address1;
	}
	public String getM_address2() {
		return m_address2;
	}
	public void setM_address2(String m_address2) {
		this.m_address2 = m_address2;
	}
	public String getM_address3() {
		return m_address3;
	}
	public void setM_address3(String m_address3) {
		this.m_address3 = m_address3;
	}
	public String getM_tel1() {
		return m_tel1;
	}
	public void setM_tel1(String m_tel1) {
		this.m_tel1 = m_tel1;
	}
	public String getM_tel2() {
		return m_tel2;
	}
	public void setM_tel2(String m_tel2) {
		this.m_tel2 = m_tel2;
	}
	public String getM_gender() {
		return m_gender;
	}
	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}
	public Date getM_b_day() {
		return m_b_day;
	}
	public void setM_b_day(Date m_b_day) {
		this.m_b_day = m_b_day;
	}
	public String getM_job() {
		return m_job;
	}
	public void setM_job(String m_job) {
		this.m_job = m_job;
	}
	public String getM_recommend() {
		return m_recommend;
	}
	public void setM_recommend(String m_recommend) {
		this.m_recommend = m_recommend;
	}
	public String getM_agree1() {
		return m_agree1;
	}
	public void setM_agree1(String m_agree1) {
		this.m_agree1 = m_agree1;
	}
	public String getM_agree2() {
		return m_agree2;
	}
	public void setM_agree2(String m_agree2) {
		this.m_agree2 = m_agree2;
	}
	public String getM_agree3() {
		return m_agree3;
	}
	public void setM_agree3(String m_agree3) {
		this.m_agree3 = m_agree3;
	}
	public Date getM_join_date() {
		return m_join_date;
	}
	public void setM_join_date(Date m_join_date) {
		this.m_join_date = m_join_date;
	}
	
	
}

