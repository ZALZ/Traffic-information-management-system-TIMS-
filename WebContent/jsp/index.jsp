<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">

<title>首页-欢迎进入道路交通管理系统</title>

<jsp:include page="/jsp/templates/csslink.jsp" flush="true" />

<style type="text/css">
.fixed-navecation{
	width:100%;
	height:40px;
	margin-top:100px;
}
</style>
</head>
<body class="sidebar-fixed header-fixed">
	<div class="page-wrapper">
		<!-- 顶部导航栏 -->
		<jsp:include page="/jsp/templates/header.jsp" flush="true" />

		<!-- 下部内容 -->
		<div class="main-container">
			<!-- 左侧导航栏 -->
			<jsp:include page="/jsp/templates/sidebar.jsp" flush="true" />

			<!-- 右侧内容 -->
			<div class="content">
				<div class="container-fluid" style="width: 1600px;">
					<!-- 分块小标题 -->
					<div class="row ">
						<div class="col-md-10">
							<div class="row"  id="roadpoint">
								<div class="col-md-12">
									<div class="alert h4 font-weight-bold bg-primary">道路基础设施调查数据概览</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<div class="card">
										<div class="card-body" style="height: 800px">
											<div id="container"></div>
											<div class="input-card"
												style="width: 200px; top: -14rem; left: 66rem;">
												<button class="btn btn-primary togglebtn" id="roadstate"
													num="0" style="margin-bottom: 5px">
													<i id='noc' class="icon icon-map"></i>&nbsp;&nbsp;道路路线&nbsp;&nbsp;
												</button>
												<button class="btn btn-success togglebtn" id="normalInter"
													num="0" style="margin-bottom: 5px">
													<i id='noc' class="icon icon-size-actual"></i>&nbsp;&nbsp;常规路口&nbsp;&nbsp;
												</button>
												<button class="btn btn-info togglebtn"
													style="margin-bottom: 5px" num="0" id="roundabout">
													<i id='noc' class="icon icon-support"></i>&nbsp;&nbsp;环形路口&nbsp;&nbsp;
												</button>
												<button class="btn btn-warning togglebtn" id="overpass"
													num="0" style="margin-bottom: 5px">
													<i id='noc' class="icon icon-shuffle"></i>&nbsp;&nbsp;立体路口&nbsp;&nbsp;
												</button>
												<button class="btn btn-danger togglebtn" id="park" num="0">
													<i id='noc' class="icon icon-direction"></i>&nbsp;&nbsp;停车设施&nbsp;&nbsp;
												</button>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="row" id="peoplepoint">
								<div class="col-md-12">
									<div class="alert bg-success h4 font-weight-bold">常规路口行人OD调查数据概览</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-5">
									<div class="card">
										<div class="card-body bg-light" style="height: 296px">
											<div id="container1" style="width: 491.547px; height: 264px"></div>
										</div>
									</div>
								</div>
								<!-- 当前路口的比例 -->
								<div class="col-md-7">
									<div class="card">
										<div class="card-body bg-light" style="height: 296px">
											<div id="container2" style="width: 713.766px; height: 264px"></div>
										</div>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<div class="card">
										<div class="card-body bg-light" style="height: 471px">
											<div id="linecontainer"
												style="width: 1269.330px; height: 429px"></div>
										</div>
									</div>
								</div>
							</div>

						</div>

						<div class="fixed-on"
							style="position: fixed; left: 1600px; top: 100px; width: 260px; height: 400px; ">
							<div id="line" style="margin-left:40px; width: 2px; height: 400px;float:left;background: radial-gradient(#42a5f5, white); "></div>
							<div id="block" style="position:absolute;float:left;width:260px;height:100%;">
								<div class="fixed-navecation ">
									<a href="#roadpoint"><span class="text-primary" style="margin-left:45px;font-size: 20px;"><i class="fa fa-angle-double-right" aria-hidden="true">道路</i></span></a>
								</div>
								<div class="fixed-navecation text-primary">
									<a href="#peoplepoint"><span class="text-primary" style="margin-left:45px;font-size: 20px;"><i class="fa fa-angle-double-right" aria-hidden="true">行人</i></span></a>
								</div>
							</div>
						</div>

					</div>

				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/jsp/templates/jslink.jsp" flush="true" />
	<script src="/static/js/myjs/echarts.js"></script>
	<script src="/static/js/myjs/index.js">
		
	</script>
</body>
</html>