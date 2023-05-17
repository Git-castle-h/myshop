package com.myshop.ex01.shopping.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MemberController {

    public ModelAndView memberJoin(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
