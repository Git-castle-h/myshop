package com.myshop.ex01.shopping.cart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.ex01.shopping.cart.dao.CartDAO;
import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.product.dao.ProductDAO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_imageVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;

@Service("CartService")
public class CartServiceImpl implements CartService{

	@Autowired
	CartVO CartVO;
	
	@Autowired
	ProductVO ProductVO;
	
	@Autowired
	Product_imageVO Product_imageVO;
	
	@Autowired
	Product_t_imageVO Product_t_imageVO;
	
	@Autowired
	CartDAO cartDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Override
	public List<List> listCart(String m_id) throws Exception {
		
		List<List> cartList = new ArrayList<List>();
		
		List<CartVO> cart = cartDAO.cartList(m_id);
		List<ProductVO>product = new ArrayList<ProductVO>();
		List<Product_imageVO> cart_image = new ArrayList<Product_imageVO>();
		List<Product_t_imageVO>cart_t_image = new ArrayList<Product_t_imageVO>();
	
		for(int i=0; i < cart.size(); i++) {
			
			String p_id = cart.get(i).getP_id();
			ProductVO.setP_id(p_id);
			product.add(productDAO.s_productById(ProductVO));
			
		}
		
		for(int i=0; i < cart.size(); i++) {
			
			String p_id = cart.get(i).getP_id();
			ProductVO.setP_id(p_id);
			cart_image.add(productDAO.s_productImageById(ProductVO));
			
		}
		
		for(int i=0; i < cart.size(); i++) {
			
			String p_id = cart.get(i).getP_id();
			ProductVO.setP_id(p_id);
			cart_t_image.add(productDAO.s_product_t_ImageById(ProductVO));
			
		}
		
		cartList.add(cart);
		cartList.add(product);
		cartList.add(cart_image);
		cartList.add(cart_t_image);
		
		return cartList;
		
	}
	
	@Override
	public CartVO s_cartByID(CartVO CartVO) throws Exception {
		CartVO cartVO = cartDAO.s_cartByID(CartVO);
		return cartVO;
	}	

	@Override
	public void addCart(CartVO CartVO) throws Exception {
		cartDAO.addCart(CartVO);
	}

	@Override
	public void delCart(CartVO CartVO) throws Exception {
		cartDAO.delCart(CartVO);
		
	}

	@Override
	public void updateCart(CartVO CartVO) throws Exception {
		cartDAO.updateCart(CartVO);
	}

	@Override
	public CartVO detailCart(CartVO CartVO)throws Exception {
		CartVO cart =cartDAO.s_cartByID(CartVO);
		return cart;
	}
	
	
}
