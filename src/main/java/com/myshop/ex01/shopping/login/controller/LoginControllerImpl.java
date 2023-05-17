package com.myshop.ex01.shopping.login.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController")
@RequestMapping("/login")
public class LoginControllerImpl implements LoginController {

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        System.out.println(viewName);
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    
    @RequestMapping("/login.do")
    public ModelAndView loginDo(@RequestParam Map<String,String> loginMap,HttpServletRequest request, HttpServletResponse response) throws Exception{
    	
    	System.out.println(loginMap);
    	
        String viewName = (String)request.getAttribute("viewName");
        System.out.println(viewName);
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    
    //아이디 찾기
    @RequestMapping("/idFind")
    public ModelAndView idFind(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    
    @RequestMapping(value ="/idFind_email",method= {RequestMethod.POST})
    public void idFind_email(
    		@RequestParam("user_name_email")String name,
    		@RequestParam("user_email")String email,
    		HttpServletRequest request, HttpServletResponse response) throws Exception{
    		
    		PrintWriter pw = response.getWriter();
    		pw.write(email);
    		
    		System.out.println("idFind : "+name+"//"+email);
    }

    
    
    @RequestMapping(value ="/idFind_phone",method= {RequestMethod.POST})
    public void idFind_phone(
    		@RequestParam("user_name_phone")String name,
    		@RequestParam("user_phone")String phone,
    		HttpServletRequest request, HttpServletResponse response) throws Exception{
    		
    		PrintWriter pw = response.getWriter();
    		pw.write(phone);
    		
    		System.out.println("idFind : "+name+"//"+phone);
    }
    
    
    @RequestMapping("/pwReset_email")
    public void pwReset_mail(
    		@RequestParam("id")String id,
    		@RequestParam("name")String name,
    		@RequestParam("email")String email,
    		HttpServletRequest request, HttpServletResponse response) throws Exception{
    		
    		String _id = "sample";
    		String _name = "sample";
    		String _email = "sample@naver.com";
    	
    		PrintWriter pw = response.getWriter();
    		
    		boolean isValid = false;
    		
    		if(_id.equals(id)&_name.equals(name)&_email.equals(email)) {
    			isValid = true;
    		}else {
    			isValid = false;
    		}
    		
    		if(isValid) {
    			pw.write("succeed");
    			System.out.println(email+"계정으로 인증메일 발송");
    		}else {
    			pw.write("fail");
    			System.out.println("유효하지 않은 접근");
    		}
    		
    		
    }
    

    @RequestMapping("/pwReset")
    public ModelAndView pwReset(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
}
