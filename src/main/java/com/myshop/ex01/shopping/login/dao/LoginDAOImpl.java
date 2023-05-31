package com.myshop.ex01.shopping.login.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myshop.ex01.shopping.member.vo.MemberVO;

@Repository("LoginDAO")
public class LoginDAOImpl implements LoginDAO {
	
	@Autowired
	private SqlSession sqlSession;	

	@Override
	public MemberVO login(Map loginMap) throws DataAccessException {
		MemberVO member=(MemberVO)sqlSession.selectOne("mapper.member.login",loginMap);
		return member;
	}


}
