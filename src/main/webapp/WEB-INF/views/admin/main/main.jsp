<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<script> let contextPath = document.querySelector("#contextPath").value; </script>
<div class="main_wrap wrap">
	<div class="page_top">
		<div class="page_title_wrap">
			<div class="page_title">
				<span>ADMIN MAIN</span>
			</div>
		</div>
	</div>
	<div class="container">
			<div class="main_preview">
				<c:choose>
					<c:when test="not empty ${banner[0].banner_link}">
					<a class="main event" href="${contextPath}/${banner[0].banner_link}" style="background-color:${banner[0][0].banner_color}">
					</c:when>
					<c:otherwise>
						<a class="main event"style="background-color:${banner[0].banner_color}">                
					</c:otherwise>
				</c:choose>
						<div class="title">
							${banner[0].banner_title}
						</div>
						<div class="detail">
							${banner[0].banner_detail}
						</div>
					</a>
				<c:choose>
					<c:when test="not empty ${banner[1].banner_link}">
					<a class="sub event" href="${contextPath}/${banner[1].banner_link}" style="background-color:${banner[0][1].banner_color}">
					</c:when>
					<c:otherwise>
						<a class="sub event"style="background-color:${banner[1].banner_color}">                
					</c:otherwise>
				</c:choose>
						<div class="title">
							${banner[1].banner_title}
						</div>
						<div class="detail">
							${banner[1].banner_detail}
						</div>
					</a>
				<c:choose>
						<c:when test="not empty ${banner[2].banner_link}">
						<a class="sub event" href="${contextPath}/${banner[2].banner_link}" style="background-color:${banner[0][2].banner_color}">
						</c:when>
						<c:otherwise>
							<a class="sub event"style="background-color:${banner[2].banner_color}">                
						</c:otherwise>
				</c:choose>
						<div class="title">
							${banner[2].banner_title}
						</div>
						<div class="detail">
							${banner[2].banner_detail}
						</div>
					</a>
			</div>
	</div>
	<div class="container">
			<div class="main_banner form">
				<div class="form_title">
					<span class="left">
						메인 배너
					</span>
				</div>
				<div class="form_context main_setting">
					<div class="form_line">
						<input type="text" class="ms_title" placeholder="메인 타이틀" value="${banner[0].banner_title}">
						<span class="detail">
							<span>메인배너의 타이틀을 입력해주세요</span>
							<!-- <span class="cgray cgray1">(ex #2d2d2d)<span> -->
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_detail" placeholder="메인 디테일" value="${banner[0].banner_detail}">
						<span class="detail">
							<span>메인 배너의 상세정보를 적어주세요</span>
							<!-- <span class="cgray cgray1">(ex #2d2d2d)<span> -->
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_bgc" placeholder="배경색" value="${banner[0].banner_color}">
						<span class="detail">
							<span>HTML 컬러코드로 입력해주세요</span>
							<span class="cgray cgray1">(ex #2d2d2d)<span>
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_link" placeholder="배너 하이퍼링크"  value="${banner[0].banner_link}">
						<span class="detail">
							<span>주소를 입력해주세요</span> 
							<span class="cgray cgray1">(ex www.myshop.com)<span>
						</span>
					</div>
					<div class="form_line">
						<div class="inputFile_wrapper1 mb_image inputFile_wrapper"> 
							<input type="file" class="file_input">
							<input type="text" class="file_name" placeholder="배너이미지" disabled="true">
							<button class="file_btn btn btn1">+ 파일추가</button>
						</div>
					</div>
					<script src="${contextPath}/resources/js/admin/main/inputFile_wrapper1.js"></script>
				</div>
			</div>
			<div class="sub_banner_1 form">
				<div class="form_title">
					<span class="left">
						보조 배너 1
					</span>
				</div>
				<div class="form_context main_setting">

					<div class="form_line">
						<input type="text" class="ms_title" placeholder="서브배너1 상세정보"  value="${banner[1].banner_title}">
						<span class="detail">
							<span>서브배너1의 타이틀을 입력해주세요</span>
							<!-- <span class="cgray cgray1">(ex #2d2d2d)<span> -->
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_detail" placeholder="서브배너1 상세정보" value="${banner[1].banner_detail}">
						<span class="detail">
							<span>서브배너1의 상세정보를 적어주세요</span>
							<!-- <span class="cgray cgray1">(ex #2d2d2d)<span> -->
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_bgc" placeholder="배경색" value="${banner[1].banner_color}">
						<span class="detail">
							<span>HTML 컬러코드로 입력해주세요</span>
							<span class="cgray cgray1">(ex #2d2d2d)<span>
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_link" placeholder="배너 하이퍼링크" value="${banner[2].banner_link}">
						<span class="detail">
							<span>주소를 입력해주세요</span>
							<span class="cgray cgray1">(ex www.myshop.com)<span>
						</span>
					</div>
					<div class="form_line">
						<div class="inputFile_wrapper2 sb1_image inputFile_wrapper"> 
							<input type="file" class="file_input">
							<input type="text" class="file_name" placeholder="배너이미지" disabled="true">
							<button class="file_btn btn btn1">+ 파일추가</button>
						</div>
					</div>
					<script src="${contextPath}/resources/js/admin/main/inputFile_wrapper2.js"></script>
				</div>
			</div>
			<div class="sub_banner_2 form">
				<div class="form_title">
					<span class="left">
						보조 배너 2
					</span>
				</div>
				<div class="form_context main_setting">

					<div class="form_line">
						<input type="text" class="ms_title" placeholder="서브배너2 타이틀" value="${banner[2].banner_title}">
						<span class="detail">
							<span>서브배너2의 타이틀을 입력해주세요</span>
							<!-- <span class="cgray cgray1">(ex #2d2d2d)<span> -->
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_detail" placeholder="서브배너2 디테일" value="${banner[2].banner_detail}">
						<span class="detail">
							<span>서브배너2의 상세정보를 적어주세요</span>
							<!-- <span class="cgray cgray1">(ex #2d2d2d)<span> -->
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_bgc" placeholder="배경색" value="${banner[2].banner_color}">
						<span class="detail">
							<span>HTML 컬러코드로 입력해주세요</span>
							<span class="cgray cgray1">(ex #2d2d2d)<span>
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_link" placeholder="배너 하이퍼링크" value="${banner[2].banner_link}">
						<span class="detail">
							<span>주소를 입력해주세요</span>
							<span class="cgray cgray1">(ex www.myshop.com)<span>
						</span>
					</div>
					<div class="form_line">
						<div class="inputFile_wrapper3 sb2_image inputFile_wrapper"> 
							<input type="file" class="file_input">
							<input type="text" class="file_name" placeholder="배너이미지" disabled="true">
							<button class="file_btn btn btn1">+ 파일추가</button>
						</div>
					</div>
					<script src="${contextPath}/resources/js/admin/main/inputFile_wrapper3.js"></script>
				</div>
			</div>
			<div class="form">
				<div class="form_context end">
					<div class="form_line submit btn_area">
						<a href="#" class="btn btn1 mod_btn join">수정하기</a>
						<a href="#" class="btn btn2 cancel">취소</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="${contextPath}/resources/js/admin/main/main.js"></script>
</div>