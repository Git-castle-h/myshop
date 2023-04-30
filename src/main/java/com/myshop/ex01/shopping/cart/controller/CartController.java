package com.myshop.ex01.shopping.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("cartController")
@RequestMapping(value="/cart", method = {RequestMethod.GET,RequestMethod.POST})
public class CartController {

    @RequestMapping(value="/cartList", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView cartList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        return mav;
    }

}
