<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
<div class="row">

	<div class="col-md-12">
		<div class="x_panel">
			<div class="x_title">
				<h2>
					用户信息管理列表 <i class="fa fa-user"></i><small>${userSession.userName}
						- 您可以通过搜索或者其他的筛选项对用户信息进行审核操作。^_^</small>
				</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<form name="huixie" method="post" action="${pageContext.request.contextPath }/dev/flatform/user/applist.action">
					<input type="hidden" name="pageIndex" value="1" />
			    <ul>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">用户名称</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<input name="uName" type="text" class="form-control col-md-7 col-xs-12" value="${querySoftwareName }">
							</div>
						</div>
					</li>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">手机号</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<input name="uPhone" type="text" class="form-control col-md-7 col-xs-12" value="${querySoftwareName }">
							</div>
						</div>
					</li>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">身份证</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<input name="uIdentity" type="text" class="form-control col-md-7 col-xs-12" value="${querySoftwareName }">
							</div>
						</div>
					</li>
					
					<li><button type="submit" class="btn btn-primary"> 查 &nbsp;&nbsp;&nbsp;&nbsp;询 </button></li>
				</ul>
			</form>
		</div>
	</div>
</div>
<div class="col-md-12 col-sm-12 col-xs-12">
	<div class="x_panel">
		<div class="x_content">
			<p class="text-muted font-13 m-b-30"></p>
			<div id="datatable-responsive_wrapper"
				class="dataTables_wrapper form-inline dt-bootstrap no-footer">
				<div class="row">
					<div class="col-sm-12">
						<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed"
							cellspacing="0" width="100%" role="grid" aria-describedby="datatable-responsive_info" style="width: 100%;">
							<thead>
								<tr role="row">
									<th class="sorting_asc" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 50px;" aria-label="First name: activate to sort column descending"
										aria-sort="ascending">用户ID</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 50px;"
										aria-label="Last name: activate to sort column ascending">
										用户名称</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 50px;"
										aria-label="Last name: activate to sort column ascending">
										手机号</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 50px;"
										aria-label="Last name: activate to sort column ascending">
										性别</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 50px;"
										aria-label="Last name: activate to sort column ascending">
										身份证</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 50px;"
										aria-label="Last name: activate to sort column ascending">
										用户角色</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 50px;"
										aria-label="Last name: activate to sort column ascending">
										操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="userL" items="${userList}" varStatus="status">
									<tr role="row" class="odd">
										<td tabindex="0" class="sorting_1">${userL.id}</td>
										<td>${userL.UName }</td>
										<td>${userL.UPhone }</td>
										<c:if test="${userL.USex ==1}">
											<td>男</td>
										</c:if>
										<c:if test="${userL.USex ==2}">
											<td>女</td>
										</c:if>
										
										<td>${userL.UIdentity }</td>
										<c:if test="${userL.URole ==1}">
											<td>管理员</td>
										</c:if>
										<c:if test="${userL.URole ==2}">
											<td>用户</td>
										</c:if>
										<td>
										<div class="btn-group">
                      							<button type="button" class="btn btn-danger">点击操作  </button>
                      							<button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        							<span class="caret"></span>
                       								<span class="sr-only">Toggle Dropdown</span>
                     							 </button>
                      							<ul class="dropdown-menu" role="menu">
                      								
                        							<li>
                        								<a class="uplrole1"appinfoid="${userL.id}" data-toggle="tooltip" data-placement="top" title="" data-original-title="">切换角色</a>
                        							</li>
                      							</ul>
                    						</div>
										</td>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-5">
						<div class="dataTables_info" id="datatable-responsive_info"
							role="status" aria-live="polite">共${totalCount}条记录
							${currentPage }/${pageCount }页</div>
					</div>
					<div class="col-sm-7">
						<div class="dataTables_paginate paging_simple_numbers"
							id="datatable-responsive_paginate">
							<ul class="pagination">
									<li class="paginate_button previous"><a
										href="javascript:page_nav(document.forms[0],1);"
										aria-controls="datatable-responsive" data-dt-idx="0"
										tabindex="0">首页</a>
									</li>
									<c:if test="${currentPage>1}">
									<li class="paginate_button "><a
										href="javascript:page_nav(document.forms[0],${currentPage-1});"
										aria-controls="datatable-responsive" data-dt-idx="1"
										tabindex="0">上一页</a>
									</li>
									</c:if>
									<c:if test="${currentPage < pageCount}">
									<li class="paginate_button "><a
										href="javascript:page_nav(document.forms[0],${currentPage+1 });"
										aria-controls="datatable-responsive" data-dt-idx="1"
										tabindex="0">下一页</a>
									</li>
									</c:if>
									<li class="paginate_button next"><a
										href="javascript:page_nav(document.forms[0],${pageCount});"
										aria-controls="datatable-responsive" data-dt-idx="7"
										tabindex="0">最后一页</a>
									</li>
							</ul>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
</div>
</div>
<%@include file="common/footer.jsp"%>
<script src="${pageContext.request.contextPath }/statics/localjs/rollpage.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/applist.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery.min.js"></script>
<script type="text/javascript">
	function page_nav(frm,num){
	  		$("[name='pageIndex']").val(num);
	 	 	$("[name='huixie']").submit();
	}
	$(function(){
		$(".uplrole1").click(function(){
			var id=$(this).attr("appinfoid");
			var url="${pageContext.request.contextPath }/dev/flatform/user/URole.action?Rid="+id;
				$.ajax({
						type :"GET",
						url :url,
						dataType :"json",
						success : function(data){
							if(data==1){
								location.reload();
							}
						}
					});
		});
	});
	
</script>
