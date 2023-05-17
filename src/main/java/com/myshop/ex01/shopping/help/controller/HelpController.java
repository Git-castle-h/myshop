package com.myshop.ex01.shopping.help.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

public interface HelpController {

    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView memberHelp(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView _memberHelp(String h_number,HttpServletRequest request, HttpServletResponse response) throws Exception;
}
