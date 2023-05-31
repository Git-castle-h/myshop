package com.myshop.ex01.admin.login.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.myshop.ex01.admin.member.vo.Admin_memberVO;

public class AdminLoginDAOImpl implements AdminLoginDAO{
	

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Admin_memberVO adminLogin(Map loginMap) throws DataAccessException {
		Admin_memberVO admin_member=(Admin_memberVO)sqlSession.selectOne("mapper.admin_member.adminLogin",loginMap);
		   return admin_member;
	}

	@Override
	public void addAdmin(Admin_memberVO Admin_memberVO) throws DataAccessException {
		sqlSession.insert("mapper.admin_member.addAdmin",Admin_memberVO);
		
	}

	@Override
	public void modAdmin(Admin_memberVO Admin_memberVO) throws DataAccessException {
		sqlSession.update("mapper.admin_member.modAdmin",Admin_memberVO);
		
	}

	@Override
	public void delAdmin(Admin_memberVO Admin_memberVO) throws DataAccessException {
		sqlSession.delete("mapper.admin_member.delAdmin",Admin_memberVO);
		
	}
}
