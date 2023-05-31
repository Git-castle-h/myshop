package com.myshop.ex01.shopping.cart.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myshop.ex01.shopping.cart.dao.CartDAO;
import com.myshop.ex01.shopping.cart.service.CartService;
import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.order.service.OrderService;
import com.myshop.ex01.shopping.order.vo.OrderVO;
import com.myshop.ex01.shopping.product.service.ProductService;
import com.myshop.ex01.shopping.product.vo.OptionVO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_imageVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;

@Controller("CartRestController")
@RequestMapping("/cart")
public class CartRestControllerImpl implements CartRestController{

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
	@RequestMapping("/cartDetail.do")
	public Map<String,String> cartDetailDo(
			@RequestParam("c_id")String c_id,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception{

    	HttpSession session = request.getSession();
    	
    	String m_id = (String)session.getAttribute("m_id");
    	//테스트용 값
    	m_id = "sampleID";
    	
    	CartVO.setM_id(m_id);
    	CartVO.setC_id(c_id);
    	CartVO cart = cartService.detailCart(CartVO);
    	
    	String p_id = cart.getP_id();
    	String p_name = cart.getP_name();
    	String p_price = cart.getP_price();
    	String p_option = cart.getP_option();
    	String c_number = cart.getC_number();
    	
    	List<OptionVO> optionArr = productService.productOptions(p_id);
    	System.out.println("optionArr : "+optionArr);
    	
    	List<String>_options = new ArrayList<String>();
    	
    	for(int i=0; i<optionArr.size(); i++){
    		_options.add(optionArr.get(i).getP_option());
    	}
    	
    	String options = _options.toString();
    	
    	session.setAttribute("m_id", m_id);
    	
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("p_id",p_id);
		map.put("p_name",p_name);
		map.put("p_price",p_price);
		map.put("p_option",p_option);
		map.put("c_number", c_number);
		map.put("options",options);
		
		return map; 
	}
	
	@ResponseBody
    @RequestMapping(value="/cartDelete.do",method= {RequestMethod.GET,RequestMethod.POST})
    public void cardDeleteDo(
    		@RequestParam("c_id")String c_id,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
		
		HttpSession session = request.getSession();
		
		String m_id =  "sampleID";
		
		CartVO.setM_id(m_id);
		CartVO.setC_id(c_id);
		
		cartService.delCart(CartVO);
    	
    	System.out.println(c_id+"번 카트 항목 제거합니다.");
    }
    
	@ResponseBody
    @RequestMapping(value="/cartDeleteSel.do",method= {RequestMethod.GET,RequestMethod.POST})
    public void cardDeleteSelDo(
    		@RequestParam("c_id_arr[]")String[]c_id_arr,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
		
		HttpSession session = request.getSession();
				
		String m_id =  "sampleID";
		
		for(int i=0; i < c_id_arr.length;i++) {
			
			CartVO.setM_id(m_id);
			CartVO.setC_id(c_id_arr[i]);
			
			cartService.delCart(CartVO);
			
			System.out.println(c_id_arr[i]+"제거 합니다.");
		}
			
    		

    }
	
	
	@ResponseBody
    @RequestMapping(value="/cartToOrder.do",method= {RequestMethod.GET,RequestMethod.POST})
    public void cartToOrderDo(
    		@RequestParam("c_id_arr[]")String[]c_id_arr,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
		
			HttpSession session = request.getSession();
			String m_id = "sampleID";
			String m_address1="123";
			String m_address2="456";
			String m_address3="789";
			
			try {
				
				for(int i=0; i < c_id_arr.length;i++) {
					CartVO.setC_id(c_id_arr[i]);
					CartVO.setM_id(m_id);
					CartVO cart = cartService.s_cartByID(CartVO);
					
					
					String c_id = cart.getC_id();
					String p_id = cart.getP_id();
					String p_option = cart.getP_option();
					String p_name = cart.getP_name();
					String p_price = cart.getP_price();
					String c_number = cart.getC_number();
					
					OrderVO.setM_id(m_id);
					OrderVO.setP_id(p_id);
					OrderVO.setP_option(p_option);
					OrderVO.setP_name(p_name);
					OrderVO.setP_price(p_price);
					OrderVO.setO_number(c_number);
					OrderVO.setO_address1(m_address1);
					OrderVO.setO_address2(m_address2);
					OrderVO.setO_address3(m_address3);

					orderService.addOrder(OrderVO);
					
					cartService.delCart(cart);
					
					System.out.println(c_id_arr[i]+"주문테이블에 추가되었습니다.");
				}
				
			} catch (Exception e) {

			}
			

			
    }
	
	@ResponseBody
	@RequestMapping(value="/modCart.do",method= {RequestMethod.GET,RequestMethod.POST})
	 public void modCartDo(
			 @RequestParam("c_id")String c_id,
			 @RequestParam("c_number")String c_number,
			 @RequestParam("p_option")String p_option,
	    		HttpServletRequest request,
	    		HttpServletResponse response) throws Exception{
		
		HttpSession session = request.getSession();
		
		String m_id =  "sampleID";
		CartVO cart = cartService.s_cartByID(CartVO);
		String p_id = cart.getP_id();
		
		ProductVO.setP_id(p_id);
		
		ProductVO product = productService.s_productById(ProductVO);
		
		String originalPrice = product.getP_price();
		String price = String.valueOf(Integer.parseInt(originalPrice)*Integer.parseInt(c_number));
		
		cart.setM_id(m_id);
		cart.setC_id(c_id);
		cart.setP_price(price);
		cart.setC_number(c_number);
		cart.setP_option(p_option);
		
		cartService.updateCart(cart);
		
		System.out.println(c_id+"의 상품개수 : "+c_number+" 상품옵션 : "+p_option+" 수정완료");
	}
	
}
