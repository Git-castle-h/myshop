<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="helpList_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>ADMIN HELP</span>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="member_select_wrap">
				<div class="select_wrapper1 select search_select">
					<button class="option toggle_btn"><span class="txt">검색 조건</span><i class="down fa-solid fa-chevron-down"></i></button>
					<ul class="select_box hide">
						<li><button class="option select_btn cgray cgray1"><span class="txt">검색 조건</span></button></li>
						<li><button class="option select_btn"><span class="txt">아이디</span></button></li>
						<li><button class="option select_btn"><span class="txt">이름</span></button></li>
					</ul>
					<script src="${contextPath}/resources/js/admin/help/select_wrapper1.js"></script>
				</div>
				<div class="select_wrapper2 select search_select">
					<button class="option toggle_btn"><span class="txt">답변 여부</span><i class="down fa-solid fa-chevron-down"></i></button>
					<ul class="select_box hide">
						<li><button class="option select_btn cgray cgray1"><span class="txt">답변 여부</span></button></li>
						<li><button class="option select_btn"><span class="txt">답변 완료</span></button></li>
						<li><button class="option select_btn"><span class="txt">답변 미완료</span></button></li>
					</ul>
					<script src="${contextPath}/resources/js/admin/help/select_wrapper2.js"></script>
				</div>
				<div class="input_wrapper search_input_wrap">
					<input type="text" class="input  search_input" placeholder="회원 검색">
				</div>
				<div class="btn_area">
					<button class="btn btn1 search_btn"><i class="fa-sharp fa-solid fa-magnifying-glass"></i></button>
				</div>
			</div>
			<div class="helpList form">
				<div class="form_title">
					<span class="left">
						회원 문의 리스트
					</span>
				</div>
				<div class="form_context helpList">
					<div class="help_line">
						<div class="id_box box">
							<span class="tag">ID</span>
							<span>회원아이디</span>
						</div>
						<div class="category_box box">
							<span>교환 환불</span>
						</div>
						<div class="title_box box">
							<a href="">
								<span>문의 제목입니다.</span>
							</a>
						</div>
						<div class="complete_box box">
							<span class="status complete_status on">완료 <span>1</span>건</span>
						</div>
					</div>
					<div class="help_line">
						<div class="id_box box">
							<span class="tag">ID</span>
							<span>회원아이디</span>
						</div>
						<div class="category_box box">
							<span>교환 환불</span>
						</div>
						<div class="title_box box">
							<a href="">
								<span>문의 제목입니다.</span>
							</a>
						</div>
						<div class="complete_box box">
							<span class="status complete_status">미완료 <span>1</span>건</span>
						</div>
					</div>
					<div class="help_line">
						<div class="id_box box">
							<span class="tag">ID</span>
							<span>회원아이디</span>
						</div>
						<div class="category_box box">
							<span>교환 환불</span>
						</div>
						<div class="title_box box">
							<a href="">
								<span>문의 제목입니다.</span>
							</a>
						</div>
						<div class="complete_box box">
							<span class="status complete_status">미완료 <span>1</span>건</span>
						</div>
					</div>
					<div class="help_line">
						<div class="id_box box">
							<span class="tag">ID</span>
							<span>회원아이디</span>
						</div>
						<div class="category_box box">
							<span>교환 환불</span>
						</div>
						<div class="title_box box">
							<a href="">
								<span>문의 제목입니다.</span>
							</a>
						</div>
						<div class="complete_box box">
							<span class="status complete_status">미완료 <span>1</span>건</span>
						</div>
					</div>
					<div class="help_line">
						<div class="id_box box">
							<span class="tag">ID</span>
							<span>회원아이디</span>
						</div>
						<div class="category_box box">
							<span>교환 환불</span>
						</div>
						<div class="title_box box">
							<a href="">
								<span>문의 제목입니다.</span>
							</a>
						</div>
						<div class="complete_box box">
							<span class="status complete_status">미완료 <span>1</span>건</span>
						</div>
					</div>
					<div class="help_line">
						<div class="id_box box">
							<span class="tag">ID</span>
							<span>회원아이디</span>
						</div>
						<div class="category_box box">
							<span>교환 환불</span>
						</div>
						<div class="title_box box">
							<a href="">
								<span>문의 제목입니다.</span>
							</a>
						</div>
						<div class="complete_box box">
							<span class="status complete_status">미완료 <span>1</span>건</span>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>

</div>


