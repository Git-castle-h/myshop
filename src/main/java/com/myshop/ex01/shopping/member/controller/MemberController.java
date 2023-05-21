package com.myshop.ex01.shopping.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MemberController {

    public ModelAndView memberJoin(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public void memberJoinDo(
			String m_id,
			String m_email,
			String m_password,
			String m_address1,
			String m_address2,
			String m_address3,
			String m_tel1,
			String m_tel2,
			String m_gender,
			String m_b_day,
			String m_job,
			String m_recommend,
			String m_agree1,
			String m_agree2,
			String m_agree3,
    		HttpServletRequest request, HttpServletResponse response) throws Exception;
    public void isOverlapped(HttpServletRequest request, HttpServletResponse response) throws Exception; 
}
