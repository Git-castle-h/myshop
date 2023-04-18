<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head lang="ko">
    <meta charset="UTF-8">
  	<meta name="viewport" content="width=device-width">
    <title>Document</title>
</head>
<body>
<div id="outer_wrap">
    <div id="wrap">
        <header>
            <tiles:insertAttribute name="header" />
        </header>
        <div class="clear"></div>
        <article>
            <tiles:insertAttribute name="body" />
        </article>
        <div class="clear"></div>
        <footer>
            <tiles:insertAttribute name="footer" />
        </footer>
    </div>
</div>
</body>
</html>