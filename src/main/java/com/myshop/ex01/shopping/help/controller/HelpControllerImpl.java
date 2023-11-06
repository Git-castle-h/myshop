package com.myshop.ex01.shopping.help.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myshop.ex01.shopping.cart.dao.CartDAO;
import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.help.service.HelpService;
import com.myshop.ex01.shopping.help.vo.HelpVO;
import com.myshop.ex01.shopping.help.vo.Help_imageVO;
import com.myshop.ex01.shopping.member.vo.MemberVO;
import com.myshop.ex01.shopping.product.dao.ProductDAO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;

@Controller("helpController")
@RequestMapping("/help")
public class HelpControllerImpl implements HelpController {
	
	@Autowired
	HelpService helpService;
	
	@Autowired
	MemberVO MemberVO;
	
	@Autowired
	CartVO CartVO;
	
	@Autowired
	ProductVO ProductVO;
	
	@Autowired
	HelpVO HelpVO;
	
	@Autowired
	Help_imageVO Help_imageVO;
	
	@Autowired
	Product_t_imageVO Product_t_imageVO;


    @RequestMapping("/helpList")
    public ModelAndView listHelp(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        
        HttpSession session = request.getSession();
        String m_id = (String) session.getAttribute("m_id");
        m_id = "sampleID";
        session.setAttribute("m_id", m_id);
        
        
        HelpVO.setM_id(m_id);
        
        List<Object>helpList = helpService.s_helpListById(HelpVO);        
        
        mav.addObject("helpList",helpList);
        mav.addObject("m_id",m_id);
        return mav;
    }
    
    @RequestMapping("/memberHelp/*")
    public ModelAndView memberHelp(HttpServletRequest request,HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }    
    @RequestMapping("/memberHelp/{h_number}")
    public ModelAndView _memberHelp(
    		@PathVariable("h_number")String h_number,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
    	
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        
        HttpSession session = request.getSession();
        session.setAttribute("h_number",h_number);
        
        HelpVO.setH_number(h_number);
        
        List<Object>helpDetail = helpService.detailHelp(HelpVO);
        
        mav.addObject("helpDetail",helpDetail);
        
        return mav;
    }


}

