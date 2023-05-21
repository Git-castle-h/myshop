package com.myshop.ex01.shopping.help.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface HelpRestController {
	
    public Map<String,String> helpDo(
    		String h_title,String h_category,String h_product_name,String h_context,String h_file_name,
    		HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
