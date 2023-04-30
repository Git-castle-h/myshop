<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="header_wrap">
    <div class="container">
        <div class="logo">
            LOGO
        </div>
        <div class="menu_wrap">
            <ul>
                <li><a href="">CLOTHES</a></li>
                <li><a href="">ACCESSORY</a></li>
                <li><a href="">SHOES</a></li>
                <li><a href="" class="cart"><span class="menuIco"><i class="fa-solid fa-bag-shopping"></i></span>&nbsp;CART</a></li>
                <li><a href="" class="login"><span class="menuIco"><i class="fa-solid fa-power-off"></i></span>&nbsp;LOGIN</a></li>
                <li><a href="">HELP</a></li>
            </ul>
        </div>
    </div>
</div>

