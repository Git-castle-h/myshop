package com.myshop.ex01.shopping.member.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.myshop.ex01.shopping.member.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;	
	
	@Override
	public List<MemberVO> memberList(MemberVO memberVO) throws DataAccessException {
		List<MemberVO> memberList=(ArrayList)sqlSession.selectList("mapper.member.memberList");
	   return memberList;
	}

	@Override
	public List<MemberVO> searchMember(Map searchMap) throws DataAccessException {
		List<MemberVO> memberList=(ArrayList)sqlSession.selectList("mapper.member.searchMember",searchMap);
		return memberList;
	}

	@Override
	public void addMember(MemberVO memberVO) throws DataAccessException {
		sqlSession.insert("mapper.member.addMember",memberVO);
	}

	@Override
	public void modMember(MemberVO memberVO) throws DataAccessException {
		sqlSession.update("mapper.member.modMember",memberVO);
		
	}

	@Override
	public String isOverlapped(String id) throws DataAccessException {
		String result =  sqlSession.selectOne("mapper.member.isOverlapped",id);
		return result;
	}

	@Override
	public void deleteMember(MemberVO memberVO) throws DataAccessException {
		sqlSession.delete("mapper.member.deleteMember",memberVO);
		
	}
}
