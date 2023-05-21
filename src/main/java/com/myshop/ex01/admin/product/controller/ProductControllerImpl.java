package com.myshop.ex01.admin.product.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("adminProductController")
@RequestMapping("/admin/product")
public class ProductControllerImpl implements ProductController {
	

	@RequestMapping(value="/newProduct", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView newProduct(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
	}
	
	@RequestMapping(value="/newProduct.do", method = {RequestMethod.GET,RequestMethod.POST})
	public void newProductDo(
			@RequestParam("mp_cate")String mp_cate,
			@RequestParam("mp_img")String mp_img,
			@RequestParam("mp_t_img")String mp_t_img,
			@RequestParam("mp_rec")String mp_rec,
			@RequestParam("mp_name")String mp_name,
			@RequestParam("mp_price")String mp_price,
			@RequestParam("mp_d_title")String mp_d_title,
			@RequestParam("mp_d_cxt")String mp_d_cxt,
			@RequestParam("mp_ess")String mp_ess,
			@RequestParam("mp_options[]")String[] mp_options,
			HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		System.out.println(" mp_cate : "+mp_cate);
		System.out.println(" mp_img : "+mp_img);
		System.out.println(" mp_t_img : "+mp_t_img);
		System.out.println(" mp_rec : "+mp_rec);
		System.out.println(" mp_name : "+mp_name);
		System.out.println(" mp_price : "+mp_price);
		System.out.println(" mp_d_title : "+mp_d_title);
		System.out.println(" mp_d_cxt : "+mp_d_cxt);
		System.out.println(" mp_ess : "+mp_ess);
		System.out.print(" mp_options : ");
		
		System.out.print("[");
		for(int i = 0; i<mp_options.length;i++) {
			if(i != mp_options.length-1) {
				System.out.print(mp_options[i]+", ");
			}else {
				System.out.print(mp_options[i]);
			}
		}
		System.out.print("]");
		System.out.println();
		
		
	}
	
	@RequestMapping(value="/modProduct/{p_id}", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView modProduct(
    		@PathVariable("p_id")String p_id,
    		HttpServletRequest request, 
    		HttpServletResponse response
    		) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
    	HttpSession session = request.getSession();
    	
    	session.setAttribute("p_id", p_id);
    	
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
	
	@RequestMapping(value="/productList", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView productList(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

	@Override
	@RequestMapping(value="/modProduct.do", method = {RequestMethod.GET,RequestMethod.POST})
	public void modProductDo(
			@RequestParam("mp_cate")String mp_cate,
			@RequestParam("mp_img")String mp_img,
			@RequestParam("mp_t_img")String mp_t_img,
			@RequestParam("mp_rec")String mp_rec,
			@RequestParam("mp_name")String mp_name,
			@RequestParam("mp_price")String mp_price,
			@RequestParam("mp_d_title")String mp_d_title,
			@RequestParam("mp_d_cxt")String mp_d_cxt,
			@RequestParam("mp_ess")String mp_ess,
			@RequestParam("mp_options[]")String[] mp_options,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
			
		HttpSession session = request.getSession();
		String p_id = (String) session.getAttribute("p_id");
		
		System.out.println(" p_id : "+p_id);
		System.out.println(" mp_cate : "+mp_cate);
		System.out.println(" mp_img : "+mp_img);
		System.out.println(" mp_t_img : "+mp_t_img);
		System.out.println(" mp_rec : "+mp_rec);
		System.out.println(" mp_name : "+mp_name);
		System.out.println(" mp_price : "+mp_price);
		System.out.println(" mp_d_title : "+mp_d_title);
		System.out.println(" mp_d_cxt : "+mp_d_cxt);
		System.out.println(" mp_ess : "+mp_ess);
		System.out.print(" mp_options : ");
		
		System.out.print("[");
		for(int i = 0; i<mp_options.length;i++) {
			if(i != mp_options.length-1) {
				System.out.print(mp_options[i]+", ");
			}else {
				System.out.print(mp_options[i]);
			}
		}
		System.out.print("]");
		System.out.println();
		
		
	}

}
