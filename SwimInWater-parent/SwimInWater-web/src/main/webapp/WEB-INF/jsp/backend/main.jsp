<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="page-title">
	<div class="title_left">
		<h3>
			<h3>
			欢迎你：${devUserSession.UName }<strong> | 
			角色：<c:if test="${devUserSession.URole==1}">管理员</c:if>
				<c:if test="${devUserSession.URole==2}">未知的</c:if></strong>
			</h3>
		</h3>
	</div>
</div>
<div class="clearfix"></div>        
<%@include file="common/footer.jsp" %>  
     