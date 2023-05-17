<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<div class="idFind_wrap wrap">
    <div class="container">
        <div class="box">
            <div class="title">IDENTIFICATION</div>
            <div class="box_wrap">
                <div class="box_top">
						<!-- <select class="selectFind select">
							<option value="email">이메일로 찾기</option>
							<option value="phone">휴대전화 번호로 찾기</option>
						</select> -->
						<div class="select_wrapper1 select select_idFind w14e">
							<input type="hidden" class="select_input" value="email"/>
							<button class="option toggle_btn"><span class="txt">이메일로 찾기</span><i class="down fa-solid fa-chevron-down"></i></button>
							<ul class="select_box hide">
								<li><button class="option select_btn disabled"><span class="txt">선택하기</span></button></li>
								<li><button class="option select_btn" data-value="email"><span class="txt">이메일로 찾기</span></button></li>
								<li><button class="option select_btn" data-value="phone"><span class="txt">휴대전화 번호로 찾기</span></button></li>
							</ul>
							<script src="${contextPath}/resources/js/login/select_wrapper1.js"></script>
						</div>
					<form class="form emailFind" action="/login/idFind.do" method="post">
							<input type="text" name="user_name" id="user_name_email" placeholder="이름">
							<input type="email" name="user_email" id="user_email" placeholder="OOO@email.com">
							<input type="hidden" id="user_verify_email" name="email_verify" placeholder="인증번호">
							<button type="button" class="idFind_btn email btn btn1 input"><span><i class="fa-solid fa-check"></i>&nbsp;아이디 찾기</span></button>
							<button type="button" class="idFind_btn id_email_verify verify btn btn1 input"><span><i class="fa-solid fa-check"></i>&nbsp;인증번호 확인</span></button>
                    </form>
					<form class="form phoneFind" action="/login/idFind.do" method="post">
						<input type="text" name="user_name" id="user_name_phone" placeholder="이름">
						<input type="tel" id="user_phone" name="phone" placeholder="000-0000-0000">
						<input type="hidden" id="user_verify_phone" name="phone_verify" placeholder="인증번호">
						<button type="button" class="idFind_btn phone btn btn1 input"><span><i class="fa-solid fa-check"></i>&nbsp;아이디 찾기</span></button>
						<button type="button" class="idFind_btn id_phone_verify verify btn btn1 input"><span><i class="fa-solid fa-check"></i>&nbsp;인증번호 확인</span></button>
					</form>
                </div>  
            </div>
        </div>
    </div>
	<script src="${contextPath}/resources/js/login/idFind.js"></script>
</div>

