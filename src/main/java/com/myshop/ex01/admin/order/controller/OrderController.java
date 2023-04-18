package com.myshop.ex01.admin.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("adminOrderController")
@RequestMapping("/admin/order")
public class OrderController {
	
	@RequestMapping(value="/listOrder.do", method = {RequestMethod.GET,RequestMethod.POST})
    public String listOrder(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        return viewName;
    }
	
	@RequestMapping(value="/modOrder.do", method = {RequestMethod.GET,RequestMethod.POST})
    public String modOrder(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        return viewName;
    }
}
