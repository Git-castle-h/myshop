<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 추가할부분 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<div class="main_wrap wrap">
    <div class="container">
        <div class="main_banner">
            <div class="main event">
                <div class="title">
                    Main Event
                </div>
                <div class="detail">
                    Event Detail
                </div>
            </div>
            <div class="sub event sub1">
                <div class="title">
                    Second Event
                </div>
                <div class="detail">
                    Event Detail
                </div>
            </div>
            <div class="sub event sub2">
                <div class="title">
                    Third Event
                </div>
                <div class="detail">
                    Event Detail
                </div>
            </div>
        </div>
        <div class="bestItem slide_wrap bestSwiper">
            <div class="title">Best Items</div>
            <div class="slide swiper-wrapper">
                 <div class="product_wrap swiper-slide">
                    <div class="img_box">
                    </div>
                    <div class="tag_box">
                        <div class="name">Item Name</div>
                        <div class="price">
                            <span class="won">\</span><span class="num">10000</span>
                        </div>
                    </div>
                 </div>
            </div>
        </div>
        <div class="newItem slide_wrap newSwiper">
            <div class="title">New Items</div>
            <div class="slide swiper-wrapper">
                <div class="product_wrap swiper-slide">
                    <div class="img_box">
                    </div>
                    <div class="tag_box">
                        <div class="name">Item Name</div>
                        <div class="price">
                            <span class="won">\</span><span class="num">10000</span>
                        </div>
                    </div>
                 </div>
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