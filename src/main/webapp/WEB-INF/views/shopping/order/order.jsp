<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<input id="contextPath" type="hidden" value="${contextPath}">
<script> let contextPath = document.querySelector("#contextPath").value; </script>
<div class="order_wrap">
	<div class="container small">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>ORDER</span>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="orderList form">
				<div class="form_title">
					<span class="left">
						주문하기
					</span>
				</div>
				<div class="form_context orderList">
					<div class="cart_line" data-id="1">
						<div class="img_box box">
							<div class="img"></div>
						</div>
                        <div class="category_box box">
                            <div class="category txt">
                                clothes
                            </div>
                        </div>
						<div class="name_box box">
                            <div class="name txt">
                                추천 Clothes1
                            </div>
						</div>
						<div class="option_box box">
							<div class="option txt">
								옵션1 / 옵션2 / 옵션3
							</div>
						</div>
                        <div class="count_box box">
                            <div class="count">
                                <span class="num">1</span>
                                <span>개</span>
                            </div>
                        </div>
						<div class="price_box box">
							<span class="price txt">
								10000
							</span>
						</div>
					</div>
				</div>
				<div class="form_context">
					<div class="order_sum">
						<div class="sum_left">
							<div class="product_sum sum_box">
								<div class="top">선택 상품금액</div>
								<div class="bottom">0</div>
							</div>
							<div class="plus sign sum_box">+</div>
							<div class="shipping_sum sum_box">
								<div class="top">배송비</div>
								<div class="bottom">1500</div>
							</div>
							<div class="minus sign sum_box">-</div>
							<div class="price_discount sum_box">
								<div class="top">할인금액</div>	
								<div class="bottom">0</div>
							</div>
							<div class="equal sign sum_box">=</div>
							<div class="final_sum sum_box">
								<div class="top">주문금액</div>
								<div class="bottom">0</div>
							</div>
						</div>
					</div>
				</div>
			</div>

            <div class="address_form form">
                <div class="form_title">
                    <span class="left">
                        배송지 주소
                    </span>
                    <span class="left adress fontsupersmall">
                        <input type="checkbox" name="address_check" class="address_check" id="address_check">
                        <label for="address_check" class="address_label">내 주소</label>
                    </span>
                </div>
                <div class="form_context address">
                    <div class="form_line">
                        <input type="text" class="address_postnum postnum" placeholder="우편번호">
                        <button class="btn1 btn postnum_btn">우편번호 검색</button>
                    </div>
                    <div class="form_line">
                        <input type="text" class="address_basic address" placeholder="기본주소">
                    </div>
                    <div class="form_line">
                        <input type="text" class="address_detail address" placeholder="상세주소">
                    </div>
                </div>
            </div>
            <div class="form submit">
				<div class="form_line btn_area">
					<button class="btn btn1 order_btn">주문하기 </button>
					<button onclick="javascript:history.back()" class="btn btn2 cancel_btn">취소</button>
				</div>
			</div>
        </div>
    </div>


	<script src="${contextPath}/resources/js/order/order.js"></script>

</div>


