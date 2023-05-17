<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
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
				<div class="main event">
					<div class="title">
						Main Event
					</div>
					<div class="detail">
						Event Detail
					</div>
				</div>
				<div class="sub event sub1">
					<div class="title">
						Second Event
					</div>
					<div class="detail">
						Event Detail
					</div>
				</div>
				<div class="sub event sub2">
					<div class="title">
						Third Event
					</div>
					<div class="detail">
						Event Detail
					</div>
				</div>
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
						<input type="text" class="ms_file_name" placeholder="배너 이미지" disabled="true">
						<button class="ms_file_btn btn btn1">+ 파일추가</button>
					</div>
					<div class="form_line">
						<input type="text" class="ms_bgc" placeholder="배경색">
						<span class="detail">
							<span>HTML 컬러코드로 입력해주세요</span>
							<span class="cgray cgray1">(ex #2d2d2d)<span>
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_link" placeholder="배너 하이퍼링크">
						<span class="detail">
							<span>주소를 입력해주세요</span> 
							<span class="cgray cgray1">(ex www.myshop.com)<span>
						</span>
					</div>
				</div>
			</div>
			<div class="main_banner form">
				<div class="form_title">
					<span class="left">
						보조 배너 1
					</span>
				</div>
				<div class="form_context main_setting">
					<div class="form_line">
						<input type="text" class="ms_file_name" placeholder="배너 이미지" disabled="true">
						<button class="ms_file_btn btn btn1">+ 파일추가</button>
					</div>
					<div class="form_line">
						<input type="text" class="ms_bgc" placeholder="배경색">
						<span class="detail">
							<span>HTML 컬러코드로 입력해주세요</span>
							<span class="cgray cgray1">(ex #2d2d2d)<span>
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_link" placeholder="배너 하이퍼링크">
						<span class="detail">
							<span>주소를 입력해주세요</span>
							<span class="cgray cgray1">(ex www.myshop.com)<span>
						</span>
					</div>
				</div>
			</div>
			<div class="main_banner form">
				<div class="form_title">
					<span class="left">
						보조 배너 2
					</span>
				</div>
				<div class="form_context main_setting">
					<div class="form_line">
						<input type="text" class="ms_file_name" placeholder="배너 이미지" disabled="true">
						<button class="ms_file_btn btn btn1">+ 파일추가</button>
					</div>
					<div class="form_line">
						<input type="text" class="ms_bgc" placeholder="배경색">
						<span class="detail">
							<span>HTML 컬러코드로 입력해주세요</span>
							<span class="cgray cgray1">(ex #2d2d2d)<span>
						</span>
					</div>
					<div class="form_line">
						<input type="text" class="ms_link" placeholder="배너 하이퍼링크">
						<span class="detail">
							<span>주소를 입력해주세요</span>
							<span class="cgray cgray1">(ex www.myshop.com)<span>
						</span>
					</div>
				</div>
			</div>
			<div class="form">
				<div class="form_context end">
					<div class="form_line submit btn_area">
						<a href="#" class="btn btn1 join">수정하기</a>
						<a href="#" class="btn btn2 cancel">취소</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>