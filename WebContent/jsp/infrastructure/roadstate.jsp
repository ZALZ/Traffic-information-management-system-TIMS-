<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">

<title>基础设施调查-道路现状</title>

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
						<span class="input-group-text">断面形状</span>
					</div>
					<input type="text" class="form-control" name="section">
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
						<span class="input-group-text" style="width: 82px">创建人</span>
					</div>
					<input type="text" class="form-control" name="creater">
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
						<span class="input-group-text" style="width: 82px">起点</span>
					</div>
					<input type="text" class="form-control" name="start">
				</div>
			</div>

			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">长度范围</span>
					</div>
					<input type="text" class="form-control" name="minlength"> <input
						type="text" class="form-control" name="maxlength">
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">终点</span>
					</div>
					<input type="text" class="form-control" name="end">
				</div>
			</div>

			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">坡度范围</span>
					</div>
					<input type="text" class="form-control" name="minincline">
					<input type="text" class="form-control" name="maxincline">
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">路段等级</span>
					</div>
					<input type="text" class="form-control" name="roadlevelId">
				</div>
			</div>

			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 152px">机动车道宽度范围</span>
					</div>
					<input type="text" class="form-control" name="minmotorwaywidth">
					<input type="text" class="form-control" name="maxmotorwaywidth">
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 82px">路面类型</span>
					</div>
					<input type="text" class="form-control" name="roadBedId">
				</div>
			</div>

			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text">非机动车道宽度范围</span>
					</div>
					<input type="text" class="form-control" name="minsuperwaywidth">
					<input type="text" class="form-control" name="maxsuperwaywidth">
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text">中央分隔线宽度范围</span>
					</div>
					<input type="text" class="form-control" name="minmedianwidth">
					<input type="text" class="form-control" name="maxmedianwidth">
				</div>
			</div>

			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text">人行横道道宽度范围</span>
					</div>
					<input type="text" class="form-control" name="minpavementwidth">
					<input type="text" class="form-control" name="maxpavementwidth">
				</div>
			</div>
			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text">两侧分隔线宽度范围</span>
					</div>
					<input type="text" class="form-control" name="minsidesseparatebeltwidth">
					<input type="text" class="form-control" name="maxsidesseparatebeltwidth">
				</div>
			</div>

			<div class="col-md-6">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 152px">红线宽度范围</span>
					</div>
					<input type="text" class="form-control" name="minredlinewidth">
					<input type="text" class="form-control" name="maxredlinewidth">
				</div>
			</div>

		</div>
		<button id="advance-cancel" data-remodal-action="cancel" class="remodal-cancel float-left">清空</button>
		<button id="advance-success" data-remodal-action="confirm" class="remodal-confirm float-right" style="margin-left:20px">搜索</button>
		<button id="advance-save" data-remodal-action="confirm" class="remodal-confirm float-right bg-primary" >保存</button>
	</div>

	<div class="page-wrapper  remodal-bg">
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
											<div class="input-card" hidden="true" style="width: 120px">
												<button class="btn btn-primary" id="drawline"
													style="margin-bottom: 5px">绘制折线</button>
												<button class="btn btn-success" id="startediter"
													style="margin-bottom: 5px">编辑</button>
												<button class="btn btn-warning" style="margin-bottom: 5px"
													id="clearediter">清空</button>
												<button class="btn btn-danger disabled" id="endediter">结束编辑</button>
											</div>
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
										道路现状列表</div>

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
										<table class="table table-striped" style="height: 100%">
											<thead>
												<tr>
													<th>ID</th>
													<th>路段名称</th>
													<th>长度</th>
													<th>路段等级</th>
													<th>路面类型</th>
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
										道路现状调查表
										<button type="button" id="cancel" class="close">&times;</button>
									</div>

									<!-- 道路基本信息输入窗口 -->
									<div class="card-body" id="input-details" style="height: 690px">
										<!-- 第一行 -->
										<hr />
										<div class="row">
											<div class="col-md-6">
												<!-- 调查人 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">调查人&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
														<span class="input-group-text">调查时间&nbsp;&nbsp <i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input id="timeSelect" name="surveytime"
														class="flatpickr flatpickr-input form-control bg-white"
														data-date-format="Y-m-d " readonly="readonly">


												</div>
											</div>
										</div>

										<!-- 第一行 -->

										<div class="row">
											<div class="col-md-12">
												<!-- 路段名输入框 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">路段名称&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="roadname" class="form-control">
												</div>
											</div>
										</div>
										<!-- 第二行 -->
										<div class="row">
											<!-- 路段等级选择框 -->
											<div class="col-md-2">
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">路段等级&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></i></span>

													</div>
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<select id="roadlevel-select" class="form-control"
														style="height: 44px;" name="roadlevelId">
														<optgroup
															label="-------------道&nbsp;&nbsp;&nbsp;&nbsp;路------------"></optgroup>
														<option value=5>&nbsp;&nbsp;&nbsp;&nbsp;快速路</option>
														<option value=6>&nbsp;&nbsp;&nbsp;&nbsp;主干路</option>
														<option value=7>&nbsp;&nbsp;&nbsp;&nbsp;次干路</option>
														<option value=8>&nbsp;&nbsp;&nbsp;&nbsp;支路</option>
														<optgroup
															label="-------------公&nbsp;&nbsp;&nbsp;&nbsp;路------------"></optgroup>
														<option value=9>&nbsp;&nbsp;&nbsp;&nbsp;高速公路</option>
														<option value=10>&nbsp;&nbsp;&nbsp;&nbsp;一级公路</option>
														<option value=11>&nbsp;&nbsp;&nbsp;&nbsp;二级公路</option>
														<option value=12>&nbsp;&nbsp;&nbsp;&nbsp;三级公路</option>
														<option value=13>&nbsp;&nbsp;&nbsp;&nbsp;四级公路</option>
													</select>
												</div>
											</div>

											<!-- 路面类型选择框 -->
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
													<select id="roadbed-select"
														class="form-control text-center h5" style="height: 44px;"
														name="roadbedtypeId">
														<option value=1>沥青路面</option>
														<option value=2>水泥混凝土路面</option>
														<option value=3>复合路面</option>
														<option value=4>其他路面</option>
													</select>
												</div>
											</div>

										</div>
										<!-- 第三行 -->
										<div class="row">
											<div class="col-md-6">
												<!-- 路段长度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">路段起点&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="start" class="form-control">
												</div>
											</div>

											<div class="col-md-6">
												<!-- 路段坡度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">路段终点&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="end" class="form-control">
												</div>
											</div>

										</div>
										<!-- 第四行 -->
										<div class="row">
											<div class="col-md-6">
												<!-- 路段长度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">路段长度&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="length" class="form-control">
												</div>
											</div>

											<div class="col-md-6">
												<!-- 路段坡度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">路段坡度&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="incline" class="form-control">
												</div>
											</div>

										</div>
										<!-- 第五行 -->
										<div class="row">
											<div class="col-md-12">
												<!-- 断面类型输入框 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">断面类型&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="section" class="form-control">
												</div>
											</div>
										</div>

										<hr />
										<!-- 第六行 -->
										<div class="row">
											<div class="col-md-6">
												<!-- 机动车道宽度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text" style="width: 185px">机动车道宽度&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="motorwaywidth"
														class="form-control">
												</div>
											</div>

											<div class="col-md-6">
												<!-- 非机动车道宽度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text" style="width: 185px">非机动车道宽度&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="superwaywidth"
														class="form-control">
												</div>
											</div>

										</div>

										<!-- 第七行 -->
										<div class="row">
											<div class="col-md-6">
												<!-- 中央分隔线宽度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text" style="width: 185px">中央分隔线宽度&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="medianwidth" class="form-control">
												</div>
											</div>

											<div class="col-md-6">
												<!-- 红线宽度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text" style="width: 185px">红线宽度&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="redlinewidth" class="form-control">
												</div>
											</div>

										</div>

										<!-- 第八行 -->
										<div class="row">
											<div class="col-md-6">
												<!-- 两侧分割线宽度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text" style="width: 185px">两侧分割线宽度&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="sidesseparatebeltwidth"
														class="form-control">
												</div>
											</div>

											<div class="col-md-6">
												<!-- 人行道宽度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text" style="width: 185px">人行道宽度<i
															class="fa fa-question-circle" style="margin-left: 45px;"
															aria-hidden="true"></i></span>

													</div>
													<input type="text" name="pavementwidth"
														class="form-control">
												</div>
											</div>

										</div>

										<div class="row">
											<div class="col-md-12">
												<!-- 停车类型输入框 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">道路路线坐标&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="coordinate" class="form-control"
														readonly>
												</div>
											</div>
										</div>


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
	<script src="/static/js/myjs/roadstate.js"></script>
</body>
</html>