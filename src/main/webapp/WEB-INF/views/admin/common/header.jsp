<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="header_wrap">
    <div class="container">
        <a href="${contextPath}/admin/main/main" class="logo">
            <span>LOGO</span>
            <span class="suffix">admin</span>
        </a> 
        <div class="menu_wrap">
            <ul>
                <li><a href="${contextPath}/admin/main/main">메인배너</a></li>
                <li><a href="${contextPath}/admin/product/productList">상품관리</a></li>
                <!-- <li><a href="">팝업관리</a></li> -->
                <li><a href="${contextPath}/admin/order/orderList">주문관리</a></li>
                <li><a href="${contextPath}/admin/member/memberList">회원관리</a></li>
                <li><a href="${conntextPath}/admin/login/login" class="login"><span class="menuIco"><i class="fa-solid fa-power-off"></i></span>&nbsp;LOGIN</a></li>
        </div>
    </div>
</div>

