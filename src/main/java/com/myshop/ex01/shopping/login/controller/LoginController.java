package com.myshop.ex01.shopping.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("loginController")
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        System.out.println(viewName);
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    @RequestMapping("/idFind")
    public ModelAndView idFind(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    @RequestMapping("/pwReset")
    public ModelAndView pwReset(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
}
