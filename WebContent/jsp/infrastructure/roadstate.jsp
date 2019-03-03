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

	<div class="modal fade" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">

				<!-- 模态框主体 -->
				<div class="modal-body">删除成功...正在重定向至主页...</div>

			</div>
		</div>
	</div>

	<div class="page-wrapper">
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
									<div class="card" style="height: 610px;">
										<div class="card-body" style="height: 100%">
											<p>sadsdsadasd</p>
										</div>
									</div>
								</div>
							</div>
							<div class="row text-white">
								<div class="col-md-6">
									<div class="card">
										<div id="insert-one" class="card-body bg-success  text-center" style="height:70px;">
											<span class="h2 font-weight-bold" style="margin:auto;">插&nbsp;入&nbsp;单&nbsp;条&nbsp;数&nbsp;据</span>
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div class="card">
										<div class="card-body bg-success  text-center" style="height:70px;">
											<span class="h2 font-weight-bold" style="margin:auto;">批&nbsp;量&nbsp;插&nbsp;入&nbsp;数&nbsp;据</span>
										</div>
									</div>
								</div>
								<div class="col-md-12">
									<div class="card">
										<div class="card-body bg-success  text-center" style="height:70px;">
											<span class="h2 font-weight-bold" style="margin:auto;">下&nbsp;载&nbsp;EXCLE&nbsp;模&nbsp;板</span>
										</div>
									</div>
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
										<button type="button" class="btn btn-warning">
											<i id="noc" class="fa fa-cog"></i> 高级检索
										</button>
									</div>

									<!-- 搜索框 -->
									<div class="col-md-4 float-right">
										<div class="input-group">
											<input type="text" id="input-group-2" name="input1-group2"
												class="form-control" placeholder="Username"> <span
												class="input-group-btn">
												<button type="button" class="btn btn-primary">
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
													<th>路段名称</th>
													<th>路段长度</th>
													<th>路段等级</th>
													<th>路面类型</th>
													<th>调查人</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach items="${roadListVo }" var="roadVo" varStatus="s">
													<tr id="${roadVo.roadstate.id }">
														<td>${roadVo.roadstate.id }</td>
														<td>${roadVo.roadstate.roadname }</td>
														<td>${roadVo.roadstate.length }</td>
														<td>${roadVo.roadLevel.typename }&nbsp;:&nbsp;${roadVo.roadLevel.name }</td>
														<td>${roadVo.roadBedType.name }</td>
														<td>${roadVo.roadstate.investigator }</td>
													</tr>
												</c:forEach>

											</tbody>
										</table>
									</div>

									<!-- 详情修改页面 -->

								</div>

								<!-- 分页效果 -->
								<div class="card-footer bg-light"
									style="height: 55px; padding: 10px 16px;">
									<div class="p1 col-md-6 float-left" style="margin-top: 7px;">
										总计：*****条数据</div>
									<ul class="pagination" style="margin-bottom: 0px">
										<li class="page-item"><a class="page-link" href="#">Previous</a></li>
										<li class="page-item"><a class="page-link" href="#">1</a></li>
										<li class="page-item"><a class="page-link" href="#">2</a></li>
										<li class="page-item"><a class="page-link" href="#">3</a></li>
										<li class="page-item"><a class="page-link" href="#">Next</a></li>
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
									<div class="card-header bg-light h4 text-center">道路现状调查表</div>

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
													<input type="text" name="investigator" class="form-control"
														placeholder="请填写调查人">
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
														<span class="input-group-text">路段名称&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="roadname" class="form-control"
														placeholder="路段名称">
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
															class="fa fa-check " id="noc" style="color: green"
															aria-hidden="true"></i></span>

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
															class="fa fa-check" id="noc" style="color: green"
															aria-hidden="true"></i></span>
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
													<input type="text" name="start" class="form-control"
														placeholder="请填入路段起点">
												</div>
											</div>

											<div class="col-md-6">
												<!-- 路段坡度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">路段终点&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="end" class="form-control"
														placeholder="请填入路段终点">
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
													<input type="text" name="length" class="form-control"
														placeholder="路段长度">
												</div>
											</div>

											<div class="col-md-6">
												<!-- 路段坡度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text">路段坡度&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="incline" class="form-control"
														placeholder="路段坡度">
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
													<input type="text" name="section" class="form-control"
														placeholder="请输入断面类型">
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
														class="form-control" placeholder="机动车道宽度">
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
														class="form-control" placeholder="非机动车道宽度">
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
													<input type="text" name="medianwidth" class="form-control"
														placeholder="中央分隔线宽度">
												</div>
											</div>

											<div class="col-md-6">
												<!-- 红线宽度 -->
												<div class="input-group mb-3 input-group-lg">
													<div class="input-group-prepend">
														<span class="input-group-text" style="width: 185px">红线宽度&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i
															class="fa fa-question-circle " aria-hidden="true"></i></span>
													</div>
													<input type="text" name="redlinewidth" class="form-control"
														placeholder="红线宽度">
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
														class="form-control" placeholder="两侧分割线宽度">
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
														class="form-control" placeholder="人行道宽度">
												</div>
											</div>

										</div>



									</div>


									<!-- 提交按钮 -->
									<div class="card-footer bg-light" style="padding:10px">
										<input type="button" id="submit"
											class="btn btn-success float-right col-md-2 "
											style="margin-left: 15px;" value="提交" /> <input
											type="button" id="clear"
											class="btn btn-danger float-right col-md-2"
											style="margin-left: 15px;" value="清空表格" /> <input
											type="button" id="delete"
											class="btn btn-danger float-right col-md-2" value="删除" hidden />
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
	<script src="/static/js/myjs/roadstate.js">
		
	</script>
</body>
</html>