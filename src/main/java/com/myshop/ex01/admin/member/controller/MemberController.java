package com.myshop.ex01.admin.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("adminMemberController")
@RequestMapping("/admin/member")
public class MemberController {
    
	@RequestMapping(value="/listMember", method = {RequestMethod.GET,RequestMethod.POST})
    public String listHelp(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        return viewName;
    }
	@RequestMapping(value="/modMember", method = {RequestMethod.GET,RequestMethod.POST})
    public String modHelp(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        return viewName;
    }
    
}
