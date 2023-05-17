<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${contextPath}/resources/css/common/common.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/common/swiper-bundle.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/common/font.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/common/normalize.css">
	<link rel="stylesheet" href="${contextPath}<tiles:getAsString name="layoutCss"/>">
  	<link rel="stylesheet" href="${contextPath}<tiles:getAsString name="dynamicCss"/>">
    <script src="https://kit.fontawesome.com/06b2da71d8.js" crossorigin="anonymous"></script>
    <script src="${contextPath}/resources/js/common/jquery-3.6.4.min.js"></script>
    <script src="${contextPath}/resources/js/common/minHeight.js"></script>
    <title><tiles:insertAttribute name="title" /></title>
</head>
<body>
    <div id="outer_wrap">
        <div id="wrap">
            <header id="header">
                <tiles:insertAttribute name="header" />
            </header>
            <article id="main">
                <tiles:insertAttribute name="body" />
            </article>
            <footer id="footer">
                <tiles:insertAttribute name="footer" />
            </footer>
        </div>
    </div>
</body>
</html>