<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">

<title>首页-欢迎进入道路交通管理系统</title>

<jsp:include page="/jsp/templates/csslink.jsp" flush="true"/>

</head>
<body class="sidebar-fixed header-fixed">
	<div class="page-wrapper">
		<!-- 顶部导航栏 -->
		<jsp:include page="/jsp/templates/header.jsp" flush="true"/>

		<!-- 下部内容 -->
		<div class="main-container">
			<!-- 左侧导航栏 -->
			<jsp:include page="/jsp/templates/sidebar.jsp" flush="true"/>
			
			<!-- 右侧内容 -->
			<div class="content">
				<div class="container-fluid">
					<!-- 分块小标题 -->
					<div class="row">
						<div class="col-md-12" 	>
							<div class="card" style="margin-bottom:15px">
								<div class="card-header" >
									<span class="h4 d-block font-weight-bold mb-2" >道路基础设施调查</span> 
								 </div>
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="col-md-3">
							<div class="card p-4">
								<div
									class="card-body d-flex justify-content-between align-items-center">
									<div>
										<span class="h4 d-block font-weight-normal mb-2">54</span> <span
											class="font-weight-light">道路现状</span>
									</div>

									<div class="h2 text-muted">
										<i class="icon icon-people"></i>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-3">
							<div class="card p-4">
								<div
									class="card-body d-flex justify-content-between align-items-center">
									<div>
										<span class="h4 d-block font-weight-normal mb-2">$32,400</span>
										<span class="font-weight-light">Income</span>
									</div>

									<div class="h2 text-muted">
										<i class="icon icon-wallet"></i>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-3">
							<div class="card p-4">
								<div
									class="card-body d-flex justify-content-between align-items-center">
									<div>
										<span class="h4 d-block font-weight-normal mb-2">900</span> <span
											class="font-weight-light">Downloads</span>
									</div>

									<div class="h2 text-muted">
										<i class="icon icon-cloud-download"></i>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-3">
							<div class="card p-4">
								<div
									class="card-body d-flex justify-content-between align-items-center">
									<div>
										<span class="h4 d-block font-weight-normal mb-2">32s</span> <span
											class="font-weight-light">Time</span>
									</div>

									<div class="h2 text-muted">
										<i class="icon icon-clock"></i>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-md-3">
							<div class="card p-4">
								<div
									class="card-body d-flex justify-content-between align-items-center">
									<div>
										<span class="h4 d-block font-weight-normal mb-2">32s</span> <span
											class="font-weight-light">Time</span>
									</div>

									<div class="h2 text-muted">
										<i class="icon icon-clock"></i>
									</div>
								</div>
							</div>
						</div>
						
					</div>

					<div class="row ">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header">Total Users</div>

								<div class="card-body p-0">
									<div class="p-4">
										<canvas id="line-chart" width="100%" height="20"></canvas>
									</div>

									<div
										class="justify-content-around mt-4 p-4 bg-light d-flex border-top d-md-down-none">
										<div class="text-center">
											<div class="text-muted small">Total Traffic</div>
											<div>12,457 Users (40%)</div>
										</div>

										<div class="text-center">
											<div class="text-muted small">Banned Users</div>
											<div>95,333 Users (5%)</div>
										</div>

										<div class="text-center">
											<div class="text-muted small">Page Views</div>
											<div>957,565 Pages (50%)</div>
										</div>

										<div class="text-center">
											<div class="text-muted small">Total Downloads</div>
											<div>957,565 Files (100 TB)</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						More Templates <a href="http://www.cssmoban.com/" target="_blank"
							title="模板之家">模板之家</a> - Collect from <a
							href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/jsp/templates/jslink.jsp" flush="true"/>
</body>
</html>