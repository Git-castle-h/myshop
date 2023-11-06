package com.myshop.ex01.shopping.help.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.shopping.cart.vo.CartVO;
import com.myshop.ex01.shopping.help.vo.HelpVO;
import com.myshop.ex01.shopping.help.vo.Help_imageVO;

@Repository("HelpDAO")
public class HelpDAOImpl implements HelpDAO{

	@Autowired
	private SqlSession sqlSession;	
	
	@Override
	public List<HelpVO> s_helpList() throws DataAccessException {
		List<HelpVO> helpList=(ArrayList)sqlSession.selectList("mapper.help.s_helpList");
		   return helpList;
	}
	
	@Override
	public List<HelpVO> s_helpListById(HelpVO HelpVO) throws DataAccessException {
		List<HelpVO> helpList= sqlSession.selectList("mapper.help.s_helpListById",HelpVO); 
		   return helpList;
	}
	

	@Override
	public HelpVO s_helpByNumber(HelpVO HelpVO) throws DataAccessException {
		HelpVO help= sqlSession.selectOne("mapper.help.s_helpByNumber",HelpVO); 
		   return help;
	}

	@Override
	public Help_imageVO s_helpImage(Help_imageVO Help_imageVO) throws DataAccessException {
		Help_imageVO helpImage=sqlSession.selectOne("mapper.help.s_helpImage",Help_imageVO);
		   return helpImage;
	}

	@Override
	public void addHelp(HelpVO HelpVO) throws DataAccessException {
		String h_number = sqlSession.selectOne("mapper.help.countHelp",HelpVO);
		String _h_number = String.valueOf((Integer.parseInt(h_number)+1));
		HelpVO.setH_number(_h_number);
		sqlSession.insert("mapper.help.addHelp",HelpVO);
		
	}

	@Override
	public void updateHelp(HelpVO HelpVO) throws DataAccessException {
		sqlSession.update("mapper.help.updateHelp",HelpVO);
		
	}

	@Override
	public void delHelp(HelpVO HelpVO) throws DataAccessException {
		sqlSession.delete("mapper.help.deleteHelp",HelpVO);
		
	}

	@Override
	public void addhelpImage(Help_imageVO Help_imageVO) throws DataAccessException {
		sqlSession.insert("mapper.help.addhelpImage",Help_imageVO);
		
	}

	@Override
	public void updatehelpImage(Help_imageVO Help_imageVO) throws DataAccessException {
		sqlSession.update("mapper.help.updatehelpImage",Help_imageVO);
		
	}

	@Override
	public void delHelpImage(Help_imageVO Help_imageVO) throws DataAccessException {
		sqlSession.delete("mapper.help.deleteHelpImage",Help_imageVO);
		
	}
	
	
	
}
