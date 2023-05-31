<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<c:set var="Cart" value="${cartList[0]}" />
<c:set var="product" value="${cartList[1]}" />
<c:set var="image" value="${cartList[2]}" />
<c:set var="t_image" value="${cartList[3]}" />

<input id="contextPath" type="hidden" value="${contextPath}">
<script> let contextPath = document.querySelector("#contextPath").value; </script>
<div class="cartList_wrap">
	<div class="container">
		<div class="page_top">
			<div class="page_title_wrap">
				<div class="page_title">
					<span>CART</span>
				</div>
			</div>
		</div>
		<div class="page_context_wrap">
			<div class="orderList form">
				<div class="form_title">
					<span class="left">
						<input type="checkbox" name="cart_check_all" id="cart_check_all" class="cart_check_all" checked="true">
						<label for="cart_check_all"  class="cart_check_all_label" >모두선택</label>
					</span>
					<span class="right detail">
						<button class="btn btn3 cart_del_btn">선택 삭제</button>
					</span>
				</div>
				<div class="form_context orderList">
					<c:forEach var ="cart" items="${Cart}"  varStatus="i">
					<div class="cart_line" data-id="${cart.c_id}">
						<div class="img_box box">
							<input type="checkbox" class="cart_line_select" checked="true">
							<div class="img">
							</div>
						</div>
						<div class="name_box box">
							<div class="text">
								<div class="category txt">
									${product[i.index].p_category}
								</div>
								<div class="name txt">
									${product[i.index].p_name}
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
								${cart.p_option}
							</div>
							<div class="count txt">
								<span class="num">
									${cart.c_number}
								</span>
								<span>개</span>
							</div>
							<div class="mod">
								<button class="mod_btn btn">주문 수정</button>
							</div>
						</div>
						<div class="price_box box">
							<span class="price txt">
								${cart.p_price}
							</span>
						</div>
					</div>
					</c:forEach>
				</div>
				<div class="form_context end">
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
						<div class="sum_right">
							<button class="order_btn btn btn1">주문 하기</button>
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
				<div class="form_context end">
					<div class="modal_top">
						<div class="product_box">
							<div class="img_box">
								<div class="img"></div>
							</div>
							<div class="context_box">
								<div class="name">ITEM NAME</div>
								<div class="price">10000</div>
							</div>
						</div>
						<div class="num_box">
							<div class="plusMinus_wrap">
								<div class="plusMinus_num">
									<button class="minus sign">-</button>
									<input type="tel" name="decide_num" class="plusMinus_input" value="1">
									<button class="plus sign">+</button>
								</div>
								<script src="${contextPath}/resources/js/cart/plusMinusInput.js"></script>
							</div>
						</div>
					</div>
					<div class="modal_bottom">
						<div class="selection_box">
							<div class="title">SELECT</div>
							<div class="select_wrapper1 select">
								<!-- SELECT  -->
								<input type="hidden" class="select_input"/>
								<button class="option toggle_btn"><span class="txt">SELECT</span><i class="down fa-solid fa-chevron-down"></i></button>
								<ul class="select_box hide">
									<li><button class="option select_btn disabled"><span class="txt">select</span></button></li>
									<li><button class="option select_btn" data-value="option"><span class="txt">option</span></button></li>
								</ul>
								<script src="${contextPath}/resources/js/cart/select_wrapper1.js"></script>
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
	<script src="${contextPath}/resources/js/cart/modal.js"></script>
	<script src="${contextPath}/resources/js/cart/cartList.js"></script>

</div>


