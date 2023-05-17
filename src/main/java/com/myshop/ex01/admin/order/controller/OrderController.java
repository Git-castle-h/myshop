package com.myshop.ex01.admin.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface OrderController {
	
    public ModelAndView orderList(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView modOrder(String o_id, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
