package com.myshop.ex01.shopping.cart.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("CartController")
@RequestMapping(value="/cart", method = {RequestMethod.GET,RequestMethod.POST})
public class CartControllerImpl implements CartController {

    @RequestMapping(value="/cartList", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView cartList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        return mav;
    }
    
    @RequestMapping(value="/cartList.do", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView cartListDo(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	
    	HttpSession session = request.getSession();
    	
    	String p_id = (String)session.getAttribute("p_id");
    	String p_name = (String)session.getAttribute("p_name");
    	String p_price = (String)session.getAttribute("p_price");	 
    	String p_option = (String)session.getAttribute("p_option");
    	String p_number = (String)session.getAttribute("p_number");
    	
        System.out.println(
        		"상품아이디 : "+p_id+
        		" 상품이름 : "+p_name+
        		" 상품가격 : "+p_price+
        		" 상품옵션 : "+p_option+
        		" 상품갯수 : "+p_number
        		);
    	
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        return mav;
    }


}
