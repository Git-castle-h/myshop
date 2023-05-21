package com.myshop.ex01.admin.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface OrderController {
	
    public ModelAndView orderList(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView modOrder(String o_id, HttpServletRequest request, HttpServletResponse response) throws Exception;
    public void modOrderDo(
			String o_number,String o_option,String o_status,String o_address1,String o_address2,String o_address3,
    		HttpServletRequest request, HttpServletResponse response) throws Exception;
}
