package com.myshop.ex01.admin.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("adminMainController")
@RequestMapping("/admin/main")
public class MainController {
	
    @RequestMapping(value="/main", method = {RequestMethod.GET,RequestMethod.POST})
    public String listHelp(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        return viewName;
    }
}
