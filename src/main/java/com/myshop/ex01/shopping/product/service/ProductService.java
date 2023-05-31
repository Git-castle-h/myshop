package com.myshop.ex01.shopping.product.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myshop.ex01.shopping.product.vo.OptionVO;
import com.myshop.ex01.shopping.product.vo.ProductVO;

public interface ProductService {
	
	public List<List>product() throws Exception;
	public List<List>recProduct() throws Exception;
	public ProductVO s_productById(ProductVO ProductVO) throws DataAccessException;
	public List<List>productCate(String p_category) throws Exception;
	public List<Object>productDT(String p_id) throws Exception;
	public List<OptionVO> productOptions(String p_id) throws Exception;

}
