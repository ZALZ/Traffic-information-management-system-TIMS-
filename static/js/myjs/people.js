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

	$("#panduan").click(function() {

		console.log($("#hasadd")[0].checked);
	})

	var container1Chart = echarts.init(document.getElementById('container1'));
	var container2Chart = echarts.init(document.getElementById('container2'));
	var line3Chart = echarts.init(document.getElementById('linecontainer'));

	function addTrclick($tr) {

		$tr.click(function() {
			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/people/selectById.do",
				type: "GET",
				dataType: "json",
				data: {
					"id": $(this).attr("id")
				},
				success: function(data, dataStatus) {
					$("#insert-one").attr("disabled", "")
					/* 将insertOrUpdate-card显示，并在追加input中追加内容 */
					/* 追加roadid的input hidden*/
					$("#insertOrUpdate-card .card-header")
						.append($("<input hidden='true' />")
							.attr("name", "id")
							.attr("value", data["id"]));
					/* 修改调查表的input */
					$(":input[name='investigator']").attr("value", data["investigator"]);
					$(":input[name='number']").attr("value", data["number"]);
					$(":input[name='intersectionId']").attr("value", data["intersectionId"]);
					$(":input[name='total8']").attr("value", data['total8']);
					$(":input[name='total9']").attr("value", data['total9']);
					$(":input[name='total10']").attr("value", data['total10']);
					$(":input[name='total11']").attr("value", data['total11']);
					$(":input[name='total14']").attr("value", data['total14']);
					$(":input[name='total15']").attr("value", data['total15']);
					$(":input[name='total16']").attr("value", data['total16']);
					$(":input[name='total17']").attr("value", data['total17']);

					$(":input[name='violation8']").attr("value", data['violation8']);
					$(":input[name='violation9']").attr("value", data['violation9']);
					$(":input[name='violation10']").attr("value", data['violation10']);
					$(":input[name='violation11']").attr("value", data['violation11']);
					$(":input[name='violation14']").attr("value", data['violation14']);
					$(":input[name='violation15']").attr("value", data['violation15']);
					$(":input[name='violation16']").attr("value", data['violation16']);
					$(":input[name='violation17']").attr("value", data['violation17']);

					$("i[id!='noc']").removeClass().addClass("fa fa-check").css("color", "green");

					/* 对日期进行格式化 */
					var d = new Date();
					d.setTime(parseInt(data["surveytime"]));
					checkon($(":input[name='surveytime']").attr("value", d.getFullYear() + "-" + (parseInt(d.getMonth()) + 1) +
							"-" +
							d.getDate())
						.prev().find("i"));

					$("#delete").removeAttr("hidden");

					$(":input[value='提交']").attr("id", "updata");

					$("#table-card").attr("hidden", "true")

					$("#insertOrUpdate-card").removeAttr("hidden");

				}

			})

			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/counter/selectByNormalIDandNumber.do",
				type: "get",
				dataType: "json",
				data: {
					"intersectionId": $(this).attr("intersectionId"),
					"number": $(this).attr("number")
				},
				success: function(datas) {
					container1Chart.setOption({
						title: {
							text: '当前路口 过街/违法 数据',
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
							itemStyle: {
								// 阴影的大小
								shadowBlur: 200,
								// 阴影水平方向上的偏移
								shadowOffsetX: 0,
								// 阴影垂直方向上的偏移
								shadowOffsetY: 0,
								// 阴影颜色
								shadowColor: 'rgba(0, 0, 0, 0.5)'
							}
						}]
					})

					/* 分时过街/违法总数据 */
						container2Chart.setOption({
							title: {
								text: '当前路口 过街/违法 数据(小时)',
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
						})
				},
			})

			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/counter/selectByNormalIDandNumberGroupBySurveyTime.do",
				type: "get",
				dataType: "json",
				data: {
					"intersectionId": $(this).attr("intersectionId"),
					"number": $(this).attr("number")
				},
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
					line3Chart.setOption({
						title: {
							text: '当前路口 过街/违法 总数据(日期)',
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
					})
				},
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
		$("tbody").empty();
		$("#total-page").text(data["total"]);
		var flowList = data["list"];
		var d = new Date();

		for (var i = 0; i < flowList.length; i++) {
			d.setTime(parseInt(flowList[i]["surveytime"]));
			$("tbody").append(mouseEL(addTrclick($("<tr id=" + flowList[i]["id"] + " intersectionId=" + flowList[i][
					"intersectionId"
				] + " number=" + flowList[i]["number"] + " >\
					<td>" + flowList[i][
					"id"
				] + "</td>\
					<td>" + flowList[i]["name"] + "</td>\
					<td>" + flowList[i]["number"] +
				"</td>\
					<td>" + flowList[i]["total"] + "</td>\
					<td>" + flowList[i]["violation"] +
				"</td>\
					<td>" + d.getFullYear() + "-" + (parseInt(d.getMonth()) + 1) + "-" + d.getDate() +
				"</td>\
				</tr>"))));
		}
		$('#pageInator').jqPaginator('option', {
			totalCounts: data["total"],
			pageSize: 13,
			visiblePages: 5,
			currentPage:data['pageNum']
		})
	}

	$('#pageInator').jqPaginator({
		totalPages: 1,
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
				url: "/Traffic-information-management-system-TIMS-/people/search.do",
				type: "get",
				dataType: "json",
				data:formdata,
				success: function(data, status) {
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

	$(":input[name='investigator']").blur(function() {
		/* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});

	$(":input[name='intersectionId']").blur(function() {
		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/intersection/selectById.do",
			type: "get",
			dataType: "json",
			data: {
				"id": $(":input[name='intersectionId']").val(),
			},
			success: function(data) {
				checkon($(":input[name='intersectionId']").prev().find("i"));
			},
			error: function() {
				checkFalse($(":input[name='intersectionId']").prev().find("i"));
			}

		})
	});

	$(":input[name='number']").blur(function() {
		/* 判断输入的是否是汉字 */
		if ((/^[1-9][0-9]?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});

	$(":input[name^='total']").blur(function() {
		if ((/^[1-9]\d*|0$/).test(this["value"])) {
			$(this).css("backgroundColor", "white")
		} else {
			console.log(false)
			$(this).css("backgroundColor", "pink")
		};
	});

	$(":input[name^='violation']").blur(function() {
		console.log($(this).parent().parent().prev().find(":input").val());
		if ((/^[1-9]\d*|0$/).test(this["value"]) && parseInt($(this).val()) <= parseInt($(this).parent().parent().prev().find(
				":input").val())) {
			$(this).css("backgroundColor", "white")
		} else {
			console.log(false)
			$(this).css("backgroundColor", "pink")
		};
	});

	/* 修改和提交方法 */
	$(":input[value='提交']").click(function() {
		if ($(this).attr("id") == "updata") {
			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/people/update.do",
				type: "get",
				dataType: "json",
				data: {

					"id": $(":input[name='id']").val(),
					"surveytime": $(":input[name='surveytime']").val(),
					"investigator": $(":input[name='investigator']").val(),
					"intersectionId": $(":input[name='intersectionId']").val(),
					"number": $(":input[name='number']").val(),
					"total8": $(":input[name='total8']").val(),
					"violation8": $(":input[name='violation8']").val(),
					"total9": $(":input[name='total9']").val(),
					"violation9": $(":input[name='violation9']").val(),
					"total10": $(":input[name='total10']").val(),
					"violation10": $(":input[name='violation10']").val(),
					"total11": $(":input[name='total11']").val(),
					"violation11": $(":input[name='violation11']").val(),
					"total14": $(":input[name='total14']").val(),
					"violation14": $(":input[name='violation14']").val(),
					"total15": $(":input[name='total15']").val(),
					"violation15": $(":input[name='violation15']").val(),
					"total16": $(":input[name='total16']").val(),
					"violation16": $(":input[name='violation16']").val(),
					"total17": $(":input[name='total17']").val(),
					"violation17": $(":input[name='violation17']").val(),
					"total": parseInt($(":input[name='total8']").val()) + parseInt($(":input[name='total9']").val()) +
						parseInt($(":input[name='total10']").val()) + parseInt($(":input[name='total11']").val()) +
						parseInt($(":input[name='total14']").val()) + parseInt($(":input[name='total15']").val()) +
						parseInt($(":input[name='total16']").val()) + parseInt($(":input[name='total17']").val()),
					"violation": parseInt($(":input[name='violation8']").val()) + parseInt($(":input[name='violation9']").val()) +
						parseInt($(":input[name='violation10']").val()) + parseInt($(":input[name='violation11']").val()) +
						parseInt($(":input[name='violation14']").val()) + parseInt($(":input[name='violation15']").val()) +
						parseInt($(":input[name='violation16']").val()) + parseInt($(":input[name='violation17']").val()),

				},
				beforeSend: function() {

				},
				success: function(data, dataStatus) {
					/* 获取到id的值 */
					$("#insertOrUpdate-card :input[type!='button']:hidden").remove();
					$("i[id!='noc']").removeClass().addClass("fa fa-question-circle").css("color", "#777");
					$(":input[type!='button']").removeAttr("value");
					$("#textarea").val('');
					$("#delete").attr("hidden", "true");
					$("#insertOrUpdate-card").attr("hidden", "true");
					$("#table-card").removeAttr("hidden");
					var $td = $("tr[id=" + data['id'] + "]").find("td");
					$($td[0]).text(data['id']);
					$($td[1]).text(data['name']);
					$($td[2]).text(data['number']);
					$($td[3]).text(data['total']);
					$($td[4]).text(data['violation']);
					var d = new Date();
					d.setTime(parseInt(data["surveytime"]));
					$($td[5]).text(d.getFullYear() + "-" + (parseInt(d.getMonth()) + 1) + "-" + d.getDate());
				},

			})
		} else if ($(this).attr("id") == "submit") {

			$.ajax({
				url: "/Traffic-information-management-system-TIMS-/people/insert.do",
				type: "get",
				dataType: "json",
				data: {
					"surveytime": $(":input[name='surveytime']").val(),
					"investigator": $(":input[name='investigator']").val(),
					"intersectionId": $(":input[name='intersectionId']").val(),
					"number": $(":input[name='number']").val(),
					"total8": $(":input[name='total8']").val(),
					"violation8": $(":input[name='violation8']").val(),
					"total9": $(":input[name='total9']").val(),
					"violation9": $(":input[name='violation9']").val(),
					"total10": $(":input[name='total10']").val(),
					"violation10": $(":input[name='violation10']").val(),
					"total11": $(":input[name='total11']").val(),
					"violation11": $(":input[name='violation11']").val(),
					"total14": $(":input[name='total14']").val(),
					"violation14": $(":input[name='violation14']").val(),
					"total15": $(":input[name='total15']").val(),
					"violation15": $(":input[name='violation15']").val(),
					"total16": $(":input[name='total16']").val(),
					"violation16": $(":input[name='violation16']").val(),
					"total17": $(":input[name='total17']").val(),
					"violation17": $(":input[name='violation17']").val(),
					"total": parseInt($(":input[name='total8']").val()) + parseInt($(":input[name='total9']").val()) +
						parseInt($(":input[name='total10']").val()) + parseInt($(":input[name='total11']").val()) +
						parseInt($(":input[name='total14']").val()) + parseInt($(":input[name='total15']").val()) +
						parseInt($(":input[name='total16']").val()) + parseInt($(":input[name='total17']").val()),
					"violation": parseInt($(":input[name='violation8']").val()) + parseInt($(":input[name='violation9']").val()) +
						parseInt($(":input[name='violation10']").val()) + parseInt($(":input[name='violation11']").val()) +
						parseInt($(":input[name='violation14']").val()) + parseInt($(":input[name='violation15']").val()) +
						parseInt($(":input[name='violation16']").val()) + parseInt($(":input[name='violation17']").val()),
				},
				beforeSend: function() {

				},
				success: function(data, dataStatus) {
					window.location.href =
						"http://localhost:8080//Traffic-information-management-system-TIMS-/people/people.do";
				},

			})
		}
	})



	/* 删除被选择的数据 */
	$("#delete").click(function() {
		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/people/delete.do",
			type: "get",
			dataType: "json",
			data: {
				"id": $(":input[name='id']").val(),
			},
			success: function(data, dataStatus) {
				window.location.href =
					"http://localhost:8080//Traffic-information-management-system-TIMS-/people/people.do";
			},
		})
	})

	$("#insert-one").click(function() {
		$(":input[value='提交']").attr("id", "submit");
		$("i[id!='noc']").removeClass().addClass("fa fa-question-circle").css("color", "#777");
		$(":input[type!='button']").val("");
		$("#textarea").val('');
		$("#delete").attr("hidden", "true");
		$("#table-card").attr("hidden", "true");
		$("#insertOrUpdate-card").removeAttr("hidden");
		$("#insert-one").attr("disabled", "");
	});

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
			url: "/Traffic-information-management-system-TIMS-/people/search.do",
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
			url: "/Traffic-information-management-system-TIMS-/people/search.do",
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
								url: "/Traffic-information-management-system-TIMS-/people/insert.do",
								type: "get",
								dataType: "json",
								data: {
									"intersectionId": objArr[0],
									"number": objArr[1],
									"total8": objArr[2],
									"total9": objArr[3],
									"total10": objArr[4],
									"total11": objArr[5],
									"total14": objArr[6],
									"total15": objArr[7],
									"total16": objArr[8],
									"total17": objArr[9],
									"total": objArr[10],
									"violation8": objArr[11],
									"violation9": objArr[12],
									"violation10": objArr[13],
									"violation11": objArr[14],
									"violation14": objArr[15],
									"violation15": objArr[16],
									"violation16": objArr[17],
									"violation17": objArr[18],
									"violation": objArr[19],
									"investigator": objArr[20],
									"surveytime": objArr[21],
								},
								success: function(data, dataStatus) {
									$("tbody").append(("<tr >\
											<td>" + key + "</td>\
											<td>" + objArr[0] +
										"</td>\
											<td>" + objArr[1] + "</td>\
											<td>" + objArr[10] +
										"</td>\
											<td>" + objArr[19] + "</td>\
											<td>" + objArr[21] +
										"</td>\
										</tr>"));
								},
							})
						}
					}
				}
			}
		}
	})

	$("#searchbtn").click(function() {
		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/people/search.do",
			type: "get",
			dataType: "json",
			data: {
				"name": $(":input[name='input1-group2']").val(),
			},
			success: function(data, dataStatus) {
				searchSuccess(data);
			},
		})
	})
	
	$("#download").click(function(){
		window.open("http://localhost:8080/Traffic-information-management-system-TIMS-/download/file.do?fileName=people.xlsx", "_blank");
	})
})
