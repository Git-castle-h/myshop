package com.myshop.ex01.admin.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("adminLodinController")
@RequestMapping("/admin/login")
public class LoginController {
	
    @RequestMapping(value="/login.do", method = {RequestMethod.GET,RequestMethod.POST})
    public String listHelp(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        return viewName;
    }
	
}
