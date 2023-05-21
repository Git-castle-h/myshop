<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<script> let contextPath = document.querySelector("#contextPath").value; </script>
<div class="modMember_wrap">
	<div class="container large">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>Admin Member</span>
				</div>
			</div>
		</div>
		<div class="section_wrap">
			<div class="section">
				<div class="page_context_wrap">
					<div class="member_info form">
						<div class="form_title">
							<span class="left">
								기본정보
							</span>
						</div>
						<div class="form_context identification">
							<div class="form_line">
								<input type="text" class="mm_id" placeholder="아이디" disabled="true">
							</div>
							<div class="form_line">
								<input type="password" class="mm_pw" placeholder="비밀번호">
							</div>
							<div class="form_line">
								<input type="password" class="mm_pw_confirm" placeholder="비밀번호 확인">
							</div>
						</div>
						<div class="form_context address">
							<div class="form_line">
								<input type="text" class="mm_postnum postnum" placeholder="우편번호">
								<button class="btn1 btn mm_postnum_btn">우편번호</button>
							</div>
							<div class="form_line">
								<input type="text" class="mm_address_basic address" placeholder="기본주소">
							</div>
							<div class="form_line">
								<input type="text" class="mm_address_detail address" placeholder="상세주소">
							</div>
						</div>
						<div class="form_context call">
							<div class="form_line">
								<input type="tel" class="mm_call call3 mm_call_1_1" placeholder="000">
								<span>-</span>	
								<input type="tel" class="mm_call call4 mm_call_1_2" placeholder="0000">
								<span>-</span>
								<input type="tel" class="mm_call call4 mm_call_1_3" placeholder="0000">
							</div>
							<div class="form_line">
								<input type="tel" class="mm_call call3 mm_call_2_1" placeholder="000">
								<span>-</span>	
								<input type="tel" class="mm_call call4 mm_call_2_2" placeholder="0000">
								<span>-</span>
								<input type="tel" class="mm_call call4 mm_call_2_3" placeholder="0000">
							</div>
						</div>
						<div class="form_context newsletter">
							<!-- <div class="form_line">
								<p class="fontsmall">
									SMS 수신동의
								</p>
								<div class="fontsmall">
									<input type="checkbox" id="mm_newsletter_chx">
									<label for="mm_newsletter_chx">동의함</label>
								</div>
							</div> -->
							<div class="form_line">
								<input type="email" class="mm_email" placeholder="이메일@shooping.net">
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
										<input type="radio" class="mm_gender" id="mm_gender_male" name="mm_gender" value="man" >
										<label for="mm_gender_male">남자</label>
									</span>	
									<span>
										<input type="radio" class="mm_gender" id="mm_gender_female" name="mm_gender" value="woman" >
										<label for="mm_gender_female">여자</label>
									</span>
							</div>
						</div>
						<div class="form_context">
							<div class="form_line">
								<span>생일</span>
								<input class="mm_b_day"  type="date">
							</div>
						</div>
						<div class="form_context">
								<div class="form_line">
								<div class="select_wrapper1 mm_job select w14e">
									<input type="hidden" class="select_input"/>
									<button class="option toggle_btn"><span class="txt">직업선택</span><i class="down fa-solid fa-chevron-down"></i></button>
									<ul class="select_box hide">
										<li><button class="option select_btn disabled"><span class="txt">직업선택</span></button></li>
										<li><button class="option select_btn" data-value="student"><span class="txt">학생</span></button></li>
										<li><button class="option select_btn" data-value="salaryMan"><span class="txt">직장인</span></button></li>
									</ul>
								</div>
								</div>
								<script src="${contextPath}/resources/js/admin/member/select_wrapper1.js"></script>
						</div>
					</div>

				</div>
			</div>
			<div class="section">
				<div class="form member_help_list">
					<div class="form_title">
						<span class="left">
							회원 문의 리스트
						</span>
					</div>
					<div class="form_context">
						<a href="${contextPath}/admin/help/modHelp/1" class="form_line">
							<div class="mhl_category">
								교환 환불
							</div>
							<div class="mhl_title">
									문의 제목입니다.
							</div>
							<div class="mhl_complete">
								<span class="tag on">완료</span>
								<!-- <span class="tag">미완료</span> -->
							</div>
						</a>
					</div>
				</div>
			</div>
		</div>
		<div class="form submit">
			<div class="form_line btn_area">
				<a href="#" class="btn btn1 mod_btn">회원정보 수정</a>
				<a href="#" class="btn btn2 cancel">수정 취소</a>
			</div>
		</div>
	</div>
	<script src="${contextPath}/resources/js/admin/member/modMember.js"></script>
</div>