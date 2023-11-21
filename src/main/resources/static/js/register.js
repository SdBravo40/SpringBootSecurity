

function submitForm(){
	alert("inside submit form");
	
	var name = $("#name").val();
	var username = $("#username").val();
	var password = $("#password").val();
	
	console.log(name);
	console.log(username);
	console.log(password);
	
	//--------GOING TO CALL AJAX ---------------------
	var csrfToken = $("meta[name='_csrf']").attr("content");
    var csrfHeader = $("meta[name='_csrf_header']").attr("content");
    var data = {};
    var headers = {};

    headers[csrfHeader] = csrfToken;
    
   data["name"] = name;
   data["username"] = username;
   data["password"] = password;
   
   
    
    //headers["Access-Control-Allow-Origin"] = "192.168.7.205"; 
    $.ajax({
        url: "registerUrl",
        crossDomain: true,
        type: 'POST',
        headers: headers,    // THIS WAS ADDED
        data: data,
        success: function (response) {
			alert("insde response");
      		swal("Success", "Saved Successfully!!","success"); 	
      		// location.reload();	
      		 $("#name").val("");
      		 $("#username").val("");
      		 $("#password").val("");
      		 
        },
        error: function (request, status, error) {
          //  $('#loading').hide();
            var repObj = (request.responseJSON);
            swal("Error!", "Cannot Saved data! Reason :" + repObj.message, "error");

        }
    });

}