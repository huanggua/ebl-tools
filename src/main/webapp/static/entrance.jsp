<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	request.setAttribute("basePath",basePath);
%>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<base href="<%=basePath%>">
		<meta charset="utf-8" />
		<title>营销平台活动查询工具</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		
		<!-- basic styles -->

		<link href="<%=basePath%>/static/assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="<%=basePath%>/static/assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="<%=basePath%>/static/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
		
		<!-- page specific plugin styles -->

		<!-- fonts -->

		<!-- <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" /> -->

		<!-- ace styles -->

		<link rel="stylesheet" href="<%=basePath%>/static/assets/css/ace.min.css" />
		<link rel="stylesheet" href="<%=basePath%>/static/assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="<%=basePath%>/static/assets/css/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="<%=basePath%>/static/assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->

		<script src="<%=basePath%>/static/assets/js/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="<%=basePath%>/static/assets/js/html5shiv.js"></script>
		<script src="<%=basePath%>/static/assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body style="background:#fff">
		<div class="page-content">
			<div class="row">
				<div class="col-xs-12">
					<!-- PAGE CONTENT BEGINS -->
					<form class="form-inline">
						<fieldset id="form-field-set">
							  <div class="form-group">
							  	<label class="sr-only" for="for-datasource">datasource</label>
							    <select class="form-control" name="datasource" id="datasource">
								  <option value="LOCAL">本地</option>
								  <option value="BETA">闭环</option>
								  <option value="FUNC">功能</option>
								  <option value="HUANGCUN">黄村</option>
                                                                  <option value="CI">CI</option>
								</select>
							  </div>
							  <div class="form-group">
							  		<div class="input-group">
										<input type="text" class="form-control search-query" placeholder="ENTRANCE_ID" id="byId">
										<span class="input-group-btn">
											<button type="button" id="queryById" class="btn btn-purple btn-sm" data-loading-text="searching">
												<i class="icon-search icon-on-right bigger-110"></i>
											</button>
										</span>
									 </div>
							  </div>
							  
							  <div class="form-group">
						  		<div class="input-group">
									<input type="text" id="byWhere" class="form-control search-query data-popover" placeholder="where statement"
									data-toggle="popover" data-trigger="focus" title="" 
									data-content="示例: entrance_id = '1990' and entrance_type='03'" data-placement="bottom">
									<span class="input-group-btn">
										<button type="button" id="queryByWhereCase" class="btn btn-success btn-sm" data-loading-text="searching">
											<i class="icon-search icon-on-right bigger-110"></i>
										</button>
									</span>
								 </div>
							  </div>
						</fieldset>
					</form>
					<div class="space-6"></div>
					
					<div class="row">
						<div class="col-xs-12">
							<div class="table-header" >
							<span class="label label-xlg label-light arrowed-in-right">PROMOTION_ENTRANCE_INFO</span>
							<div class="pull-right" style="margin-right:10px;">
								<button class="btn btn-xs btn-info" id="edit-btn">
									<i class="icon-edit bigger-120"></i>
								</button>
								<button class="btn btn-xs btn-danger" id="delete-btn">
									<i class="icon-trash bigger-120"></i>
								</button>
							</div>
							</div>
							
							<div class="table-responsive">
								<table id="query-table" class="table table-striped table-bordered table-hover">
									<thead id="result-thead">
									</thead>
									<tbody id="result-tbody">
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!-- PAGE CONTENT ENDS -->
				</div><!-- /.col -->
			</div><!-- /.row -->
		</div><!-- /.page-content -->
		<!-- basic scripts -->
		
		<!--[if !IE]> -->

		<script src="<%=basePath%>/static/assets/js/jquery-2.0.3.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
		<![endif]-->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='<%=basePath%>/static/assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='<%=basePath%>/static/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
		</script>
		<![endif]-->

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='<%=basePath%>/static/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="<%=basePath%>/static/assets/js/bootstrap.min.js"></script>
		<script src="<%=basePath%>/static/assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->
		<script src="<%=basePath%>/static/assets/js/jquery.dataTables.min.js"></script>
		<script src="<%=basePath%>/static/assets/js/jquery.dataTables.bootstrap.js"></script>
		<script src="<%=basePath%>/static/assets/app/js/query.js"></script>
		<script src="<%=basePath%>/static/assets/js/jquery.form.js"></script>
		
		<!-- ace scripts -->
		
		<script src="<%=basePath%>/static/assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath%>/static/assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			//查询结果表格
			var thead=$('#result-thead');
			var tbody=$('#result-tbody');
			//上一次查询是通过哪种方式
			var lastQuery = "";
			jQuery(function($){
				$('.data-popover').popover('hide');
				
				$(document).on('click', '#checkAll', function(){
				    $("input[name='checkItem']").prop("checked",this.checked);
				});
				
				$('#queryById').click(function () {
					var $byId = $('#byId');
					var $id= $byId.val();
					if(null===$id || ""===$id.trim()){
						$byId.val('');
						$byId.focus();
						return false;
					}else if(!/^[0-9]*$/.test($id)){
						//如果不是全数字
						showModal('ID输入格式不正确哦!');
						return false;
					}
					var $btn = $(this).button('loading');
					$.ajax({
						type : 'post',
						dateType:'json',
						url : '<%=basePath%>' + 'query/entranceInfo/byId.do',
						contentType: "application/x-www-form-urlencoded; charset=utf-8", 
						data :{id:$id,datasource:$('#datasource option:selected').val()},
						timeout : 15000,
						beforeSend : function(XMLHttpRequest) {
							//disable form
						    disableForm();
						},
						cache : false,
						success : function(r) {
							lastQuery = "byId"
						    $btn.button('reset');
						    enableForm();
							var obj = $.parseJSON(r);
							if (obj.success) {
								thead.html(obj.thead);
								tbody.html(obj.tbody);
							} else {
								tbody.html("");
								showModal(obj.message);
							}
						},
						error: function (xmlHttpRequest) {
							tbody.html("");
							showModal(JSON.stringify(xmlHttpRequest));
							$btn.button('reset');
						    enableForm();
				        },
					});
				});
				
				//通过条件查询请求
				$('#queryByWhereCase').click(function () {
					var $byWhere = $('#byWhere');
					var $where= $byWhere.val();
					if(null===$where || ""===$where.trim()){
						$where.val('');
						$where.focus();
						return false;
					}
					if(/^[0-9]*$/.test($where)){
						return false;  
					}
					var $btn = $(this).button('loading');
					$.ajax({
						type : 'post',
						dateType:'json',
						url : '<%=basePath%>' + 'query/entranceInfo/byWhereCase.do',
						contentType: "application/x-www-form-urlencoded; charset=utf-8", 
						data :{whereCase:$where,datasource:$('#datasource option:selected').val()},
						timeout : 15000,
						beforeSend : function(XMLHttpRequest) {
							//disable form
						    disableForm();
						},
						cache : false,
						success : function(r) {
							lastQuery = "byWhere"
						    $btn.button('reset');
						    enableForm();
							var obj = $.parseJSON(r);
							if (obj.success) {
								thead.html(obj.thead);
								tbody.html(obj.tbody);
							} else {
								tbody.html("");
								showModal(obj.message);
							}
						},
						error: function (xmlHttpRequest) {
							tbody.html("");
							showModal(JSON.stringify(xmlHttpRequest));
							$btn.button('reset');
						    enableForm();
				        },
					});
				});
				
				//保存更改
				$('#saveBtn').click(function(){
					var $btn = $(this).button('loading');
					$('#updateForm').ajaxSubmit({  
				        type: 'post',  
					    beforeSend : function(XMLHttpRequest) {
							//disable form
						    disableForm();
						},
						cache : false,
						success : function(r) {
							var obj = $.parseJSON(r);
							if (obj.success) {
							    $btn.button('reset');
								enableForm();
								$('#edit-modal').modal('hide');
								showModal(obj.message);
								refreshTable();
							} else {
								$btn.button('reset');
								enableForm();
								showModal(obj.message);
							}
						},
						error: function (xmlHttpRequest) {
							$('#edit-modal').modal('hide');
							showModal(JSON.stringify(xmlHttpRequest));
							$btn.button('reset');
				        }
				    });
				})
				
				//编辑数据
				$('#edit-btn').click(function(){
					var $checkedBox = $('input[name="checkItem"]:checkbox:checked');
					if($checkedBox.length === 0){
						showModal('请选中一条记录进行编辑。');
						return false;
					}else if($checkedBox.length > 1){
						showModal('请选中一条记录进行编辑。');
						return false;
					}else{
						//通过数组获取出来的元素只能通过JS来操作
						var checkBox = $checkedBox[0];
						//获取主键的值
						var primary = checkBox.parentNode.parentNode.attributes["name"].value;
						//load数据
						$.ajax({
							type : 'post',
							dateType:'json',
							url : '<%=basePath%>' + 'query/entranceInfo/loadById.do',
							contentType: "application/x-www-form-urlencoded; charset=utf-8", 
							data :{id:primary},
							timeout : 15000,
							beforeSend : function(XMLHttpRequest) {
							},
							cache : false,
							success : function(r) {
								var obj = $.parseJSON(r);
								if (obj.success) {
									$('#update-thead').html(obj.thead);
									$('#update-tbody').html(obj.tbody);
									$('#edit-modal').modal('show');
								} else {
									showModal(obj.message);
								}
							},
							error: function (xmlHttpRequest) {
								showModal(JSON.stringify(xmlHttpRequest));
					        },
						});
					}
				});
				
				//删除记录
				$('#delete-btn').click(function(){
					var $checkedBox = $('input:checkbox:checked');
					if($checkedBox.length === 0){
						showModal('没有选中任何记录。');
						return false;
					}
					//展示删除的modal
					$('#danger-count').html($checkedBox.length-1);
					$('#delete-modal').modal('show');
				});
				
				//确定删除
				$('#confirmBtn').click(function(){
					var ids = '';
					var $checkedBox = $('input[name="checkItem"]:checked');
					for(var i=0;i<$checkedBox.length;i++){
						ids += $checkedBox[i].parentNode.parentNode.attributes["name"].value;
						ids += ',';
					}
					$.ajax({
						type : 'post',
						dateType:'json',
						url : '<%=basePath%>' + 'delete/entranceInfo/deleteByIds.do',
						contentType: "application/x-www-form-urlencoded; charset=utf-8", 
						data :{ids:ids.substring(0,ids.length-1)},
						timeout : 15000,
						beforeSend : function(XMLHttpRequest) {
						},
						cache : false,
						success : function(r) {
							var obj = $.parseJSON(r);
							$('#delete-modal').modal('hide');
							showModal(obj.message);
							refreshTable();
						},
						error: function (xmlHttpRequest) {
							$('#delete-modal').modal('hide');
							showModal(JSON.stringify(xmlHttpRequest));
				        },
					});
				});
			});
			
			//刷新数据 - 在执行了编辑和删除之后刷新
			var refeshTableById = function(param){
				$.ajax({
					type : 'post',
					dateType:'json',
					url : '<%=basePath%>' + 'query/entranceInfo/byId.do',
					contentType: "application/x-www-form-urlencoded; charset=utf-8", 
					data :{id:$('#byId').val(),datasource:$('#datasource option:selected').val()},
					timeout : 15000,
					beforeSend : function(XMLHttpRequest) {
					},
					cache : false,
					success : function(r) {
						var obj = $.parseJSON(r);
						if (obj.success) {
							thead.html(obj.thead);
							tbody.html(obj.tbody);
						} else {
							tbody.html("");
						}
					},
					error: function (xmlHttpRequest) {
			        },
				});
			}
			//更新表格
			var refeshTableByWhereCase = function(param){
				$.ajax({
					type : 'post',
					dateType:'json',
					url : '<%=basePath%>' + 'query/entranceInfo/byWhereCase.do',
					contentType: "application/x-www-form-urlencoded; charset=utf-8", 
					data :{whereCase:$('#byWhere').val(),datasource:$('#datasource option:selected').val()},
					timeout : 15000,
					beforeSend : function(XMLHttpRequest) {
					},
					cache : false,
					success : function(r) {
						var obj = $.parseJSON(r);
						if (obj.success) {
							thead.html(obj.thead);
							tbody.html(obj.tbody);
						} else {
							tbody.html("");
						}
					},
					error: function (xmlHttpRequest) {
			        },
				});
			};
			
			var refreshTable = function() {
				if (lastQuery === "byId") {
					refeshTableById();
				} else if (lastQuery === "byWhere") {
					refeshTableByWhereCase();
				}
			}
		</script>
	<!-- <div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div> -->
	<!-- 更新记录弹出层 -->
	<div class="modal fade" id="edit-modal" role="dialog" aria-labelledby="edit-modalModalLabel">
	  <div class="modal-dialog modal-lg" role="document" style="width:100%">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="edit-modalModalLabel">编辑</h4>
	      </div>
	      <div class="modal-body">
	      	<div class="table-responsive">
	      		  <form id="updateForm" action="<%=basePath%>update/entranceInfo/updateById.do">
	      		  	<fieldset>
					      <table class="table table-striped table-bordered table-hover">
							<thead id="update-thead">
							<!-- 表头 -->
							<tr></tr>
							</thead>
							<tbody id="update-tbody">
							<!-- 表格数据 -->
						  	</tbody>
					      </table>
				     </fieldset>
			      </form>
			 </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	        <button type="button" class="btn btn-primary" id = "saveBtn" data-loading-text="updating">保存</button>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	<!-- 删除记录弹层 -->
	<div class="modal fade" id="delete-modal" role="dialog" aria-labelledby="edit-modalModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">提示</h4>
	      </div>
	      <div class="modal-body">
	      	<div class="alert alert-danger">是否删除选中的<strong id="danger-count"></strong>条记录？删除后不可恢复!</div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	        <button type="button" class="btn btn-danger" id = "confirmBtn" data-loading-text="deleting">确定</button>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
</body>
</html>
