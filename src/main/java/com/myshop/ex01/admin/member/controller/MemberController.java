package com.myshop.ex01.admin.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface MemberController {
    
    public ModelAndView memberList(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView modMember(String m_id,HttpServletRequest request, HttpServletResponse response) throws Exception;
    public void modMemberDo(
			/* String m_id, */String m_pw,String m_email,String m_address1,String m_address2,String m_address3,String m_tel1,String m_tel2,String m_gender,String m_b_day,String m_job,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception;
    
}
