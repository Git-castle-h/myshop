<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="mypageModInfo_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>Member Join</span>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="basic_info form">
				<div class="form_title">
					<span class="left">
						기본정보
					</span>
				</div>
				<div class="form_context identification">
					<div class="form_line">
						<input type="text" class="mj_id" placeholder="아이디" disabled="true">
					</div>
				</div>
				<div class="form_context address">
					<div class="form_line">
						<input type="text" class="memberjoin_postnum postnum" placeholder="우편번호">
						<button class="btn1 btn mj_postnum_btn">우편번호</button>
					</div>
					<div class="form_line">
						<input type="text" class="mj_address_basic address" placeholder="기본주소">
					</div>
					<div class="form_line">
						<input type="text" class="mj_address_detail address" placeholder="상세주소">
					</div>
				</div>
				<div class="form_context call">
					<div class="form_line">
						<input type="tel" class="mj_call call3 mj_call_1_1" placeholder="000">
						<span>-</span>	
						<input type="tel" class="mj_call call4 mj_call_1_2" placeholder="0000">
						<span>-</span>
						<input type="tel" class="mj_call call4 mj_call_1_3" placeholder="0000">
					</div>
					<div class="form_line">
						<input type="tel" class="mj_call call3 mj_call_2_1" placeholder="000">
						<span>-</span>	
						<input type="tel" class="mj_call call4 mj_call_2_2" placeholder="0000">
						<span>-</span>
						<input type="tel" class="mj_call call4 mj_call_2_3" placeholder="0000">
					</div>
				</div>
				<div class="form_context newsletter">
					<div class="form_line">
						<div class="fontsmall">
							<input type="checkbox" id="mj_newsletter_chx">
							<label for="mj_newsletter_chx">동의함</label>
						</div>
						<p class="fontsmall">
							쇼핑몰에서 제공하는 유익한 이벤트 소식을 SMS로 받으실 수 있습니다.
						</p>
					</div>
					<div class="form_line">
						<input type="email" class="mj_email" placeholder="이메일@shooping.net">
					</div>
				</div>
			</div>
			<div class="add_info form">
				<div class="form_title">
					<span class="left">
						추가정보
					</span>
				</div>
				<div class="form_context">
					<div class="form_line fontsmall">
							<span>
								<input type="radio" id="mj_gender_male" name="mj_gender" value="man" >
								<label for="mj_gender_male">남자</label>
							</span>	
							<span>
								<input type="radio" id="mj_gender_female" name="mj_gender" value="woman" >
								<label for="mj_gender_female">여자</label>
							</span>
					</div>
				</div>
				<div class="form_context">
					<div class="form_line">
						<span>생일</span>
						<input type="date">
					</div>
				</div>
				<div class="form_context">
						<div class="form_line">
						<div class="select_wrapper1 select w14e">
							<button class="option toggle_btn"><span class="txt">직업선택</span><i class="down fa-solid fa-chevron-down"></i></button>
							<ul class="select_box hide">
								<li><button class="option select_btn cgray cgray1"><span class="txt">직업선택</span></button></li>
								<li><button class="option select_btn"><span class="txt">학생</span></button></li>
								<li><button class="option select_btn"><span class="txt">직장인</span></button></li>
							</ul>
						</div>
						</div>
						<script src="${contextPath}/resources/js/mypage/select_wrapper1.js"></script>
				</div>
			</div>
			<div class="form submit">
				<div class="form_line btn_area">
					<a href="#" class="btn btn1 modify">정보수정</a>
					<a href="#" class="btn btn2 cancel">취소</a>
				</div>
			</div>
		</div>
	</div>
	
</div>