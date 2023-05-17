package com.myshop.ex01.admin.help.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("adminHelpController")
@RequestMapping("/admin/help")
public class HelpControllerImpl implements HelpController {

    @RequestMapping(value="/helpList", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    
    @RequestMapping(value="/modHelp/{h_number}", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView modHelp(
    		@PathVariable("h_number")String h_number,
    		HttpServletRequest request, 
    		HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
	
}
