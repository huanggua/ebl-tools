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
		<meta charset="utf-8" />
		<title>登录-EBL关联查询管理工具</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="shortcut icon" href="<%=basePath%>leaf.ico" type="image/x-icon"/>
		<link rel=”icon” href="<%=basePath%>leaf.ico" type="image/x-icon" />
		<!-- basic styles -->

		<link href="<%=basePath%>static/assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="<%=basePath%>static/assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="<%=basePath%>static/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->


		<!-- ace styles -->

		<link rel="stylesheet" href="<%=basePath%>static/assets/css/ace.min.css" />
		<link rel="stylesheet" href="<%=basePath%>static/assets/css/ace-rtl.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="<%=basePath%>static/assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="<%=basePath%>static/assets/js/html5shiv.js"></script>
		<script src="<%=basePath%>static/assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body class="login-layout" style="background-image: url(<%=basePath%>static/assets/image/bg.jpg);background-size:cover">
		<div class="main-container">
			<div class="main-content">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1">
						<div class="login-container">
							<div class="center">
									<h1><i class="icon-lea"></i></h1>
							</div>
							<div class="center">
								<h1>
									<i class="icon-leaf green"></i>
									<span class="red">EBL</span>
									<span class="white">Query Util</span>
								</h1>
								<h3 class="blue">Copyright © 2004-2015 JD</h3>
							</div>

							<div class="space-6"></div>

							<div class="position-relative">
								<div id="login-box" class="login-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header blue lighter bigger">
												<i class="icon-coffee green"></i>
												<span class="red" id="promotion-info"></span>
											</h4>
											<div class="space-6"></div>

											<form>
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="用户名" id="username"'/>
															<i class="icon-user"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="密码" id="password"/>
															<i class="icon-lock"></i>
														</span>
													</label>

													<div class="space"></div>

													<div class="clearfix">													
														<button id="login-btn" type="button" class="width-35 pull-right btn btn-sm btn-primary">
															<i class="icon-key"></i>
															登录
														</button>
													</div>

													<div class="space-4"></div>
												</fieldset>
											</form>
										</div>
									</div><!-- /widget-body -->
								</div><!-- /login-box -->
							
							</div><!-- /position-relative -->
						</div>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div>
		</div><!-- /.main-container -->

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

		<!-- <![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='<%=basePath%>static/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
		</script>
		<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='<%=basePath%>static/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>

		<!-- inline scripts related to this page -->

		<script type="text/javascript">
			function show_box(id) {
			 jQuery('.widget-box.visible').removeClass('visible');
			 jQuery('#'+id).addClass('visible');
			}
		</script>
		
		<script type="text/javascript">
			var loginBtn = $('#login-btn');
			var usernameObj= $('#username');
			var passwordObj= $('#password');
			var baseUrl = "<%=basePath%>";
			var toURL = getUrlParam('target');
			$(function(){
				loginBtn.click(function(){
					login(baseUrl,usernameObj.val(),passwordObj.val());
				});
				
				passwordObj.keydown(function(e){
				    if(e.keyCode==13) {
				   	 login(baseUrl,usernameObj.val(),passwordObj.val());
				    };
				});
			});
			/**
			 *
			 * @param url
			 * @param username
			 * @param password
			 *
			 */
			var login = function(url,username,password){
			
				if(null === username || "" ===username.trim()){
						alert("用户名不能为空!");
						return false;
					}else if(null === password || "" === password.trim()){
						alert("密码不能为空!");
						return false;
				}
				
				$.ajax({
					type : 'post',
					dateType:'json',
					url : url + '/user/doLogin.do',
					contentType: "application/x-www-form-urlencoded; charset=utf-8", 
					data : {username:username,password:password},
					timeout : 15000,
					beforeSend : function(XMLHttpRequest) {
					},
					cache : false,
					success : function(r) {
						var obj = $.parseJSON(r);
						var msg = obj.message;
						var targetUrl = obj.url;
						if (obj.success) {
							window.location.href = toURL === null?(url + targetUrl):toURL;
						} else {
							$('#promotion-info').html(msg);
							usernameObj.focus();
							passwordObj.val('');
						}
					},
					error: function (xmlHttpRequest) {
						
			        },
				});
			};
			
			function getUrlParam(name){  
			    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");  
			    //匹配目标参数  
			    var r = window.location.search.substr(1).match(reg);  
			    //返回参数值  
			    if (r!=null) return unescape(r[2]);  
			   		 return null;  
			}  
		</script>
	<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>