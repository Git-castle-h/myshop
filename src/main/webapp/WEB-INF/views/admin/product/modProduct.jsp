<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<script> let contextPath = document.querySelector("#contextPath").value; </script>
<c:set var="product" value="${productDetail[0]}"/>
<c:set var="options" value="${productDetail[1]}"/>
<c:set var="image" value="${productDetail[2]}"/>
<c:set var="thumbnail" value="${productDetail[3]}"/>
<div class="modProduct_wrap">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>ADMIN PRODUCT</span>
				</div>
			</div>
		</div>
		<div class="container">
				<div class="page_context_wrap">
					<div class="left section">
						<div class="img_box"></div>
						<script src="${contextPath}/resources/js/admin/product/img_box.js"></script>
					</div>
					<div class="right section">
						<div class="tag_box">
							<div class="name">
								${product.p_name}
							</div>
							<div class="price">
								<span class="won">\</span><span class="num">${product.p_price}</span>
							</div>
							<div class="description">${product.p_detail_title}</div>
						</div>
						<div class="detail_box">
							<div class="title">PRODUCT DETAIL</div>
							<div class="context">
								${product.p_detail_context}
							</div>
						</div>
						<div class="selection_box">
							<div class="title">SELECT</div>
							<div class="select_wrapper1 select">
								<input type="hidden" class="select_input"/>
								<button class="option toggle_btn"><span class="txt">OPTION</span><i class="down fa-solid fa-chevron-down"></i></button>
								<ul class="select_box hide">
									<li><button class="option select_btn disabled"><span class="txt">OPTION</span></button></li>
									<c:forEach var="option" items="${options}" varStatus="i">
										<li><button class="option select_btn"><span class="txt">${option.p_option}</span></button></li>
									</c:forEach>
								</ul>
							</div>
						</div>
						
					</div>
				</div>
				<script src="${contextPath}/resources/js/admin/product/select_wrapper1.js"></script>
				<div class="product_category form">
					<div class="form_title">
						<span class="left">
							상품 카테고리 수정
						</span>
					</div>
					<div class="form_context main_setting">
						<div class="form_line">
							<div class="select_wrapper2 mp_cate select">
								<input type="hidden" class="select_input"/>
								<button class="option toggle_btn">
									<c:choose>
										<c:when test="${product.p_category} == null">
											<span class="txt">CATEGORY</span>
										</c:when>
										<c:otherwise>
											<span class="txt">${product.p_category}</span>
										</c:otherwise>
									</c:choose>
									<i class="down fa-solid fa-chevron-down"></i>
								</button>
								<ul class="select_box hide">
										<li><button class="option select_btn disabled"><span class="txt">CATEGORY</span></button></li>
										<li><button class="option select_btn" data-value="clothes"><span class="txt">CLOTHES</span></button></li>
										<li><button class="option select_btn" data-value="accessory"><span class="txt">ACCESSORY</span></button></li>
										<li><button class="option select_btn" data-value="shoes"><span class="txt">SHOES</span></button></li>
								</ul>
							</div>
								<script src="${contextPath}/resources/js/admin/product/select_wrapper2.js"></script>
						</div>
					</div>
				</div>
				<div class="product_image form">
					<div class="form_title">
						<span class="left">
							상품 이미지 수정
						</span>
					</div>
					<div class="form_context main_setting">
						<div class="form_line">
							<div class="inputFile_wrapper1 mp_img inputFile_wrapper pi_image"> 
								<input type="file" class="file_input">
								<c:choose>
									<c:when test="${image.p_image_name} == null">
										<input type="text" class="file_name" disabled="true">
									</c:when>
									<c:otherwise>
										<input type="text" class="file_name" value="${image.p_image_name}" disabled="true">
									</c:otherwise>
								</c:choose>
								<button class="file_btn btn btn1">+ 파일추가</button>
							</div>
							<script src="${contextPath}/resources/js/admin/help/inputFile_wrapper1.js"></script>
						</div>
					</div>
				</div>
				<div class="product_t_image form">
					<div class="form_title">
						<span class="left">
							상품 썸네일 이미지 수정
						</span>
					</div>
					<div class="form_context main_setting">
						<div class="form_line">
							<div class="inputFile_wrapper2 mp_t_img inputFile_wrapper pi_t_image"> 
								<input type="file" class="file_input">
								<c:choose>
									<c:when test="${thumbnail.p_t_image_name} == null">
										<input type="text" class="file_name" disabled="true">
									</c:when>
									<c:otherwise>
										<input type="text" class="file_name" value="${thumbnail.p_t_image_name}" disabled="true">
									</c:otherwise>
								</c:choose>
								<button class="file_btn btn btn1">+ 파일추가</button>
							</div>
							<script src="${contextPath}/resources/js/admin/help/inputFile_wrapper2.js"></script>
						</div>
					</div>
				</div>
				<div class="product_name form">
					<div class="form_title">
						<span class="left">
							상품 이름/가격
						</span>
						<span class="right">
							<c:choose>
								<c:when test="${product.p_recommend  == 'no'}">
									<input type="checkbox" name="recommend_check" class="mp_rec" id="recommend_check">
								</c:when>
								<c:when test="${product.p_recommend == 'recommend'}">
									<input type="checkbox" name="recommend_check" class="mp_rec" id="recommend_check" checked>
								</c:when>
								<c:otherwise>
									<input type="checkbox" name="recommend_check" class="mp_rec" id="recommend_check">
								</c:otherwise>
							</c:choose>
							<label for="recommend_check" class="fontsmall">추천 아이템으로 설정 </label>
						</span>
					</div>
					<div class="form_context end">
						<div class="form_line">
							<input type="text" class="mp_name pn_name w100" placeholder="상품 이름" value="${product.p_name}">
						</div>
						<div class="form_line">
							<input type="tel" class="mp_price pn_price w100" placeholder="상품 가격" value="${product.p_price}">
						</div>
					</div>
				</div>
				<div class="product_detail form">
					<div class="form_title">
						<span class="left">
							상품 상세 내용
						</span>
					</div>
					<div class="form_context end">
						<div class="form_line">
							<input type="text" class="pd_title w100" placeholder="제목" value="${product.p_detail_title}">
						</div>
						<div class="form_line">
							<textarea name="pd_context" id="pd_context" class="pd_context w100">${product.p_detail_context}</textarea>
						</div>
					</div>
				</div>
				<div class="product_option form">
					<div class="form_title">
						<span class="left">
							상품 옵션
						</span>
						<span class="po_essential right">
							<!-- <input type="checkbox" class="po_essential_input" id="po_essential_input" name="po_essential_input" > -->
							<!-- <label for="po_essential_input">필수</label> -->
							<button class="po_essential_btn btn btn1 plus">+</button>
							<button class="po_essential_btn btn btn1 minus disabled">-</button>
						</span>
					</div>
					<div class="form_context end">
						<div class="form_line">
							<c:forEach var="option" items="${options}" varStatus="i">
								<div class="po_line">
									<input type="text" class="po_option w100" placeholder="옵션을 입력해주세요" value="${option.p_option}">	
								</div>
							</c:forEach>
								<div class="po_line">
									<input type="text" class="po_option w100" placeholder="옵션을 입력해주세요">
								</div>
						</div>
					</div>
				</div>
				<div class="form submit">
					<div class="form_context end">
						<div class="form_line btn_area">
							<button type="button" class="btn btn1 mp_btn">수정하기</button>
							<button type="button" class="btn btn2 cancel">취소</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="${contextPath}/resources/js/admin/product/modProduct.js"></script>
</div>
