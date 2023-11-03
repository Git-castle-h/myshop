package com.myshop.ex01.admin.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface MainController {
	
    public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public void mainDo(
			String m_title,
			String m_detail,
			String m_bg,
			String m_link,
			String m_file,
			
			String s1_title,
			String s1_detail,
			String s1_bg,
			String s1_link,
			String s1_file,
			
			String s2_title,
			String s2_detail,
			String s2_bg,
			String s2_link,
			String s2_file,
    		HttpServletRequest request, HttpServletResponse response) throws Exception;
    
}
