<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />

<div class="admin_login_wrap wrap">
    <div class="container">
        <div class="box">
            <div class="title">ADMIN LOGIN</div>
            <div class="box_wrap">
                <div class="box_top">
                    <form class="form" action="/login/login.do" method="post">
                        <input type="text" name="user_id" class="user_id" placeholder="아이디">
                        <input type="text" name="user_pw" class="user_pw" placeholder="비밀번호">
                        <button type="submit" class="login_btn btn1 btn input"><span>LOGIN</span></button>
                    </form>
                </div>  
            </div>
        </div>
    </div>
</div>

