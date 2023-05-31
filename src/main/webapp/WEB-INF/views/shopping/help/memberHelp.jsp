<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<c:set var="help" value="${helpDetail[0]}" />
<c:set var="image" value="${helpDetail[1]}" />
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
						<input type="text" class="mh_title w100" value="${help.h_title}" placeholder="제목">
					</div>
					<div class="form_line">
						<div class="select_wrapper1 select mh_category mh_select_help w100">
							<input type="hidden" class="mh_select select_input"value="${help.h_category}" />
							<c:choose >
							<c:when test="${empty help.h_category}">
							<button class="option toggle_btn"><span class="txt">문의 종류</span><i class="down fa-solid fa-chevron-down"></i></button>
							</c:when>
							<c:when test="${not empty help.h_category}">
							<button class="option toggle_btn"><span class="txt">${help.h_category}</span><i class="down fa-solid fa-chevron-down"></i></button>
							</c:when>
							</c:choose>
							<ul class="select_box hide">
								<li><button class="option select_btn disabled"><span class="txt">문의 종류</span></button></li>
								<li><button class="option select_btn" data-value="반품/교환"><span class="txt">반품/교환</span></button></li>
								<li><button class="option select_btn" data-value="배송 관련"><span class="txt">배송 관련</span></button></li>
							</ul>							
						</div>
						<script src="${contextPath}/resources/js/help/select_wrapper1.js"></script>
					</div>
					<div class="form_line">
						<input type="text" class="mh_product w100" placeholder="제품 명" value="${help.h_product_name}">
					</div>
					<div class="form_line">
						<textarea name="mh_context" id="mh_context" class="mh_context w100" placeholder="상세 내용">${help.h_context}</textarea>
					</div>
					<div class="form_line">
						<div class="form_line">
							<div class="inputFile_wrapper1 inputFile_wrapper mh_file"> 
								<input type="file" class="file_input" value="${image.h_image_name}">
								<input type="text" class="file_name" disabled="true">
								<button class="file_btn btn btn1">+ 파일추가</button>
							</div>
							<script src="${contextPath}/resources/js/help/inputFile_wrapper1.js"></script>
						</div>
					</div>
				</div>
				<c:choose>
				<c:when test="${empty help.h_title}">
					<div class="form_context end">
						<div class="form_line submit btn_area">
							<button type="button" class="btn btn1 mh_btn submit">1:1 문의하기</button>
							<button type="button" onclick="javascript:history.back()" class="btn btn2 cancel">취소</button>
						</div>
					</div>
				</c:when>
				<c:when test="${!empty help.h_title}">
				<c:if test='${empty help.h_answer_title}'>
					<div class="form_context end">
						<div class="form_line submit btn_area">
							<button type="button" class="btn btn1 mh_btn mod">문의 수정하기</button>
							<button type="button" onclick="javascript:history.back()" class="btn btn2 cancel">취소</button>
						</div>
					</div>
				</c:if>
				</c:when>
				</c:choose>
			</div>
		</div>
		<c:if test='${!empty help.h_answer_title}'>

			<div class="page_context_wrap">
				<div class="basic_info form">
					<div class="form_title">
						<span class="left">
							문의 답변
						</span>
					</div>
					<div class="form_context ">
						<div class="form_line">
							<input type="text" class="mh_title w100" value="${help.h_answer_title}" placeholder="답변 제목" disabled>
						</div>
						<div class="form_line">
							<textarea name="mh_context" id="mh_context" class="mh_context w100" placeholder="답변 내용"  disabled>${help.h_answer_context}</textarea>
						</div>
					</div>
					<div class="form_context end">
						<div class="form_line submit btn_area">
							<a href="#" class="btn btn3 back">목록으로 돌아가기</a>
						</div>
					</div>
				</div>
			</div>
		</c:if>
	</div>
</div>
<script src="${contextPath}/resources/js/help/memberHelp.js"></script>