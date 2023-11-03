package com.myshop.ex01.admin.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.ex01.admin.main.dao.AdminMainDAO;
import com.myshop.ex01.admin.main.vo.Admin_bannerVO;
import com.myshop.ex01.admin.main.vo.Admin_banner_imageVO;

@Service("AdminMainService")
public class AdminMainServiceImpl  implements AdminMainService{

	@Autowired
	private AdminMainDAO MainDAO;
	
	
	@Override
	public List<Admin_bannerVO> adminBanner() throws Exception {
			List<Admin_bannerVO> bannerList = MainDAO.s_bannerList();
		return bannerList;
	}


	@Override
	public void addBanner(Admin_bannerVO admin_bannerVO) throws Exception {
		MainDAO.addBanner(admin_bannerVO);
		
	}


	@Override
	public void modBanner(Admin_bannerVO admin_bannerVO) throws Exception {
		MainDAO.updateBanner(admin_bannerVO);
		
	}


	@Override
	public void modBannerImage(Admin_banner_imageVO admin_banner_imageVO) throws Exception {
		MainDAO.updateBannerImage(admin_banner_imageVO);
		
	}


	@Override
	public void delBanner(Admin_bannerVO admin_bannerVO) throws Exception {
		String banner_name = admin_bannerVO.getBanner_name();
		MainDAO.deleteBanner(banner_name);
		
	}


	@Override
	public void delBannerImage(Admin_banner_imageVO admin_banner_imageVO) throws Exception {
		String banner_name = admin_banner_imageVO.getBanner_image_name();
		MainDAO.deleteBannerImage(banner_name);
	}
	






	
	
}
