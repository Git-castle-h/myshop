package com.myshop.ex01.shopping.mypage.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("mypageController")
@RequestMapping("/mypage")
public class MypageControllerImpl implements MypageController {
	
    @RequestMapping("/mypageConfirm")
    public ModelAndView mypageConfirm(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    
    @RequestMapping("/mypageConfirm.do")
    public ModelAndView mypageConfirmDo(Map<String,String>map, HttpServletRequest request, HttpServletResponse response) throws Exception{
    
    	HttpSession session = request.getSession();
    	
    	String m_id = (String)session.getAttribute("m_id");
    	
    	PrintWriter pw = response.getWriter();
    	
    	//�ӽ� ���̵�
    	m_id  = "sampleId";
    	
    	String m_pw = map.get("user_pw");
    	
    	//�ӽ� ��й�ȣ Ȯ��
    	if(m_pw == "1234") {
    		pw.write("��ġ");
    	}else {
    		pw.write("����ġ");
    	}
    	
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    	
    }
    
    @RequestMapping("/mypageModInfo")
    public ModelAndView mypageModInfo(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String viewName = (String)request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
}
