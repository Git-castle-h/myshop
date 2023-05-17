package com.myshop.ex01.shopping.cart.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("CartRestController")
@RequestMapping("/cart")
public interface CartRestController {
	
	public Map<String,String> cartDetailDo(String c_number,HttpServletRequest request, HttpServletResponse response) throws Exception;
	public void cardDeleteDo(String c_id,HttpServletRequest request, HttpServletResponse response) throws Exception;
	public void cardDeleteSelDo(String[]c_id_arr,HttpServletRequest request, HttpServletResponse response) throws Exception;
    public void cartToOrderDo(String[]c_id_arr,HttpServletRequest request,HttpServletResponse response) throws Exception;
	public void modCartDo(String c_id,String c_number,String p_option,HttpServletRequest request,HttpServletResponse response) throws Exception;
}
