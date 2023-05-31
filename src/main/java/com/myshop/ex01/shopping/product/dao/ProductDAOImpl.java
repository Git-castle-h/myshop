package com.myshop.ex01.shopping.product.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.shopping.product.vo.OptionVO;
import com.myshop.ex01.shopping.product.vo.ProductVO;
import com.myshop.ex01.shopping.product.vo.Product_imageVO;
import com.myshop.ex01.shopping.product.vo.Product_t_imageVO;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{
	

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<ProductVO> s_productList() throws DataAccessException {
		List<ProductVO> productList=(ArrayList)sqlSession.selectList("mapper.product.s_productList");
		   return productList;
	}

	@Override
	public ProductVO s_productById(ProductVO ProductVO) throws DataAccessException {
		ProductVO product= sqlSession.selectOne("mapper.product.s_productById",ProductVO);
		   return product;
	}
	
	@Override
	public List<ProductVO> s_productByCate(ProductVO ProductVO) throws DataAccessException {
		List<ProductVO> productList=(ArrayList)sqlSession.selectList("mapper.product.s_productByCate",ProductVO);
		   return productList;
	}

	@Override
	public List<ProductVO> s_recommend_product() throws DataAccessException {
		List<ProductVO> rec_productList=(ArrayList)sqlSession.selectList("mapper.product.s_recommend_product");
		   return rec_productList;
	}

	@Override
	public Product_imageVO s_productImageById(ProductVO ProductVO) throws DataAccessException {
		Product_imageVO productImage=(Product_imageVO) sqlSession.selectOne("mapper.product.s_productImageById",ProductVO);
		   return productImage;
	}

	@Override
	public Product_t_imageVO s_product_t_ImageById(ProductVO ProductVO) throws DataAccessException {
		Product_t_imageVO product_t_Image=(Product_t_imageVO) sqlSession.selectOne("mapper.product.s_product_t_ImageById",ProductVO);
		   return product_t_Image;
	}

	@Override
	public void addProduct(ProductVO ProductVO) throws DataAccessException {
		sqlSession.insert("mapper.product.addProduct",ProductVO);
		
	}

	@Override
	public void updateProduct(ProductVO ProductVO) throws DataAccessException {
		sqlSession.update("mapper.product.updateProduct",ProductVO);
		
	}

	@Override
	public void deleteProduct(ProductVO ProductVO) throws DataAccessException {
		sqlSession.delete("mapper.product.deleteProduct",ProductVO);
		
	}

	@Override
	public void addProductImage(Product_imageVO Product_imageVO) throws DataAccessException {
		sqlSession.insert("mapper.product.addProductImage",Product_imageVO);
		
	}

	@Override
	public void updateProductImage(Product_imageVO Product_imageVO) throws DataAccessException {
		sqlSession.update("mapper.product.updateProductImage",Product_imageVO);
		
	}

	@Override
	public void delProductImage(Product_imageVO Product_imageVO) throws DataAccessException {
		sqlSession.delete("mapper.product.delProductImage",Product_imageVO);
		
	}

	@Override
	public void addProduct_t_Image(Product_t_imageVO Product_t_imageVO) throws DataAccessException {
		sqlSession.insert("mapper.product.addProduct_t_Image",Product_t_imageVO);
	}

	@Override
	public void updateProduct_t_Image(Product_t_imageVO Product_t_imageVO) throws DataAccessException {
		sqlSession.update("mapper.product.updateProduct_t_Image",Product_t_imageVO);
		
	}

	@Override
	public void delProduct_t_Image(Product_t_imageVO Product_t_imageVO) throws DataAccessException {
		sqlSession.delete("mapper.product.delProduct_t_Image",Product_t_imageVO);
		
	}

	@Override
	public List<OptionVO> s_optionById(ProductVO ProductVO) throws DataAccessException {
		List<OptionVO> optionList=(ArrayList)sqlSession.selectList("mapper.product.s_optionById",ProductVO);
		   return optionList;
	}

	@Override
	public void addOption(OptionVO OptionVO) throws DataAccessException {
		sqlSession.insert("mapper.product.updateOption",OptionVO);
		
	}

	@Override
	public void updateOption(OptionVO OptionVO) throws DataAccessException {
		sqlSession.update("mapper.product.updateOption",OptionVO);
		
	}

	@Override
	public void delOption(ProductVO ProductVO) throws DataAccessException {
		sqlSession.delete("mapper.product.delOption",ProductVO);
		
	}	

	
}
