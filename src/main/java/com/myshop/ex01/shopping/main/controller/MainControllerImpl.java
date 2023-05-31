package com.myshop.ex01.shopping.main.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myshop.ex01.shopping.main.service.MainService;
import com.myshop.ex01.shopping.product.service.ProductService;
@Controller("mainController")
@RequestMapping("/main")
public class MainControllerImpl {
	
	@Autowired
	private MainService mainService;
	
	
	@Autowired
	private ProductService productService;


    @RequestMapping("/main")
    public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        
        List<List> banner = mainService.banner();
        List<List> product = productService.product();
        List<List> recProduct = productService.recProduct();
        
        ModelAndView mav = new ModelAndView(viewName);
        
        mav.addObject("banner",banner);
        mav.addObject("product",product);
        mav.addObject("recProduct",recProduct);
        
        return mav;
    }
}
