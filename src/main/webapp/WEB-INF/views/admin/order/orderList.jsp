<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="orderList_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>ADMIN ORDER</span>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="member_select_wrap">
				<div class="select_wrapper1 select search_select">
					<button class="option toggle_btn"><span class="txt">검색 조건</span><i class="down fa-solid fa-chevron-down"></i></button>
					<ul class="select_box hide">
						<li><button class="option select_btn disabled"><span class="txt">검색 조건</span></button></li>
						<li><button class="option select_btn"><span class="txt">아이디</span></button></li>
						<li><button class="option select_btn"><span class="txt">이름</span></button></li>
					</ul>
					<script src="${contextPath}/resources/js/admin/order/select_wrapper1.js"></script>
				</div>
				<div class="select_wrapper2 select search_select">
					<button class="option toggle_btn"><span class="txt">답변 여부</span><i class="down fa-solid fa-chevron-down"></i></button>
					<ul class="select_box hide">
						<li><button class="option select_btn disabled"><span class="txt">답변 여부</span></button></li>
						<li><button class="option select_btn"><span class="txt">답변 완료</span></button></li>
						<li><button class="option select_btn"><span class="txt">답변 미완료</span></button></li>
					</ul>
					<script src="${contextPath}/resources/js/admin/order/select_wrapper2.js"></script>
				</div>
				<div class="input_wrapper search_input_wrap">
					<input type="text" class="input  search_input" placeholder="회원 검색">
				</div>
				<div class="btn_area">
					<button class="btn btn1 search_btn"><i class="fa-sharp fa-solid fa-magnifying-glass"></i></button>
				</div>
			</div>
			<div class="orderList form">
				<div class="form_title">
					<span class="left">
						주문 리스트
					</span>
				</div>
				<div class="form_context helpList">
					<a class="order_line" href="${contextPath}/admin/order/modOrder/1">
						<div class="id_box box">
							<span class="tag">ID</span>
							<span>회원아이디</span>
						</div>
						<div class="name_box box">
								<span class="txt">PRODUCT NAME</span>
						</div>
						<div class="option_box box">
							<span class="txt">OPTION1/OPTION2/OPTION3/OPTION4</span>
						</div>
						<div class="address_box box">
							<span class="txt">성남시 00거리 00길 11-11 (상세주소)</span>
						</div>
						<div class="request_box box">
							<span class="status request_status on">요청사항</span>
							<!-- <span class="status request_status">요청사항</span> -->
						</div>
						<div class="shipping_box box">
							<span class="status shipping_status order">주문접수</span>
							<!-- <span class="status shipping_status s_ready">배송준비</span>
							<span class="status shipping_status s_ing">배송중</span>
							<span class="status shipping_status s_complete">배송완료</span> -->
						</div>
						<div class="confirm_box box">
							<span class="status confirm_status">확인</span>
							<!-- <span class="status confirm_status">미확인</span> -->
						</div>
					</a>
				</div>
			</div>
			
		</div>
	</div>

</div>


