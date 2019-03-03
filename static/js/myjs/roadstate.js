$(function() {

	$(timeSelect).flatpickr();

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

	var $tr = $("tbody tr");
	// rgba(68, 68, 68, 0.05)
	$("tbody tr").mouseenter(function() {

		$(this).css("background-color", "#badc58");
	});
	$("tbody tr").mouseleave(function() {
		if (this["rowIndex"] % 2 == 1) {
			$(this).css("background-color", "rgba(68, 68, 68, 0.05)");
		} else {
			$(this).css("background-color", "#FFF");
		}

	});



	// 点击表格进入详情页
	$("tbody tr").click(function() {
		var todate = new Date();

		$.ajax({
			url: "/Traffic-information-management-system-TIMS-/infra/selectById.do",
			type: "GET",
			dataType: "json",
			data: {
				"id": this.id
			},
			success: function(data, dataStatus) {
				/* 将insertOrUpdate-card显示，并在追加input中追加内容 */
				$("#insertOrUpdate-card form").attr("action", "/Traffic-information-management-system-TIMS-/infra/updata.do");
				/* 追加roadid的input hidden*/
				$("#insertOrUpdate-card .card-header")
					.append($("<input hidden='true' />")
						.attr("name", "id")
						.attr("value", data["roadstate"]["id"]));

				/* 修改调查表的input */
				checkon($(":input[name='investigator']").attr("value", data["roadstate"]["investigator"]).prev().find("i"));
				checkon($(":input[name='roadname']").attr("value", data["roadstate"]["roadname"]).prev().find("i"));
				checkon($(":input[name='incline']").attr("value", data["roadstate"]["incline"]).prev().find("i"));
				checkon($(":input[name='length']").attr("value", data["roadstate"]["length"]).prev().find("i"));
				checkon($(":input[name='section']").attr("value", data["roadstate"]["section"]).prev().find("i"));
				checkon($(":input[name='motorwaywidth']").attr("value", data["roadstate"]["motorwaywidth"]).prev().find("i"));
				checkon($(":input[name='superwaywidth']").attr("value", data["roadstate"]["superwaywidth"]).prev().find("i"));
				checkon($(":input[name='pavementwidth']").attr("value", data["roadstate"]["pavementwidth"]).prev().find("i"));
				checkon($(":input[name='medianwidth']").attr("value", data["roadstate"]["medianwidth"]).prev().find("i"));
				checkon($(":input[name='sidesseparatebeltwidth']").attr("value", data["roadstate"]["sidesseparatebeltwidth"])
					.prev().find("i"));
				checkon($(":input[name='redlinewidth']").attr("value", data["roadstate"]["redlinewidth"]).prev().find("i"));
				checkon($(":input[name='start']").attr("value", data["roadstate"]["start"]).prev().find("i"));
				checkon($(":input[name='end']").attr("value", data["roadstate"]["end"]).prev().find("i"));

				$("#roadlevel-select").val(data["roadstate"]["roadlevelId"]);
				$("#roadbed-select").val(data["roadstate"]["roadbedtypeId"]);

				var d = new Date();
				d.setTime(parseInt(data["roadstate"]["surveytime"]));
				checkon($(":input[name='surveytime']").attr("value", d.toLocaleDateString()).prev().find("i"));
				$("#delete").removeAttr("hidden");

				$(":input[value='提交']").attr("id", "updata");

				$("#table-card").attr("hidden", "true")

				$("#insertOrUpdate-card").removeAttr("hidden");

			}

		})
	});


	$(":input[name='investigator']").blur(function() {
		/* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});

	$(":input[name='roadname']").blur(function() {
		/* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	/* 坡度 */
	$(":input[name='incline']").blur(function() {
		if ((/^[1-9][0-9]?(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});

	/* 长度 */
	$(":input[name='length']").blur(function() {
		if ((/^[1-9][0-9]{0,17}(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='section']").blur(function() {
		//* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='motorwaywidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='superwaywidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='pavementwidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='medianwidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='sidesseparatebeltwidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='redlinewidth']").blur(function() {
		if ((/^[1-9][0-9]{0,2}(\.\d{1,2})?$/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='start']").blur(function() { /* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"])) {
			checkon($(this).prev().find("i"));
		} else {
			checkFalse($(this).prev().find("i"));
		};
	});
	$(":input[name='end']").blur(function() { /* 判断输入的是否是汉字 */
		if ((/^[\u4e00-\u9fff]+/).test(this["value"])) {
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
					$("#insertOrUpdate-card :input[type!='button']:hidden").remove();
					$("i[id!='noc']").removeClass().addClass("fa fa-question-circle").css("color", "#777");
					$(":input[type!='button']").removeAttr("value");
					$("#delete").attr("hidden", "true");
					$("#insertOrUpdate-card").attr("hidden", "true");
					$("#table-card").removeAttr("hidden");
					var $td = $("tr[id=" + data['roadstate']['id'] + "]").find("td")
					$($td[0]).text(data['roadstate']['id']);
					$($td[1]).text(data['roadstate']['roadname']);
					$($td[2]).text(data['roadstate']['length']);
					$($td[3]).html(data['roadLevel']['typename'] + "&nbsp;:&nbsp;" + data['roadLevel']['name']);
					$($td[4]).text(data['roadBedType']['name']);
					$($td[5]).text(data['roadstate']['investigator']);

				},

			})
		}else if($(this).attr("id") == "submit") {
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
					window.location.href = "http://localhost:8080//Traffic-information-management-system-TIMS-/infra/roadstate.do";
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
				window.location.href = "http://localhost:8080//Traffic-information-management-system-TIMS-/infra/roadstate.do";
			},
		})
	})
	
	$("#insert-one").click(function(){
		$("#table-card").attr("hidden", "true");
		$("#insertOrUpdate-card").removeAttr("hidden");
	})
	
	
});
