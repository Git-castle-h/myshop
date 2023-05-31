package com.myshop.ex01.shopping.cart.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myshop.ex01.shopping.cart.vo.CartVO;

public interface CartDAO {
	
	public List<CartVO> cartList(String m_id) throws DataAccessException;
	public CartVO s_cartByID(CartVO CartVO) throws DataAccessException;
	public void addCart(CartVO CartVO) throws DataAccessException;
	public void delCart(CartVO CartVO) throws DataAccessException;
	public void updateCart(CartVO CartVO) throws DataAccessException;

}
