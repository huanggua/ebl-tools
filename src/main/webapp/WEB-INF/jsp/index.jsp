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
		<link rel="shortcut icon" href="<%=basePath%>leaf.ico" type="image/x-icon"/>
		<link rel=”icon” href="<%=basePath%>leaf.ico" type="image/x-icon" />
		<base href="<%=basePath%>">
		<meta charset="utf-8" />
		<title>益世商务秘书平台查询工具</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- basic styles -->
		<link href="<%=basePath%>static/assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="<%=basePath%>static/assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="<%=basePath%>static/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->

		<!-- fonts -->

		<!-- <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" /> -->

		<!-- ace styles -->

		<link rel="stylesheet" href="<%=basePath%>static/assets/css/ace.min.css" />
		<link rel="stylesheet" href="<%=basePath%>static/assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="<%=basePath%>static/assets/css/ace-skins.min.css" />
		<link rel="stylesheet" href="<%=basePath%>static/assets/app/css/add-tabs.css" />
		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="<%=basePath%>static/assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->

		<script src="<%=basePath%>static/assets/js/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="<%=basePath%>static/assets/js/html5shiv.js"></script>
		<script src="<%=basePath%>static/assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body style="background:#fff;font-family:微软雅黑">
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="javascript:void(0)" class="navbar-brand">
						<small>
							<i class="icon-leaf"></i>
							EBL Util
						</small>
					</a><!-- /.brand -->
				</div><!-- /.navbar-header -->
				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="<%=basePath%>static/assets/avatars/fury.png" />
								<span class="user-info">
									<small>你好,</small>
									<%=session.getAttribute("username") %>
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="javascript:void(0)" id="logout-btn">
										<i class="icon-off"></i>
										退出
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
			</div><!-- /.container -->
		</div>

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>
				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					<ul class="nav nav-list">
						<li>
							<a href="javascript:void(0)" class="dropdown-toggle">
								<i class="icon-gift"></i>
								<span class="menu-text">益世数据查询</span>
								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									 <a href="JavaScript:void(0)" addtabs="entrance" url="<%=basePath%>common/query/user.do" title="用户基础信息">
										<i class="icon-double-angle-right"></i>
										用户基础信息
									</a>
								</li>
								<li>
									<a href="JavaScript:void(0)" addtabs="prize" url="<%=basePath%>common/query/enterprise.do" title="企业基础信息">
										<i class="icon-double-angle-right"></i>
										企业基础信息
									</a>
								</li>
								<li>
									<a href="JavaScript:void(0)" addtabs="rule" url="<%=basePath%>common/query/license.do" title="营业执照信息">
										<i class="icon-double-angle-right"></i>
										营业执照信息
									</a>
								</li>
								<li>
									<a href="JavaScript:void(0)" addtabs="extention" url="<%=basePath%>common/query/tax.do" title="企业税务信息">
										<i class="icon-double-angle-right"></i>
										企业税务信息
									</a>
								</li>
								<li>
									<a href="JavaScript:void(0)" addtabs="voucher" url="<%=basePath%>common/query/invoice.do" title="企业发票信息">
										<i class="icon-double-angle-right"></i>
										企业发票信息
									</a>
								</li>
			                    <li>
									<a href="JavaScript:void(0)" addtabs="webchat" url="<%=basePath%>common/query/order.do" title="订单中心">
										<i class="icon-double-angle-right"></i>
										订单中心
									</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="javascript:void(0)" class="dropdown-toggle">
								<i class="icon-group"></i>
								<span class="menu-text">益世数据删除</span>
								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									 <a href="JavaScript:void(0)" addtabs="basic" url="<%=basePath%>common/query/customerBasic.do" title="会员信息">
										<i class="icon-double-angle-right"></i>
										企业财税信息删除
									</a>
								</li>								
								<li>
									<a href="JavaScript:void(0)" addtabs="customerExternalRelation" url="<%=basePath%>common/query/customerExternalRelation.do" title="京东信息 ">
										<i class="icon-double-angle-right"></i>
										企业发票信息删除
									</a>
								</li>
							</ul>
						</li>

					</ul><!-- /.nav-list -->

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>

				<div class="main-content">
					<div class="page-content">
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								 <!-- Nav tabs -->
				                <ul class="nav nav-tabs" role="tablist">
				                                   
				                </ul>

				                <!-- Tab panes -->
				                <div class="tab-content">
				                	<div class="alert alert-block alert-success">
										<i class="icon-ok green"></i>
										欢迎使用
										<strong class="green">
											益世商务秘书测试查询系统
											<small>(Version beta 1.0)</small>
										</strong>
										——让测试变的更简单.	
									</div>
									<div class="col-12">
										<div class="widget-box">
											<div class="widget-header widget-header-flat">
												<h4>功能列表</h4>
											</div>
											<div class="widget-body">
												<div class="widget-main">
													<div class="row">
														<div class="col-xs-12">
															<ul class="list-unstyled spaced">
																<hr>		
																<li>
																	<span class="glyphicon glyphicon-tags pink" aria-hidden="true"></span>
																	<span class="label label-xlg label-pink arrowed-right">益世商务数据删除(如：完整的删除某一模块的数据)</span>
																</li>
                                                                <hr>
                                                                <li>
                                                                    <span class="glyphicon glyphicon-tags green" aria-hidden="true"></span>
                                                                    <span class="label label-xlg label-success arrowed-right">益世商务各模块关联查询(用户模块、企业模块、营业执照模块、财税模块、电子发票模块、订单中心)</span>
                                                                </li>
															</ul>
															
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
				                </div>                 
								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->

			</div><!-- /.main-container-inner -->
			
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->

		<script src="<%=basePath%>static/assets/js/jquery-2.0.3.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
		
		<script src="<%=basePath%>static/assets/js/1.10.2/jquery.min.js"></script>
		
		<![endif]-->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='<%=basePath%>static/assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

		<!--<![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='<%=basePath%>static/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
		</script>
		<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='<%=basePath%>static/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="<%=basePath%>static/assets/js/bootstrap.min.js"></script>
		<script src="<%=basePath%>static/assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->
		
		<!-- add tabs-->
		<script src="<%=basePath%>static/assets/app/js/add-tabs.js"></script>
		<!-- ace scripts -->

		<script src="<%=basePath%>static/assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath%>static/assets/js/ace.min.js"></script>
		<script type="text/javascript">
		$(function(){
			$("#logout-btn").click(function(){
				$.ajax({
					type : 'get',
					dateType:'json',
					url : '<%=basePath%>' + 'user/doLogout.do',
					contentType: "application/x-www-form-urlencoded; charset=utf-8",
					timeout : 15000,
					beforeSend : function(XMLHttpRequest) {
					},
					cache : false,
					success : function(r) {
						location.reload();
					},
					error: function (xmlHttpRequest) {
					},
				});
			});
		});
		</script>
		<!-- inline scripts related to this page -->
		<!-- <div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div> -->
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="confirmModal-success" tabindex="-1" role="dialog"
			aria-labelledby="confirmModalLabal" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">提示</h4>
					</div>
					<div class="modal-body" >
						<div class="alert alert-block alert-success">
							<strong class="green" id="confirm-message-success">
							
							</strong>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal">确认</button>
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal -->
		</div>
		
		<div class="modal fade" id="confirmModal-error" tabindex="-1" role="dialog"
			aria-labelledby="confirmModalLabal" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">提示</h4>
					</div>
					<div class="modal-body">
						<div class="alert alert-block alert-danger">
							<strong class="red" id="confirm-message-error">
							
							</strong>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal">确认</button>
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal -->
		</div>
		
		<div class="modal fade" id="modal-sm"tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
		  	<div class="modal-dialog modal-sm">
			    <div class="modal-content" id="modal-sm-content">
			    </div>
 	 		</div>
 	 	</div>
</body>
</html>