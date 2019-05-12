$(function() {

	btnClass = {
		"roadstate": "btn-primary",
		"normalInter": "btn-success",
		"roundabout": "btn-info",
		"overpass": "btn-warning",
		"park": "btn-danger",
	}

	/* 地图功能 */
	var map = new AMap.Map('container', {
		zoom: 10, //级别
		center: [114.264433, 30.601824], //中心点坐标
	});

	var lineList = [];
	$.getJSON("/Traffic-information-management-system-TIMS-/data/getAllRoad.do", function(data) {
		$("#roadstate").append(data.length);
		for (var i = 0; i < data.length; i++) {
			var lnglatList = data[i]["coordinate"].split(";");
			var pathList = [];
			for (var j = 0; j < lnglatList.length - 1; j++) {
				pathList.push(new AMap.LngLat(lnglatList[j].split("&")[0], lnglatList[j].split("&")[1]));
			}
			var line = new AMap.Polyline({
				path: pathList,
				isOutline: true,
				outlineColor: '#ffeeff',
				borderWeight: 3,
				strokeColor: "#3366FF",
				strokeOpacity: 1,
				strokeWeight: 6,
				// 折线样式还支持 'dashed'
				strokeStyle: "solid",
				// strokeStyle是dashed时有效
				strokeDasharray: [10, 5],
				lineJoin: 'round',
				lineCap: 'round',
				zIndex: 50,
			});
			map.add(line);
			lineList.push(line)
		}
	})

	var normalMarker = [];
	$.getJSON("/Traffic-information-management-system-TIMS-/data/getAllNormal.do", function(data) {
		$("#normalInter").append(data.length);
		for (var i = 0; i < data.length; i++) {
			var markers = new AMap.Marker({
				position: new AMap.LngLat(data[i]["coordinate"].split("&")[0], data[i]["coordinate"].split(
					"&")[1]),
				title: data[i]["id"] + ":" + data[i]["name"],
				content: "<div class='text-success'><i class='fa fa-map-marker fa-2x' aria-hidden='true'></i></div>"
			});
			markers.setMap(map);
			normalMarker.push(markers);
		}
	})

	var roundaboutMarker = [];
	$.getJSON("/Traffic-information-management-system-TIMS-/data/getAllRoundabout.do", function(data) {
		$("#roundabout").append(data.length);
		for (var i = 0; i < data.length; i++) {
			var markers = new AMap.Marker({
				position: new AMap.LngLat(data[i]["coordinate"].split("&")[0], data[i]["coordinate"].split(
					"&")[1]),
				title: data[i]["id"] + ":" + data[i]["name"],
				content: "<div class='text-info'><i class='fa fa-map-marker fa-2x' aria-hidden='true'></i></div>"
			});
			markers.setMap(map);
			roundaboutMarker.push(markers);
		}
	})

	var overpassMarker = [];
	$.getJSON("/Traffic-information-management-system-TIMS-/data/getAllOverpass.do", function(data) {
		$("#overpass").append(data.length);
		for (var i = 0; i < data.length; i++) {
			var markers = new AMap.Marker({
				position: new AMap.LngLat(data[i]["coordinate"].split("&")[0], data[i]["coordinate"].split(
					"&")[1]),
				title: data[i]["id"] + ":" + data[i]["name"],
				content: "<div class='text-warning'><i class='fa fa-map-marker fa-2x' aria-hidden='true'></i></div>"
			});
			markers.setMap(map);
			overpassMarker.push(markers);
		}
	})

	var parkMarker = [];
	$.getJSON("/Traffic-information-management-system-TIMS-/data/getAllPark.do", function(data) {
		$("#park").append(data.length);
		for (var i = 0; i < data.length; i++) {
			var markers = new AMap.Marker({
				position: new AMap.LngLat(data[i]["coordinate"].split("&")[0], data[i]["coordinate"].split(
					"&")[1]),
				title: data[i]["id"] + ":" + data[i]["name"],
				content: "<div class='text-danger'><i class='fa fa-map-marker fa-2x' aria-hidden='true'></i></div>"
			});
			markers.setMap(map);
			parkMarker.push(markers);
		}
	})

	idList = {
		"roadstate": lineList,
		"normalInter": normalMarker,
		"roundabout": roundaboutMarker,
		"overpass": overpassMarker,
		"park": parkMarker,
	}

	function hideAll(list) {
		for (var i = 0; i < list.length; i++) {
			list[i].hide();
		}
	}

	function showAll(list) {
		for (var i = 0; i < list.length; i++) {
			list[i].show();
		}
	}

	$(".input-card button").click(function() {
		if ($(this).attr("num") == "0") {
			hideAll(idList[this.id]);
			$(this).removeClass(btnClass[this.id]);
			$(this).attr("num", "1");
		} else {
			showAll(idList[this.id]);
			$(this).addClass(btnClass[this.id]);
			$(this).attr("num", "0");
		}
	})


	/* 行人流量可视化 */

	var container1Chart = echarts.init(document.getElementById('container1'));
	var container2Chart = echarts.init(document.getElementById('container2'));
	var line3Chart = echarts.init(document.getElementById('linecontainer'));

	$.getJSON("/Traffic-information-management-system-TIMS-/counter/selectTotal.do", function(datas) {
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
				text: '过街/违法 总数据(小时)',
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
				data: ['08~09', '09~10', '10~11', '11~12', '14~15', '15~16', '16~17', '17~18'],
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

	})

	$.getJSON("/Traffic-information-management-system-TIMS-/counter/selectAllGroupBySurveyTime.do", function(datas) {
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
				type: 'value',
				boundaryGap: [0, '100%']
			},
			dataZoom: [{
				type: 'inside',
				start: 0,
				end: dateList.lenght
			}, {
				start: 0,
				end: dateList.lenght,
				handleIcon: 'M10.7,11.9v-1.3H9.3v1.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4v1.3h1.3v-1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7V23h6.6V24.4z M13.3,19.6H6.7v-1.4h6.6V19.6z',
				handleSize: '80%',
				handleStyle: {
					color: '#fff',
					shadowBlur: 3,
					shadowColor: 'rgba(0, 0, 0, 0.6)',
					shadowOffsetX: 2,
					shadowOffsetY: 2
				}
			}],
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
	})
	
	

})
