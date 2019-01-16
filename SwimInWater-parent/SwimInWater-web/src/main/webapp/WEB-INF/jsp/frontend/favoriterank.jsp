<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>收藏排行榜</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/statics/css/common.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/statics/css/ranking-list.css">
        <script src="js/jquery-3.3.1.js"></script>
    </head>
    <body>
    <!--引入头部-->
    <div id="header"><%@ include file="header.jsp" %></div>
        <div class="contant">
            
            <div class="list clearfix">
                <ul>
                <c:forEach items="${collectionList }" var="collectionList" varStatus="sta">
                    <li>
                        <span class="num one" style="background-color: 00bdff">${sta.index+1 }</span>
                        <a href="route_detail.html"><img src="${pageContext.request.contextPath }${collectionList.pRelativePath}" alt=""></a>
                        <h4><a href="route_detail.html">[${collectionList.sCity }]${collectionList.sContent }</a></h4>
                        <p>
                            <b class="price">&yen;<span>${collectionList.sPrice }</span>起</b>
                            <span class="shouchang">已收藏${collectionList.sCollectionNum }次</span>
                        </p>
                    </li>
                  </c:forEach>  
                </ul>
            </div>
           
        </div>
    	
         <!--导入底部-->
   		 <div id="footer"><%@ include file="footer.jsp" %></div>
    <!--导入布局js，共享header和footer-->
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/include.js"></script>
    </body>
</html>