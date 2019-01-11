<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<!-- 头部 start -->
    <header id="header">
        <div class="top_banner">
            <img src="${pageContext.request.contextPath }/statics/images/top_banner.jpg" alt="">
        </div>
        <div class="shortcut">
            <!-- 未登录状态  -->
            <div class="login_out">

                <a href="${pageContext.request.contextPath }/login.action">登录</a>
                <a href="${pageContext.request.contextPath }/register_ok.action">注册</a>
            </div>
            <!-- 登录状态  -->
            <div class="login">
            	
                <span>欢迎回来，admin</span>
                <a href="${pageContext.request.contextPath }/myfavorite.action" class="collection">我的收藏</a>
                <a href="javascript:;">退出</a>
            </div>
        </div>
        <div class="header_wrap">
            <div class="topbar">
                <div class="logo">
                    <a href="/"><img src="${pageContext.request.contextPath }/statics/images/logo.jpg" alt=""></a>
                </div>
                <div class="search">
                    <input name="" type="text" placeholder="请输入路线名称" class="search_input" autocomplete="off">
                    <a href="javascript:;" class="search-button">搜索</a>
                </div>
                <div class="hottel">
                    <div class="hot_pic">
                        <img src="${pageContext.request.contextPath }/statics/images/hot_tel.jpg" alt="">
                    </div>
                    <div class="hot_tel">
                        <p class="hot_time">客服热线(9:00-6:00)</p>
                        <p class="hot_num">400-618-9090</p>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- 头部 end -->
     <!-- 首页导航 -->
    <div class="navitem"> 
        <ul class="nav">
            <li class="nav-active"><a href="${pageContext.request.contextPath }/index.action">首页</a></li>
            <li><a href="${pageContext.request.contextPath }/route_list.action">门票</a></li>
            <li><a href="${pageContext.request.contextPath }/Hotel.action">酒店</a></li>
            <li><a href="${pageContext.request.contextPath }/Hongkong_ticket.action">香港车票</a></li>
            <li><a href="${pageContext.request.contextPath }/Outbound_travel.action">出境游</a></li>
            <li><a href="${pageContext.request.contextPath }/Domestic_tourism.action">国内游</a></li>
            <li><a href="${pageContext.request.contextPath }/Hong_Kong_and_Macao_travel.action">港澳游</a></li>
            <li><a href="${pageContext.request.contextPath }/Mass_customization.action">抱团定制</a></li>
            <li><a href="${pageContext.request.contextPath }/Global_Free_Travel.action">全球自由行</a></li>
            <li><a href="${pageContext.request.contextPath }/favoriterank.action">收藏排行榜</a></li>
        </ul>
    </div>
    