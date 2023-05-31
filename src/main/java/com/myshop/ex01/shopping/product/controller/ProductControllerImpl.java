package com.myshop.ex01.shopping.product.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myshop.ex01.shopping.cart.service.CartService;
import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.member.vo.MemberVO;
import com.myshop.ex01.shopping.product.service.ProductService;
import com.myshop.ex01.shopping.product.vo.ProductVO;

@Controller("productController")
@RequestMapping("/product")
public class ProductControllerImpl implements ProductController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CartService cartService;
	
	@Autowired
	ProductVO ProductVO;
	
	@Autowired
	CartVO CartVO;
	
    @RequestMapping("/product")
    public ModelAndView product(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    
    @RequestMapping("/productList/{p_category}")
    public ModelAndView productList(
    		@PathVariable("p_category")String p_category,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        
        List<List>productCate = productService.productCate(p_category);
        
        
        mav.addObject("p_category",p_category);
        mav.addObject("productCate",productCate);
        
        
        return mav;
    }
    
    @RequestMapping("/productDetail/{p_id}")
    public ModelAndView productDetail(
    		@PathVariable("p_id")String p_id,
    		HttpServletRequest request, 
    		HttpServletResponse response) throws Exception{
    	
        String viewName = (String)request.getAttribute("viewName");
        
        HttpSession session = request.getSession();
        
        
        ModelAndView mav = new ModelAndView(viewName);
        List<Object>productDetail = productService.productDT(p_id);
        
        ProductVO product = (ProductVO)productDetail.get(0);
        
        String p_name = product.getP_name();
        String p_price = product.getP_price();
        
    	session.setAttribute("p_id",p_id);
    	session.setAttribute("p_name",p_name);
    	session.setAttribute("p_price",p_price);
              
        mav.addObject("productDetail",productDetail);
        
        return mav;
    }
    
    @RequestMapping("/productDetail/productBuy.do")
    public ModelAndView productBuyDo(
    		@RequestParam("p_option")String p_option,
    		@RequestParam("p_number")String p_number,
    		HttpServletRequest request, 
    		HttpServletResponse response) throws Exception{
    	
    	 HttpSession session = request.getSession();
     
//        MemberVO member = (MemberVO)session.getAttribute("member");
//        session.setAttribute("member", member);
//    	String m_id = member.getM_id();
    	
    	String m_id = "sampleID";
    	String p_id = (String)session.getAttribute("p_id");
        String p_name = (String)session.getAttribute("p_name");
        String p_price = (String)session.getAttribute("p_price");
        
        String price = String.valueOf(Integer.parseInt(p_price)*Integer.parseInt(p_number));
        
        CartVO.setM_id(m_id);
        CartVO.setP_id(p_id);
        CartVO.setP_name(p_name);
        CartVO.setP_price(price);
        CartVO.setP_option(p_option);
        CartVO.setC_number(p_number);
        
        
        cartService.addCart(CartVO);
        
        System.out.println(
        		"상품아이디 : "+p_id+
        		" 구매자 : "+m_id+
        		" 상품이름 : "+p_name+
        		" 상품가격 : "+price+
        		" 상품옵션 : "+p_option+
        		" 상품갯수 : "+p_number
        		);
    	
        String viewName = (String)request.getAttribute("viewName");
        
        ModelAndView mav = new ModelAndView(viewName);

        
        return mav;
    }

}
