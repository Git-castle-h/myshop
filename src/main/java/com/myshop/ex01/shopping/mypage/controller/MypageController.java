package com.myshop.ex01.shopping.mypage.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MypageController {
	
    public ModelAndView mypageConfirm(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView mypageConfirmDo(Map<String,String>map,HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView mypageModInfo(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
