package com.myshop.ex01.admin.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.admin.main.vo.Admin_bannerVO;
import com.myshop.ex01.admin.main.vo.Admin_banner_imageVO;

@Repository("AdminMainDAO")
public class AdminMainDAOImpl implements AdminMainDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Admin_bannerVO> s_bannerList() throws DataAccessException {
		List<Admin_bannerVO> bannerList = (ArrayList)sqlSession.selectList("mapper.banner.s_bannerList");
		return bannerList;
	}

	@Override
	public Admin_banner_imageVO s_bannerImage(String banner_name) throws DataAccessException {
		Admin_banner_imageVO admin_banner_imageVO = (Admin_banner_imageVO)sqlSession.selectOne("mapper.banner.s_bannerImage",banner_name);
		return admin_banner_imageVO;
	}

	@Override
	public void addBanner(Admin_bannerVO admin_bannerVO) throws DataAccessException {
		sqlSession.insert("mapper.banner.addBanner",admin_bannerVO);
		
	}

	@Override
	public void updateBanner(Admin_bannerVO admin_bannerVO) throws DataAccessException {
		sqlSession.update("mapper.banner.updateBanner",admin_bannerVO);
	}

	@Override
	public void addBannerImage(Admin_banner_imageVO admin_banner_imageVO) throws DataAccessException {
		sqlSession.insert("mapper.banner.addBannerImage",admin_banner_imageVO);
		
	}

	@Override
	public void updateBannerImage(Admin_banner_imageVO admin_banner_imageVO) throws DataAccessException {
		sqlSession.update("mapper.banner.updateBannerImage",admin_banner_imageVO);
		
	}

	@Override
	public void deleteBanner(String banner_name) throws DataAccessException {
		sqlSession.delete("mapper.banner.deleteBanner",banner_name);
		
	}

	@Override
	public void deleteBannerImage(String banner_name) throws DataAccessException {
		sqlSession.delete("mapper.banner.deleteBannerImage",banner_name);
		
	}	
	
}
