package com.myshop.ex01.shopping.order.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myshop.ex01.shopping.cart.dao.CartDAO;
import com.myshop.ex01.shopping.cart.service.CartService;
import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.order.service.OrderService;
import com.myshop.ex01.shopping.order.vo.OrderVO;
import com.myshop.ex01.shopping.product.dao.ProductDAO;
import com.myshop.ex01.shopping.product.service.ProductService;
import com.myshop.ex01.shopping.product.vo.OptionVO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_imageVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;

@Controller("orderController")
@RequestMapping("/order")
public class OrderControllerImpl implements OrderController {
	
	@Autowired
	CartService cartService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	ProductVO ProductVO;
	
	@Autowired
	CartVO CartVO;
	
	@Autowired
	OptionVO OptionVO;
	
	@Autowired
	OrderVO OrderVO;
	
	@Autowired
	Product_imageVO Product_imageVO;
	
	@Autowired
	Product_t_imageVO Product_t_imageVO;
	
    @RequestMapping("/order")
    public ModelAndView order(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    @RequestMapping("/orderList")
    public ModelAndView orderList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        
        HttpSession session = request.getSession();
        
        String m_id = "sampleID";
        
        List<List>orderList = orderService.listOrder(m_id);
        
        mav.addObject("orderList",orderList);
        
        return mav;
    }
}
