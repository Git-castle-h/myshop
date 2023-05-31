package com.myshop.ex01.shopping.main.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myshop.ex01.shopping.main.vo.BannerVO;
import com.myshop.ex01.shopping.main.vo.Banner_imageVO;

public interface MainDAO {
	
	public List<BannerVO> s_bannerList() throws DataAccessException;
	public Banner_imageVO s_bannerImage(BannerVO BannerVO) throws DataAccessException;
	public void addBanner(BannerVO BannerVO) throws DataAccessException;
	public void updateBanner(BannerVO BannerVO) throws DataAccessException;
	public void addBannerImage(Banner_imageVO Banner_imageVO) throws DataAccessException;
	public void updateBannerImage(Banner_imageVO Banner_imageVO) throws DataAccessException;
	public void deleteBanner(BannerVO BannerVO) throws DataAccessException;
	public void deleteBannerImage(Banner_imageVO Banner_imageVO) throws DataAccessException;
}
