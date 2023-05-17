package com.myshop.ex01.shopping.login.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("loginRestController")
@RequestMapping("/login")
public class LoginControllerRestImpl implements LoginControllerRest {

	@ResponseBody
    @RequestMapping(value ="/idFind_email_verify",method= {RequestMethod.POST})
    public Map<String, String> idFind_email_verify(
    		@RequestParam("code")String code,
    		HttpServletRequest request, HttpServletResponse response) throws Exception{
    		
    		String _code = "0000";
    		String id = "sample_id";
    		
    		Map<String,String> map = new HashMap<String, String>();
    		
    		if(_code.equals(code)) {
    			map.put("valid", "true");
    			map.put("id", id);
    			System.out.println("인증번호 일치 "+code+"="+_code);
    		}else {
    			map.put("valid", "false");
    			System.out.println("인증번호 불일치 "+code+"x"+_code);
    		}
    		
    		System.out.println("인증번호 : "+code);
    		
    		return map;
    }
    
    
    @ResponseBody
    @RequestMapping(value ="/idFind_phone_verify",method= {RequestMethod.POST})
    public Map<String, String> idFind_phone_verify(
    		@RequestParam("code")String code,
    		HttpServletRequest request, HttpServletResponse response) throws Exception{
    		
    		String _code = "0000";
    		String id = "sample_id";
    		
    		Map<String,String> map = new HashMap<String, String>();
    		
    		if(_code.equals(code)) {
    			map.put("valid", "true");
    			map.put("id", id);
    			System.out.println("인증번호 일치 "+code+"="+_code);
    		}else {
    			map.put("valid", "false");
    			System.out.println("인증번호 불일치 "+code+"x"+_code);
    		}
    		
    		System.out.println("인증번호 : "+code);
    		
    		return map;
    }
	
}
