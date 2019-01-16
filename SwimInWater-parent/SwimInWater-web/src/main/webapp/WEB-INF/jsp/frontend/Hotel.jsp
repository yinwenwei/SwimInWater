<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>黑马旅游-搜索</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/common.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/search.css">
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.3.1.js"></script>
</head>
<body>
<!--引入头部-->
<div id="header"><%@ include file="header.jsp" %></div>
    <div class="page_one">
        <div class="contant">
            <div class="crumbs">
                <img src="${pageContext.request.contextPath}/statics/images/search.png" alt="">
                <p>黑马旅行><span>搜索结果</span></p>
            </div>
            
            <div class="xinxi clearfix">
                <div class="left">
                    <div class="header">
                        <span>商品信息</span>
                        <span class="jg">价格</span>
                    </div>
                    <ul>
                    	<c:forEach items="${pageBean.list }" var="hotelList">
                        <li>
                            <div class="img"><img src="${pageContext.request.contextPath}${hotelList.pRelativePath}" alt=""></div>
                            <div class="text1">
                                <p>${hotelList.hName }</p>
                                <br/>
                                <p>${hotelList.hContent }</p>
                            </div>
                            <div class="price">
                                <p class="price_num">
                                    <span>&yen;</span>
                                    <span>${hotelList.hPrice }</span>
                                    <span>起</span>
                                </p>
                                <p><a href="route_detail.html">查看详情</a></p>
                            </div>
                        </li>
                        </c:forEach>
                        
                    </ul>
                    <div class="page_num_inf">
                                                          共${pageBean.totalCount }条记录
							<span>${pageBean.currentPage }</span><span>/${pageBean.pageCount }</span>页
                    </div>
                    <div class="pageNum">
                        <ul>
                            <li><a href="Hotel.action?currentPage=1">首页</a></li>
                            <li class="threeword"><a href="Hotel.action?currentPage=${pageBean.prev }">上一页</a></li>
                            <li class="threeword"><a href="Hotel.action?currentPage=${pageBean.next }">下一页</a></li>
                            <li class="threeword"><a href="Hotel.action?currentPage=${pageBean.pageCount }">末页</a></li>
                        </ul>
                    </div>
                </div>
                <div class="right">
                    <div class="top">
                        <div class="hot">HOT</div>
                        <span>热门推荐</span>
                    </div>
                    <ul>
                        <li>
                            <div class="left"><img src="${pageContext.request.contextPath}/statics/images/04-search_09.jpg" alt=""></div>
                            <div class="right">
                                <p>清远新银盏温泉度假村酒店/自由行套...</p>
                                <p>网付价<span>&yen;<span>899</span>起</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="left"><img src="${pageContext.request.contextPath}/statics/images/04-search_09.jpg" alt=""></div>
                            <div class="right">
                                <p>清远新银盏温泉度假村酒店/自由行套...</p>
                                <p>网付价<span>&yen;<span>899</span>起</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="left"><img src="${pageContext.request.contextPath}/statics/images/04-search_09.jpg" alt=""></div>
                            <div class="right">
                                <p>清远新银盏温泉度假村酒店/自由行套...</p>
                                <p>网付价<span>&yen;<span>899</span>起</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="left"><img src="${pageContext.request.contextPath}/statics/images/04-search_09.jpg" alt=""></div>
                            <div class="right">
                                <p>清远新银盏温泉度假村酒店/自由行套...</p>
                                <p>网付价<span>&yen;<span>899</span>起</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="left"><img src="${pageContext.request.contextPath}/statics/images/04-search_09.jpg" alt=""></div>
                            <div class="right">
                                <p>清远新银盏温泉度假村酒店/自由行套...</p>
                                <p>网付价<span>&yen;<span>899</span>起</span>
                                </p>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <!--引入头部-->
    <div id="footer"><%@ include file="footer.jsp" %></div>
    <!--导入布局js，共享header和footer-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/include.js"></script>
</body>

</html>