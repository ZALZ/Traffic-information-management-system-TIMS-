$(function() {


	parktype = {
		27: "路内临时性公共停车场",
		28: "交通性停车场",
		29: "文体性停车场",
		30: "商业性停车场",
		31: "货运车停车场",
		32: "居住地停车场",
		33: "工作地停车场",
		34: "货运车专用停车场",
		35: "道路停车场",
	}

	$(timeSelect).flatpickr();

	/* 地图功能 */
	var marker, map = new AMap.Map('container', {
		zoom: 10, //级别
		center: [114.264433, 30.601824], //中心点坐标
	});

	var toolbar = new AMap.ToolBar();
	map.addControl(toolbar);
	var scale = new AMap.Scale();
	map.addControl(scale);
	var mouseTool = new AMap.MouseTool();
	map.addControl(mouseTool);

	var markList = new Array();

	function clearMarker() {
		while (markList.length > 0) {
			map.remove(markList.pop());
		}
	}

	function showAllMarker() {
		for (var i = 0; i < markList.length; i++) {
			markList[i].show();
		}
	}

	function hideAllMarker() {
		for (var i = 0; i < markList.length; i++) {
			markList[i].hide();
		}
	}

	function getposition(e) {
		if (marker != null)
			map.remove(marker);
		var lng = e.lnglat.getLng();
		var lat = e.lnglat.getLat();

		marker = new AMap.Marker({
			position: new AMap.LngLat(lng, lat), // 经纬度对象，也可以是经纬度构成的一维数组[116.39, 39.9]
		});
		marker.setMap(map);
		$(":input[name='coordinate']").val(lng + "&" + lat);
		markList.push(marker)
	}


	$("#panduan").click(function() {

		console.log($("#hasadd")[0].checked);
	})


	function addTrclick($tr) {
		$tr.click(function() {
			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/park/selectById.do",
				type: "GET",
				dataType: "json",
				data: {
					"id": $(this).attr("id")
				},
				success: function(data, dataStatus) {
					hideAllMarker();
					map.on('click', getposition);
					$("#insert-one").attr("disabled", "")
					/* 将insertOrUpdate-card显示，并在追加input中追加内容 */
					/* 追加roadid的input hidden*/
					$("#insertOrUpdate-card .card-header")
						.append($("<input hidden='true' />")
							.attr("name", "id")
							.attr("value", data["id"]));
					/* 修改调查表的input */
					checkon($(":input[name='investigator']").attr("value", data["investigator"]).prev().find("i"));
					checkon($(":input[name='name']").attr("value", data["name"]).prev().find("i"));
					checkon($(":input[name='area']").attr("value", data["area"]).prev().find("i"));
					checkon($(":input[name='catability']").attr("value", data["catability"]).prev().find("i"));
					checkon($(":input[name='classification']").attr("value", data["classification"]).prev().find("i"));
					checkon($(":input[name='coordinate']").attr("value", data["coordinate"]).prev().find("i"));
					$(":input[name='parktypeId']").attr("checked", data["parktypeId"])
					$("#textarea").val(data["businessstatus"]);
					/* 对日期进行格式化 */
					var d = new Date();
					d.setTime(parseInt(data["surveytime"]));
					checkon($(":input[name='surveytime']").attr("value", d.getFullYear() + "-" + (parseInt(d.getMonth())+1) + "-" +
							d.getDate())
						.prev().find("i"));
					marker = new AMap.Marker({
						position: new AMap.LngLat(data["coordinate"].split("&")[0], data["coordinate"].split("&")[1]), // 经纬度对象，也可以是经纬度构成的一维数组[116.39, 39.9]
					});
					marker.setMap(map);

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

	$("#cancel").click(function() {
		if (marker != null) {
			map.remove(marker);
			marker = null;
		}
		map.off('click', getposition);
		$("i[id!='noc']").removeClass().addClass("fa fa-question-circle").css("color", "#777");
		$(":input[type!='button']").attr("value", "");
		$("#textarea").val('');
		$("#delete").removeAttr("hidden");
		$("#table-card").removeAttr("hidden");
		$("#insertOrUpdate-card").attr("hidden", "true");
		$("#insert-one").removeAttr("disabled")
		showAllMarker();
	})

	function searchSuccess(data) {
		clearMarker();
		$("tbody").empty();
		$("#total-page").text(data["total"]);
		var parkList = data["list"];
		for (var i = 0; i < parkList.length; i++) {
			$("tbody").append(mouseEL(addTrclick($("<tr id=" + parkList[i]["id"] + ">\
					<td>" + parkList[i][
					"id"
				] + "</td>\
					<td>" + parkList[i]["name"] + "</td>\
					<td>" + parkList[i]["area"] +
				"</td>\
					<td>" + parkList[i]["catability"] + "</td>\
					<td>" + parktype[parkList[i][
					"parktypeId"
				]] + "</td>\
					<td>" + parkList[i]["investigator"] + "</td>\
				</tr>"))));
			var markers = new AMap.Marker({
				position: new AMap.LngLat(parkList[i]["coordinate"].split("&")[0], parkList[i]["coordinate"].split("&")[
					1]), // 经纬度对象，也可以是经纬度构成的一维数组[116.39, 39.9]
				title: parkList[i]["id"] + ":" + parkList[i]["name"]
			});
			markers.setMap(map);
			markList.push(markers);
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
			formdata["name"] = $(":input[name='input1-group2']").val();
			var $advance = $("#advance-setting").find(":input");
			for (var i = 0; i < $advance.length; i++) {
				formdata[$advance[i].name] = $($advance[i]).val();
			}
			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/park/search.do",
				type: "get",
				dataType: "json",
				data: formdata,
				success: function(data) {
					searchSuccess(data);
				}
			})
		}
	});

	function checkon(secc) {
		secc.removeClass();
		secc.addClass("fa fa-check");
		secc.css("color", "green");
	}

	function checkFalse(secc) {
		secc.removeClass();
		secc.addClass("fa fa-times");
		secc.css("color", "red");
	}



	function refreshIcon(secc) {
		secc.removeClass();
		secc.addClass("fa fa-li fa-spinner fa-spin");
	}



	$(":input[name='investigator']").blur(function() {
		/* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});

	$(":input[name='name']").blur(function() {
		/* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});

	$(":input[name='intonumber']").blur(function() {
		if ((/^[1-9][0-9]?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});

	$(":input[name='turningwidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='radius']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
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

	/* 修改和提交方法 */
	$(":input[value='提交']").click(function() {
		if ($(this).attr("id") == "updata") {
			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/park/update.do",
				type: "get",
				dataType: "json",
				data: {

					"id": $(":input[name='id']").val(),
					"surveytime": $(":input[name='surveytime']").val(),
					"investigator": $(":input[name='investigator']").val(),
					"name": $(":input[name='name']").val(),
					"area": $(":input[name='area']").val(),
					"catability": $(":input[name='catability']").val(),
					"classification": $(":input[name='classification']").val(),
					"businessstatus": $(":input[name='businessstatus']").val(),
					"parktypeId": $(":input[name='parktypeId']").val(),
					"coordinate": $(":input[name='coordinate']").val(),

				},
				beforeSend: function() {

				},
				success: function(data, dataStatus) {
					/* 获取到id的值 */
					window.location.href =
						"http://localhost:8080//Traffic-information-management-system-TIMS-/park/park.do";
				},

			})
		} else if ($(this).attr("id") == "submit") {

			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/park/insert.do",
				type: "get",
				dataType: "json",
				data: {
					"surveytime": $(":input[name='surveytime']").val(),
					"investigator": $(":input[name='investigator']").val(),
					"name": $(":input[name='name']").val(),
					"area": $(":input[name='area']").val(),
					"catability": $(":input[name='catability']").val(),
					"classification": $(":input[name='classification']").val(),
					"businessstatus": $(":input[name='businessstatus']").val(),
					"parktypeId": $(":input[name='parktypeId']").val(),
					"coordinate": $(":input[name='coordinate']").val(),
				},
				beforeSend: function() {

				},
				success: function(data, dataStatus) {
					window.location.href =
						"http://localhost:8080//Traffic-information-management-system-TIMS-/park/park.do";
				},

			})
		}

	})


	$(".cancel-delail").click(function() {
		window.location.href =
			"http://localhost:8080//Traffic-information-management-system-TIMS-/park/park.do";
	})


	/* 删除被选择的数据 */
	$("#delete").click(function() {
		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/park/delete.do",
			type: "get",
			dataType: "json",
			data: {
				"id": $(":input[name='id']").val(),
			},
			success: function(data, dataStatus) {
				window.location.href =
					"http://localhost:8080//Traffic-information-management-system-TIMS-/park/park.do";
			},
		})
	})

	$("#insert-one").click(function() {
		hideAllMarker()
		map.on('click', getposition);
		$(":input[value='提交']").attr("id", "submit");
		$("i[id!='noc']").removeClass().addClass("fa fa-question-circle").css("color", "#777");
		$(":input[type!='button']").attr("value","");
		$("#textarea").val('');
		$("#delete").attr("hidden", "true");
		$("#table-card").attr("hidden", "true");
		$("#insertOrUpdate-card").removeAttr("hidden");
		$("#insert-one").attr("disabled", "");
	});

	$("#searchbtn").click(function() {
		var formdata = {}
		formdata["name"] = $(":input[name='input1-group2']").val();
		var $advance = $("#advance-setting").find(":input");
		for (var i = 0; i < $advance.length; i++) {
			formdata[$advance[i].name] = $($advance[i]).val();
		}
		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/park/search.do",
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
		formdata["name"] = $(":input[name='input1-group2']").val();
		var $advance = $("#advance-setting").find(":input");
		for (var i = 0; i < $advance.length; i++) {
			formdata[$advance[i].name] = $($advance[i]).val();
		}
		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/park/search.do",
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
		$("#advance-setting :input").val("");
	});

	/* 上传文件方法 */
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
				clearMarker();
				$("tbody").empty();
				//var result = document.getElementById("result");
				//显示文件  
				var relArr = this.result.split("\r\n");
				if (!$.isEmptyObject(relArr) && relArr.length > 1) {
					for (var key = 1, len = relArr.length; key < len; key++) {
						var values = relArr[key];
						if (!$.isEmptyObject(values)) {
							var objArr = values.split(",");
							$.ajax({
								url: "/Traffic-information-management-system-TIMS-/park/insert.do",
								type: "get",
								dataType: "json",
								data: {
									"name": objArr[0],
									"catability": objArr[1],
									"classification": objArr[2],
									"parktypeId": objArr[3],
									"area": objArr[4],
									"businessstatus": objArr[5],
									"coordinate": objArr[6],
									"investigator": objArr[7],
									"surveytime": objArr[8],
								},
								success: function(data, dataStatus) {
									$("tbody").append(("<tr >\
											<td>" + key + "</td>\
											<td>" + objArr[0] + "</td>\
											<td>" + objArr[4] + "</td>\
											<td>" + objArr[1] + "</td>\
											<td>" + parktype[objArr[3]] + "</td>\
											<td>" + objArr[7] + "</td>\
										</tr>"));

									var markers = new AMap.Marker({
										position: new AMap.LngLat(objArr[6].split("&")[0], objArr[6].split(
											"&")[1]),
										title: key + ":" + objArr[0],
									});
									markers.setMap(map);

								},
							})
						}
					}

				}
			}
		}
	})

	$("#download").click(function(){
		window.open("http://localhost:8080/Traffic-information-management-system-TIMS-/download/file.do?fileName=park.xlsx", "_blank");
	})
	
})
