package com.myshop.ex01.admin.main.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("AdminMainService")
@Transactional(propagation=Propagation.REQUIRED)
public class AdminMainServiceImpl {
	
	
}
