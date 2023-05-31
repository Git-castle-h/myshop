package com.myshop.ex01.shopping.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.order.dao.OrderDAO;
import com.myshop.ex01.shopping.order.vo.OrderVO;
import com.myshop.ex01.shopping.product.dao.ProductDAO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_imageVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;

@Service("OrderService")
public class OrderServiceImpl implements OrderService{

	@Autowired
	CartVO CartVO;
	
	@Autowired
	OrderVO OrderVO;
	
	@Autowired
	ProductVO ProductVO;
	
	@Autowired
	Product_imageVO Product_imageVO;
	
	@Autowired
	Product_t_imageVO Product_t_imageVO;
	
	@Autowired
	OrderDAO orderDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Override
	public List<List> listOrder(String m_id) throws Exception {
		
		List<List> orderList = new ArrayList<List>();
		
		List<OrderVO> order = orderDAO.orderList(m_id);
		List<ProductVO>product = new ArrayList<ProductVO>();
		List<Product_imageVO> order_image = new ArrayList<Product_imageVO>();
		List<Product_t_imageVO>order_t_image = new ArrayList<Product_t_imageVO>();
		
		for(int i=0; i < order.size(); i++) {
			
			String p_id = order.get(i).getP_id();
			ProductVO.setP_id(p_id);
			product.add(productDAO.s_productById(ProductVO));
			
		}
		
		for(int i=0; i < order.size(); i++) {
			
			String p_id = order.get(i).getP_id();
			ProductVO.setP_id(p_id);
			order_image.add(productDAO.s_productImageById(ProductVO));
			
		}
		
		for(int i=0; i < order.size(); i++) {
			
			String p_id = order.get(i).getP_id();
			ProductVO.setP_id(p_id);
			order_t_image.add(productDAO.s_product_t_ImageById(ProductVO));
			
		}
		
		orderList.add(order);
		orderList.add(product);
		orderList.add(order_image);
		orderList.add(order_t_image);
		
		return orderList;
	}

	@Override
	public void addOrder(OrderVO OrderVO) throws Exception {
		orderDAO.addOrder(OrderVO);
	}

	@Override
	public void delOrder(OrderVO OrderVO) throws Exception {
		orderDAO.delOrder(OrderVO);
	}

	@Override
	public void updateOrder(OrderVO OrderVO) throws Exception {
		orderDAO.updateOrder(OrderVO);
	}
	
	@Override
	public OrderVO detailOrder(OrderVO OrderVO)throws Exception {
		OrderVO order =orderDAO.s_orderByID(OrderVO);
		return order;
	}

	
}
