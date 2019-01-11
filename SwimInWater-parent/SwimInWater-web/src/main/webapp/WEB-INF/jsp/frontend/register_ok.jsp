<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>注册</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/common.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/register.css">
		<!--导入jquery-->
		<script src="/staticsjs/jquery-3.3.1.js"></script>
    </head>
    <body>
    <!--引入头部-->
    <div id="header"><%@ include file="header.jsp" %></div>
        <!-- 头部 end -->
    	<div style="text-align:center;red:yellow;font-weight:bold;height:150px;padding-top:100px;font-size:30px;">
    		<h4>恭喜，注册成功！请登录您的注册邮箱进行激活您的账号，激活后才能登录。</h4>
    	</div>
        <!--引入尾部-->
    	<div id="footer"><%@ include file="footer.jsp" %></div>
    <!--导入布局js，共享header和footer-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/include.js"></script>
    </body>
</html>