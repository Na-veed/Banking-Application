function loginValidation(){
	var customerId = document.getElementById("customerId").value;
	var password = document.getElementById("password").value;
	
	if(customerId == ""){
		document.getElementById("errorCustomerId").innerHTML = "*Customer Id cannot be empty";
		return false;
	}
	else{
		document.getElementById("errorCustomerId").innerHTML = " ";
	}
	
	if(password == ""){
		document.getElementById("errorPassword").innerHTML = "*Please enter your password";
		return false;
	}
	else{
		document.getElementById("errorPassword").innerHTML = " ";
	}
}