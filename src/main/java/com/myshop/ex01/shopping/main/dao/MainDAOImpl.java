package com.myshop.ex01.shopping.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.shopping.main.vo.BannerVO;
import com.myshop.ex01.shopping.main.vo.Banner_imageVO;

@Repository("MainDAO")
public class MainDAOImpl implements MainDAO{

	@Autowired
	private SqlSession sqlSession;	
	
	@Override
	public List<BannerVO> s_bannerList() throws DataAccessException {
		List<BannerVO> bannerList=(ArrayList)sqlSession.selectList("mapper.banner.s_bannerList");
		   return bannerList;
	}

	@Override
	public Banner_imageVO s_bannerImage(BannerVO BannerVO) throws DataAccessException {
		Banner_imageVO bannerImage=(Banner_imageVO) sqlSession.selectOne("mapper.banner.s_bannerImage",BannerVO);
		   return bannerImage;
	}

	@Override
	public void addBanner(BannerVO BannerVO) throws DataAccessException {
		sqlSession.insert("mapper.banner.addBanner",BannerVO);

	}

	@Override
	public void updateBanner(BannerVO BannerVO) throws DataAccessException {
		sqlSession.update("mapper.banner.updateBanner",BannerVO);
		
	}

	@Override
	public void addBannerImage(Banner_imageVO Banner_imageVO) throws DataAccessException {
		sqlSession.insert("mapper.banner.addBannerImage",Banner_imageVO);
		
	}

	@Override
	public void updateBannerImage(Banner_imageVO Banner_imageVO) throws DataAccessException {
		sqlSession.update("mapper.banner.updateBannerImage",Banner_imageVO);
		
	}

	@Override
	public void deleteBanner(BannerVO BannerVO) throws DataAccessException {
		sqlSession.delete("mapper.banner.deleteBanner",BannerVO);
		
	}

	@Override
	public void deleteBannerImage(Banner_imageVO Banner_imageVO) throws DataAccessException {
		sqlSession.delete("mapper.banner.deleteBannerImage",Banner_imageVO);
		
	}
	
}
