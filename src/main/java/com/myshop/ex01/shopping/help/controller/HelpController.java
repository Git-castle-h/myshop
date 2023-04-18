package com.myshop.ex01.shopping.help.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("helpController")
@RequestMapping("/help")
public class HelpController {

    @RequestMapping("/listHelp.do")
    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    @RequestMapping("/memberHelp.do")
    public String memberHelp(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        return viewName;
    }


}
