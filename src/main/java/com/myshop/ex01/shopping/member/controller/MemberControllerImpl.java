package com.myshop.ex01.shopping.member.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("memberController")
@RequestMapping("/member")
public class MemberControllerImpl implements MemberController {

    @RequestMapping("/memberJoin")
    public ModelAndView memberJoin(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    
    @RequestMapping("/memberJoin.do")
	@Override
	public void memberJoinDo(
			@RequestParam("m_id")String m_id,
			@RequestParam("m_email")String m_email,
			@RequestParam("m_password")String m_password,
			@RequestParam("m_address1")String m_address1,
			@RequestParam("m_address2")String m_address2,
			@RequestParam("m_address3")String m_address3,
			@RequestParam("m_tel1")String m_tel1,
			@RequestParam("m_tel2")String m_tel2,
			@RequestParam("m_gender")String m_gender,
			@RequestParam("m_b_day")String m_b_day,
			@RequestParam("m_job")String m_job,
			@RequestParam("m_recommend")String m_recommend,
			@RequestParam("m_agree1")String m_agree1,
			@RequestParam("m_agree2")String m_agree2,
			@RequestParam("m_agree3")String m_agree3,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
    	
    	System.out.print("m_id : "+m_id+" ");
    	System.out.print("m_email : "+m_email+" ");
    	System.out.print("m_password : "+m_password+" ");
    	System.out.print("m_address1 : "+m_address1+" ");
    	System.out.print("m_address2 : "+m_address2+" ");
    	System.out.print("m_address3 : "+m_address3+" ");
    	System.out.print("m_tel1 : "+m_tel1+" ");
    	System.out.print("m_tel2 : "+m_tel2+" ");
    	System.out.print("m_gender : "+m_gender+" ");
    	System.out.print("m_b_day : "+m_b_day+" ");
    	System.out.print("m_job : "+m_job+" ");
    	System.out.print("m_recommend : "+m_recommend+" ");
    	System.out.print("m_agree1 : "+m_agree1+" ");
    	System.out.print("m_agree2 : "+m_agree2+" ");
    	System.out.print("m_agree3 : "+m_agree3+" ");
		
	}

    @RequestMapping("/isOverlapped.do")
	@Override
	public void isOverlapped(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		PrintWriter pw = response.getWriter();
				
		
	}


}

