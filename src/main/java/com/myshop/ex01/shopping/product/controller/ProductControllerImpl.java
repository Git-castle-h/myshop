package com.myshop.ex01.shopping.product.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("productController")
@RequestMapping("/product")
public class ProductControllerImpl implements ProductController {
    @RequestMapping("/product")
    public ModelAndView product(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    
    @RequestMapping("/productList/{p_category}")
    public ModelAndView productList(
    		@PathVariable("p_category")String p_category,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        
        Map<String,String>p_list = new HashMap<String,String>();
        
        p_list.put("p_category", p_category);
        mav.addObject("p_list",p_list);
        
        return mav;
    }
    
    @RequestMapping("/productDetail/{p_id}")
    public ModelAndView productDetail(
    		@PathVariable("p_id")String p_id,
    		HttpServletRequest request, 
    		HttpServletResponse response) throws Exception{
    	
        String viewName = (String)request.getAttribute("viewName");
        
        HttpSession session = request.getSession();
        
        session.setAttribute("p_id", p_id);
        session.setAttribute("p_name", "상품이름입니다.");
        session.setAttribute("p_price","상품가격입니다.");
        
        ModelAndView mav = new ModelAndView(viewName);
        Map<String,String>p_detail = new HashMap<String,String>();
        
        p_detail.put("p_id", p_id);
        mav.addObject("productDetail",p_detail);
        
        return mav;
    }
    
    @RequestMapping("/productDetail/productBuy.do")
    public ModelAndView productBuyDo(
    		@RequestParam("p_option")String p_option,
    		@RequestParam("p_number")String p_number,
    		HttpServletRequest request, 
    		HttpServletResponse response) throws Exception{
    	
    	 HttpSession session = request.getSession();
    	
    	String p_id = (String)session.getAttribute("p_id");
        String p_name = (String)session.getAttribute("p_name");
        String p_price = (String)session.getAttribute("p_price");
        
        
        session.setAttribute("p_id", p_id);
        session.setAttribute("p_name", "상품이름입니다.");
        session.setAttribute("p_price","상품가격입니다.");	 
    	session.setAttribute("p_option", p_option);
    	session.setAttribute("p_number", p_number);
    	 
    	
        System.out.println(
        		"상품아이디 : "+p_id+
        		" 상품이름 : "+p_name+
        		" 상품가격 : "+p_price+
        		" 상품옵션 : "+p_option+
        		" 상품갯수 : "+p_number
        		);
    	
        String viewName = (String)request.getAttribute("viewName");
        
        ModelAndView mav = new ModelAndView(viewName);

        
        return mav;
    }

}
