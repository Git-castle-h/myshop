package com.myshop.ex01.shopping.order.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface OrderRestController {
	
	public Map<String,String> orderDetailDo(String o_id,HttpServletRequest request,HttpServletResponse response) throws Exception;
	public Map<String,String> myAddressDo(HttpServletRequest request,HttpServletResponse response) throws Exception;
	public void orderDo(String[] c_id_arr,String address_post,String address_basic,String address_detail,HttpServletRequest request,HttpServletResponse response) throws Exception;
}
