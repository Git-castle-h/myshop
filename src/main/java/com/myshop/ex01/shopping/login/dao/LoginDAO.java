package com.myshop.ex01.shopping.login.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myshop.ex01.shopping.member.vo.MemberVO;

public interface LoginDAO {
	public MemberVO login(Map loginMap) throws DataAccessException;

	
}
