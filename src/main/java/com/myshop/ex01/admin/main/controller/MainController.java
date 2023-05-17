package com.myshop.ex01.admin.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MainController {
	
    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
