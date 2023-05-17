package com.myshop.ex01.shopping.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MainController {

    public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
