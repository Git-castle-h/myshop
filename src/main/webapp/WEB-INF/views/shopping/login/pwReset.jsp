<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<div class="pwReset_wrap wrap">
    <div class="container">
        <div class="box">
            <div class="title">PASSWORD RESET</div>
            <div class="box_wrap">
                <div class="box_top">
                    <div class="form" action="/login/pwReset.do" method="post">
                        <input type="text" name="user_id" class="user_id" placeholder="아이디">
                        <input type="text" name="user_name" class="user_name" placeholder="이름">
						<input type="email" name="user_email" class="user_email" placeholder="OOO@email.com">
                        <button type="button" class="pwReset_btn btn1 btn input"><span><i class="fa-solid fa-envelope"></i>&nbsp;인증메일 발송</span></button>
                    </div>
                </div>  
            </div>
        </div>
    </div>
    <script src="${contextPath}/resources/js/login/pwReset.js"></script>
</div>