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
        <form class="form-horizontal form-label-left" action="${pageContext.request.contextPath }/dev/flatform/user/doAdd.action" 
        method="post" enctype="multipart/form-data">
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">景点名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="SName" class="form-control col-md-7 col-xs-12" 
               data-validate-length-range="20" data-validate-words="1" name="SName"  required="required"
               placeholder="请输入景点名称" type="text">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">所属城市 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="SCity" class="form-control col-md-7 col-xs-12" 
               data-validate-length-range="20" data-validate-words="1" name="SCity"  required="required"
               placeholder="请输入所属城市" type="text">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">所属地区<span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select name="SRegion" id="flatformId" class="form-control"   required="required">
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
              <textarea id="SContent" name="SContent"     required="required"
              placeholder="请输入景点相关内容，本信息作为景点的详细信息进行景点的介绍。" class="form-control col-md-7 col-xs-12"></textarea>
            </div>
          </div>
          
           <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="number">景点价格$ <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="number" id="SPrice" name="SPrice"   required="required"
              data-validate-minmax="10,500"  placeholder="请输入金额$" class="form-control col-md-7 col-xs-12">
            </div>
          </div>
          
         
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">发布状态 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select name="SStatus" id="flatformId" class="form-control"   required="required">
              		<c:if test="${findDictionary != null }">
						<c:forEach var="FD" items="${findDictionary }">
							<option value="${FD.DContentId}">${FD.DContentName}</option>
						</c:forEach>
					</c:if>
              </select>
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">景点图片 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="file" class="form-control col-md-7 col-xs-12" name="spic" id="spic"/>
            <input type="file" class="form-control col-md-7 col-xs-12" name="spic" id="spic"/>
            <input type="file" class="form-control col-md-7 col-xs-12" name="spic" id="spic"/>
            <input type="file" class="form-control col-md-7 col-xs-12" name="spic" id="spic"/>
            <input type="file" class="form-control col-md-7 col-xs-12" name="spic" id="spic"/>
            <input type="file" class="form-control col-md-7 col-xs-12" name="spic" id="spic"/>
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">酒店名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="HName" class="form-control col-md-7 col-xs-12" 
               data-validate-length-range="20" data-validate-words="1" name="HName"  required="required"
               placeholder="请输入酒店名称" type="text">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">酒店等级 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select name="HGrage" id="flatformId" class="form-control"   required="required">
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
              <input type="number" id="HPrice" name="HPrice"   required="required"
              data-validate-minmax="10,500"  placeholder="请输入金额$" class="form-control col-md-7 col-xs-12">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">酒店详情<span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea id="HContent" name="HContent"     required="required"
              placeholder="请输入酒店相关内容，本信息作为酒店的详细信息进行酒店的介绍。" class="form-control col-md-7 col-xs-12"></textarea>
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">酒店图片 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="file" class="form-control col-md-7 col-xs-12" name="hpic" id="hpic"/>
            <input type="file" class="form-control col-md-7 col-xs-12" name="hpic" id="hpic"/>
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">线路名称<span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="LName" class="form-control col-md-7 col-xs-12" 
               data-validate-length-range="20" data-validate-words="1" name="LName"  required="required"
               placeholder="请输入线路名称" type="text">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">线路说明<span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea id="LContent" name="LContent"     required="required"
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
    <br/><br/>
  </div>
</div>
<%@include file="common/footer.jsp"%>
<script src="${pageContext.request.contextPath }/statics/localjs/appcheck.js"></script>