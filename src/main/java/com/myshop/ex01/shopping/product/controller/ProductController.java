package com.myshop.ex01.shopping.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("productController")
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/product")
    public ModelAndView product(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    @RequestMapping("/productDetail")
    public ModelAndView productDetail(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    @RequestMapping("/productList")
    public ModelAndView productList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
}
