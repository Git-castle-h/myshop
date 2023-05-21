package com.myshop.ex01.admin.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("adminMainController")
@RequestMapping("/admin/main")
public class MainControllerImpl implements MainController {
	
    @RequestMapping(value="/main", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

	@Override
	@RequestMapping("/main.do")
	public void mainDo(
			@RequestParam("m_file")String m_file,
			@RequestParam("m_bg")String m_bg,
			@RequestParam("m_link")String m_link,
			@RequestParam("s1_file")String s1_file,
			@RequestParam("s1_bg")String s1_bg,
			@RequestParam("s1_link")String s1_link,
			@RequestParam("s2_file")String s2_file,
			@RequestParam("s2_bg")String s2_bg,
			@RequestParam("s2_link")String s2_link,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		System.out.print("m_file : "+m_file);
		System.out.print(" m_bg : "+m_bg);
		System.out.println(" m_link : "+m_link);
		System.out.print(" s1_file : "+s1_file);
		System.out.print(" s1_bg : "+s1_bg);
		System.out.println(" s1_link : "+s1_link);
		System.out.print(" s2_file : "+s2_file);
		System.out.print(" s2_bg : "+s2_bg);
		System.out.println(" s2_link : "+s2_link);
		
		
	}
    
    
    
    
}
