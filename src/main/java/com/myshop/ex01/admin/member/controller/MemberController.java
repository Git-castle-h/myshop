package com.myshop.ex01.admin.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public interface MemberController {
    
    public ModelAndView memberList(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView modMember(String m_id,HttpServletRequest request, HttpServletResponse response) throws Exception;
    
}
