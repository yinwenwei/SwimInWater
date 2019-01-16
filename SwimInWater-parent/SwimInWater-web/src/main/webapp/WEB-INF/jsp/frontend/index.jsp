<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>黑马旅游网</title>
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/statics/css/bootstrap.min.css" rel="stylesheet" >
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/common.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/index.css">
</head>
<body>
	<!--引入头部-->
	<%@ include file="header.jsp" %>
    <div id="header">
    
    </div>
    <!-- banner start-->
    <section id="banner">
        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel" data-interval="2000">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            </ol>
            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="${pageContext.request.contextPath}/statics/images/banner_1.jpg" alt="">
                </div>
                <div class="item">
                    <img src="${pageContext.request.contextPath}/statics/images/banner_2.jpg" alt="">
                </div>
                <div class="item">
                    <img src="${pageContext.request.contextPath}/statics/images/banner_3.jpg" alt="">
                </div>
            </div>
            <!-- Controls -->
            <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
            <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
        </div>
    </section>
    <!-- banner end-->
    <!-- 旅游 start-->
    <section id="content">
         <!-- 黑马精选start-->
        <section class="hemai_jx">
            <div class="jx_top">
                <div class="jx_tit">
                    <img src="${pageContext.request.contextPath}/statics/images/icon_5.jpg" alt="">
                    <span>黑马精选</span>
                </div>
                <!-- Nav tabs -->
                <ul class="jx_tabs" role="tablist">
                    <li role="presentation" class="active">
                        <span></span>
                        <a href="#popularity" aria-controls="popularity" role="tab" data-toggle="tab">人气旅游</a>
                    </li>
                    <li role="presentation">
                        <span></span>
                        <a href="#newest" aria-controls="newest" role="tab" data-toggle="tab">最新旅游</a>
                    </li>
                    <li role="presentation">
                        <span></span>
                        <a href="#theme" aria-controls="theme" role="tab" data-toggle="tab">主题旅游</a>
                    </li>
                </ul>
            </div>
            <div class="jx_content">
                <!-- Tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="popularity">
                        <div class="row">
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_4.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_4.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_4.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_4.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="newest">
                        <div class="row">
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_1.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_1.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_1.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_1.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="theme">
                        <div class="row">
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_2.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_2.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_2.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-3">
                                <a href="javascript:;">
                                    <img src="${pageContext.request.contextPath}/statics/images/jiangxuan_2.jpg" alt="">
                                    <div class="has_border">
                                        <h3>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</h3>
                                        <div class="price">网付价<em>￥</em><strong>889</strong><em>起</em></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- 黑马精选end-->
        
        
        
        <!-- 国内游 start-->
        <c:forEach items="${dictionary_list }" var="diclist" varStatus="dicsta">
        
        <section class="hemai_jx">
            <div class="jx_top">
                <div class="jx_tit">
                    <img src="${pageContext.request.contextPath}/statics/images/icon_6.jpg" alt="">
                    <span>${diclist.DContentName }</span>
                </div>
            </div>
            <div class="heima_gn">
                <div class="guonei_l">
                    <img src="${pageContext.request.contextPath}/statics/images/guonei_1.jpg" alt="">
                </div>
                
                <div class="guone_r">
                    <div class="row">
                    	<c:set var="i" value="0"/>
	                    <c:forEach items="${findScenPicAll }" var="findScenPic" varStatus="sta">
		                   	<c:if test="${findScenPic.sRegion==diclist.DContentId&&i<6}">
		                  	<c:set var="i" value="${i+1 }"/>
		                        <div class="col-md-4">
		                            <a href="${pageContext.request.contextPath }/scenicarea/scenicareaInfo.action?id=${findScenPic.id}&contentName=${diclist.DContentName}">
										<img src="${pageContext.request.contextPath}/statics/images/jiangxuan_4.jpg" alt="">
										<div class="has_border">
											<h3>${findScenPic.sName }</h3>
											<div class="price">网付价<em>￥</em><strong>${findScenPic.sPrice }</strong><em>起</em></div>									
										</div>
									</a>
		                        </div>
		                    </c:if>
	                    </c:forEach>
                    </div>
                </div>
              
            </div>
        </section>
        <!-- 国内游 end-->
      </c:forEach>
      
      
    </section>
    <!-- 旅游 end-->
   <!--导入底部-->
    <div id="footer"></div>
 	<%@ include file="footer.jsp" %>
</body>
</html>
<script src="${pageContext.request.contextPath}/statics/js/jquery-2.1.0.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/bootstrap.min.js"></script>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/include.js"></script> --%>