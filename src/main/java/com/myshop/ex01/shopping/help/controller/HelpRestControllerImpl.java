package com.myshop.ex01.shopping.help.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("helpRestController")
@RequestMapping("/help")
public class HelpRestControllerImpl implements HelpRestController {
	
	@ResponseBody
    @RequestMapping("/help.do")
    public Map<String,String> helpDo(
    		@RequestParam("h_title")String h_title,
    		@RequestParam("h_category")String h_category,
    		@RequestParam("h_product_name")String h_product_name,
    		@RequestParam("h_context")String h_context,
    		@RequestParam("h_file_name")String h_file_name,
    		HttpServletRequest request, HttpServletResponse response) throws Exception{
		
			System.out.print("���� ���� : "+h_title+" ");
			System.out.print("���� �з� : "+h_category+" ");
			System.out.print("���� ��ǰ : "+h_product_name+" ");
			System.out.print("���� ���� : "+h_context+" ");
			System.out.print("���� �̹��� : "+h_file_name+" ");

		Map<String,String> map = new HashMap<String,String>();
		
        return map;
    }


}
