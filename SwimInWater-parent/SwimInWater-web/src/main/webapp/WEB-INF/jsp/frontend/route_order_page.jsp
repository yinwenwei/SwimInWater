<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>路线详情</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/common.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/route-detail.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/search.css">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/bootstrap-spinner.css">
    <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/jquery.spinner.js"></script>

    <style type="text/css">
        .process_bar{width:100%;height:40px;font-size:16px;text-align: center;}
        .process_bar ul li{float:left;height:40px;line-height:40px;text-align:center;color:#969a9d;background-color:#e7e8e9}
        .process_bar ul li span{font-family:Times Roman;font-size:20px}
        .process_bar ul .step_1{background-color:#fe9c00;color:#f5f8fa}
        .process_bar .online li{width:394px;margin-right: 2px;}
        .process_bar .online{}
        .process_bar {
            width: 1188px;
            margin: 20px auto;
        }
        #contain_body{
            width:100%;
            height:140px;
            ont-size:13px;
            text-align: center;
        }
        .footer {
            position: fixed;
            left: 0px;
            bottom: 0px;
            margin: 0px;
            width: 100%;
            height: 70px;
            background-color: #eee;
            z-index: 9999;
        }

    </style>
</head>

<body>
<!--引入头部-->
<div id="header"><%@ include file="header.jsp" %></div>
    <!-- 详情 start -->
        <div class="process_bar">
            <ul class="online">
                <li class="step_1"><span>1.</span>填写与核对订单</li>
                <li><span>2.</span>支付</li>
                <li><span>3.</span>成功提交订单</li>
            </ul>
        </div>
        <div id="contain_body">
            <div style="font-size: 20px;width:1188px;margin: 0 auto;text-align: left">
                <span style="color: #fe9c00;">预订信息</span>
            </div>
            <div style="width:1188px;margin: 0 auto;height: 3px;background-color: #fe9c00;"></div>
            <div style="width:1188px;margin: 0 auto;height: 100px;text-align: left;font-size: 15px;" >
                <p style="overflow: hidden;text-overflow:ellipsis;white-space: nowrap;width: 300px"><span >${scenicspot.sName } </span></p>
                <p>${hotel.hName}</p>
                <a style="color: #00bdff;font-weight: bolder">查看景点详情</a>
            </div>

        </div>

        <form action="" class="form-horizontal"  role="form">
            <div class="form-group">
                <label for="dtp_input2" class="col-md-2 control-label">选择日期:</label>
                <div class="input-group date form_date col-md-2" data-date="" data-date-format="yyyy MM dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                    <input class="form-control" size="16" type="text" value="" readonly  >
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>
                <label for="dtp_input2" class="col-md-2 control-label" style="margin-top: 15px">选择数量:</label>

                <div class="input-group spinner col-md-2" data-trigger="spinner" style="margin-top: 17px;">
                    <input type="text" class="form-control text-center" value="1" data-rule="quantity" readonly>
                    <div class="input-group-addon">
                        <a href="javascript:;" class="spin-up" data-spin="up"><i class="fa fa-caret-up"></i></a>
                        <a href="javascript:;" class="spin-down" data-spin="down"><i class="fa fa-caret-down"></i></a>
                    </div>
                </div>

                <input type="hidden" id="dtp_input2" value="" /><br/>
            </div>

        </form>
        <!-- ---- process_bar   ------------------------ -->
        <div class="you_need_konw">
            <span>旅游须知</span>
            <div class="notice">
                <p>1、旅行社已投保旅行社责任险。建议游客购买旅游意外保险 <br>

                <p>2、旅游者参加打猎、潜水、海边游泳、漂流、滑水、滑雪、滑草、蹦极、跳伞、滑翔、乘热气球、骑马、赛车、攀岩、水疗、水上飞机等属于高风险性游乐项目的，敬请旅游者务必在参加前充分了解项目的安全须知并确保身体状况能适应此类活动；如旅游者不具备较好的身体条件及技能，可能会造成身体伤害。</p>

                <p>3、参加出海活动时，请务必穿着救生设备。参加水上活动应注意自己的身体状况，有心脏病、冠心病、高血压、感冒、发烧和饮酒及餐后不可以参加水上活动及潜水。在海里活动时，严禁触摸海洋中各种鱼类，水母，海胆，珊瑚等海洋生物，避免被其蛰伤。老人和小孩必须有成年人陪同才能参加合适的水上活动。在海边游玩时，注意保管好随身携带的贵重物品。</p>

                <p>4、根据中国海关总署的规定，旅客在境外购买的物品，在进入中国海关时可能需要征收关税。详细内容见《中华人民共和国海关总署公告2010年第54号文件》。</p>

                <p>5、建议出发时行李托运，贵重物品、常用物品、常用药品、御寒衣物等请随身携带，尽量不要托运。行李延误属于不可抗力因素，我司将全力协助客人跟进后续工作，但我司对此不承担任何责任。</p>
                <p>1、旅行社已投保旅行社责任险。建议游客购买旅游意外保险 <br>

                <p>2、旅游者参加打猎、潜水、海边游泳、漂流、滑水、滑雪、滑草、蹦极、跳伞、滑翔、乘热气球、骑马、赛车、攀岩、水疗、水上飞机等属于高风险性游乐项目的，敬请旅游者务必在参加前充分了解项目的安全须知并确保身体状况能适应此类活动；如旅游者不具备较好的身体条件及技能，可能会造成身体伤害。</p>

                <p>3、参加出海活动时，请务必穿着救生设备。参加水上活动应注意自己的身体状况，有心脏病、冠心病、高血压、感冒、发烧和饮酒及餐后不可以参加水上活动及潜水。在海里活动时，严禁触摸海洋中各种鱼类，水母，海胆，珊瑚等海洋生物，避免被其蛰伤。老人和小孩必须有成年人陪同才能参加合适的水上活动。在海边游玩时，注意保管好随身携带的贵重物品。</p>

                <p>4、根据中国海关总署的规定，旅客在境外购买的物品，在进入中国海关时可能需要征收关税。详细内容见《中华人民共和国海关总署公告2010年第54号文件》。</p>

                <p>5、建议出发时行李托运，贵重物品、常用物品、常用药品、御寒衣物等请随身携带，尽量不要托运。行李延误属于不可抗力因素，我司将全力协助客人跟进后续工作，但我司对此不承担任何责任。</p>
            </div>           
        </div>
        <!-- ----------------------------------- -->
        <div class="footer row" style="text-align: left;">
            <div class="col-md-3" ></div>
            <div class="col-md-3" ></div>
            <div class="col-md-2" ></div>

            <div class="col-md-1" >
                <p style="margin-top: 22px;">订单总金额:</p>
            </div>

            <div class="col-md-1" ></div>

            <div class="col-md-1" >
                <button type="button" class="btn btn-danger" style="font-size: 16px;font-weight: bold;margin-top: 16px;width: 130px;">去支付</button>
            </div>


        </div>

    <!--引入头部-->
    <div id="footer"><%@ include file="footer.jsp" %></div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${pageContext.request.contextPath}/statics/js/jquery-2.1.0.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/statics/js/bootstrap.min.js"></script>
    <!--导入布局js，共享header和footer-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-1.8.3.min.js" charset="UTF-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
    <%-- <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/include.js"></script> --%>

<script type="text/javascript">
    $('.form_datetime').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        forceParse: 0,
        showMeridian: 1
    });
    $('.form_date').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2,
        forceParse: 0
    });
    $('.form_time').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 1,
        minView: 0,
        maxView: 1,
        forceParse: 0
    });
</script>

</body>

</html>