package com.myshop.ex01.admin.help.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;


public interface HelpController {

    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView modHelp(String h_number,HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
