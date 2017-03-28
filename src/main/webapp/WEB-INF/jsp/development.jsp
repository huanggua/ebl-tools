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

	<body style="background:#fff;font-family:微软雅黑">
		<div class="page-content">
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								 <!-- Nav tabs -->
				                <ul class="nav nav-tabs" role="tablist">
				                                   
				                </ul>

				                <!-- Tab panes -->
				                <div class="tab-content">
				                	<div class="alert alert-block alert-warning">
										<i class="icon-ok green"></i>
										ups!
										<strong class="green">
											该功能还未正式上线,预计会在
											<small>(Version beta 2.0)</small>
											中发布 ,请耐心等待
										</strong>
										——让测试变的更简单.	
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
		<script src="<%=basePath%>/static/assets/js/jquery.form.js"></script>
		
		<!-- ace scripts -->
		
		<script src="<%=basePath%>/static/assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath%>/static/assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
		<!-- <div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div> -->
</body>
</html>
