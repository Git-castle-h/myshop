package com.myshop.ex01.shopping.cart.service;

import java.util.List;

import com.myshop.ex01.shopping.cart.vo.CartVO;

public interface CartService {
	public List<List> listCart(String m_id) throws Exception;
	public CartVO detailCart(CartVO CartVO) throws Exception;
	public void addCart(CartVO CartVO) throws Exception;
	public void delCart(CartVO CartVO) throws Exception;
	public void updateCart(CartVO CartVO) throws Exception;
	public CartVO s_cartByID(CartVO CartVO) throws Exception;
}
