package com.myshop.ex01.shopping.member.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myshop.ex01.shopping.member.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> memberList(MemberVO memberVO) throws DataAccessException;
	public List<MemberVO>  searchMember(Map searchMap) throws DataAccessException;
	public void addMember(MemberVO memberVO) throws DataAccessException;
	public void modMember(MemberVO memberVO) throws DataAccessException;
	public void deleteMember(MemberVO memberVO) throws DataAccessException;
	public String isOverlapped(String id) throws DataAccessException;
}
