package com.myshop.ex01.shopping.main.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myshop.ex01.shopping.main.dao.MainDAO;
import com.myshop.ex01.shopping.main.vo.BannerVO;
import com.myshop.ex01.shopping.main.vo.Banner_imageVO;

@Service("MainService")
@Transactional(propagation=Propagation.REQUIRED)
public class MainServiceImpl implements MainService {
	
	@Autowired
	private MainDAO MainDAO;
	
	@Autowired
	Banner_imageVO banner_imageVO;
	
	@Override
	public List<List> banner() throws Exception {
		
		List<List> banner = new ArrayList<List>();
		List<BannerVO> bannerList = MainDAO.s_bannerList();	
		List<Banner_imageVO> bannerImg= new ArrayList<Banner_imageVO>();
		
		for(int i=0; i<bannerList.size(); i++) {
			Banner_imageVO b_img =(Banner_imageVO) MainDAO.s_bannerImage(bannerList.get(i));
			bannerImg.add(b_img);
		}
		
		banner.add(bannerList); 
		banner.add(bannerImg);
		
		return banner;
	}
	
}
