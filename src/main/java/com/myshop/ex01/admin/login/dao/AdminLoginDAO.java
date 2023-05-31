package com.myshop.ex01.admin.login.dao;

import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myshop.ex01.admin.member.vo.Admin_memberVO;

public interface AdminLoginDAO {
	
	public Admin_memberVO adminLogin(Map loginMap) throws DataAccessException;
	public void addAdmin(Admin_memberVO Admin_memberVO) throws DataAccessException;
	public void modAdmin(Admin_memberVO Admin_memberVO) throws DataAccessException;
	public void delAdmin(Admin_memberVO Admin_memberVO) throws DataAccessException;

}
