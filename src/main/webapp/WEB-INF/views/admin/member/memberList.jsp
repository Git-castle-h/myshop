<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="memberList_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>ADMIN MEMBER</span>
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
					<script src="${contextPath}/resources/js/admin/product/select_wrapper1.js"></script>
				</div>
				<div class="input_wrapper search_input_wrap">
					<input type="text" class="input  search_input" placeholder="회원 검색">
				</div>
				<div class="btn_area">
					<button class="btn btn1 search_btn"><i class="fa-sharp fa-solid fa-magnifying-glass"></i></button>
				</div>
			</div>
			<div class="memberList form">
				<div class="form_title">
					<span class="left">
						회원 리스트
					</span>
				</div>
				<div class="form_context memberList">
					<a href="${contextPath}/admin/member/modMember/1" class="member_line">
						<div class="id_box box">
							<span class="tag">ID</span>
							<span>회원아이디</span>
						</div>
						<div class="name_box box">
							<span class="tag">이름</span>
							<span>김XX</span>
						</div>
						<div class="help_box box">
							<span class="status help_status on">문의 <span>1</span>건</span>
						</div>
						<div class="order_box box">
							<span class="status order_status on">주문 <span>1</span>건</span>
						</div>
						<div class="shipping_box box">
							<span class="status shipping_status on">배송 <span>1</span>건</span>
						</div>
						<div class="complete_box box">
							<span class="status complete_status on">완료 <span>1</span>건</span>
						</div>
					</a>
				</div>
			</div>
		</div>
	</div>

</div>


