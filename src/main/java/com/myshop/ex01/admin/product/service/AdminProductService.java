package com.myshop.ex01.admin.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myshop.ex01.admin.product.vo.Admin_optionVO;
import com.myshop.ex01.admin.product.vo.Admin_productVO;
import com.myshop.ex01.admin.product.vo.Admin_product_imageVO;
import com.myshop.ex01.admin.product.vo.Admin_product_t_imageVO;

@Service("AdminProductService")
public interface AdminProductService {
	
	public List<List> listProduct()throws Exception;
	
	public List<Object> detailProduct(String p_id)throws Exception;
	
	public int newProductID() throws Exception;
	
	public void addProduct(Admin_productVO admin_productVO) throws Exception;
	
	public void modProduct(Admin_productVO admin_productVO) throws Exception;
	
	//Image
	
	public void addProductImage(Admin_product_imageVO admin_product_imageVO) throws Exception;
	
	public void addProduct_t_Image(Admin_product_t_imageVO admin_product_t_imageVO) throws Exception;
	
	public void modProductImage(Admin_product_imageVO admin_product_imageVO) throws Exception;
	
	public void modProduct_t_Image(Admin_product_t_imageVO admin_product_t_imageVO) throws Exception;
	
	public void delProduct(Admin_productVO admin_productVO)throws Exception;
	
	public void delProductImage(Admin_product_imageVO admin_product_imageVO)throws Exception;
	
	public void delProduct_t_Image(Admin_product_t_imageVO admin_product_t_imageVO)throws Exception;

	//option
	
	public List<Admin_optionVO> listOption(Admin_productVO admin_productVO) throws Exception;
	
	public void addOption(Admin_optionVO admin_optionVO)throws Exception;
	
	public void modOption(Admin_optionVO admin_optionVO)throws Exception;
	
	public void delOption(Admin_optionVO admin_optionVO)throws Exception;
}
