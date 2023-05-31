package com.myshop.ex01.shopping.product.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myshop.ex01.shopping.product.dao.ProductDAO;
import com.myshop.ex01.shopping.product.vo.OptionVO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_imageVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;


@Service("ProductService")
@Transactional(propagation=Propagation.REQUIRED)
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private ProductVO ProductVO;
	
	@Autowired
	private Product_imageVO Product_imageVO;
	
	@Autowired
	private Product_t_imageVO Product_t_imageVO;
	
	
	@Override
	public List<List> product() throws Exception {
		
		List<List> product = new ArrayList<List>();
		List<ProductVO> productList = productDAO.s_productList();
		
		List<Product_imageVO> productImageList= new ArrayList<Product_imageVO>();
		List<Product_t_imageVO> productTImageList= new ArrayList<Product_t_imageVO>();
		
		for(int i=0; i<productList.size(); i++) {
			Product_imageVO p_img =(Product_imageVO) productDAO.s_productImageById(productList.get(i));
			productImageList.add(p_img);
		}
		
		for(int i=0; i<productList.size(); i++) {
			Product_t_imageVO p_t_img =(Product_t_imageVO) productDAO.s_product_t_ImageById(productList.get(i));
			productTImageList.add(p_t_img);
		}
		
		product.add(productList);
		product.add(productImageList);
		product.add(productTImageList);
		
		
		return product;
	}

	@Override
	public List<List> recProduct() throws Exception {

		List<List> recProduct = new ArrayList<List>();
		List<ProductVO> recProductList = productDAO.s_recommend_product();
		
		List<Product_imageVO> recProductImageList= new ArrayList<Product_imageVO>();
		List<Product_t_imageVO> recProductTImageList= new ArrayList<Product_t_imageVO>();
		
		for(int i=0; i<recProductList.size(); i++) {
			Product_imageVO p_img =(Product_imageVO) productDAO.s_productImageById(recProductList.get(i));
			recProductImageList.add(p_img);
		}
		
		for(int i=0; i<recProductList.size(); i++) {
			Product_t_imageVO p_t_img =(Product_t_imageVO) productDAO.s_product_t_ImageById(recProductList.get(i));
			recProductTImageList.add(p_t_img);
		}
		
		recProduct.add(recProductList);
		recProduct.add(recProductImageList);
		recProduct.add(recProductTImageList);
		
		
		return recProduct;
	}

	@Override
	public List<List> productCate(String p_category) throws Exception {
		
		ProductVO.setP_category(p_category);
		List<List>productCate = new ArrayList<List>();
		
		List<ProductVO> productCtx = productDAO.s_productByCate(ProductVO);
		List<Product_imageVO> productImageList= new ArrayList<Product_imageVO>();
		List<Product_t_imageVO> productTImageList= new ArrayList<Product_t_imageVO>();
		
		for(int i=0; i<productCtx.size(); i++) {
			Product_imageVO p_img =(Product_imageVO) productDAO.s_productImageById(productCtx.get(i));
			productImageList.add(p_img);
		}
		
		for(int i=0; i<productCtx.size(); i++) {
			Product_t_imageVO p_t_img =(Product_t_imageVO) productDAO.s_product_t_ImageById(productCtx.get(i));
			productTImageList.add(p_t_img);
		}
		
		productCate.add(productCtx);
		productCate.add(productImageList);
		productCate.add(productTImageList);
				
		return productCate;
	}

	@Override
	public List<Object> productDT(String p_id) throws Exception {
		ProductVO.setP_id(p_id);
		
		List<Object>productDetail = new ArrayList<Object>();
		
		ProductVO product = productDAO.s_productById(ProductVO);
		List<OptionVO> options = productDAO.s_optionById(ProductVO);
		Product_imageVO productImage= productDAO.s_productImageById(ProductVO);
		Product_t_imageVO productTImage= productDAO.s_product_t_ImageById(ProductVO);
		
		productDetail.add(product);
		productDetail.add(options);
		productDetail.add(productImage);
		productDetail.add(productTImage);
		
		return productDetail;
	}
	
	@Override
	public List<OptionVO> productOptions(String p_id) throws Exception {
		ProductVO.setP_id(p_id);
		List<OptionVO> options = productDAO.s_optionById(ProductVO);
		return options;
	}

	@Override
	public ProductVO s_productById(ProductVO ProductVO) throws DataAccessException {
		ProductVO product = productDAO.s_productById(ProductVO);
		return product;
	}
	
	
}

