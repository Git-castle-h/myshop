package com.myshop.ex01.admin.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		HttpSession session = request.getSession();
		session.setAttribute("m_id", m_id);
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
	
	@RequestMapping(value="/modMember.do", method = {RequestMethod.GET,RequestMethod.POST})
    public void modMemberDo(
//    		@RequestParam("m_id")String m_id,
    		@RequestParam("m_pw")String m_pw,
    		@RequestParam("m_email")String m_email,
    		@RequestParam("m_address1")String m_address1,
    		@RequestParam("m_address2")String m_address2,
    		@RequestParam("m_address3")String m_address3,
    		@RequestParam("m_tel1")String m_tel1,
    		@RequestParam("m_tel2")String m_tel2,
    		@RequestParam("m_gender")String m_gender,
    		@RequestParam("m_b_day")String m_b_day,
    		@RequestParam("m_job")String m_job,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
		
		HttpSession session = request.getSession();
		String m_id =(String)session.getAttribute("m_id");
		System.out.println("m_id : "+m_id);
		System.out.println("m_pw : "+m_pw);
		System.out.println("m_email : "+m_email);
		System.out.println("m_address1 : "+m_address1);
		System.out.println("m_address2 : "+m_address2);
		System.out.println("m_address3 : "+m_address3);
		System.out.println("m_tel1 : "+m_tel1);
		System.out.println("m_tel2 : "+m_tel2);
		System.out.println("m_gender : "+m_gender);
		System.out.println("m_b_day : "+m_b_day);
		System.out.println("m_job : "+m_job);
		
		session.setAttribute(m_id, m_id);
	}
}

