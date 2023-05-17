package com.myshop.ex01.shopping.cart.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("CartRestController")
@RequestMapping("/cart")
public class CartRestControllerImpl implements CartRestController{

	@ResponseBody
	@RequestMapping("/cartDetail.do")
	public Map<String,String> cartDetailDo(
			@RequestParam("c_id")String c_id,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception{

    	HttpSession session = request.getSession();
    	
    	String m_id = (String)session.getAttribute("m_id");
    	//테스트용 값
    	m_id = "sampleId";
    	String p_id = "1";
    	String p_name = "추천 Clothes1";
    	String p_price = "10000";
    	String p_option = "105";
    	String c_number = "5";
		
    	ArrayList<String> optionArr = new ArrayList<String>();
    	
    	optionArr.add("90");
    	optionArr.add("95");
    	optionArr.add("100");
    	optionArr.add("105");
    	
    	String options =optionArr.toString();
    	
   
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
    	
    	System.out.println(c_id+"번 카트 항목 제거합니다.");
    }
    
	@ResponseBody
    @RequestMapping(value="/cartDeleteSel.do",method= {RequestMethod.GET,RequestMethod.POST})
    public void cardDeleteSelDo(
    		@RequestParam("c_id_arr[]")String[]c_id_arr,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
			
			for(int i=0; i < c_id_arr.length;i++) {
				System.out.println(c_id_arr[i]+"제거 합니다.");
			}
			
    		

    }
	
	
	@ResponseBody
    @RequestMapping(value="/cartToOrder.do",method= {RequestMethod.GET,RequestMethod.POST})
    public void cartToOrderDo(
    		@RequestParam("c_id_arr[]")String[]c_id_arr,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
			
			for(int i=0; i < c_id_arr.length;i++) {
				System.out.println(c_id_arr[i]+"주문테이블에 추가되었습니다.");
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
		
		System.out.println(c_id+"의 상품개수 : "+c_number+" 상품옵션 : "+p_option+" 수정완료");
	}
	
}
