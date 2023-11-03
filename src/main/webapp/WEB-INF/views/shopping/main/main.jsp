<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="main_wrap wrap">
    <div class="container">
        <div class="main_banner">
            <c:choose>
            <c:when test="not empty ${banner[0][0].banner_link}">
            <a class="main event" href="${contextPath}/${banner[0][0].banner_link}" style="background-color:${banner[0][0].banner_color}">
            </c:when>
            <c:otherwise>
                <a class="main event"style="background-color:${banner[0][0].banner_color}">                
            </c:otherwise>
            </c:choose>
                <div class="title">
                    ${banner[0][0].banner_title}
                </div>
                <div class="detail">
                    ${banner[0][0].banner_detail}
                </div>
            </a>
            <c:choose>
            <c:when test="not empty ${banner[0][1].banner_link}">
            <a class="sub event" href="${contextPath}/${banner[0][1].banner_link}" style="background-color:${banner[0][1].banner_color}">
            </c:when>
            <c:otherwise>
                <a class="sub event"style="background-color:${banner[0][1].banner_color}">                
            </c:otherwise>
            </c:choose>
                <div class="title">
                    ${banner[0][1].banner_title}
                </div>
                <div class="detail">
                    ${banner[0][1].banner_detail}
                </div>
            </a>
            <c:choose>
                <c:when test="not empty ${banner[0][2].banner_link}">
                <a class="sub event" href="${contextPath}/${banner[0][2].banner_link}" style="background-color:${banner[0][2].banner_color}">
                </c:when>
                <c:otherwise>
                    <a class="sub event"style="background-color:${banner[0][2].banner_color}">                
                </c:otherwise>
            </c:choose>
                <div class="title">
                    ${banner[0][2].banner_title}
                </div>
                <div class="detail">
                    ${banner[0][2].banner_detail}
                </div>
            </a>
        </div>
        <div class="bestItem slide_wrap bestSwiper">
            <div class="title">Best Items</div>
            <div class="slide swiper-wrapper">
                <c:forEach var="recp" items="${recProduct[0]}">
                    <a class="product_wrap swiper-slide" href="${contextPath}/product/productDetail/${recp.p_id}">
                        <div class="img_box">
                            <c:if test="not empty ${recProduct[2][count].p_t_image_name}">
                                <img src="${contextPath}/images/${recProduct[2][count].p_t_image_name}" alt="">
                            </c:if>
                        </div>
                        <div class="tag_box">
                            <div class="name">${recp.p_name}</div>
                            <div class="price">
                                <span class="won">\</span><span class="num">${recp.p_price}</span>
                            </div>
                        </div>
                    </a>
                </c:forEach>
            </div>
        </div>
        <div class="newItem slide_wrap newSwiper">
            <div class="title">New Items</div>
            <div class="slide swiper-wrapper">
                <c:forEach var="pro" items="${product[0]}">
                    <a class="product_wrap swiper-slide" href="${contextPath}/product/productDetail/${pro.p_id}">
                        <div class="img_box">
                            <c:if test="not empty ${product[2][count].p_t_image_name}">
                                <img src="${contextPath}/images/${product[2][count].p_t_image_name}" alt="">
                            </c:if>
                        </div>
                        <div class="tag_box">
                            <div class="name">${pro.p_name}</div>
                            <div class="price">
                                <span class="won">\</span><span class="num">${pro.p_price}</span>
                            </div>
                        </div>
                    </a>
                </c:forEach>
            </div>
        </div>
    </div>
    <script src="${contextPath}/resources/js/common/swiper-bundle.min.js"></script>
    <script>
        const swiper1 = new Swiper('.bestSwiper', {
            slidesPerView: "auto",
            spaceBetween: 30,
            autoplay: {
                 delay: 2000,
            },
        });

        const swiper2 = new Swiper('.newSwiper', {
            slidesPerView: "auto",
            spaceBetween: 30,
            autoplay: {
                 delay: 2000,
            },
        });
    </script>
</div>