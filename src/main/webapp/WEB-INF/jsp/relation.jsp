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
		<title>益世商务查询工具</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="shortcut icon" href="<%=basePath%>leaf.ico" type="image/x-icon"/>
		<link rel=”icon” href="<%=basePath%>leaf.ico" type="image/x-icon" />
　		<link rel="bookmark" href="<%=basePath%>leaf.ico" type="image/x-icon" />
		<!-- basic styles -->

		<link href="<%=basePath%>/static/assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="<%=basePath%>/static/assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="<%=basePath%>/static/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
		
		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="<%=basePath%>/static/assets/css/jquery-ui-1.10.3.custom.min.css" />
		<link rel="stylesheet" href="<%=basePath%>/static/assets/css/chosen.css" />
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
		
		<style type="text/css">
					#toTop {
		    /*选中的背景图片的大小*/
		    width: 24px;
		    height: 24px;
		    display: none;/*刚开始不显示*/
		    position: fixed;
		    right: 10px;/*距离右边大小值*/
		    bottom: 20px;/*距离底部大小值*/
		    /*选定图片区域*/
		    background-image: url(<%=basePath%>/static/assets/image/top.png);
		    background-repeat: no-repeat;
		    opacity: 0.3; /*透明度*/
		}
		
		#toTop:hover {
		    opacity: 1;/*悬停时不透明*/
		    filter: alpha(opacity = 100);
		}
		
		</style>
	</head>

	<body style="background:#fff;font-family:微软雅黑">
		<div class="page-content">
			<div class="row">
				<div class="col-xs-12">
					<!-- PAGE CONTENT BEGINS -->
					<form class="form-inline">
						<fieldset id="form-field-set">
							  <div class="form-group">
							  	<label class="sr-only" for="datasource">datasource</label>
							    <select class="form-control chosen-select" name="datasource" id="datasource" data-toggle="tooltip" data-placement="top" title="选择环境">
								 <!--  <option value="LOCAL">本地</option> -->
								  <option value="FUNC">功能</option>
								  <option value="AUTO">自动化</option>
                                  <option value="DEV">开发</option>
								</select>
							  </div>
							  <div class="form-group">
							  	<label class="sr-only" for="columnName">columnName</label>
							    <select class="form-control chosen-select" name="columnName" id="columnName" data-toggle="tooltip" data-placement="top" title="列名限制">
							    	<c:forEach var="column" items="${columns }">
							    		<option value="${column }">${column }</option>
							    	</c:forEach>
								</select>
							  </div>
							  <div class="form-group">
						  		<div class="input-group">
									<input type="text" class="form-control search-query data-popover" placeholder="${primaryKey }" id="byId" data-toggle="popover" data-trigger="focus" title="" 
									data-content="限定列查询" data-placement="bottom">
									<!-- 因为form中只有一个input=text 避免回车自动提交 增加一个隐藏的 -->
									<input type="text" disabled="disabled" style="display: none"/>
									<span class="input-group-btn">
										<button type="button" id="queryById" class="btn btn-purple btn-sm" data-loading-text="searching">
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
							<c:forEach var="tableName" items="${tableNames }">
					    		<div class="table-header danger" >
									<span class="label label-xlg label-success arrowed-in-right">${tableName }</span>
								</div>
								<div class="table-responsive">
									<table id="query-table_${tableName }" class="table table-striped table-bordered table-hover">
										<thead id="result-thead_${tableName }">
										</thead>
										<tbody id="result-tbody_${tableName }">
										</tbody>
									</table>
								</div>
								<div class="space-12"></div>
							</c:forEach>
						</div>
					</div>
					<!-- PAGE CONTENT ENDS -->
				</div><!-- /.col -->
			</div><!-- /.row -->
			<a href="#" target="_self" id="toTop" title="top" onclick="window.scrollTo(0,0);return false"></a>
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
		<script src="<%=basePath%>/static/assets/js/chosen.jquery.min.js"></script>
		<!-- ace scripts -->
		
		<script src="<%=basePath%>/static/assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath%>/static/assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">


			//查询结果表格
			jQuery(function($){
				$('.data-popover').popover('hide');
				
				$('#queryById').click(function () {
					var $byId = $('#byId');
					var $id= $byId.val();
					if(null===$id || ""===$id.trim()){
						$byId.val('');
						$byId.focus();
						return false;
					}
					var $btn = $(this).button('loading');
					$.ajax({
						type : 'post',
						dateType:'json',
						url : '<%=basePath%>' + 'query/${location }/byParams.do',
						contentType: "application/x-www-form-urlencoded; charset=utf-8", 
						data :{
							columnName:$('#columnName option:selected').val(),
							columnValue:$id,
							datasource:$('#datasource option:selected').val()
						},
						timeout : 15000,
						beforeSend : function(XMLHttpRequest) {
						    disableForm();
						},
						cache : false,
						success : function(r) {
						    $btn.button('reset');
						    enableForm();
							var obj = $.parseJSON(r);
							if (obj.success) {
								//添加表格数据
								var entities = obj.entities;
								for(var i=0;i<entities.length;i++){
									var qr = entities[i];
									$('#result-thead_'+qr.tableName).html(qr.thead);
									$('#result-tbody_'+qr.tableName).html(qr.tbody);
								}
							} else {
								showModal(obj.message,false);
							}
						},
						error: function (xmlHttpRequest) {
//                            tbody.html("");
							showModal(JSON.stringify(xmlHttpRequest),false);
							$btn.button('reset');
						    enableForm();
				        }
					});
				});
				
			});//end $jquery


            //删除数据
            function deleteAction(id,tableName){
                //展示删除的modal
                $('#delete-modal').modal('show');

                $('#confirmBtn').click(function(){
                    $.ajax({
                        type : 'post',
                        dataType: 'json',
                        url: '<%=basePath%>' + 'delete/${location }/deleteById.do',
                        contentType: "application/x-www-form-urlencoded; charset=utf-8",
                        data: {
                            id: id,
                            tableName:tableName,
                            datasource:$('#datasource option:selected').val()
                        },
                        timeout: 15000,
                        beforeSend : function(XMLHttpRequest){
                        },
                        cache: false,
                        success: function(r){
                            console.log(r);
                            var obj = r;
//                            showModal(obj.message,true);
                        },
                        error: function(XMLHttpRequest){
                            $('#delete-modal').modal('hide');
                            showModal(JSON.stringify(XMLHttpRequest),false);
                        }
                    });
                });
            }

            <%--var refreshTable = function() {--%>
                <%--var $byId = $('#byId');--%>
                <%--var $id= $byId.val();--%>

                <%--$.ajax({--%>
                    <%--type : 'post',--%>
                    <%--dateType:'json',--%>
                    <%--url : '<%=basePath%>' + 'query/${location }/byParams.do',--%>
                    <%--contentType: "application/x-www-form-urlencoded; charset=utf-8",--%>
                    <%--data :{--%>
                        <%--columnName:$('#columnName option:selected').val(),--%>
                        <%--columnValue:$id,--%>
                        <%--datasource:$('#datasource option:selected').val()--%>
                    <%--},--%>
                    <%--timeout : 15000,--%>
                    <%--beforeSend : function(XMLHttpRequest) {--%>
                        <%--disableForm();--%>
                    <%--},--%>
                    <%--cache : false,--%>
                    <%--success : function(r) {--%>
                        <%--var obj = $.parseJSON(r);--%>
                        <%--if (obj.success) {--%>
                            <%--//添加表格数据--%>
                            <%--var entities = obj.entities;--%>
                            <%--for(var i=0;i<entities.length;i++){--%>
                                <%--var qr = entities[i];--%>
                                <%--$('#result-thead_'+qr.tableName).html(qr.thead);--%>
                                <%--$('#result-tbody_'+qr.tableName).html(qr.tbody);--%>
                            <%--}--%>
                        <%--} else {--%>
                            <%--showModal(obj.message,false);--%>
                        <%--}--%>
                    <%--},--%>
                    <%--error: function (xmlHttpRequest) {--%>
<%--//                            tbody.html("");--%>
                        <%--showModal(JSON.stringify(xmlHttpRequest),false);--%>
                        <%--$btn.button('reset');--%>
                        <%--enableForm();--%>
                    <%--}--%>
                <%--});--%>
            <%--};--%>

			function toTopHide(){
			    $(document).scrollTop()>300?$("#toTop").show():$("#toTop").hide();
			}
			
			$(window).scroll(function(){
				toTopHide();
			});
			
			
			//回车提交
			$('#byId').keydown(function(e){
			    if(e.keyCode==13) {
			    	$('#queryById').click();
			    };
			});
			$('.chosen-select').chosen();
		</script>
	<!-- <div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div> -->
    <%--删除记录弹出层--%>
    <div class="modal fade" id="delete-modal" role="dialog" aria-labelledby="edit-modalModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">提示</h4>
                </div>
                <div class="modal-body">
                    <div class="alert alert-danger">是否删除该记录？删除后不可恢复!</div>
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
