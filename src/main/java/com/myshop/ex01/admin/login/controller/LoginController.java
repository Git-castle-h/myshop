package com.myshop.ex01.admin.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;


public interface LoginController {

    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
