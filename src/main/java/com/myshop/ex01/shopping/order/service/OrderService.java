package com.myshop.ex01.shopping.order.service;

import java.util.List;

import com.myshop.ex01.shopping.order.vo.OrderVO;

public interface OrderService {
	
	public List<List> listOrder (String m_id) throws Exception;
	public void addOrder (OrderVO OrderVO) throws Exception;
	public void delOrder (OrderVO OrderVO) throws Exception;
	public void updateOrder (OrderVO OrderVO) throws Exception;
	public OrderVO detailOrder(OrderVO OrderVO)throws Exception;
}
