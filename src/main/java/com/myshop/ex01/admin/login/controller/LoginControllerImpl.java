package com.myshop.ex01.admin.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("adminLodinController")
@RequestMapping("/admin/login")
public class LoginControllerImpl implements LoginController{
	
    @RequestMapping(value="/login", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
	
}
