<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="productDetail_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>Clothes</span>
				<!-- <span>Accessory</span>
				<span>Shoes</span> -->
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="left section">
				<div class="img_box"></div>
				<script src="${contextPath}/resources/js/product/img_box.js"></script>
			</div>
			<div class="right section">
				<div class="tag_box">
					<div class="name">ITEM NAME</div>
					<div class="price">
						<span class="won">\</span><span class="num">10000</span>
					</div>
					<div class="description">Description</div>
				</div>
				<div class="detail_box">
					<div class="title">PRODUCT DETAIL</div>
					<div class="context">
						Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's 
					</div>
				</div>
				<div class="selection_box">
					<div class="title">SELECT</div>
					<div class="select_wrapper1 select">
						<button class="option toggle_btn"><span class="txt">OPTION</span><i class="down fa-solid fa-chevron-down"></i></button>
						<ul class="select_box hide">
							<li><button class="option select_btn"><span class="txt">OPTION</span></button></li>
							<li><button class="option select_btn"><span class="txt">SELECTED</span></button></li>
						</ul>
					</div>
				</div>
				<div class="decide_box">
					<div class="decide_wrap">
						<span class="decide_name">ITEM NAME</span>
						&nbsp;/&nbsp;
						<span class="decide_option">SELECTED</span>
						<div class="plusMinus_wrap">
							<div class="plusMinus_num">
								<button class="minus sign">-</button>
								<input type="tel" name="decide_num" class="plusMinus_input" value="1">
								<button class="plus sign">+</button>
							</div>
						</div>
					</div>
				</div>
				<div class="buy_box">
					<button href="" class="buy_btn btn btn1">BUY</button>
					<button href="" class="cart_btn btn btn2">CART</button>
				</div>
				
			</div>
		</div>
	</div>
		<script src="${contextPath}/resources/js/product/select_detail.js"></script>
</div>
