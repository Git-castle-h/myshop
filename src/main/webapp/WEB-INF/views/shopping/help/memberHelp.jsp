<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<script> let contextPath = document.querySelector("#contextPath").value; </script>
<div class="memberHelp_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>HELP</span>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="basic_info form">
				<div class="form_title">
					<span class="left">
						문의 내용
					</span>
					<span class="right">
						<a href="${contextPath}/help/helpList">기존 문의 내역 ></a>
					</span>
				</div>
				<div class="form_context ">
					<div class="form_line">
						<input type="text" class="mh_title w100" placeholder="제목">
					</div>
					<div class="form_line">
						<div class="select_wrapper1 select mh_category mh_select_help w100">
							<input type="hidden" class="mh_select select_input"/>
							<button class="option toggle_btn"><span class="txt">문의 종류</span><i class="down fa-solid fa-chevron-down"></i></button>
							<ul class="select_box hide">
								<li><button class="option select_btn disabled"><span class="txt">문의 종류</span></button></li>
								<li><button class="option select_btn" data-value="반품/교환"><span class="txt">반품/교환</span></button></li>
								<li><button class="option select_btn" data-value="배송 관련"><span class="txt">배송 관련</span></button></li>
							</ul>							
						</div>
						<script src="${contextPath}/resources/js/help/select_wrapper1.js"></script>
					</div>
					<div class="form_line">
						<input type="text" class="mh_product w100" placeholder="제품 명">
					</div>
					<div class="form_line">
						<textarea name="mh_context" id="mh_context" class="mh_context w100" placeholder="상세 내용"></textarea>
					</div>
					<div class="form_line">
						<div class="form_line">
							<div class="inputFile_wrapper1 inputFile_wrapper"> 
								<input type="file" class="file_input">
								<input type="text" class="file_name" disabled="true">
								<button class="file_btn btn btn1">+ 파일추가</button>
							</div>
							<script src="${contextPath}/resources/js/help/inputFile_wrapper1.js"></script>
						</div>
					</div>
				</div>
				<div class="form_context end">
					<div class="form_line submit btn_area">
						<button type="button" class="btn btn1 mh_submit">1:1 문의하기</button>
						<button type="button" onclick="javascript:history.back()" class="btn btn2 cancel">취소</button>
					</div>
				</div>
			</div>
		</div>
		<!-- <c:if test='${not empty answer}'> -->
		<!-- </c:if> -->
			<div class="page_context_wrap">
				<div class="basic_info form">
					<div class="form_title">
						<span class="left">
							문의 답변
						</span>
					</div>
					<div class="form_context ">
						<div class="form_line">
							<input type="text" class="mh_title w100" placeholder="답변 제목" disabled>
						</div>
						<div class="form_line">
							<textarea name="mh_context" id="mh_context" class="mh_context w100" placeholder="답변 내용"  disabled></textarea>
						</div>
					</div>
					<div class="form_context end">
						<div class="form_line submit btn_area">
							<a href="#" class="btn btn3 back">목록으로 돌아가기</a>
						</div>
					</div>
				</div>
			</div>
	</div>
</div>
<script src="${contextPath}/resources/js/help/memberHelp.js"></script>