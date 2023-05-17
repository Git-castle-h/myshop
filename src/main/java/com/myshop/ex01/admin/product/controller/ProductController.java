package com.myshop.ex01.admin.product.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface ProductController {
	
    public ModelAndView modProduct(String productID,HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView productList(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
