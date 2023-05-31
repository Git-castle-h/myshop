package com.myshop.ex01.shopping.cart.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.main.vo.BannerVO;

@Repository("CartDAO")
public class CartDAOImpl implements CartDAO{

	@Autowired
	private SqlSession sqlSession;	
	
	@Override
	public List<CartVO> cartList(String m_id) throws DataAccessException {
		List<CartVO> cartList=(ArrayList)sqlSession.selectList("mapper.cart.cartList",m_id);
		   return cartList;
	}

	@Override
	public CartVO s_cartByID(CartVO CartVO) throws DataAccessException {
		CartVO cartVO= (CartVO)sqlSession.selectOne("mapper.cart.s_cartByID",CartVO);
		return cartVO;
	}	
	
	@Override
	public void addCart(CartVO CartVO) throws DataAccessException {
		String cart_id = sqlSession.selectOne("mapper.cart.countCart",CartVO);
		String _cart_id = String.valueOf((Integer.parseInt(cart_id)+1));
		CartVO.setC_id(_cart_id);
		
		sqlSession.insert("mapper.cart.addCart",CartVO);
	}

	@Override
	public void delCart(CartVO CartVO) throws DataAccessException {
		sqlSession.delete("mapper.cart.delCart",CartVO);
		
	}

	@Override
	public void updateCart(CartVO CartVO) throws DataAccessException {
		sqlSession.update("mapper.cart.updateCart",CartVO);
		
	}


	
	
}
