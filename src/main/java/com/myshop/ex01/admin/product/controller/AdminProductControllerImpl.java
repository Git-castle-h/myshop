package com.myshop.ex01.admin.product.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myshop.ex01.admin.product.dao.AdminProductDAO;
import com.myshop.ex01.admin.product.service.AdminProductService;
import com.myshop.ex01.admin.product.vo.Admin_optionVO;
import com.myshop.ex01.admin.product.vo.Admin_productVO;
import com.myshop.ex01.admin.product.vo.Admin_product_imageVO;
import com.myshop.ex01.admin.product.vo.Admin_product_t_imageVO;
import com.myshop.ex01.shopping.product.vo.ProductVO;

@Controller("adminProductController")
@RequestMapping("/admin/product")
public class AdminProductControllerImpl implements AdminProductController {
	
	@Autowired
	AdminProductService adminProductService;
	
	@Autowired
	private Admin_productVO ProductVO;
	
	@Autowired
	private Admin_optionVO admin_optionVO;
	
	@Autowired
	private Admin_product_imageVO admin_product_imageVO;	
	
	@Autowired
	private Admin_product_t_imageVO admin_product_t_imageVO;
	
	

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
		
		
		String p_id = Integer.toString(adminProductService.newProductID());
				
	
		Admin_productVO product = ProductVO;
		Admin_optionVO option = admin_optionVO;	
		Admin_product_imageVO  p_image = admin_product_imageVO;	
		Admin_product_t_imageVO p_t_image = admin_product_t_imageVO;

		//adminID
		String adminId = "admin";
		product.setAdmin_id(adminId);
		
		product.setP_id(p_id);
		product.setP_name(mp_name);
		product.setP_price(mp_price);
		product.setP_detail_title(mp_d_title);
		product.setP_detail_context(mp_d_cxt);
		product.setP_recommend(mp_rec);
		product.setP_category(mp_cate);
		
		System.out.println("추천 여부 :"+mp_rec);
		
		p_image.setP_id(p_id);
		p_image.setP_name(mp_name);
		p_image.setP_price(mp_price);
		p_image.setP_image_name(mp_img);
		
		p_t_image.setP_id(p_id);
		p_t_image.setP_name(mp_name);
		p_t_image.setP_price(mp_price);
		p_t_image.setP_t_image_name(mp_t_img);

		
		adminProductService.addProduct(product);
		
		if(mp_img != null && mp_img != "") {
		adminProductService.addProductImage(p_image);
		}
		if(mp_t_img != null && mp_t_img != "") {
		adminProductService.addProduct_t_Image(p_t_image);
		}
//		신규 옵션 리스트로 묶기
		List<Admin_optionVO> newOptions = new ArrayList<Admin_optionVO>();
		
		for(int i=0; i<mp_options.length; i++) {
			Admin_optionVO newOption = new Admin_optionVO();
			newOption.setP_id(p_id);
			newOption.setP_name(mp_name);
			newOption.setP_option(mp_options[i]);
			newOption.setP_price(mp_price);
			
			System.out.println("신규옵션 : "+newOption.getP_option());
			newOptions.add(newOption);
		}
		
//		신규 옵션 등록
		
//		System.out.println("신규옵션들 : "+newOptions);
		System.out.println("신규 옵션 리스트 크기 : "+newOptions.size());
		System.out.println("신규 옵션 리스트 p_id : "+newOptions.get(0).getP_id());
		for(int e=0; e<newOptions.size(); e++){
			System.out.println(newOptions.get(e).getP_option());
			adminProductService.addOption(newOptions.get(e));
		}
		
		
		
	
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
    	
    	List<Object> productDetail = adminProductService.detailProduct(p_id);	
        ModelAndView mav = new ModelAndView(viewName);
        mav.addObject("productDetail",productDetail);
        return mav;
    }
	
	@RequestMapping(value="/productList", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView productList(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	String viewName = (String)request.getAttribute("viewName");
    	
    	List<List> productList = adminProductService.listProduct();
    	
        ModelAndView mav = new ModelAndView(viewName);
        mav.addObject("productList",productList);
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
		
			Admin_productVO product = ProductVO;
			Admin_optionVO option = admin_optionVO;	
			Admin_product_imageVO  p_image = admin_product_imageVO;	
			Admin_product_t_imageVO p_t_image = admin_product_t_imageVO;

			product.setP_id(p_id);
			product.setP_name(mp_name);
			product.setP_price(mp_price);
			product.setP_detail_title(mp_d_title);
			product.setP_detail_context(mp_d_cxt);
			product.setP_recommend(mp_rec);
			product.setP_category(mp_cate);
			
			System.out.println("추천 여부 :"+mp_rec);
			
			p_image.setP_id(p_id);
			p_image.setP_name(mp_name);
			p_image.setP_price(mp_price);
			p_image.setP_image_name(mp_img);
			
			p_t_image.setP_id(p_id);
			p_t_image.setP_name(mp_name);
			p_t_image.setP_price(mp_price);
			p_t_image.setP_t_image_name(mp_t_img);

			
//			신규 옵션 리스트로 묶기
			List<Admin_optionVO> newOptions = new ArrayList<Admin_optionVO>();
			
			for(int i=0; i<mp_options.length; i++) {
				Admin_optionVO newOption = new Admin_optionVO();
				newOption.setP_id(p_id);
				newOption.setP_name(mp_name);
				newOption.setP_option(mp_options[i]);
				newOption.setP_price(mp_price);
				
				System.out.println("신규옵션 : "+newOption.getP_option());
				newOptions.add(newOption);
			}
			
//			기존 옵션목록 제거
			List<Admin_optionVO> originalOption = adminProductService.listOption(product);
			
			for(int i=0; i<originalOption.size(); i++) {
				System.out.println("제거옵션 : "+originalOption.get(i).getP_option());
				adminProductService.delOption(originalOption.get(i));	
			}
			
			adminProductService.modProduct(product);
			adminProductService.modProductImage(p_image);
			adminProductService.modProduct_t_Image(p_t_image);
			
//			신규 옵션 등록
			
//			System.out.println("신규옵션들 : "+newOptions);
			System.out.println("신규 옵션 리스트 크기 : "+newOptions.size());
			System.out.println("신규 옵션 리스트 p_id : "+newOptions.get(0).getP_id());
			for(int e=0; e<newOptions.size(); e++){
				System.out.println(newOptions.get(e).getP_option());
				adminProductService.addOption(newOptions.get(e));
			}
			
			
			
		
	}

}
