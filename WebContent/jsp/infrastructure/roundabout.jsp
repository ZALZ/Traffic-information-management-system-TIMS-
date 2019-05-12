<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<title>基础设施调查-环形交叉路口</title>
<jsp:include page="/jsp/templates/csslink.jsp" flush="true" />
</head>
<body class="sidebar-fixed header-fixed">
	<div class="remodal" data-remodal-id="modal">
		<button data-remodal-action="close" class="remodal-close"></button>
		<h1>高级检索</h1>
		<div class="row " id="advance-setting">
			<!-- id -->
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">ID范围</span>
					</div>
					<input type="text" class="form-control" name="minId"> <input
						type="text" class="form-control" name="maxId">
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">创建人</span>
					</div>
					<input type="text" class="form-control" name="creater">
				</div>
			</div>

			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text">调查时间</span>
					</div>
					<input id="timeSelect" name="minsurveytime"
						class="flatpickr flatpickr-input form-control bg-white"
						data-date-format="Y-m-d " readonly="readonly" /><input
						id="timeSelect" name="maxsurveytime"
						class="flatpickr flatpickr-input form-control bg-white"
						data-date-format="Y-m-d " readonly="readonly" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">调查人</span>
					</div>
					<input type="text" class="form-control" name="investigator">
				</div>
			</div>

			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text">创建时间</span>
					</div>
					<input id="timeSelect" name="mincreatetime"
						class="flatpickr flatpickr-input form-control bg-white"
						data-date-format="Y-m-d " readonly="readonly" /><input
						id="timeSelect" name="maxcreatetime"
						class="flatpickr flatpickr-input form-control bg-white"
						data-date-format="Y-m-d " readonly="readonly" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">转弯半径</span>
					</div>
					<input type="text" class="form-control" name="minradius"><input
						type="text" class="form-control" name="maxradius">
				</div>
			</div>

			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text">更新时间</span>
					</div>
					<input id="timeSelect" name="minupdatetime"
						class="flatpickr flatpickr-input form-control bg-white"
						data-date-format="Y-m-d " readonly="readonly" /><input
						id="timeSelect" name="maxupdatetime"
						class="flatpickr flatpickr-input form-control bg-white"
						data-date-format="Y-m-d " readonly="readonly" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">转弯宽度</span>
					</div>
					<input type="text" class="form-control" name="minturningwidth"><input
						type="text" class="form-control" name="maxturningwidth">
				</div>
			</div>

			


		</div>
		<button id="advance-cancel" data-remodal-action="cancel"
			class="remodal-cancel float-left">清空</button>
		<button id="advance-success" data-remodal-action="confirm"
			class="remodal-confirm float-right" style="margin-left: 20px">搜索</button>
		<button id="advance-save" data-remodal-action="confirm"
			class="remodal-confirm float-right bg-primary">保存</button>
	</div>

	<div class="page-wrapper remodal-bg">
		<!-- 顶部导航栏 -->
		<jsp:include page="/jsp/templates/header.jsp" flush="true" />

		<!-- 下部内容 -->
		<div class="main-container">
			<!-- 左侧导航栏 -->
			<jsp:include page="/jsp/templates/sidebar.jsp" flush="true" />

			<!-- 右侧内容 -->
			<div class="content">
				<div class="container-fluid" style="width: 1600px">
					<div class="row">
						<!-- 坐标地图列 -->
						<div class="col-md-6">
							<div class="row">
								<div class="col-md-12">
									<div class="card">
										<div class="card-body" style="height: 608px">
											<div id="container"></div>
										</div>
									</div>
								</div>
							</div>
							<div class="row text-white">
								<div class="col-md-6">
									<button type="button" id="insert-one"
										style="width: 100%; height: 70px; font-size: 25px;"
										class="btn btn-success ">插&nbsp;入&nbsp;单&nbsp;个&nbsp;数&nbsp;据</button>

								</div>
								<div class="col-md-6">
									<button type="button" id="uploadExcel"
										style="width: 100%; height: 70px; font-size: 25px;"
										class="btn btn-primary">批&nbsp;量&nbsp;插&nbsp;入&nbsp;数&nbsp;据</button>
									<form hidden id="uploadForm" enctype="multipart/form-data">
										<input id="file" type="file" name="file" />
									</form>


								</div>
								<div class="col-md-12">
									<button type="button" id="download"
										style="width: 100%; height: 70px; font-size: 25px; margin-top: 28px"
										class="btn btn-info">下&nbsp;载&nbsp;EXCEL&nbsp;模&nbsp;板</button>

								</div>

							</div>

						</div>


						<!-- 详细列表信息 -->
						<div class="col-md-6" id="table-card">
							<div class="card">
								<div class="card-header bg-light h4 text-left"
									style="padding: 10px 16px;">
									<div class="p1 col-md-6 float-left" style="margin-top: 4px;">
										环形交叉路口列表</div>

									<!-- 高级搜索 -->
									<div class="col-md-2 float-right">
										<a href="#modal"><button class="btn btn-outline-primary">
												<i id="noc" class="fa fa-cog"></i> 高级检索
											</button></a>
									</div>

									<!-- 搜索框 -->
									<div class="col-md-4 float-right">
										<div class="input-group">
											<input type="text" id="input-group-2" name="input1-group2"
												class="form-control"> <span class="input-group-btn">
												<button type="button" id="searchbtn" class="btn btn-primary">
													<i id="noc" class="fa fa-search"></i> Search
												</button>
											</span>
										</div>
									</div>
								</div>

								<div class="card-body" id="road-table" style="height: 690px">
									<div class="table-responsive">
										<table class="table table-striped">
											<thead>
												<tr>
													<th>ID</th>
													<th>环岛路口名称</th>
													<th>入口道数</th>
													<th>转弯半径</th>
													<th>车道宽度</th>
													<th>调查人</th>
												</tr>
											</thead>
											<tbody>

											</tbody>
										</table>
									</div>

									<!-- 详情修改页面 -->

								</div>


								<!-- 分页效果 -->
								<div class="card-footer bg-light"
									style="height: 55px; padding: 10px 16px;">
									<div class="p1 col-md-6 float-left" style="margin-top: 7px;">
										总计：<span id="total-page" style="color: red;"></span>条数据
									</div>
									<ul class="pagination" id="pageInator"
										style="margin-bottom: 0px">
									</ul>
								</div>

							</div>
						</div>

						<!-- 插入数据卡片 -->

						<div class="col-md-6" id="insertOrUpdate-card" hidden=true>

							<div class="card ">
								<div class="card-header bg-light h4 text-center">
									环岛路口基本信息调查表
									<button type="button" id="cancel" class="close">&times;</button>
								</div>

								<!-- 交叉路口基本信息输入窗口 -->
								<div class="card-body" id="input-details" style="height: 690px">
									<!-- 第一行 -->
									<div class="row" style="margin-top: 165px;">
										<div class="col-md-2"></div>
										<div class="col-md-8">
											<!-- 调查人 -->
											<div class="input-group mb-3 input-group-lg">
												<div class="input-group-prepend">
													<div class="input-group-text float-left"
														style="width: 165px;">
														调查人&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
														<i class="fa fa-question-circle float-right"
															aria-hidden="true"></i>
													</div>

												</div>
												<input type="text" name="investigator" class="form-control">
											</div>
										</div>
										<div class="col-md-2"></div>
									</div>
									<div class="row">
										<div class="col-md-2"></div>
										<div class="col-md-8">
											<!-- 调查时间 -->
											<div class="input-group mb-3 input-group-lg">
												<div class="input-group-prepend">
													<span class="input-group-text float-left"
														style="width: 165px;">调查时间&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
														<i class="fa fa-question-circle float-right"
														aria-hidden="true"></i>
													</span>
												</div>
												<input id="timeSelect" name="surveytime"
													class="flatpickr flatpickr-input form-control bg-white"
													data-date-format="Y-m-d " readonly="readonly">


											</div>
										</div>
										<div class="col-md-2"></div>
									</div>


									<!-- 第一行 -->

									<div class="row">
										<div class="col-md-2"></div>
										<div class="col-md-8">
											<!-- 路段名输入框 -->
											<div class="input-group mb-3 input-group-lg">
												<div class="input-group-prepend">
													<span class="input-group-text float-left"
														style="width: 165px;">环岛路口名称&nbsp;&nbsp;<i
														class="fa fa-question-circle" aria-hidden="true"></i></span>
												</div>
												<input type="text" name="name" class="form-control">
											</div>
										</div>
										<div class="col-md-2"></div>
									</div>

									<div class="row">
										<div class="col-md-2"></div>
										<div class="col-md-8">
											<!-- 转弯半径输入框 -->
											<div class="input-group mb-3 input-group-lg">
												<div class="input-group-prepend">
													<span class="input-group-text float-left"
														style="width: 165px;">入口车道数&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i
														class="fa fa-question-circle " aria-hidden="true"></i></span>
												</div>
												<input type="text" name="intonumber" class="form-control">
											</div>
										</div>
										<div class="col-md-2"></div>
									</div>

									<div class="row">
										<div class="col-md-2"></div>
										<div class="col-md-8">
											<!-- 转弯半径输入框 -->
											<div class="input-group mb-3 input-group-lg">
												<div class="input-group-prepend">
													<span class="input-group-text float-left"
														style="width: 165px;">转弯半径&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i
														class="fa fa-question-circle " aria-hidden="true"></i></span>
												</div>
												<input type="text" name="radius" class="form-control">
											</div>
										</div>
										<div class="col-md-2"></div>
									</div>

									<div class="row">
										<div class="col-md-2"></div>
										<div class="col-md-8">
											<!-- 转弯车道宽度输入框 -->
											<div class="input-group mb-3 input-group-lg">
												<div class="input-group-prepend">
													<span class="input-group-text float-left"
														style="width: 165px;">车道宽度&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i
														class="fa fa-question-circle " aria-hidden="true"></i></span>
												</div>
												<input type="text" name="turningwidth" class="form-control">
											</div>
										</div>
										<div class="col-md-2"></div>
									</div>
									<div class="row">
										<div class="col-md-2"></div>
										<div class="col-md-8">
											<!-- 停车类型输入框 -->
											<div class="input-group mb-3 input-group-lg">
												<div class="input-group-prepend">
													<span class="input-group-text">环形交叉路口坐标坐标&nbsp;&nbsp;<i
														class="fa fa-question-circle " aria-hidden="true"></i></span>
												</div>
												<input type="text" name="coordinate" class="form-control"
													readonly>
											</div>
										</div>
										<div class="col-md-2"></div>
									</div>

								</div>


								<!-- 提交按钮 -->
								<div class="card-footer bg-light" style="padding: 10px">
									<input type="button" id="submit"
										class="btn btn-success float-right col-md-2 "
										style="margin-left: 15px;" value="提交" /> <input type="button"
										id="clear" class="btn btn-warning float-right col-md-2"
										style="margin-left: 15px;" value="清空表格" /> <input
										type="button" id="delete"
										class="btn btn-danger float-right col-md-2" value="删除"
										hidden="true" />
								</div>
							</div>

						</div>
					</div>

				</div>
			</div>

		</div>
	</div>
	<jsp:include page="/jsp/templates/jslink.jsp" flush="true" />
	<script src="/static/js/myjs/roundabout.js">
		
	</script>
</body>
</html>