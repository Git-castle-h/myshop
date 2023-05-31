<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<c:set var="Order" value="${orderList[0]}" />
<c:set var="product" value="${orderList[1]}" />
<c:set var="image" value="${orderList[2]}" />
<c:set var="t_image" value="${orderList[3]}" />
<input id="contextPath" type="hidden" value="${contextPath}">
<script> let contextPath = document.querySelector("#contextPath").value; </script>
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
						<li><a href="${contextPath}/mypage/mypageConfirm">INFO</a></li>
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
					<c:forEach var="order" items="${Order}" varStatus="i">
					<div class="order_line" data-id="${order.o_id}">
						<div class="img_box box">
							<div class="img">
								<c:if test="not empty ${t_image[i.index]}">
									<img src="${contextPath}/${t_image[i.index].p_t_image_id}" alt="">
								</c:if>
							</div>
						</div>
						<div class="name_box box">
							<div class="text">
								<div class="category txt">
									${product[i.index].p_category}
								</div>
								<div class="name txt">
									${order.p_name}
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
								${order.p_option}
							</div>
							<div class="count txt">
								<span class="num">${order.o_number}</span>	
								<span>개</span>
							</div>
							<div class="mod">
								<button class="mod_btn btn">주문 수정</button>
							</div>
						</div>
						<div class="address_box box">
							<div class="main txt">
								${order.o_address2}
							</div>
							<div class="detail txt">
								${order.o_address3}
							</div>
						</div>
						<div class="status_box box">
							<c:choose>
								<c:when test="${order.o_status}=='accepted'">
									<span class="accept status">주문접수</span>
								</c:when>
								<c:when test="${order.o_status}=='ready'">
									<span class="ready status">배송준비</span>
								</c:when>
								<c:when test="${order.o_status}=='ing'">
									<span class="proceed status">배송중</span>
								</c:when>
								<c:when test="${order.o_status}=='complete'">
									<span class="complete status">배송완료</span>
								</c:when>
							</c:choose>
						</div>
						<div class="price_box box">
							<span class="price txt">
								${order.p_price}
							</span>
						</div>
					</div>
					</c:forEach>
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
								<div class="price">100000</div>
							</div>
						</div>
						<div class="num_box">
							<div class="plusMinus_wrap">
								<div class="plusMinus_num">
									<button class="minus sign">-</button>
									<input type="tel" name="decide_num" class="plusMinus_input" value="1">
									<button class="plus sign">+</button>
								</div>
								<script src="${contextPath}/resources/js/order/plusMinusInput.js"></script>
							</div>
						</div>
					</div>
					<div class="modal_bottom">
						<div class="left section">
							<div class="selection_box">
								<div class="title">SELECT</div>
								<div class="select_wrapper1 select">
									<input type="hidden" class="select_input"/>
									<button class="option toggle_btn"><span class="txt">OPTION</span><i class="down fa-solid fa-chevron-down"></i></button>
									<ul class="select_box hide">
										<li><button class="option select_btn disabled"><span class="txt">OPTION</span></button></li>
										<li><button class="option select_btn"><span class="txt">SELECTED</span></button></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="right section">
							<div class="address">
								<div class="title">주소</div>
								<div class="form_line">
									<input type="text" class="postnum postnum" placeholder="우편번호">
									<button class="btn1 btn postnum_btn">우편번호</button>
								</div>
								<div class="form_line">
									<input type="text" class="address_basic address" placeholder="기본주소">
								</div>
								<div class="form_line">
									<input type="text" class="address_detail address" placeholder="상세주소">
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
	<script src="${contextPath}/resources/js/order/modal.js"></script>
	<script src="${contextPath}/resources/js/order/orderList.js"></script>
	<script src="${contextPath}/resources/js/order/select_wrapper1.js"></script>

</div>


