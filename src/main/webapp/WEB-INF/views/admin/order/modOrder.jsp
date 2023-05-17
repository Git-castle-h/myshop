<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="modOrder_wrap">
	<div class="container">
		<div class="form modOrder_orderList">
			<div class="form_title">
				주문수정
			</div>
			<div class="form_context end">
				<div class="modOrder_top">
					<div class="product_box">
						<div class="img_box">
							<div class="img"></div>
						</div>
						<div class="context_box">
							<div class="name">ITEM NAME</div>
							<div class="price">\ 100000</div>
							<div class="detail">PRODUCT DETAIL</div>
						</div>
					</div>
					<div class="num_box">
						<div class="plusMinus_wrap">
							<div class="plusMinus_num">
								<button class="minus sign">-</button>
								<input type="tel" name="decide_num" class="plusMinus_input" value="1">
								<button class="plus sign">+</button>
							</div>
							<script src="${contextPath}/resources/js/admin/order/plusMinusInput.js"></script>
						</div>
					</div>
				</div>
				<div class="modOrder_bottom">
					<div class="left section">
						<div class="selection_box">
							<div class="title">SELECT</div>
							<div class="select_wrapper1 select">
								<button class="option toggle_btn"><span class="txt">OPTION</span><i class="down fa-solid fa-chevron-down"></i></button>
								<ul class="select_box hide">
									<li><button class="option select_btn"><span class="txt">OPTION</span></button></li>
									<li><button class="option select_btn"><span class="txt">SELECTED</span></button></li>
								</ul>
							</div>
							<script src="${contextPath}/resources/js/admin/order/select_wrapper1.js"></script>
						</div>
					</div>
					<div class="right section">
						<div class="address">
							<div class="title">주소</div>
							<div class="form_line">
								<input type="text" class="memberjoin_postnum postnum" placeholder="우편번호">
								<button class="btn1 btn mj_postnum_btn">우편번호</button>
							</div>
							<div class="form_line">
								<input type="text" class="mj_address_basic address" placeholder="기본주소">
							</div>
							<div class="form_line">
								<input type="text" class="mj_address_detail address" placeholder="상세주소">
							</div>
						</div>
					</div>
				</div>
				<div class="form submit">
					<div class="form_line btn_area">
						<button class="btn btn1 modify">수정</button> 
						<button class="btn btn2 cancel">취소</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>