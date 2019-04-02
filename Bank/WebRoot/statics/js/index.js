function pageClick(k) {
	$(k).parent().find("div").removeClass("active");
	$(k).addClass("active");
	$("#flTitle").text($(k).text());
}

function Click(z){
	alert(z);
	window.location.href = z;
	
}
