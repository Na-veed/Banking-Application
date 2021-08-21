function RegisterCustomerValidation() {
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	var emailId = document.getElementById("emailId").value;
	var mobileNumber = document.getElementById("mobileNumber").value;
	var city = document.getElementById("city").value;
	
	if (firstName == "") {
		document.getElementById("errorFirstName").innerHTML = "<p>*Name is mandatory</p>";
		return false;
	}
	else {
		document.getElementById("errorFirstName").innerHTML = "<p> </p>";

	}
	if (lastName == "") {
		document.getElementById("errorLastName").innerHTML = "*Name is mandatory";
		return false;
	}
	else {
		document.getElementById("errorLastName").innerHTML = "<p> </p>";

	}
	if (emailId == "") {
		document.getElementById("errorMailId").innerHTML = "*Email Id is mandatory ";
		return false;
	}
	else {
		document.getElementById("errorMailId").innerHTML = "<p> </p>";

	}
	if (mobileNumber == "") {
		document.getElementById("errorPhoneNumber").innerHTML = "*Mobile Number is mandatory ";
		return false;
	}
	else {
		document.getElementById("errorPhoneNumber").innerHTML = "<p> </p>";

	}
	if (city == "null") {
		document.getElementById("errorCity").innerHTML = "*City is mandatory";
		return false;
	}
	else {
		document.getElementById("errorCity").innerHTML = "<p> </p>";

	}

}


/**
 *
 */