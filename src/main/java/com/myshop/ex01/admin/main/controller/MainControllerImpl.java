package com.myshop.ex01.admin.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myshop.ex01.admin.main.service.AdminMainService;
import com.myshop.ex01.admin.main.vo.Admin_bannerVO;
import com.myshop.ex01.admin.main.vo.Admin_banner_imageVO;

@Controller("adminMainController")
@RequestMapping("/admin/main")
public class MainControllerImpl implements MainController {
	
	@Autowired
	AdminMainService adminMainService;
	
	@Autowired
	Admin_bannerVO admin_bannerVO;
	
	@Autowired
	Admin_banner_imageVO admin_banner_imageVO;
	
	
    @RequestMapping(value="/main", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
    	
    	List<Admin_bannerVO> banner = adminMainService.adminBanner();
    	
        ModelAndView mav = new ModelAndView(viewName);
        mav.addObject("banner",banner);
        return mav;
    }

	@Override
	@RequestMapping("/main.do")
	public void mainDo(
			
			@RequestParam("m_title")String m_title,
			@RequestParam("m_detail")String m_detail,
			@RequestParam("m_bg")String m_bg,
			@RequestParam("m_link")String m_link,
			@RequestParam("m_file")String m_file,
			
			@RequestParam("s1_title")String s1_title,
			@RequestParam("s1_detail")String s1_detail,
			@RequestParam("s1_bg")String s1_bg,
			@RequestParam("s1_link")String s1_link,
			@RequestParam("s1_file")String s1_file,
			
			@RequestParam("s2_title")String s2_title,
			@RequestParam("s2_detail")String s2_detail,
			@RequestParam("s2_bg")String s2_bg,
			@RequestParam("s2_link")String s2_link,
			@RequestParam("s2_file")String s2_file,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		if(!(m_title.isBlank())){
			
			admin_bannerVO.setBanner_name("main");
			admin_bannerVO.setBanner_title(m_title);
			admin_bannerVO.setBanner_detail(m_detail);
			admin_bannerVO.setBanner_color(m_bg);
			admin_bannerVO.setBanner_link(m_link);
			
			adminMainService.modBanner(admin_bannerVO);
			
			System.out.print("m_file : "+m_file);
		}
		
		if(!(s1_title.isBlank())){
			admin_bannerVO.setBanner_name("sub_1");
			admin_bannerVO.setBanner_title(s1_title);
			admin_bannerVO.setBanner_detail(s1_detail);
			admin_bannerVO.setBanner_color(s1_bg);
			admin_bannerVO.setBanner_link(s1_link);
			
			adminMainService.modBanner(admin_bannerVO);
		
			System.out.print(" s1_file : "+s1_file);
		}
		
		if(!(s2_title.isBlank())){
			admin_bannerVO.setBanner_name("sub_2");
			admin_bannerVO.setBanner_title(s2_title);
			admin_bannerVO.setBanner_detail(s2_detail);
			admin_bannerVO.setBanner_color(s2_bg);
			admin_bannerVO.setBanner_link(s2_link);
			
			adminMainService.modBanner(admin_bannerVO);
			
			System.out.print(" s2_file : "+s2_file);
		}
		
		
		
		
		
		
		
	}
    
    
    
    
}
