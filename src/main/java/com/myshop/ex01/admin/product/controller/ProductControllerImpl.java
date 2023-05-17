package com.myshop.ex01.admin.product.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("adminProductController")
@RequestMapping("/admin/product")
public class ProductControllerImpl implements ProductController {
	
	@RequestMapping(value="/modProduct/{p_id}", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView modProduct(
    		@PathVariable("p_id")String p_id,
    		HttpServletRequest request, 
    		HttpServletResponse response
    		) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
	
	@RequestMapping(value="/productList", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView productList(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
}
