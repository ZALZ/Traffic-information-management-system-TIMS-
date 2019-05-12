<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">

<title>基础设施调查-常规交叉路口现状</title>

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
						<span class="input-group-text" style="width: 82px">入口车道</span>
					</div>
					<input type="text" class="form-control" name="minIntonumber"><input
						type="text" class="form-control" name="maxIntonumber">
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
						<span class="input-group-text" style="width: 82px">车道宽度</span>
					</div>
					<input type="text" class="form-control" name="maxIntowidth"><input
						type="text" class="form-control" name="minIntowidth">
				</div>
			</div>
			
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">区域类型</span>
					</div>
					<input type="text" class="form-control" name="areatypeId">
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">管制类型</span>
					</div>
					<input type="text" class="form-control" name="controltypeId">
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
										常规交叉路口列表</div>

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
													<th>交叉路口名称</th>
													<th>入口道数</th>
													<th>所属区域</th>
													<th>管制类型</th>
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

						<div class="col-md-6" id="insertOrUpdate-card" hidden="true">
							<form
								action="${pageContext.request.contextPath }/infra/insert.do"
								method="post">
								<div class="card ">
									<div class="card-header bg-light h4 text-center">
										交叉路口基本信息调查表
										<button type="button" id="cancel" class="close">&times;</button>
									</div>

									<!-- 交叉路口基本信息输入窗口 -->
									<div class="card-body" id="input-details" style="height: 690px">
										<!-- 第一行 -->
										<hr style="margin-top: 100px; margin-bottom: 30px" />
										<div class="row">
											<div class="col-md-6">
												<!-- 调查人 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">调查人&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
															<i class="fa fa-question-circle " aria-hidden="true"></i>
														</span>

													</div>
													<input type="text" name="investigator" class="form-control">
												</div>
											</div>
											<hr>
											<div class="col-md-6">
												<!-- 调查时间 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">调查时间&nbsp;&nbsp; <i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input id="timeSelect" name="surveytime"
														class="flatpickr flatpickr-input form-control bg-white"
														data-date-format="Y-m-d " placeholder="点击选择日期"
														readonly="readonly">


												</div>
											</div>
										</div>

										<!-- 第一行 -->

										<div class="row">
											<div class="col-md-12">
												<!-- 路段名输入框 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">交叉路口名称&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="name" class="form-control">
												</div>
											</div>
										</div>

										<hr style="margin-bottom: 30px" />

										<!-- 第二行 -->
										<div class="row">
											<!-- 区域类型选择框 -->
											<div class="col-md-2">
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">区域类型&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>

													</div>
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<select id="areatypeId-select" class="form-control"
														style="height: 44px;" name="areatypeId">
														<option value=14>&nbsp;&nbsp;&nbsp;&nbsp;商业区</option>
														<option value=15>&nbsp;&nbsp;&nbsp;&nbsp;工业区</option>
														<option value=16>&nbsp;&nbsp;&nbsp;&nbsp;生活区</option>
														<option value=17>&nbsp;&nbsp;&nbsp;&nbsp;混合区</option>
													</select>
												</div>
											</div>

											<!-- 管制类型选择框 -->
											<div class="col-md-2">
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">路面类型&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<select id="controltypeId-select"
														class="form-control text-center h5" style="height: 44px;"
														name="controltypeId">
														<option value=18>信号控制</option>
														<option value=19>标志标线</option>
														<option value=20>交警执勤</option>
														<option value=21>其他安全措施</option>
														<option value=22>无控制</option>
													</select>
												</div>
											</div>

										</div>

										<hr style="margin-bottom: 30px" />
										<div class="row">
											<div class="col-md-12">
												<!-- 进口车道数 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">进口车道数&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="intonumber" class="form-control">
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-12">
												<!-- 进口车道宽度输入框 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">进口车道宽度&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="intowidth" class="form-control">
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-12">
												<!-- 停车类型输入框 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">常规交叉路口坐标&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="coordinate" class="form-control"
														readonly>
												</div>
											</div>
										</div>
										<hr style="margin-bottom: 30px" />

									</div>


									<!-- 提交按钮 -->
									<div class="card-footer bg-light" style="padding: 10px">
										<input type="button" id="submit"
											class="btn btn-success float-right col-md-2 "
											style="margin-left: 15px;" value="提交" /> <input
											type="button" id="clear"
											class="btn btn-warning float-right col-md-2"
											style="margin-left: 15px;" value="清空表格" /> <input
											type="button" id="delete"
											class="btn btn-danger float-right col-md-2" value="删除"
											hidden="true" />
									</div>
								</div>

							</form>
						</div>
					</div>

				</div>
			</div>

		</div>
	</div>
	<jsp:include page="/jsp/templates/jslink.jsp" flush="true" />
	<script src="/static/js/myjs/normal.js">
		
	</script>
</body>
</html>