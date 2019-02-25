<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>道路基础设施调查</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/static/js/jquery.min.js"></script>
<style>
* {
	margin: 0px;
	padding: 0px;
}

#main {
	width: 1300px;
	margin: auto;
}

#menu {
	width: 200px;
	float: left;
	margin-right: 20px;
	position: fixed;
	top: 200px;
}

#menu>* {
	width: 200px;
}

#right {
	width: 1080px;
	float: right;
}

.secend {
	display: none;
}

ul {
	list-style-type: none;
	font-size: 15px;
	padding-left: 30px;
	margin: auto;
}

ul>li {
	
}

ul>li>a {
	color: black;
	margin: 10px 0px 10px 0px;
}
</style>

<script>
	$(function() {
		$(".menu").click(
				function() {
					$(this).next().slideDown("normal");
					$(this).siblings().filter("div").not($(this).next())
							.slideUp("normal")
				})

		$("tbody>tr").click(function() {
			var app = $("<div></div>").css({
				"width" : "100%",
				"height" : "20px",
				"background-color" : "red"
			});
			$(this).appendChild(app)
		})

		$("button").click(function() {
			$.get("/infrastructure/state/search", function(data, status) {

			})
		})
	})
</script>
</head>
<body>
	<div id="main">
		<div id="menu">
			<div class="btn-group-vertical">
				<button type="button" class="btn btn-primary menu">道路交通基础设施调查</button>
				<div class="secend">
					<ul>
						<li><a href="#">道路现状调查</a></li>
						<li><a href="#">交叉路口设施现状调查</a></li>
						<li><a href="#">车辆设施停放现状调查</a></li>
					</ul>
				</div>
				<button type="button" class="btn btn-primary menu">道路流量调查</button>
				<div class="secend">
					<ul>
						<li><a href="#">道路现状调查</a></li>
						<li><a href="#">交叉路口设施现状调查</a></li>
						<li><a href="#">车辆设施停放现状调查</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="right">
			<div class="header">
				<h1 style="text-align: center">道路现状调查</h1>
				<div class="btn btn-success"
					style="float: left; margin-right: 20px;">单个插入</div>
				<div class="btn btn-primary" style="float: left">批量上传</div>
				<form class="form-inline" style="float: right" method="get"
					action="/infrastructure/state/search">
					<label for="text">Search:</label> <input type="text"
						class="form-control" id="name" name="name" />
					<button type="submit" class="btn btn-primary" value="搜索"></button>
				</form>
			</div>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>id</th>
						<th>路段名称</th>
						<th>长度</th>
						<th>坡度</th>
						<th>区域类型</th>
						<th>起点</th>
						<th>终点</th>
						<th>创建人</th>
						<th>调查人</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${roadList }" var="road" varStatus="s">
						<!-- this.id = id;
							this.creater = creater;
							this.investigator = investigator;
							this.roadName = roadName;
							this.length = length;
							this.incline = incline;
							this.sectionForm = sectionForm;
							this.start = start;
							this.end = end; -->
						<tr>
							<td><input type="checkbox" name="ids" value="${road.id }"></td>
							<td>${road.roadName }</td>
							<td>${road.length }</td>
							<td>${road.incline }</td>
							<td>${road.sectionForm }</td>
							<td>${road.start }</td>
							<td>${road.end }</td>
							<td>${road.creater }</td>
							<td>${road.investigator }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</div>

</body>
</html>