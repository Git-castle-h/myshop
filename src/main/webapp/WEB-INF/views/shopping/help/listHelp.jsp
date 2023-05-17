<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="helpList_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>Help</span>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="orderList form">
				<div class="form_title">
					<span class="left">
						내 문의 리스트
					</span>
					<span class="right">
						<a class="btn btn3 help_btn" href="${contextPath}/help/memberHelp/">문의하기</a>
					</span>
				</div>
				<div class="form_context orderList">
					<a href="${contextPath}/help/memberHelp/1" class="help_line">
						<div class="img_box box">
							<div class="img"></div>
						</div>
						<div class="title_box box">
							<div class="text">
								<div class="title txt">
									문의 제목입니다.
								</div>
								<div class="category txt">
									교환ㆍ환불
								</div>
							</div>

						</div>
						<div class="status_box box">
							<div class="status">
								<span class="wait">답변 대기중</span>
								<!-- <span class="complete">답변 완료</span> -->
							</div>
							<div class="modify">
								<button class="btn btn3 modbtn">수정하기</button>
							</div>
						</div>
					</a>
				</div>
			</div>
		</div>
	</div>

</div>


