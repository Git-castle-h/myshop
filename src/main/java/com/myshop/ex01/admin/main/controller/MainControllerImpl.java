package com.myshop.ex01.admin.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("adminMainController")
@RequestMapping("/admin/main")
public class MainControllerImpl implements MainController {
	
    @RequestMapping(value="/main", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
}
