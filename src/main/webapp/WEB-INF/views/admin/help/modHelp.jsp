<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="modHelp_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>ADMIN HELP</span>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="basic_info form">
				<div class="form_title">
					<span class="left">
						문의 내용
					</span>
				</div>
				<div class="form_context ">
					<div class="form_line">
						<input type="text" class="mh_title w100" placeholder="제목" disabled="true">
					</div>
					<div class="form_line">
						<input type="text" class="mh_category w100" placeholder="문의 종류" disabled="true">
					</div>
					<div class="form_line">
						<input type="text" class="mh_product w100" placeholder="제품 명" disabled="true">
					</div>
					<div class="form_line">
						<textarea name="mh_context" id="mh_context" class="mh_context w100" placeholder="상세 내용" disabled="true"></textarea>
					</div>
					<div class="form_line">
						<input type="text" class="mh_file_name" disabled="true">
					</div>
					<div class="form_line">
						<div class="img_box">
						</div>
					</div>
				</div>
			</div>
			<div class="basic_info form">
				<div class="form_title">
					<span class="left">
						문의 답변
					</span>
				</div>
				<div class="form_context ">
					<div class="form_line">
						<input type="text" class="mh_title w100" placeholder="답변 제목">
					</div>
					<div class="form_line">
						<textarea name="mh_context" id="mh_context" class="mh_context w100" placeholder="답변 내용"></textarea>
					</div>
				</div>
				<div class="form_context submit end">
					<div class="form_line btn_area">
						<a href="#" class="btn btn1 help">답변하기</a>
						<a href="#" class="btn btn2 cancel">목록으로 돌아가기</a>
					</div>
				</div>
			</div>
		</div>


	</div>
	
</div>