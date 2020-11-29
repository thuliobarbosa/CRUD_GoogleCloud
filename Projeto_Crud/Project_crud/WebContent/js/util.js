// Fazer Requisão
function requestAjax(model, formulario) {
	return Promise.resolve(
	  jQuery.ajax({
	    type: "GET",
	    dataType: "json",
	    data: $(formulario).serialize(),
	    url: "/projetocrud/Controller?service=" + model
	  })
	).finally(function() {
	});
}
