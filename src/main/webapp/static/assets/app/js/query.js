var enableForm = function(){
	$('[fieldset]').removeAttr('disabled');
};
var disableForm = function(){
	$('[fieldset]').attr('disabled','disabled');
};

var showModal = function(msg,o){
	if(o){
		$('#confirm-message-success',window.parent.document).html(msg);
		$('#confirmModal-success',window.parent.document).modal('show');
	}else{
		$('#confirm-message-error',window.parent.document).html(msg);
		$('#confirmModal-error',window.parent.document).modal('show');
	}
};
$(document).ready(function(){
	$('[data-toggle="tooltip"]').tooltip();
});