package com.myshop.ex01.admin.main.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.admin.main.vo.Admin_bannerVO;
import com.myshop.ex01.admin.main.vo.Admin_banner_imageVO;

public interface AdminMainDAO {
	
	public List<Admin_bannerVO> s_bannerList()  throws DataAccessException;
	public Admin_banner_imageVO s_bannerImage (String banner_name) throws DataAccessException;
	public void addBanner (Admin_bannerVO admin_bannerVO) throws DataAccessException;
	public void updateBanner (Admin_bannerVO admin_bannerVO) throws DataAccessException;
	public void addBannerImage (Admin_banner_imageVO admin_banner_imageVO) throws DataAccessException;
	public void updateBannerImage (Admin_banner_imageVO admin_banner_imageVO) throws DataAccessException;
	public void deleteBanner (String banner_name) throws DataAccessException;
	public void deleteBannerImage (String banner_name) throws DataAccessException;
}
