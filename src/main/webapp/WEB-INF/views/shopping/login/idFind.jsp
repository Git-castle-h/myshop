<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="idFind_wrap wrap">
    <div class="container">
        <div class="box">
            <div class="title">IDENTIFICATION</div>
            <div class="box_wrap">
                <div class="box_top">
						<select class="selectFind select">
							<option value="email">이메일로 찾기</option>
							<option value="phone">휴대전화 번호로 찾기</option>
						</select>
					<form class="form emailFind" action="/login/idFind.do" method="post">
							<input type="text" name="user_name" id="user_name" placeholder="이름">
							<input type="email" name="user_email" id="user_email" placeholder="OOO@email.com">
							<button type="submit" class="idFind_btn btn btn1 input"><span><i class="fa-solid fa-check"></i>&nbsp;아이디 찾기</span></button>
                    </form>
					<form class="form phoneFind" action="/login/idFind.do" method="post">
						<input type="text" name="user_name" id="user_name" placeholder="이름">
						<input type="tel" id="user_phone" name="phone" placeholder="000-0000-0000">
						<button type="submit" class="idFind_btn btn btn1 input"><span><i class="fa-solid fa-check"></i>&nbsp;아이디 찾기</span></button>
					</form>
                </div>  
            </div>
        </div>
    </div>
	<script src="${contextPath}/resources/js/login/idFind.js"></script>
</div>

