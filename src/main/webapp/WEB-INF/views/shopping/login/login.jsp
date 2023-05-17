<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />

<div class="login_wrap wrap">
    <div class="container">
        <div class="box">
            <div class="title">LOGIN</div>
            <div class="box_wrap">
                <div class="box_top">
                    <form class="form" action="${contextPath}/login/login.do" method="post">
                        <input type="text" name="user_id" class="user_id" placeholder="아이디">
                        <input type="text" name="user_pw" class="user_pw" placeholder="비밀번호">
                        <button type="submit" class="login_btn btn1 btn input"><span>LOGIN</span></button>
                    </form>
                </div>  
                <div class="box_btm">
                    <div class="box_btm_left">
                        <a href="${contextPath}/login/idFind" class="idFind">아이디 찾기</a>
                        <span>|</span>
                        <a href="${contextPath}/login/pwReset" class="pwReset">비밀번호 찾기</a>
                    </div>
                    <div class="box_btm_right">
                        <a href="${contextPath}/member/memberJoin" class="pwFind">회원가입</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

