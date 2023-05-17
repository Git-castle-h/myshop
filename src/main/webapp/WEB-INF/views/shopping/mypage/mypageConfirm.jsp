<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<script> let contextPath = document.querySelector("#contextPath").value; </script>
<div class="mypageConfirm_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>My Page</span>
				</div>
				<div class="page_sub_title">
					<ul>
						<li><a href="${contextPath}/order/orderList">ORDER</a></li>
						<li class="on"><a href="#">INFO</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="box">
				<div class="box_wrap">
					<div class="box_top">
						<form class="form" action="/login/login.do" method="post">
							<input type="text" name="user_pw" class="user_pw" placeholder="비밀번호 확인">
							<button type="submit" class="login_btn btn1 btn input"><span>MY 정보수정</span></button>
						</form>
					</div>  
				</div>
			</div>
		</div>
	</div>
</div>