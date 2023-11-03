package com.myshop.ex01.admin.main.service;

import java.util.List;

import com.myshop.ex01.admin.main.vo.Admin_bannerVO;
import com.myshop.ex01.admin.main.vo.Admin_banner_imageVO;


public interface AdminMainService {
	
	public List<Admin_bannerVO> adminBanner() throws Exception;
	public void addBanner(Admin_bannerVO admin_bannerVO)throws Exception;
	
	public void modBanner(Admin_bannerVO admin_bannerVO) throws Exception;
	public void modBannerImage(Admin_banner_imageVO admin_banner_imageVO) throws Exception;

	public void delBanner(Admin_bannerVO admin_bannerVO) throws Exception;
	public void delBannerImage(Admin_banner_imageVO admin_banner_imageVO) throws Exception;
	
}

