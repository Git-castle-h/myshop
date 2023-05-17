package com.myshop.ex01.admin.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("adminOrderController")
@RequestMapping("/admin/order")
public class OrderControllerImpl implements OrderController {
	
	@RequestMapping("/orderList")
    public ModelAndView orderList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
	@RequestMapping("/modOrder/{o_id}")
    public ModelAndView modOrder(
    		@PathVariable("o_id")String o_id,
    		HttpServletRequest request, 
    		HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }	
}
