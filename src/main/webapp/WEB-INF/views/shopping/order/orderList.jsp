<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="orderList_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>My Page</span>
				</div>
				<div class="page_sub_title">
					<ul>
						<li class="on"><a href="#">ORDER</a></li>
						<li><a href="#">INFO</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="orderList form">
				<div class="form_title">
					<span class="left">
						내 주문
					</span>
					<span class="right detail">
						‘주문 접수’ 단계에서만 주문 수정이 가능합니다. 기타 다른 문의사항은 전화 및 이메일 문의 부탁드립니다.
					</span>
				</div>
				<div class="form_context orderList">
					<div class="order_line">
						<div class="img_box box">
							<div class="img"></div>
						</div>
						<div class="name_box box">
							<div class="text">
								<div class="category txt">
									PRODUCT CATEGORY
								</div>
								<div class="name txt">
									PRODUCT NAME
								</div>
							</div>
							<div class="delete">
								<button class="delete_btn btn btn2">
									<i class="fa-solid fa-xmark"></i>
								</button>
							</div>
						</div>
						<div class="option_box box">
							<div class="option txt">
								옵션1 / 옵션2 / 옵션3
							</div>
							<div class="name txt">
								PRODUCT NAME
							</div>
							<div class="mod">
								<button class="mod_btn btn">주문 수정</button>
							</div>
						</div>
						<div class="address_box box">
							<div class="main txt">
								성남시 00거리 00길
							</div>
							<div class="detail txt">
								11-11 (상세주소)
							</div>
						</div>
						<div class="status_box box">
							<span class="accept status">주문접수</span>
							<!-- <span class="ready status">배송준비</span> -->
							<!-- <span class="proceed status">배송중</span> -->
							<!-- <span class="complete status">배송완료</span> -->
						</div>
						<div class="price_box box">
							<span class="price txt">
								\10,000
							</span>
						</div>
					</div>
					<div class="order_line">
						<div class="img_box box">
							<div class="img"></div>
						</div>
						<div class="name_box box">
							<div class="text">
								<div class="category txt">
									PRODUCT CATEGORY
								</div>
								<div class="name txt">
									PRODUCT NAME
								</div>
							</div>
							<div class="delete">
								<button class="delete_btn btn btn2">
									<i class="fa-solid fa-xmark"></i>
								</button>
							</div>
						</div>
						<div class="option_box box">
							<div class="option txt">
								옵션1 / 옵션2 / 옵션3
							</div>
							<div class="name txt">
								PRODUCT NAME
							</div>
							<div class="mod">
								<button class="mod_btn btn">주문 수정</button>
							</div>
						</div>
						<div class="address_box box">
							<div class="main txt">
								성남시 00거리 00길
							</div>
							<div class="detail txt">
								11-11 (상세주소)
							</div>
						</div>
						<div class="status_box box">
							<!-- <span class="accept status">주문접수</span> -->
							<span class="ready status">배송준비</span>
							<!-- <span class="proceed status">배송중</span> -->
							<!-- <span class="complete status">배송완료</span> -->
						</div>
						<div class="price_box box">
							<span class="price txt">
								\10,000
							</span>
						</div>
					</div>
					<div class="order_line">
						<div class="img_box box">
							<div class="img"></div>
						</div>
						<div class="name_box box">
							<div class="text">
								<div class="category txt">
									PRODUCT CATEGORY
								</div>
								<div class="name txt">
									PRODUCT NAME
								</div>
							</div>
							<div class="delete">
								<button class="delete_btn btn btn2">
									<i class="fa-solid fa-xmark"></i>
								</button>
							</div>
						</div>
						<div class="option_box box">
							<div class="option txt">
								옵션1 / 옵션2 / 옵션3
							</div>
							<div class="name txt">
								PRODUCT NAME
							</div>
							<div class="mod">
								<button class="mod_btn btn">주문 수정</button>
							</div>
						</div>
						<div class="address_box box">
							<div class="main txt">
								성남시 00거리 00길
							</div>
							<div class="detail txt">
								11-11 (상세주소)
							</div>
						</div>
						<div class="status_box box">
							<!-- <span class="accept status">주문접수</span> -->
							<!-- <span class="ready status">배송준비</span> -->
							<span class="proceed status">배송중</span>
							<!-- <span class="complete status">배송완료</span> -->
						</div>
						<div class="price_box box">
							<span class="price txt">
								\10,000
							</span>
						</div>
					</div>
					<div class="order_line">
						<div class="img_box box">
							<div class="img"></div>
						</div>
						<div class="name_box box">
							<div class="text">
								<div class="category txt">
									PRODUCT CATEGORY
								</div>
								<div class="name txt">
									PRODUCT NAME
								</div>
							</div>
							<div class="delete">
								<button class="delete_btn btn btn2">
									<i class="fa-solid fa-xmark"></i>
								</button>
							</div>
						</div>
						<div class="option_box box">
							<div class="option txt">
								옵션1 / 옵션2 / 옵션3
							</div>
							<div class="name txt">
								PRODUCT NAME
							</div>
							<div class="mod">
								<button class="mod_btn btn">주문 수정</button>
							</div>
						</div>
						<div class="address_box box">
							<div class="main txt">
								성남시 00거리 00길
							</div>
							<div class="detail txt">
								11-11 (상세주소)
							</div>
						</div>
						<div class="status_box box">
							<!-- <span class="accept status">주문접수</span> -->
							<!-- <span class="ready status">배송준비</span> -->
							<!-- <span class="proceed status">배송중</span> -->
							<span class="complete status">배송완료</span>
						</div>
						<div class="price_box box">
							<span class="price txt">
								\10,000
							</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="modal_wrap">
		<div class="modal_context">
			<div class="form modal_orderList">
				<div class="form_title">
					주문수정
				</div>
				<div class="form_context">
					<div class="modal_top">
						<div class="img_box">
							<div class="img"></div>
						</div>
						<div class="context_box">
							<div class="name"></div>
							<div class="price"></div>
							<div class="detail"></div>
						</div>
						<div class="num_box">
							<div class="plusMinus_wrap">
								<div class="plusMinus_num">
									<button class="minus sign">-</button>
									<input type="tel" name="decide_num" class="plusMinus_input" value="1">
									<button class="plus sign">+</button>
								</div>
							</div>
						</div>
					</div>
					<div class="modal_bottom">
						<div class="left">
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
						</div>
						<div class="right">

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="${contextPath}/resources/js/order/orderList.js"></script>
</div>


