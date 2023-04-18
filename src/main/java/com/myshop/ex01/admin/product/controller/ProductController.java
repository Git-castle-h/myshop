package com.myshop.ex01.admin.product.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("adminProductController")
@RequestMapping("/admin/product")
public class ProductController {
	
	@RequestMapping(value="/modProduct.do", method = {RequestMethod.GET,RequestMethod.POST})
    public String modProduct(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        return viewName;
    }
	
	@RequestMapping(value="/listProduct.do", method = {RequestMethod.GET,RequestMethod.POST})
    public String listProduct(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        return viewName;
    }
}
