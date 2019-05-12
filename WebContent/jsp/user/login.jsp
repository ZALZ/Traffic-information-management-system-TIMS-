<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>TIMS-用户登录</title>
<jsp:include page="/jsp/templates/csslink.jsp" flush="true" />
</head>
<body class="header-fixed">

	<div class="remodal" data-remodal-id="modal">
		<form action="/Traffic-information-management-system-TIMS-/user/regist.do" method="post">
			<button data-remodal-action="close" class="remodal-close"></button>
			<h1>注册</h1>
			<div class="row " id="regist-text">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width:150px;">用户名:</span>
					</div>
					<input type="text" class="form-control" id="username" name="username">
				</div>
			</div>
			<div class="row " id="regist-text">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width:150px;">密码:</span>
					</div>
					<input type="password" class="form-control" id="password" name="password">
				</div>
			</div>
			<div class="row " id="regist-text">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width:150px;">确认密码:</span>
					</div>
					<input type="password" id="repassword" class="form-control" name="repassword">
				</div>
			</div>
			<div class="row " id="regist-text">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width:150px;">E-mail:</span>
					</div>
					<input type="email" class="form-control" name="email">
				</div>
			</div>
			<input type="submit" class="btn btn-success" id="email" value="注册">
		</form>
	</div>

	<jsp:include page="/jsp/templates/header.jsp" flush="true" />
	<div class="page-wrapper flex-row align-items-center">

		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-5">
					<form action="${pageContext.request.contextPath}/user/login.do"
						method="post">
						<div class="card p-4">
							<div
								class="card-header text-center text-uppercase h4 font-weight-light">
								登录</div>

							<div class="card-body py-5">
								<div class="form-group">
									<label class="form-control-label">用户名：</label> <input
										type="text" class="form-control" name="username">
								</div>

								<div class="form-group">
									<label class="form-control-label">密码：</label> <input
										type="password" class="form-control" name="password">
								</div>

							</div>

							<div class="card-footer">
								<div class="row">
									<div class="col-md-6">
										<a href="#modal" class="btn btn-warning col-md-12"> 注册 </a>
									</div>
									<div class="col-md-6">
										<input type="submit" class="btn btn-primary px-5 float-right"
											value="登录" />
									</div>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/jsp/templates/jslink.jsp" flush="true" />
	<script type="text/javascript">
	</script>
</body>
</html>
