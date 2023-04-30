package com.myshop.ex01.shopping.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("mypageController")
@RequestMapping("/mypage")
public class MypageController {
	
    @RequestMapping("/memberConfirm")
    public ModelAndView member(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
}
