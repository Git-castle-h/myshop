package com.myshop.ex01.admin.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface MainController {
	
    public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public void mainDo(String m_file,String m_bg,String m_link,String s1_file,String s1_bg,String s1_link,String s2_file,String s2_bg,String s2_link,HttpServletRequest request, HttpServletResponse response) throws Exception;
    
}
