package com.myshop.ex01.admin.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("adminMemberController")
@RequestMapping("/admin/member")
public class MemberControllerImpl implements MemberController{
    
	@RequestMapping(value="/memberList", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView memberList(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
	@RequestMapping(value="/modMember/{m_id}", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView modMember(
    		@PathVariable("m_id")String m_id,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    
}
