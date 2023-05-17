package com.myshop.ex01.shopping.cart.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
public interface CartController {
	
    public ModelAndView cartList(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView cartListDo(HttpServletRequest request, HttpServletResponse response) throws Exception;
  
}
