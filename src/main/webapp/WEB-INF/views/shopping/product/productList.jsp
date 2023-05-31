<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<div class="productList_wrap wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>${p_category}</span>
				<!-- <span>Accessory</span>
				<span>Shoes</span> -->
				</div>
			</div>
			<div class="page_menu_wrap">
				<div class="left">
				</div>
				<!-- <div class="page_menu center">
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
				</div> -->
				<!-- <div class="page_arrange right">
					<div class="select_wrapper1 select">
						<button class="option toggle_btn"><span class="txt">베스트 아이템 순</span><i class="down fa-solid fa-chevron-down"></i></button>
						<ul class="select_box hide">
							<li><button class="option select_btn"><span class="txt">베스트 아이템 순</span></button></li>
							<li><button class="option select_btn"><span class="txt">가격 순</span></button></li>
							<li><button class="option select_btn"><span class="txt">판매 순</span></button></li>
						</ul>
					</div>
					<script src="${contextPath}/resources/js/product/select_wrapper1.js"></script>
				</div> -->
			</div>
		</div>
			<div class="page_context_wrap">
				<c:forEach var="product" items="${productCate[0]}" varStatus="status">
					<a class="product_wrap" href="${contextPath}/product/productDetail/${product.p_id}">
						<div class="img_box">
							<c:if test="not empty productCate[1][count]">
								<img src="${contextPath}/image/${productCate[1][count].p_image_name}">
							</c:if>
						</div>
						<div class="tag_box">
							<div class="name">${product.p_name}</div>
							<div class="price">
								<span class="won">\</span><span class="num">${product.p_price}</span>
							</div>
						</div>
					</a>
				</c:forEach>
			</div>
	
		<script src="${contextPath}/resources/js/product/img_box.js"></script>
	</div>
</div>