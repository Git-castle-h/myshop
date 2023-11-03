package com.myshop.ex01.admin.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.ex01.admin.product.dao.AdminProductDAO;
import com.myshop.ex01.admin.product.vo.Admin_optionVO;
import com.myshop.ex01.admin.product.vo.Admin_productVO;
import com.myshop.ex01.admin.product.vo.Admin_product_imageVO;
import com.myshop.ex01.admin.product.vo.Admin_product_t_imageVO;

@Service("AdminProductService")
public class AdminProductServiceImpl implements AdminProductService{

	@Autowired
	AdminProductDAO productDAO;

	
	@Override
	public List<List> listProduct() throws Exception {
		
		List<Admin_productVO> productList = productDAO.s_productList();
		List<Admin_product_imageVO>productImageList = new ArrayList<Admin_product_imageVO>();
		List<Admin_product_t_imageVO>productTImageList = new ArrayList<Admin_product_t_imageVO>();
		
		for(int i=0; i<productList.size(); i++){
			Admin_product_imageVO p_img = (Admin_product_imageVO) productDAO.s_productImageById(productList.get(i));
			productImageList.add(p_img);
		}
		
		for(int i=0; i<productList.size(); i++) {
			Admin_product_t_imageVO p_img = (Admin_product_t_imageVO) productDAO.s_product_t_ImageById(productList.get(i));
			productTImageList.add(p_img);	
		}
		
		List<List> product = new ArrayList<List>();
		
		product.add(productList);
		product.add(productImageList);
		product.add(productTImageList);
		
		return product;
	}
	
	@Override
	public List<Object> detailProduct(String p_id) throws Exception{
		
		List<Object> productDetail = new ArrayList<Object>();
		
		Admin_productVO productVO = (Admin_productVO)productDAO.s_productById(p_id);
		List<Admin_optionVO> optionList = productDAO.s_optionById(productVO);
		Admin_product_imageVO imageVO = (Admin_product_imageVO)productDAO.s_productImageById(productVO);
		Admin_product_t_imageVO t_imageVO = (Admin_product_t_imageVO)productDAO.s_product_t_ImageById(productVO);
		
		productDetail.add(productVO);
		productDetail.add(optionList);
		productDetail.add(imageVO);
		productDetail.add(t_imageVO);
		
		return productDetail;
	}
	
	@Override
	public int newProductID() throws Exception {
		int productNum = productDAO.get_productNum()+1;
		return productNum;
	}
	
	@Override
	public void addProduct(Admin_productVO admin_productVO) throws Exception {
		productDAO.addProduct(admin_productVO);
	}

	@Override
	public void modProduct(Admin_productVO admin_productVO) throws Exception {
		productDAO.updateProduct(admin_productVO);		
	}

//	image
	
	@Override
	public void addProductImage(Admin_product_imageVO admin_product_imageVO) throws Exception {
		productDAO.addProductImage(admin_product_imageVO);	
	}

	@Override
	public void addProduct_t_Image(Admin_product_t_imageVO admin_product_t_imageVO) throws Exception {
		productDAO.addProduct_t_Image(admin_product_t_imageVO);
	}

	
	@Override
	public void modProductImage(Admin_product_imageVO admin_product_imageVO) throws Exception {
		productDAO.updateProductImage(admin_product_imageVO);	
	}

	@Override
	public void modProduct_t_Image(Admin_product_t_imageVO admin_product_t_imageVO) throws Exception {
		productDAO.updateProduct_t_Image(admin_product_t_imageVO);
	}

	@Override
	public void delProduct(Admin_productVO admin_productVO) throws Exception {
		productDAO.deleteProduct(admin_productVO);	
	}

	@Override
	public void delProductImage(Admin_product_imageVO admin_product_imageVO) throws Exception {
		productDAO.delProductImage(admin_product_imageVO);		
	}

	@Override
	public void delProduct_t_Image(Admin_product_t_imageVO admin_product_t_imageVO) throws Exception {
		productDAO.delProduct_t_Image(admin_product_t_imageVO);		
	}

	
	//option
	
	@Override
	public List<Admin_optionVO> listOption(Admin_productVO admin_productVO) throws Exception {
		List<Admin_optionVO> optionList = productDAO.s_optionById(admin_productVO);
		return optionList;
	}

	@Override
	public void addOption(Admin_optionVO admin_optionVO) throws Exception {
		productDAO.addOption(admin_optionVO);
	}

	@Override
	public void modOption(Admin_optionVO admin_optionVO) throws Exception {
		productDAO.updateOption(admin_optionVO);
	}

	@Override
	public void delOption(Admin_optionVO admin_optionVO) throws Exception {
		productDAO.delOption(admin_optionVO);		
	}

	
	
	
}
