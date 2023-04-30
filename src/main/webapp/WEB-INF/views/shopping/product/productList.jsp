<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="productList_wrap wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>Clothes</span>
				<!-- <span>Accessory</span>
				<span>Shoes</span> -->
				</div>
			</div>
			<div class="page_menu_wrap">
				<div class="left">
				</div>
				<div class="page_menu center">
					<ul class="">
						<li class="on">
							<a href="#">TOP</a>
						</li>
						<li>
							<a href="#">SHIRT</a>
						</li>
						<li>
							<a href="#">PANTS</a>
						</li>
						<li>
							<a href="#">OUTER</a>
						</li>
					</ul>
				</div>
				<div class="page_arrange right">
					<div class="select_wrapper1 select">
						<button class="option toggle_btn"><span class="txt">베스트 아이템 순</span><i class="down fa-solid fa-chevron-down"></i></button>
						<ul class="select_box hide">
							<li><button class="option select_btn"><span class="txt">베스트 아이템 순</span></button></li>
							<li><button class="option select_btn"><span class="txt">가격 순</span></button></li>
							<li><button class="option select_btn"><span class="txt">판매 순</span></button></li>
						</ul>
					</div>
					<script src="${contextPath}/resources/js/product/select_wrapper1.js"></script>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="product_wrap">
				<div class="img_box"></div>
				<div class="tag_box">
					<div class="name">Item Name</div>
					<div class="price">
						<span class="won">\</span><span class="num">10000</span>
					</div>
				</div>
			</div>
			<div class="product_wrap">
				<div class="img_box"></div>
				<div class="tag_box">
					<div class="name">Item Name</div>
					<div class="price">
						<span class="won">\</span><span class="num">10000</span>
					</div>
				</div>
			</div>
			<div class="product_wrap">
				<div class="img_box"></div>
				<div class="tag_box">
					<div class="name">Item Name</div>
					<div class="price">
						<span class="won">\</span><span class="num">10000</span>
					</div>
				</div>
			</div>
			<div class="product_wrap">
				<div class="img_box"></div>
				<div class="tag_box">
					<div class="name">Item Name</div>
					<div class="price">
						<span class="won">\</span><span class="num">10000</span>
					</div>
				</div>
			</div>
			<div class="product_wrap">
				<div class="img_box"></div>
				<div class="tag_box">
					<div class="name">Item Name</div>
					<div class="price">
						<span class="won">\</span><span class="num">10000</span>
					</div>
				</div>
			</div>
			<div class="product_wrap">
				<div class="img_box"></div>
				<div class="tag_box">
					<div class="name">Item Name</div>
					<div class="price">
						<span class="won">\</span><span class="num">10000</span>
					</div>
				</div>
			</div>
			<div class="product_wrap">
				<div class="img_box"></div>
				<div class="tag_box">
					<div class="name">Item Name</div>
					<div class="price">
						<span class="won">\</span><span class="num">10000</span>
					</div>
				</div>
			</div>
			<div class="product_wrap">
				<div class="img_box"></div>
				<div class="tag_box">
					<div class="name">Item Name</div>
					<div class="price">
						<span class="won">\</span><span class="num">10000</span>
					</div>
				</div>
			</div>
			<script src="${contextPath}/resources/js/product/img_box.js"></script>
		</div>
	</div>
</div>