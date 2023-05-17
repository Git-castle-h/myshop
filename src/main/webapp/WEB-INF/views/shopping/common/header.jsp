<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="header_wrap">
    <div class="container">
        <div class="logo">
            <a href="${contextPath}/main/main">LOGO</a>
        </div>
        <div class="menu_wrap">
            <ul>
                <li><a href="${contextPath}/product/productList/clothes">CLOTHES</a></li>
                <li><a href="${contextPath}/product/productList/accessory">ACCESSORY</a></li>
                <li><a href="${contextPath}/product/productList/shoes">SHOES</a></li>
                <li><a href="${contextPath}/cart/cartList" class="cart"><span class="menuIco"><i class="fa-solid fa-bag-shopping"></i></span>&nbsp;CART</a></li>
                <li><a href="${contextPath}/login/login" class="login"><span class="menuIco"><i class="fa-solid fa-power-off"></i></span>&nbsp;LOGIN</a></li>
                <li><a href="${contextPath}/order/orderList" class="order"><span class="menuIco"></span>MYPAGE</a></li>
                <li><a href="${contextPath}/help/helpList">HELP</a></li>
            </ul>
        </div>
    </div>
</div>

