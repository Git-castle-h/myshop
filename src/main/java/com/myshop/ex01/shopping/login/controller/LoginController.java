package com.myshop.ex01.shopping.login.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;


public interface LoginController {

    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView loginDo(Map<String,String> loginMap,HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView idFind(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView pwReset(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
