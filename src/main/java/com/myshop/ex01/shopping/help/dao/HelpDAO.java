package com.myshop.ex01.shopping.help.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myshop.ex01.shopping.help.vo.HelpVO;
import com.myshop.ex01.shopping.help.vo.Help_imageVO;

public interface HelpDAO {
	
	public List<HelpVO> s_helpList() throws DataAccessException;
	public List<HelpVO> s_helpListById(HelpVO HelpVO) throws DataAccessException;
	public HelpVO s_helpByNumber(HelpVO HelpVO) throws DataAccessException;
	public Help_imageVO s_helpImage(Help_imageVO Help_imageVO) throws DataAccessException;
	public void addHelp(HelpVO HelpVO) throws DataAccessException;
	public void updateHelp(HelpVO HelpVO) throws DataAccessException;
	public void delHelp(HelpVO HelpVO) throws DataAccessException;
	public void addhelpImage(Help_imageVO Help_imageVO) throws DataAccessException;
	public void updatehelpImage(Help_imageVO Help_imageVO) throws DataAccessException;
	public void delHelpImage(Help_imageVO Help_imageVO) throws DataAccessException;

}
