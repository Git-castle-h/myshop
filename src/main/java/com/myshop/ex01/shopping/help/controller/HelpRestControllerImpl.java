package com.myshop.ex01.shopping.help.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.help.service.HelpService;
import com.myshop.ex01.shopping.help.vo.HelpVO;
import com.myshop.ex01.shopping.help.vo.Help_imageVO;
import com.myshop.ex01.shopping.member.vo.MemberVO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;

@Controller("helpRestController")
@RequestMapping("/help")
public class HelpRestControllerImpl implements HelpRestController {
	
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

	
	@ResponseBody
    @RequestMapping("/help.do")
    public Map<String,String> helpDo(
    		@RequestParam("h_title")String h_title,
    		@RequestParam("h_category")String h_category,
    		@RequestParam("h_product_name")String h_product_name,
    		@RequestParam("h_context")String h_context,
    		@RequestParam("h_file_name")String h_file_name,
    		HttpServletRequest request, HttpServletResponse response) throws Exception{
		
			System.out.print("문의 제목 : "+h_title+" ");
			System.out.print("문의 분류 : "+h_category+" ");
			System.out.print("문의 상품 : "+h_product_name+" ");
			System.out.print("문의 내용 : "+h_context+" ");
			System.out.print("문의 이미지 : "+h_file_name+" ");

		Map<String,String> map = new HashMap<String,String>();
		
		HttpSession session = request.getSession();
		
		String m_id = (String)session.getAttribute("m_id");
		
		m_id="sampleID";
		
		HelpVO.setM_id(m_id);
		HelpVO.setH_title(h_title);
		HelpVO.setH_category(h_category);
		HelpVO.setH_product_name(h_product_name);
		HelpVO.setH_context(h_context);
		
		helpService.addHelp(HelpVO);
		
        return map;
    }
	
	@ResponseBody
    @RequestMapping("/modhelp.do")
    public Map<String,String> modHelpDo(
    		@RequestParam("h_title")String h_title,
    		@RequestParam("h_category")String h_category,
    		@RequestParam("h_product_name")String h_product_name,
    		@RequestParam("h_context")String h_context,
    		@RequestParam("h_file_name")String h_file_name,
    		HttpServletRequest request, HttpServletResponse response) throws Exception{
		
			System.out.print("문의 제목 : "+h_title+" ");
			System.out.print("문의 분류 : "+h_category+" ");
			System.out.print("문의 상품 : "+h_product_name+" ");
			System.out.print("문의 내용 : "+h_context+" ");
			System.out.print("문의 이미지 : "+h_file_name+" ");

		Map<String,String> map = new HashMap<String,String>();
		
		HttpSession session = request.getSession();
		
		String m_id = "sampleID";
		String h_number = (String)session.getAttribute("h_number");		
		
		
		HelpVO.setM_id(m_id);
		HelpVO.setH_number(h_number);
		HelpVO.setH_title(h_title);
		HelpVO.setH_category(h_category);
		HelpVO.setH_product_name(h_product_name);
		HelpVO.setH_context(h_context);
		
		helpService.updateHelp(HelpVO);
		
        return map;
    }


}

