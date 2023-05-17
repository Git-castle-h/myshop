package com.myshop.ex01.shopping.help.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("helpController")
@RequestMapping("/help")
public class HelpControllerImpl implements HelpController {

    @RequestMapping("/helpList")
    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    @RequestMapping("/memberHelp/*")
    public ModelAndView memberHelp(HttpServletRequest request,HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }    
    @RequestMapping("/memberHelp/{h_number}")
    public ModelAndView _memberHelp(
    		@PathVariable("h_number")String h_number,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }


}
