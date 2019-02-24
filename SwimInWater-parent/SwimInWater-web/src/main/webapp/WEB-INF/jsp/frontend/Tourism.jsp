<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>黑马旅游-搜索</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/statics/css/common.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/search.css">
    <script src="${pageContext.request.contextPath }/statics/js/jquery-3.3.1.js"></script>
</head>
<body>

<!--引入头部-->
<div id="header">
<%@ include file="header.jsp" %>
</div>
    <div class="page_one">
        <div class="contant">
            <div class="crumbs">
                <img src="${pageContext.request.contextPath }/statics/images/search.png" alt="">
                <p>黑马旅行><span>搜索结果</span></p>
            </div>
            <div class="xinxi clearfix">
                <div class="left">
                    <div class="header">
                        <span>商品信息</span>
                        <span class="jg">价格</span>
                        <input type="hidden" value="${sname }" id="scenNaem"/>
                    </div>
                    <ul>
                    <c:forEach items="${scen.scenList }" var="chainList">
                        <li>
                            <div class="img"><img src="${pageContext.request.contextPath }/${chainList.pRelativePath}" alt=""></div>
                            <div class="text1">
                                <p>${chainList.sName }</p>
                                <br/>
                                <p>[${chainList.sCity }]${chainList.sContent }</p>
                            </div>
                            <div class="price">
                                <p class="price_num">
                                    <span>&yen;</span>
                                    <span>${chainList.sPrice }</span>
                                    <span>起</span>
                                </p>
                                <p><a href="route_detail.html">查看详情</a></p>
                            </div>
                        </li>
                     </c:forEach>
                    </ul>
                    <div class="page_num_inf">
                        	 共${scen.pageSize }条记录
							<span>${scen.pageNo }</span><span>/${scen.pageCount }</span>页
                    </div>
                    <div class="pageNum">
                        <ul>
                            <li><a href="#" page="1">首页</a></li>
                            <li class="threeword"><a href="javaScript:;" page=${scen.prev }>上一页</a></li>
                            <li class="threeword"><a href="javaScript:;" page=${scen.next }>下一页</a></li>
                            <li class="threeword"><a href="javaScript:;" page=${scen.pageCount }>末页</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!--引入头部-->
    <div id="footer"><%@ include file="footer.jsp" %></div>
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery.min.js"></script>
    <script type="text/javascript">
		$(function(){
			var sname=$('#scenNaem').val();
			$('.search_input').val(sname);
				$('.pageNum a').click(function(){
					var page=$(this).attr('page');
					//给pageNo赋值
		  			$('.scenPageNo').val(page);
		  			query();
				});
		});    
    </script>
    <!--导入布局js，共享header和footer-->
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/include.js"></script>
</body>

</html>