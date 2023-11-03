<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<c:set var="helpList" value="${helpList[0]}" />
<c:set var="image" value="${helpList[1]}" />
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
					<c:forEach var="help" items="${helpList}" varStatus="i">
					<a href="${contextPath}/help/memberHelp/${help.h_number}" class="help_line">
						<div class="img_box box">
							<div class="img">
								<img src="${contextPath}/image/${image['h_number']}" alt="">
							</div>
						</div>
						<div class="title_box box">
							<div class="text">
								<div class="title txt">
									${help.h_title}
								</div>
								<div class="category txt">
									${help.h_category}
								</div>
							</div>

						</div>
						<div class="status_box box">
							<div class="status">
								<c:choose>
									<c:when test="${help.h_status == null}">
										<span class="wait">답변 대기중</span>
									</c:when>
									<c:when test="${help.h_status == 'answered'}">
										<span class="complete">답변 완료</span>
									</c:when>
								</c:choose>
							</div>
							<div class="modify">
								<c:if test="${help.h_status == null}">
									<button class="btn btn3 mh_mod">수정하기</button>
								</c:if>
							</div>
						</div>
					</a>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>

</div>


