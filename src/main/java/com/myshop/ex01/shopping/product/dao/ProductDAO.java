package com.myshop.ex01.shopping.product.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myshop.ex01.shopping.product.vo.OptionVO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_imageVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;

public interface ProductDAO {
	
	public List<ProductVO> s_productList() throws DataAccessException;
	public ProductVO s_productById(ProductVO ProductVO) throws DataAccessException;
	public List<ProductVO> s_productByCate(ProductVO ProductVO) throws DataAccessException;
	public List<ProductVO> s_recommend_product() throws DataAccessException;
	
	public Product_imageVO s_productImageById(ProductVO ProductVO) throws DataAccessException;
	public Product_t_imageVO s_product_t_ImageById(ProductVO ProductVO) throws DataAccessException;
	
	public List<OptionVO> s_optionById(ProductVO ProductVO) throws DataAccessException;
	
	
	public void addProduct(ProductVO ProductVO) throws DataAccessException;
	public void updateProduct(ProductVO ProductVO) throws DataAccessException;
	public void deleteProduct(ProductVO ProductVO) throws DataAccessException;
	
	public void addProductImage(Product_imageVO Product_imageVO) throws DataAccessException;
	public void updateProductImage(Product_imageVO Product_imageVO) throws DataAccessException;
	public void delProductImage(Product_imageVO Product_imageVO) throws DataAccessException;
	
	public void addProduct_t_Image(Product_t_imageVO Product_t_imageVO) throws DataAccessException;
	public void updateProduct_t_Image(Product_t_imageVO Product_t_imageVO) throws DataAccessException;
	public void delProduct_t_Image(Product_t_imageVO Product_t_imageVO) throws DataAccessException;
	
	public void addOption(OptionVO OptionVO) throws DataAccessException;
	public void updateOption(OptionVO OptionVO) throws DataAccessException;
	public void delOption(ProductVO ProductVO) throws DataAccessException;
	
	

}
