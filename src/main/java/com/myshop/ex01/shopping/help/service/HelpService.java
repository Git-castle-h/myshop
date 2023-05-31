package com.myshop.ex01.shopping.help.service;

import java.util.List;

import com.myshop.ex01.shopping.help.vo.HelpVO;

public interface HelpService {
	
	public List<Object>listHelp() throws Exception;
	public List<Object> s_helpListById(HelpVO HelpVO) throws Exception;
	public HelpVO s_helpById(HelpVO HelpVO) throws Exception;
	public List<Object> detailHelp(HelpVO HelpVO) throws Exception;
	public void addHelp(HelpVO HelpVO) throws Exception;
	public void delHelp(HelpVO HelpVO) throws Exception;
	public void updateHelp(HelpVO HelpVO) throws Exception;
}
