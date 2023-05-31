package com.myshop.ex01.shopping.order.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.shopping.help.vo.HelpVO;
import com.myshop.ex01.shopping.order.vo.OrderVO;

@Repository("orderDAO")
public class OrderDAOImpl implements OrderDAO{

	@Autowired
	private SqlSession sqlSession;	
	
	@Override
	public List<OrderVO> s_orderList() throws DataAccessException {
		List<OrderVO> orderList=(ArrayList)sqlSession.selectList("mapper.order.s_orderList");
		   return orderList;
	}

	@Override
	public List<OrderVO> orderList(String m_id) throws DataAccessException {
		List<OrderVO> orderList=(ArrayList)sqlSession.selectList("mapper.order.orderList",m_id);
		   return orderList;
	}
	
	@Override
	public OrderVO s_orderByID(OrderVO OrderVO) throws DataAccessException {
		OrderVO order=sqlSession.selectOne("mapper.order.s_orderByID",OrderVO);
		   return order;
	}


	@Override
	public void addOrder(OrderVO OrderVO) throws DataAccessException {
		String order_id = sqlSession.selectOne("mapper.order.countOrder",OrderVO);
		String _order_id = String.valueOf((Integer.parseInt(order_id)+1));
		OrderVO.setO_id(_order_id);
		
		sqlSession.insert("mapper.order.addOrder",OrderVO);
		
	}

	@Override
	public void updateOrder(OrderVO OrderVO) throws DataAccessException {
		sqlSession.update("mapper.order.updateOrder",OrderVO);
		
	}

	@Override
	public void delOrder(OrderVO OrderVO) throws DataAccessException {
		sqlSession.delete("mapper.order.delOrder",OrderVO);
		
	}
	
	
	
}
