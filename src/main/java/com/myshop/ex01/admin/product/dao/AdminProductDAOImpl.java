package com.myshop.ex01.admin.product.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.admin.product.vo.Admin_optionVO;
import com.myshop.ex01.admin.product.vo.Admin_productVO;
import com.myshop.ex01.admin.product.vo.Admin_product_imageVO;
import com.myshop.ex01.admin.product.vo.Admin_product_t_imageVO;

@Repository("Admin_productDAO")
public class AdminProductDAOImpl implements AdminProductDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Admin_productVO> s_productList() throws DataAccessException {
		List<Admin_productVO> productList=(ArrayList)sqlSession.selectList("mapper.admin_product.s_productList");
		   return productList;
	}
	
	@Override
	public int get_productNum() throws DataAccessException {
		int productNum =(Integer)sqlSession.selectOne("mapper.admin_product.get_productNum");
		   return productNum;
	}

	@Override
	public Admin_productVO s_productById(String p_id) throws DataAccessException {
		Admin_productVO product= sqlSession.selectOne("mapper.admin_product.s_productById",p_id);
		   return product;
	}
	
	@Override
	public List<Admin_productVO> s_productByCate(Admin_productVO ProductVO) throws DataAccessException {
		List<Admin_productVO> productList=(ArrayList)sqlSession.selectList("mapper.admin_product.s_productByCate",ProductVO);
		   return productList;
	}

	@Override
	public List<Admin_productVO> s_recommend_product() throws DataAccessException {
		List<Admin_productVO> rec_productList=(ArrayList)sqlSession.selectList("mapper.admin_product.s_recommend_product");
		   return rec_productList;
	}

	@Override
	public Admin_product_imageVO s_productImageById(Admin_productVO ProductVO) throws DataAccessException {
		Admin_product_imageVO productImage=(Admin_product_imageVO) sqlSession.selectOne("mapper.admin_product.s_productImageById",ProductVO);
		   return productImage;
	}

	@Override
	public Admin_product_t_imageVO s_product_t_ImageById(Admin_productVO ProductVO) throws DataAccessException {
		Admin_product_t_imageVO product_t_Image=(Admin_product_t_imageVO) sqlSession.selectOne("mapper.admin_product.s_product_t_ImageById",ProductVO);
		   return product_t_Image;
	}

	@Override
	public void addProduct(Admin_productVO ProductVO) throws DataAccessException {
		sqlSession.insert("mapper.admin_product.addProduct",ProductVO);
		
	}

	@Override
	public void updateProduct(Admin_productVO ProductVO) throws DataAccessException {
		sqlSession.update("mapper.admin_product.updateProduct",ProductVO);
		
	}

	@Override
	public void deleteProduct(Admin_productVO ProductVO) throws DataAccessException {
		sqlSession.delete("mapper.admin_product.deleteProduct",ProductVO);
		
	}

	@Override
	public void addProductImage(Admin_product_imageVO Product_imageVO) throws DataAccessException {
		sqlSession.insert("mapper.admin_product.addProductImage",Product_imageVO);
		
	}

	@Override
	public void updateProductImage(Admin_product_imageVO Product_imageVO) throws DataAccessException {
		sqlSession.update("mapper.admin_product.updateProductImage",Product_imageVO);
		
	}

	@Override
	public void delProductImage(Admin_product_imageVO Product_imageVO) throws DataAccessException {
		sqlSession.delete("mapper.admin_product.delProductImage",Product_imageVO);
		
	}

	@Override
	public void addProduct_t_Image(Admin_product_t_imageVO Product_t_imageVO) throws DataAccessException {
		sqlSession.insert("mapper.admin_product.addProduct_t_Image",Product_t_imageVO);
	}

	@Override
	public void updateProduct_t_Image(Admin_product_t_imageVO Product_t_imageVO) throws DataAccessException {
		sqlSession.update("mapper.admin_product.updateProduct_t_Image",Product_t_imageVO);
		
	}

	@Override
	public void delProduct_t_Image(Admin_product_t_imageVO Product_t_imageVO) throws DataAccessException {
		sqlSession.delete("mapper.admin_product.delProduct_t_Image",Product_t_imageVO);
		
	}

	@Override
	public List<Admin_optionVO> s_optionById(Admin_productVO ProductVO) throws DataAccessException {
		List<Admin_optionVO> optionList=(ArrayList)sqlSession.selectList("mapper.admin_product.s_optionById",ProductVO);
		   return optionList;
	}

	@Override
	public void addOption(Admin_optionVO OptionVO) throws DataAccessException {
		sqlSession.insert("mapper.admin_product.addOption",OptionVO);
		
	}

	@Override
	public void updateOption(Admin_optionVO OptionVO) throws DataAccessException {
		sqlSession.update("mapper.admin_product.updateOption",OptionVO);
		
	}

	@Override
	public void delOption(Admin_optionVO OptionVO) throws DataAccessException {
		sqlSession.delete("mapper.admin_product.delOption",OptionVO);	
	}
	
}
