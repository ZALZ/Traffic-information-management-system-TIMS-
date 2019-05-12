$(function() {
	// 基于准备好的dom，初始化echarts实例
	var container1Chart = echarts.init(document.getElementById('container1'));
	var container2Chart = echarts.init(document.getElementById('container2'));
	var line3Chart = echarts.init(document.getElementById('linecontainer'));


	$.ajax({
		url: "/Traffic-information-management-system-TIMS-/counter/selectTotal.do",
		type: "get",
		dataType: "json",
		success: function(datas) {

			container1ChartOption = {
				title: {
					text: '所有 过街/违法 总数据',
					left: 'center',

				},
				tooltip: {
					trigger: 'item',
					formatter: "{a} <br/>{b} : {c} ({d}%)",
				},
				toolbox: {
					feature: {
						saveAsImage: {}
					},
					right: 15,
				},
				series: [{
					name: '过街/违章总数据',
					type: 'pie',
					radius: '55%',
					data: [{
							value: datas["violation"],
							name: '违章总人数',
							itemStyle: {
								color: '#A60000',
							},
						},
						{
							value: datas["total"],
							name: '过街总人数',
							itemStyle: {
								color: '#3398DB',
							},
						}
					],
				}]
			}
			container1Chart.setOption(container1ChartOption);

			/* 分时过街/违法总数据 */
			container2ChartOption = {
				title: {
					text: '分时 过街/违法 总数据',
					left: 'center',

				},
				tooltip: {
					trigger: 'axis',
					axisPointer: { // 坐标轴指示器，坐标轴触发有效
						type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
					}
				},
				toolbox: {
					feature: {
						saveAsImage: {}
					},
					right: 15,
				},
				legend: {
					data: ['总人数', '违法人数'],
					top: 23
				},
				grid: {
					left: '3%',
					right: '4%',
					bottom: '3%',
					containLabel: true
				},
				yAxis: {
					type: 'value'
				},
				xAxis: {
					type: 'category',
					data: ['08', '09', '10', '11', '14', '15', '16', '17'],
					rotate: 45,
					interval: 0
				},
				series: [{
						name: '违法人数',
						type: 'bar',
						stack: '人数',
						data: [datas["violation8"], datas["violation9"], datas["violation10"], datas["violation11"], datas[
							"violation14"], datas["violation15"], datas["violation16"], datas["violation17"]],
						itemStyle: {
							color: '#A60000',
						},
					},
					{
						name: '总人数',
						type: 'bar',
						stack: '人数',
						data: [datas["total8"], datas["total9"], datas["total10"], datas["total11"], datas["total14"], datas[
							"total15"], datas["total16"], datas["total17"]],
						itemStyle: {
							color: '#3398DB',
						},
					},
				]
			}
			container2Chart.setOption(container2ChartOption);
		},
	})

	$.ajax({
		url: "/Traffic-information-management-system-TIMS-/counter/selectAllGroupBySurveyTime.do",
		type: "get",
		dataType: "json",
		success: function(datas) {
			var dateList = [];
			var totalList = [];
			var violationList = [];
			var d = new Date();
			for (var i = 0; i < datas.length; i++) {
				d.setTime(parseInt(datas[i]["surveytime"]));
				dateList.push(d.getFullYear() + "-" + (parseInt(d.getMonth()) + 1) + "-" + d.getDate());
				totalList.push(datas[i]["total"]);
				violationList.push(datas[i]["violation"]);
			}
			
			line3ChartOption = {
				title: {
					text: '所有 过街/违法 总数据(日期)',
					left: 'center',
				},
				tooltip: {
					trigger: 'axis'
				},
				legend: {
					data: ['总人数', '违法人数'],
					left: 'center',
					top: 25,
				},
				grid: {
					left: '3%',
					right: '4%',
					bottom: '3%',
					containLabel: true
				},
				toolbox: {
					feature: {
						saveAsImage: {}
					},
					right: 15,
				},
				xAxis: {
					type: 'category',
					boundaryGap: false,
					data: dateList,
				},
				yAxis: {
					type: 'value'
				},
				series: [{
						name: '总人数',
						type: 'line',
						data: totalList,
						itemStyle: {
							color: '#3398DB',
						},

					},
					{
						name: '违法人数',
						type: 'line',
						data: violationList,
						itemStyle: {
							color: '#A60000',
						},
					},
				]
			}
			line3Chart.setOption(line3ChartOption);
		},

	})

	$("#cancel").click(function() {
		$("i[id!='noc']").removeClass().addClass("fa fa-question-circle").css("color", "#777");
		$(":input[type!='button']").attr("value", "");
		$("#textarea").val('');
		$("#delete").removeAttr("hidden");
		$("#table-card").removeAttr("hidden");
		$("#insertOrUpdate-card").attr("hidden", "true");
		$("#insert-one").removeAttr("disabled")
		container1Chart.setOption(container1ChartOption);
		container2Chart.setOption(container2ChartOption);
		line3Chart.setOption(line3ChartOption);
	})

})
