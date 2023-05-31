package com.myshop.ex01.shopping.order.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myshop.ex01.shopping.help.vo.Help_imageVO;
import com.myshop.ex01.shopping.order.vo.OrderVO;

public interface OrderDAO {
	
	
	public List<OrderVO> s_orderList() throws DataAccessException;
	public List<OrderVO> orderList(String m_id) throws DataAccessException;
	public OrderVO s_orderByID(OrderVO OrderVO) throws DataAccessException;
	public void addOrder(OrderVO OrderVO) throws DataAccessException;
	public void updateOrder(OrderVO OrderVO) throws DataAccessException;
	public void delOrder(OrderVO OrderVO) throws DataAccessException;

}
