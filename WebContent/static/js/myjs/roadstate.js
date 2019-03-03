$(function() {
	
	$(timeSelect).flatpickr();
	
	$("tbody tr").click(function() {
		var todate = new Date();
		
		$.ajax({
			url:"/Traffic-information-management-system-TIMS-/infra/selectById.do",
			type:"GET",
			dataType:"json",
			data:{"id":this.id},
			success:function (data,dataStatus) {
				/* 将insertOrUpdate-card显示，并在追加input中追加内容 */
				// $("#insertOrUpdate-card form").attr("action","/Traffic-information-management-system-TIMS-/infra/updata.do");
				/* 追加roadid的input hidden*/
				$("#insertOrUpdate-card .card-header")
								.append($("<input hidden='true' />")
										.attr("name","id")
										.attr("value",data["roadstate"]["id"]));
				
				/* 修改调查表的input */
				$(":input[name='investigator']").attr("value",data["roadstate"]["investigator"]);
				$(":input[name='roadname']").attr("value",data["roadstate"]["roadname"]);
				$(":input[name='incline']").attr("value",data["roadstate"]["incline"]);
				$(":input[name='length']").attr("value",data["roadstate"]["length"]);
				$(":input[name='section']").attr("value",data["roadstate"]["section"]);
				$(":input[name='motorwaywidth']").attr("value",data["roadstate"]["motorwaywidth"]);
				$(":input[name='superwaywidth']").attr("value",data["roadstate"]["superwaywidth"]);
				$(":input[name='pavementwidth']").attr("value",data["roadstate"]["pavementwidth"]);
				$(":input[name='medianwidth']").attr("value",data["roadstate"]["medianwidth"]);
				$(":input[name='sidesseparatebeltwidth']").attr("value",data["roadstate"]["sidesseparatebeltwidth"]);
				$(":input[name='redlinewidth']").attr("value",data["roadstate"]["redlinewidth"]);
				$(":input[name='start']").attr("value",data["roadstate"]["start"]);
				$(":input[name='end']").attr("value",data["roadstate"]["end"]);
				
				var d = new Date()
				var t = d.setTime(data["roadstate"]["surveytime"])
				console.log(t)
				$(":input[name='surveytime']").attr("value",data["roadstate"]["end"]);
				
				
				$("#table-card").attr("hidden","true");
				$("#insertOrUpdate-card").removeAttr("hidden");
			
			}
			
		})
	});
});
