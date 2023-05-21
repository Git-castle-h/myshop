package com.myshop.ex01.admin.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("adminOrderController")
@RequestMapping("/admin/order")
public class OrderControllerImpl implements OrderController {
	
	@RequestMapping("/orderList")
    public ModelAndView orderList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");        
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
	@RequestMapping("/modOrder/{o_id}")
    public ModelAndView modOrder(
    		@PathVariable("o_id")String o_id,
    		HttpServletRequest request, 
    		HttpServletResponse response) throws Exception{
		
		HttpSession session = request.getSession();
		session.setAttribute("o_id", o_id);
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
	@RequestMapping("/modOrder.do")
	public void modOrderDo(
			@RequestParam("o_number")String o_number,
			@RequestParam("o_option")String o_option,
			@RequestParam("o_status")String o_status,
			@RequestParam("o_address1")String o_address1,
			@RequestParam("o_address2")String o_address2,
			@RequestParam("o_address3")String o_address3,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String o_id = (String)session.getAttribute("o_id");
		
		System.out.println(" o_id : "+o_id);
		System.out.println(" o_number : "+o_number);
		System.out.println(" o_option : "+o_option);
		System.out.println(" o_status : "+o_status);
		System.out.println(" o_address1 : "+o_address1);
		System.out.println(" o_address2 : "+o_address2);
		System.out.println(" o_address3 : "+o_address3);
		System.out.println();
	
	}	
	
	
}
