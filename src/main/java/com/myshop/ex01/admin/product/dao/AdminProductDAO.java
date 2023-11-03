package com.myshop.ex01.admin.product.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.admin.product.vo.Admin_optionVO;
import com.myshop.ex01.admin.product.vo.Admin_productVO;
import com.myshop.ex01.admin.product.vo.Admin_product_imageVO;
import com.myshop.ex01.admin.product.vo.Admin_product_t_imageVO;

@Repository("AdminProductDAO")
public interface AdminProductDAO  {


	public List<Admin_productVO> s_productList() throws DataAccessException;
	
	public int get_productNum() throws DataAccessException;

	public Admin_productVO s_productById(String p_id) throws DataAccessException;
	
	public List<Admin_productVO> s_productByCate(Admin_productVO ProductVO) throws DataAccessException;

	public List<Admin_productVO> s_recommend_product() throws DataAccessException;

	public Admin_product_imageVO s_productImageById(Admin_productVO ProductVO) throws DataAccessException;

	public Admin_product_t_imageVO s_product_t_ImageById(Admin_productVO ProductVO) throws DataAccessException;

	public void addProduct(Admin_productVO ProductVO) throws DataAccessException;

	public void updateProduct(Admin_productVO ProductVO) throws DataAccessException;

	public void deleteProduct(Admin_productVO ProductVO) throws DataAccessException;

	public void addProductImage(Admin_product_imageVO Product_imageVO) throws DataAccessException;

	public void updateProductImage(Admin_product_imageVO Product_imageVO) throws DataAccessException;

	public void delProductImage(Admin_product_imageVO Product_imageVO) throws DataAccessException;

	public void addProduct_t_Image(Admin_product_t_imageVO Product_t_imageVO) throws DataAccessException;

	public void updateProduct_t_Image(Admin_product_t_imageVO Product_t_imageVO) throws DataAccessException;

	public void delProduct_t_Image(Admin_product_t_imageVO Product_t_imageVO) throws DataAccessException;

	public List<Admin_optionVO> s_optionById(Admin_productVO ProductVO) throws DataAccessException;

	public void addOption(Admin_optionVO OptionVO) throws DataAccessException;

	public void updateOption(Admin_optionVO OptionVO) throws DataAccessException;

	public void delOption(Admin_optionVO OptionVO) throws DataAccessException;
}
