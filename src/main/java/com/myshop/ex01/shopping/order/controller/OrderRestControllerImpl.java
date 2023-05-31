package com.myshop.ex01.shopping.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myshop.ex01.shopping.cart.service.CartService;
import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.order.service.OrderService;
import com.myshop.ex01.shopping.order.vo.OrderVO;
import com.myshop.ex01.shopping.product.service.ProductService;
import com.myshop.ex01.shopping.product.vo.OptionVO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_imageVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller("orderRestController")
@RequestMapping("/order")
public class OrderRestControllerImpl implements OrderRestController {
  
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
	
	
	@ResponseBody
	@RequestMapping("/orderDetail.do")
	public Map<String,String> orderDetailDo(
			@RequestParam("o_id")String o_id,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception{

    	HttpSession session = request.getSession();
    	
    	String m_id = (String)session.getAttribute("m_id");
    	session.setAttribute("m_id", m_id);
    	
    	m_id = "sampleID";
    	
    	OrderVO.setM_id(m_id);
    	OrderVO.setO_id(o_id);
    	
    	OrderVO order = orderService.detailOrder(OrderVO);
    	
    	String p_id = order.getP_id();
    	String p_name = order.getP_name();
    	String p_price = order.getP_price();
    	String p_option = order.getP_option();
    	String c_number = order.getO_number();
    	String o_address_post = order.getO_address1();
    	String o_address_basic = order.getO_address2();
    	String o_address_detail = order.getO_address3();

    	List<OptionVO> optionArr = productService.productOptions(p_id);
    	System.out.println("optionArr : "+optionArr);
    	
    	List<String>_options = new ArrayList<String>();
    	
    	for(int i=0; i<optionArr.size(); i++){
    		_options.add(optionArr.get(i).getP_option());
    	}
    	
    	String options = _options.toString();
    	
    	session.setAttribute("m_id", m_id);
    	session.setAttribute("o_id", o_id);
    	
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("p_id",p_id);
		map.put("p_name",p_name);
		map.put("p_price",p_price);
		map.put("p_option",p_option);
		map.put("c_number", c_number);
		map.put("options",options);
		map.put("o_address_post",o_address_post);
		map.put("o_address_basic",o_address_basic);
		map.put("o_address_detail",o_address_detail);
		
		return map; 
	}
	
	@ResponseBody
	@RequestMapping("/modOrder.do")
	public void modOrderDo(
			@RequestParam("p_option")String p_option,
			@RequestParam("o_number")String o_number,
			@RequestParam("o_address1")String o_address1,
			@RequestParam("o_address2")String o_address2,
			@RequestParam("o_address3")String o_address3,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		
    	HttpSession session = request.getSession();
    	
    	String m_id = (String)session.getAttribute("m_id");
    	session.setAttribute("m_id", m_id);
    	
    	m_id = "sampleID";
		String o_id = (String)session.getAttribute("o_id");
		
		OrderVO.setM_id(m_id);
		OrderVO.setO_id(o_id);
		
		OrderVO order = orderService.detailOrder(OrderVO);
		
		String p_id = order.getP_id();
		ProductVO.setP_id(p_id);
		ProductVO product = productService.s_productById(ProductVO);
		
		String originalPrice = product.getP_price();
		String price = String.valueOf(Integer.parseInt(originalPrice)*Integer.parseInt(o_number));
		
		order.setM_id(m_id);
		order.setO_id(o_id);
		order.setP_option(p_option);
		order.setP_price(price);
		order.setO_number(o_number);
		order.setO_address1(o_address1);
		order.setO_address2(o_address2);
		order.setO_address3(o_address3);
    	
    	orderService.updateOrder(order);
					
		System.out.println(o_id+"의 설정변경 옵션 : "+p_option+" 수량 : "+o_number+" 우편번호 : "+o_address1+" 기본주소 : "+o_address2+" 상세주소 : "+o_address3);
		 
	}
	
	@ResponseBody
	@RequestMapping("/orderDelete.do")
	public void orderDeletdDo(
			@RequestParam("o_id")String o_id,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		

    	HttpSession session = request.getSession();
    	
    	String m_id = (String)session.getAttribute("m_id");
    	
    	m_id = "sampleID";
    	
    	OrderVO.setM_id(m_id);
    	OrderVO.setO_id(o_id);
    	
    	orderService.delOrder(OrderVO);
		
    	session.setAttribute("m_id", m_id);
    	
		System.out.println(o_id+"삭제되었습니다.");
		 
	}
	
	@ResponseBody
	@RequestMapping("/myAddress.do")
	public Map<String,String> myAddressDo(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		
		HttpSession session = request.getSession();
		
		String m_id = (String)session.getAttribute("m_id");
		
		m_id = "sampleId";
		String address_post = "10000";
		String address_basic = "서울시 송파구";
		String address_detail = "석촌호수";
		
		session.setAttribute("m_id", m_id);
		
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("address_post", address_post);
		map.put("address_basic", address_basic);
		map.put("address_detail", address_detail);
		return map;
	};
	
	@ResponseBody
	@RequestMapping("/order.do")
	public void orderDo(
			@RequestParam("c_id_arr[]")String[] c_id_arr,
			@RequestParam("address_post")String address_post,
			@RequestParam("address_basic")String address_basic,
			@RequestParam("address_detail")String address_detail,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		
		HttpSession session = request.getSession();
		
		String m_id = (String)session.getAttribute("m_id");
		
		m_id = "sampleId";

		for(int i=0; i<c_id_arr.length;i++) {
			
			String c_id = c_id_arr[i];
			String c_info = "c_id를 가진 cart항목의 정보들";
			
			System.out.println("t_order에 c_id : "+c_id+", c_info : "+c_info+", 주소 : "+address_post+address_basic+address_detail);
			
		}
		
	
		session.setAttribute("m_id", m_id);
		
		
	};
	
}
