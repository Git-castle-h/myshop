package com.myshop.ex01.admin.product.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface ProductController {
	
	public ModelAndView newProduct(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public void newProductDo(
			String mp_cate,String mp_img,String mp_t_img,String mp_rec,String mp_name,String mp_price,String mp_d_title,String mp_d_cxt,String mp_ess,String[] mp_options,
			HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView modProduct(String productID,HttpServletRequest request, HttpServletResponse response) throws Exception;
    public void modProductDo(
			String mp_cate,String mp_img,String mp_t_img,String mp_rec,String mp_name,String mp_price,String mp_d_title,String mp_d_cxt,String mp_ess,String[] mp_options,
			HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView productList(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
