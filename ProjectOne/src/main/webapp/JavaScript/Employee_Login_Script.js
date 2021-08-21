function loginValidation(){
	var employeeId = document.getElementById("employeeId").value;
	var password = document.getElementById("password").value;
	
	if(employeeId == ""){
		document.getElementById("errorEmployeeId").innerHTML = "*Please enter your Id";
		return false;
	}
	else{
		document.getElementById("errorEmployeeId").innerHTML = " ";
	}
	
	if(password == ""){
		document.getElementById("errorPassword").innerHTML = "*Please enter your password";
		return false;
	}
	else{
		document.getElementById("errorPassword").innerHTML = " ";
	}
}