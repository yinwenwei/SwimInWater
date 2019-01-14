<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
<div class="row">
  <div class="col-md-12 col-sm-12 col-xs-12">
    <div class="x_panel">
      <div class="x_title">
        <h2>添加景点信息 <i class="fa fa-user"></i>&nbsp;${devUserSession.UName }</small></h2>
             <div class="clearfix"></div>
      </div>
      <div class="x_title">
            <h2>景点基础信息</h2>
          <div class="clearfix"></div>
      </div>
      <div class="x_content1">
        <form class="form-horizontal form-label-left" action="${pageContext.request.contextPath }/dev/flatform/user/doAdd.action" method="post">
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">景点名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="softwareName" class="form-control col-md-7 col-xs-12" 
               data-validate-length-range="20" data-validate-words="1" name="sName"  required="required"
               placeholder="请输入景点名称" type="text">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">所属城市 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="softwareName" class="form-control col-md-7 col-xs-12" 
               data-validate-length-range="20" data-validate-words="1" name="sCity"  required="required"
               placeholder="请输入所属城市" type="text">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">所属地区<span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select name=sRegion id="flatformId" class="form-control"   required="required">
              		<c:if test="${findDictionary3 != null }">
						<c:forEach var="FD3" items="${findDictionary3 }">
							<option value="${FD3.DContentId}">${FD3.DContentName}</option>
						</c:forEach>
					</c:if>
              </select>
            </div>
          </div>
          
          
           <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">景点内容<span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea id="appInfo" name="sContent"     required="required"
              placeholder="请输入景点相关内容，本信息作为景点的详细信息进行景点的介绍。" class="form-control col-md-7 col-xs-12"></textarea>
            </div>
          </div>
          
           <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="number">景点价格$ <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="number" id="downloads" name="sPrice"   required="required"
              data-validate-minmax="10,500"  placeholder="请输入金额$" class="form-control col-md-7 col-xs-12">
            </div>
          </div>
          
         
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">发布状态 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select name="sStatus" id="flatformId" class="form-control"   required="required">
              		<c:if test="${findDictionary != null }">
						<c:forEach var="FD" items="${findDictionary }">
							<option value="${FD.DContentId}">${FD.DContentName}</option>
						</c:forEach>
					</c:if>
              </select>
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">酒店名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="softwareName" class="form-control col-md-7 col-xs-12" 
               data-validate-length-range="20" data-validate-words="1" name="hName"  required="required"
               placeholder="请输入酒店名称" type="text">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">酒店等级 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select name="hGrage" id="flatformId" class="form-control"   required="required">
              		<c:if test="${findDictionary2 != null }">
						<c:forEach var="FD2" items="${findDictionary2 }">
							<option value="${FD2.DContentId }">${FD2.DContentName}</option>
						</c:forEach>
					</c:if>
              </select>
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="number">酒店价格$ <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="number" id="downloads" name="hPrice"   required="required"
              data-validate-minmax="10,500"  placeholder="请输入金额$" class="form-control col-md-7 col-xs-12">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">酒店详情<span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea id="appInfo" name="hContent"     required="required"
              placeholder="请输入酒店相关内容，本信息作为酒店的详细信息进行酒店的介绍。" class="form-control col-md-7 col-xs-12"></textarea>
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">线路名称<span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="softwareName" class="form-control col-md-7 col-xs-12" 
               data-validate-length-range="20" data-validate-words="1" name="lName"  required="required"
               placeholder="请输入线路名称" type="text">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">线路说明<span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea id="appInfo" name="lContent"     required="required"
              placeholder="请输入线路相关内容，本信息作为线路的详细信息进行线路的介绍。" class="form-control col-md-7 col-xs-12"></textarea>
            </div>
          </div>
        	<div class="form-group">
        		<div class="col-md-6 col-md-offset-3">
        		<button id="status" type="submit" name="status" value="2" class="btn btn-success">提交</button>
          		<button type="button" class="btn btn-primary" id="back">返回</button>
        		</div>
     		</div>
        </form>
        </div>
        <div class="clearfix"></div>
        <div class="x_title">
            <h2>最新版本信息</h2>
            <ul class="nav navbar-right panel_toolbox">
              <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
              </li>
            </ul>
          <div class="clearfix"></div>
        </div>
        <div class="x_content" style="display: block;">
         <br>
        <form class="form-horizontal form-label-left">
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">版本号 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input class="form-control col-md-7 col-xs-12" value="${appVersion.versionNo }" 
              type="text" readonly="readonly" >
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="number">版本大小 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="number" value="${appVersion.versionSize }" class="form-control col-md-7 col-xs-12">
            </div>
          </div>
       
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">发布状态 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="hidden" name="publishStatus" id="publishStatus" value="3">预发布
            </div>
          </div>
        
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">版本简介 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea class="form-control col-md-7 col-xs-12">
              ${appVersion.versionInfo }</textarea>
            </div>
          </div>
           <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">apk文件 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
            <c:choose> 
			  <c:when test="${appVersion.downloadLink == null || appVersion.downloadLink == ''}">   
			    	暂无
			  </c:when> 
			  <c:otherwise>   
			    <p>${appVersion.apkFileName}&nbsp;&nbsp;
			    <a href="${appVersion.downloadLink}" >下载</a>
			    </p>
			  </c:otherwise> 
            </c:choose> 
            </div>
          </div>
          <div class="clearfix"></div>
          <br/><br/>
        </form>
    </div>
    <div class="clearfix"></div>
    <br/><br/>
  </div>
</div>
<%@include file="common/footer.jsp"%>
<script src="${pageContext.request.contextPath }/statics/localjs/appcheck.js"></script>