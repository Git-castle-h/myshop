<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<script> let contextPath = document.querySelector("#contextPath").value; </script>
<c:set var="products" value="${productList[0]}"/>
<c:set var="productImage" value="${productList[1]}"/>
<c:set var="productTImage" value="${productList[2]}"/>
<div class="productList_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>ADMIN CATEGORY</span>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<!-- <div class="product_select_wrap">
				<div class="select_wrapper1 select search_select">
					<button class="option toggle_btn"><span class="txt">상품 분류</span><i class="down fa-solid fa-chevron-down"></i></button>
					<ul class="select_box hide">
						<li><button class="option select_btn disabled"><span class="txt">상품 분류</span></button></li>
						<li><button class="option select_btn"><span class="txt">의류</span></button></li>
						<li><button class="option select_btn"><span class="txt">악세사리</span></button></li>
					</ul>
					<script src="${contextPath}/resources/js/admin/product/select_wrapper1.js"></script>
				</div>
				<div class="input_wrapper search_input_wrap">
					<input type="text" class="input  search_input" placeholder="상품검색">
				</div>
				<div class="btn_area">
					<button class="btn btn1 search_btn"><i class="fa-sharp fa-solid fa-magnifying-glass"></i></button>
				</div>
			</div> -->
			<div class="productList form">
				<div class="form_title">
					<span class="left">
						상품 리스트
					</span>
					<span class="right">
						<a href="${contextPath}/admin/product/newProduct">상품 등록하기 ></a>
					</span>
				</div>
				<div class="form_context productList">
					<c:forEach var="product" items="${products}" varStatus="i">
						<a href="${contextPath}/admin/product/modProduct/${product.p_id}" class="product_line">
							<div class="img_box box">
								<div class="img">
									<c:choose>
										<c:when test="${productTImage[i.index].p_t_image_name != null}">
											<img src ="${contextPath}/image/${productTImage[i.index].p_t_image_name}">
										</c:when>
									</c:choose>
								</div>
							</div>
							<div class="title_box box">
									<div class="text">
										<div class="category txt">
											${product.p_category}
										</div>
										<div class="name txt">
											${product.p_name}
										</div>
										<div class="price txt">
											${product.p_price}
										</div>
									</div>
							</div>
							<div class="mod_box box">
								<div class="mod">
									<button class="mod_btn btn btn1">상품 수정</button>
								</div>
							</div>
						</a>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>

</div>


