package com.myshop.ex01.shopping.help.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.ex01.shopping.help.dao.HelpDAO;
import com.myshop.ex01.shopping.help.vo.HelpVO;
import com.myshop.ex01.shopping.help.vo.Help_imageVO;

@Service("HelpService")
public class HelpServiceImpl implements HelpService {
	
	@Autowired
	HelpVO HelpVO;
	
	@Autowired
	HelpDAO helpDAO;
	
	@Autowired
	Help_imageVO Help_imageVO;
	
	@Override
	public List<Object> listHelp() throws Exception {
		List<Object>helpList = new ArrayList<Object>(); 
				
		List<HelpVO> help =(ArrayList)helpDAO.s_helpList();
		Map<String,Help_imageVO> helpImageMap = new HashMap<String,Help_imageVO>();
		
		for(int i = 0; i<help.size(); i++) {
			String h_number = help.get(i).getH_number();
			Help_imageVO.setH_number(h_number);
			Help_imageVO help_image = helpDAO.s_helpImage(Help_imageVO);
			helpImageMap.put(h_number, help_image);		
			
			}
		
		helpList.add(help);
		helpList.add(helpImageMap);
		
		return helpList;
	}
	
	@Override
	public List<Object> s_helpListById(HelpVO HelpVO) throws Exception {
		
		List<Object>helpList = new ArrayList<Object>();
		List<HelpVO> help =(ArrayList)helpDAO.s_helpListById(HelpVO);
		Map<String,Help_imageVO> helpImageMap = new HashMap<String,Help_imageVO>();
		
		for(int i = 0; i<help.size(); i++) {
			String m_id = help.get(i).getM_id();
			String h_number = help.get(i).getH_number();
			Help_imageVO.setM_id(m_id);
			Help_imageVO.setH_number(h_number);
			Help_imageVO help_image = helpDAO.s_helpImage(Help_imageVO);
			helpImageMap.put(m_id, help_image);		
			
			}
		
		helpList.add(help);
		helpList.add(helpImageMap);
		
		return helpList;
	}
	
	@Override
	public HelpVO s_helpById(HelpVO HelpVO) throws Exception {
		HelpVO help = helpDAO.s_helpById(HelpVO);
		return help;
	}

	@Override
	public List<Object> detailHelp(HelpVO HelpVO) throws Exception {
		
		List<Object>helpDetail = new ArrayList<Object>();
		
		HelpVO help =helpDAO.s_helpById(HelpVO);
		
		String m_id = help.getM_id();
		String h_number = help.getH_number();
		
		Help_imageVO.setM_id(m_id);
		Help_imageVO.setH_number(h_number);
		Help_imageVO helpImage = helpDAO.s_helpImage(Help_imageVO);
		
		helpDetail.add(help);
		helpDetail.add(helpImage);

		return helpDetail;
	}

	@Override
	public void addHelp(HelpVO HelpVO) throws Exception {
		helpDAO.addHelp(HelpVO);
		
	}

	@Override
	public void delHelp(HelpVO HelpVO) throws Exception {
		helpDAO.delHelp(HelpVO);
		
	}

	@Override
	public void updateHelp(HelpVO HelpVO) throws Exception {
		helpDAO.updateHelp(HelpVO);
		
	}




	

}
