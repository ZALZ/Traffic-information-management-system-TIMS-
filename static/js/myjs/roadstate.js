$(function() {

	$(timeSelect).flatpickr();

	levelType = {
		5: "道路&nbsp;:&nbsp;快速路",
		6: "道路&nbsp;:&nbsp;主干路",
		7: "道路&nbsp;:&nbsp;次干路",
		8: "道路&nbsp;:&nbsp;支路",
		9: "公路&nbsp;:&nbsp;高速公路",
		10: "公路&nbsp;:&nbsp;一级公路",
		11: "公路&nbsp;:&nbsp;二级公路",
		12: "公路&nbsp;:&nbsp;三级公路",
		13: "公路&nbsp;:&nbsp;四级公路",
	}

	bedType = {
		1: "沥青路面",
		2: "水泥混凝土路面",
		3: "复合路面",
		4: "其他路面",
	}

	/* 地图功能 */
	var map = new AMap.Map('container', {
		zoom: 10, //级别
		center: [114.264433, 30.601824], //中心点坐标
	});

	var toolbar = new AMap.ToolBar();
	map.addControl(toolbar);
	var scale = new AMap.Scale();
	map.addControl(scale);

	var mouseTool = new AMap.MouseTool(map);
	//监听draw事件可获取画好的覆盖物
	var overlays;
	var polyline;
	var path;
	mouseTool.on('draw', function(e) {
		overlays = e.obj;
		path = [];
		var pathList = overlays.getPath();
		$(":input[name='coordinate']").val("");
		for (var i = 0; i < pathList.length; i++) {
			path.push(new AMap.LngLat(pathList[i]['lng'], pathList[i]['lat']));
			$(":input[name='coordinate']")[0].value += pathList[i]['lng'] + "&" + pathList[i]['lat'] + ";"
		}
	})

	var LineList = [];

	function draw() {
		mouseTool.polyline({
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
	}

	$("#drawline").click(function() {
		if (polyline != null)
			map.remove(polyline);
		if (overlays != null)
			map.remove(overlays);
		draw();
	})

	$("#startediter").click(function() {
		if (polyline != null)
			map.remove(polyline);
		if (overlays != null)
			map.remove(overlays);
		polyline = new AMap.Polyline({
			path: path,
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

		map.add(polyline);
		polyEditor = new AMap.PolyEditor(map, polyline);
		polyEditor.open();
		$("#drawline").addClass("disabled")
		$("#clearediter").addClass("disabled")
		$("#endediter").removeClass("disabled");
	})
	$("#clearediter").click(function() {
		clearallLine();
		$(":input[name='coordinate']").val("");

	})
	$("#endediter").click(function() {
		$("#clearediter").removeClass("disabled");
		$("#drawline").removeClass("disabled");
		$(":input[name='coordinate']").val("");
		var pathList = polyline.getPath();
		for (var i = 0; i < pathList.length; i++) {
			$(":input[name='coordinate']")[0].value += pathList[i]['lng'] + "&" + pathList[i]['lat'] + ";"
		}
		polyEditor.close();
	})


	function clearallLine() {
		while (LineList.length > 0) {
			map.remove(LineList.pop());
		}
	}

	$("#cancel").click(function() {
		if (polyline != null)
			map.remove(polyline);
		$(".input-card").attr("hidden", "true");
		$("i[id!='noc']").removeClass().addClass("fa fa-question-circle").css("color", "#777");
		$(":input[type!='button']").attr("value", "");
		$("#textarea").val('');
		$("#delete").removeAttr("hidden");
		$("#table-card").removeAttr("hidden");
		$("#insertOrUpdate-card").attr("hidden", "true");
		$("#insert-one").removeAttr("disabled")
		showAllLine();
	})


	function addTrclick($tr) {
		$tr.click(function() {
			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/infra/selectById.do",
				type: "GET",
				dataType: "json",
				data: {
					"id": $(this).attr("id"),
				},
				success: function(data, dataStatus) {
					hideAllLine();
					var todate = new Date();
					$("#insert-one").attr("disabled", "")
					/* 追加roadid的input hidden*/
					$("#insertOrUpdate-card .card-header")
						.append($("<input hidden='true' />")
							.attr("name", "id")
							.attr("value", data["id"]));

					/* 修改调查表的input */
					$(":input[name='investigator']").attr("value", data["investigator"]);
					$(":input[name='roadname']").attr("value", data["roadname"]);
					$(":input[name='incline']").attr("value", data["incline"]);
					$(":input[name='length']").attr("value", data["length"]);
					$(":input[name='section']").attr("value", data["section"]);
					$(":input[name='motorwaywidth']").attr("value", data["motorwaywidth"]);
					$(":input[name='superwaywidth']").attr("value", data["superwaywidth"]);
					$(":input[name='pavementwidth']").attr("value", data["pavementwidth"]);
					$(":input[name='medianwidth']").attr("value", data["medianwidth"]);
					$(":input[name='sidesseparatebeltwidth']").attr("value", data["sidesseparatebeltwidth"]);
					$(":input[name='redlinewidth']").attr("value", data["redlinewidth"]);
					$(":input[name='start']").attr("value", data["start"]);
					$(":input[name='end']").attr("value", data["end"]);

					$(":input[name='coordinate']").attr("value", data["coordinate"])

					$("#roadlevel-select").val(data["roadlevelId"]);
					$("#roadbed-select").val(data["roadbedtypeId"]);
					/* 对日期进行格式化 */
					var d = new Date();
					d.setTime(parseInt(data["surveytime"]));
					$(":input[name='surveytime']").attr("value", d.getFullYear() + "-" + (parseInt(d.getMonth()) + 1) + "-" +
						d.getDate());
					var lnglatList = data["coordinate"].split(";");
					path = [];
					for (var i = 0; i < lnglatList.length - 1; i++) {
						path.push(new AMap.LngLat(lnglatList[i].split("&")[0], lnglatList[i].split("&")[1]))
					}
					polyline = new AMap.Polyline({
						path: path,
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
					map.add(polyline);
					$(".input-card").removeAttr("hidden");

					$("#delete").removeAttr("hidden");

					$(":input[value='提交']").attr("id", "updata");

					$("#table-card").attr("hidden", "true")

					$("#insertOrUpdate-card").removeAttr("hidden");

				}

			})
		});
		return $tr;
	}

	function mouseEL($tr) {
		$tr.mouseenter(function() {
			$(this).css("background-color", "#badc58");
		});
		$tr.mouseleave(function() {
			if (this["rowIndex"] % 2 == 1) {
				$(this).css("background-color", "rgba(68, 68, 68, 0.05)");
			} else {
				$(this).css("background-color", "#FFF");
			}
		});
		return $tr;
	}

	function searchSuccess(data) {
		clearallLine();
		$("tbody").empty();
		$("#total-page").text(data["total"]);
		var roadlist = data["list"];
		for (var i = 0; i < roadlist.length; i++) {
			$("tbody").append(mouseEL(addTrclick($("<tr id=" + roadlist[i]["id"] + ">\
					<td>" + roadlist[i][
					"id"
				] + "</td>\
					<td>" + roadlist[i]["roadname"] + "</td>\
					<td>" + roadlist[i]["length"] +
				"</td>\
					<td>" + levelType[roadlist[i]["roadlevelId"]] +
				"</td>\
					<td>" + bedType[roadlist[i]["roadbedtypeId"]] + "</td>\
					<td>" + roadlist[i]["investigator"] +
				"</td>\
				</tr>"))));
			var lnglatList = roadlist[i]["coordinate"].split(";");
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
			LineList.push(line);
		}
		$('#pageInator').jqPaginator('option', {
			totalCounts: data["total"],
			pageSize: 13,
			visiblePages: 5,
			currentPage:data['pageNum']
		});
	}

	$('#pageInator').jqPaginator({
		totalPages: 10,
		visiblePages: 5,
		currentPage: 1,
		first: '<li class="page-item"><a class="page-link" href="javascript:void(0);">&lt;&lt;</a></li>',
		prev: '<li class="page-item"><a class="page-link" href="javascript:void(0);">&lt;</a></li>',
		next: '<li class="page-item"><a class="page-link" href="javascript:void(0);">&gt;</a></li>',
		last: '<li class="page-item"><a class="page-link" href="javascript:void(0);">&gt;&gt;</a></li>',
		page: '<li class="page-item"><a class="page-link" href="javascript:void(0);">{{page}}</a></li>',
		onPageChange: function(num, type) {
			var formdata = {}
			formdata["page"] = num;
			formdata["roadname"] = $(":input[name='input1-group2']").val();
			var $advance = $("#advance-setting").find(":input");
			for (var i = 0; i < $advance.length; i++) {
				formdata[$advance[i].name] = $($advance[i]).val();
			}

			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/infra/search.do",
				type: "get",
				dataType: "json",
				data: formdata,
				success: function(data) {
					searchSuccess(data)
				}
			})
		}

	});




	// 点击表格进入详情页



	$(":input[name='investigator']").blur(function() {
		/* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"]));
	});

	$(":input[name='roadname']").blur(function() {
		/* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"]));
	});
	/* 坡度 */
	$(":input[name='incline']").blur(function() {
		if ((/^[1-9][0-9]?(\.\d{1,2})?$/).test(this["value"]));
	});

	/* 长度 */
	$(":input[name='length']").blur(function() {
		if ((/^[1-9][0-9]{0,17}(\.\d{1,2})?$/).test(this["value"]));
	});

	$(":input[name='section']").blur(function() {
		//* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"]));
	});

	$(":input[name='motorwaywidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"]));
	});

	$(":input[name='superwaywidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"]));
	});

	$(":input[name='pavementwidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"]));
	});

	$(":input[name='medianwidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"]));
	});

	$(":input[name='sidesseparatebeltwidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"]));
	});

	$(":input[name='redlinewidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"]));
	});

	$(":input[name='start']").blur(function() { /* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"]));
	});

	$(":input[name='end']").blur(function() { /* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"]));
	});





	/* 判断输入的所有都符合条件 */
	$(":input").blur(function() {
		var secc = true
		$("i").each(function() {
			if ($(this).hasClass("fa-times")) {
				secc = false
				return false
			}
		})
		if (secc) {
			$(":input[value='提交']").removeAttr("disabled").removeClass("btn-link").addClass("btn-success");
		} else {
			$(":input[value='提交']").attr("disabled", "true").removeClass("btn-success").addClass("btn-link");
		}
	})


	/* 修改当前页面数据 */
	$(":input[value='提交']").click(function() {
		if ($(this).attr("id") == "updata") {
			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/infra/update.do",
				type: "get",
				dataType: "json",
				data: {
					"id": $(":input[name='id']").val(),
					"surveytime": $(":input[name='surveytime']").val(),
					"creater": $(":input[name='creater']").val(),
					"investigator": $(":input[name='investigator']").val(),
					"roadname": $(":input[name='roadname']").val(),
					"length": $(":input[name='length']").val(),
					"incline": $(":input[name='incline']").val(),
					"section": $(":input[name='section']").val(),
					"motorwaywidth": $(":input[name='motorwaywidth']").val(),
					"superwaywidth": $(":input[name='superwaywidth']").val(),
					"pavementwidth": $(":input[name='pavementwidth']").val(),
					"medianwidth": $(":input[name='medianwidth']").val(),
					"sidesseparatebeltwidth": $(":input[name='sidesseparatebeltwidth']").val(),
					"redlinewidth": $(":input[name='redlinewidth']").val(),
					"start": $(":input[name='start']").val(),
					"end": $(":input[name='end']").val(),
					"roadlevelId": $(":input[name='roadlevelId']").val(),
					"roadbedtypeId": $(":input[name='roadbedtypeId']").val(),
					"coordinate": $(":input[name='coordinate']").val(),
				},
				beforeSend: function() {

				},
				success: function(data, dataStatus) {
					/* 获取到id的值 */
					window.location.href =
						"http://localhost:8080//Traffic-information-management-system-TIMS-/infra/roadstate.do";

				},

			})
		} else if ($(this).attr("id") == "submit") {
			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/infra/insert.do",
				type: "get",
				dataType: "json",
				data: {
					"surveytime": $(":input[name='surveytime']").val(),
					"creater": $(":input[name='creater']").val(),
					"investigator": $(":input[name='investigator']").val(),
					"roadname": $(":input[name='roadname']").val(),
					"length": $(":input[name='length']").val(),
					"incline": $(":input[name='incline']").val(),
					"section": $(":input[name='section']").val(),
					"motorwaywidth": $(":input[name='motorwaywidth']").val(),
					"superwaywidth": $(":input[name='superwaywidth']").val(),
					"pavementwidth": $(":input[name='pavementwidth']").val(),
					"medianwidth": $(":input[name='medianwidth']").val(),
					"sidesseparatebeltwidth": $(":input[name='sidesseparatebeltwidth']").val(),
					"redlinewidth": $(":input[name='redlinewidth']").val(),
					"start": $(":input[name='start']").val(),
					"end": $(":input[name='end']").val(),
					"roadlevelId": $(":input[name='roadlevelId']").val(),
					"roadbedtypeId": $(":input[name='roadbedtypeId']").val(),
					"coordinate": $(":input[name='coordinate']").val(),
				},
				beforeSend: function() {

				},
				success: function(data, dataStatus) {
					window.location.href =
						"http://localhost:8080//Traffic-information-management-system-TIMS-/infra/roadstate.do";
				},

			})
		}

	})


	/* 删除被选择的数据 */
	$("#delete").click(function() {
		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/infra/delete.do",
			type: "get",
			dataType: "json",
			data: {
				"id": $(":input[name='id']").val(),
			},
			success: function(data, dataStatus) {
				window.location.href =
					"http://localhost:8080//Traffic-information-management-system-TIMS-/infra/roadstate.do";
			},
		})
	})

	function hideAllLine() {
		for (var i = 0; i < LineList.length; i++) {
			LineList[i].hide();
		}
	}

	function showAllLine() {
		for (var i = 0; i < LineList.length; i++) {
			LineList[i].show();
		}
	}

	$("#insert-one").click(function() {
		hideAllLine();
		$(".input-card").removeAttr("hidden");
		$(":input[value='提交']").attr("id", "submit");
		$("i[id!='noc']").removeClass().addClass("fa fa-question-circle").css("color", "#777");
		$(":input[type!='button']").attr("value", "");
		$("#delete").attr("hidden", "true");
		$("#table-card").attr("hidden", "true");
		$("#insertOrUpdate-card").removeAttr("hidden");
		$("#insert-one").attr("disabled", "")
	})

	$("#searchbtn").click(function() {
		var formdata = {}
		formdata["roadname"] = $(":input[name='input1-group2']").val();
		var $advance = $("#advance-setting").find(":input");
		for (var i = 0; i < $advance.length; i++) {
			formdata[$advance[i].name] = $($advance[i]).val();
		}
		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/infra/search.do",
			type: "get",
			dataType: "json",
			data: formdata,
			success: function(data, dataStatus) {
				searchSuccess(data)
			},
		})
	})

	$("#advance-success").click(function() {
		var formdata = {}
		formdata["roadname"] = $(":input[name='input1-group2']").val();
		var $advance = $("#advance-setting").find(":input");
		for (var i = 0; i < $advance.length; i++) {
			formdata[$advance[i].name] = $($advance[i]).val();
		}
		console.log(formdata);
		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/infra/search.do",
			type: "get",
			dataType: "json",
			data: formdata,
			success: function(data, dataStatus) {
				searchSuccess(data)
			},
		})
	})

	var inst = $('[data-remodal-id=modal]').remodal();
	$("advance-save").click(function() {
		inst.close();
	})

	$(document).on('cancellation', '.remodal', function() {
		console.log(1111111)
		$("#advance-setting :input").val("");
	});

	/* 实现上传文件 */
	$("#uploadExcel").click(function() {
		return $(":input[type='file']").click();
	})
	$(":input[type='file']").change(function() {
		var data = [];
		var files = $(this)[0].files;
		if (files.length) {
			var file = files[0];
			var reader = new FileReader(); //new一个FileReader实例
			if (typeof FileReader == 'undefined') {
				layer.alert("你的浏览器暂不支持该功能", {
					title: "提示",
					skin: "layui-layer-molv"
				});
				file.setAttribute("disabled", "disabled");
				return;
			}
			reader.readAsText(file);
			reader.onload = function(f) {
				clearallLine();
				$("tbody").empty();
				//var result = document.getElementById("result");
				//显示文件  
				var relArr = this.result.split("\r\n");
				if (!$.isEmptyObject(relArr) && relArr.length > 1) {
					for (var key = 1, len = relArr.length; key < len; key++) {
						var values = relArr[key];
						if (!$.isEmptyObject(values)) {
							var obj = {};
							var objArr = values.split(",");
							$.ajax({
								url: "/Traffic-information-management-system-TIMS-/infra/insert.do",
								type: "get",
								dataType: "json",
								data: {
									"roadname": objArr[0],
									"start": objArr[1],
									"end": objArr[2],
									"length": objArr[3],
									"incline": objArr[4],
									"section": objArr[5],
									"motorwaywidth": objArr[6],
									"superwaywidth": objArr[7],
									"pavementwidth": objArr[8],
									"medianwidth": objArr[9],
									"sidesseparatebeltwidth": objArr[10],
									"redlinewidth": objArr[11],
									"roadlevelId": objArr[12],
									"roadbedtypeId": objArr[13],
									"coordinate": objArr[14],
									"investigator": objArr[15],
									"surveytime": objArr[16],
								},
								success: function(data, dataStatus) {
									$("tbody").append(("<tr >\
											<td>" + key + "</td>\
											<td>" + objArr[0] +
										"</td>\
											<td>" + objArr[3] + "</td>\
											<td>" + levelType[objArr[12]] +
										"</td>\
											<td>" + bedType[objArr[13]] + "</td>\
											<td>" + objArr[15] +
										"</td>\
										</tr>"));

									var lnglatList = objArr[14].split(";");
									var path = [];
									for (var i = 0; i < lnglatList.length - 1; i++) {
										path.push(new AMap.LngLat(lnglatList[i].split("&")[0], lnglatList[i].split("&")[1]))
									}
									var polyline = new AMap.Polyline({
										path: path,
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
									map.add(polyline);
								},
							})
						}
					}

				}
			}
		}
	})

	$("#clear").click(function() {
		$("#insertOrUpdate-card :input[type!='button']").attr("value", "")
	})
	
	$("#download").click(function(){
		window.open("http://localhost:8080/Traffic-information-management-system-TIMS-/download/file.do?fileName=roadstate.xlsx", "_blank");
	})

});
