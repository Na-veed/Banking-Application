function RegisterCustomerValidation() {
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	var password = document.getElementById("password").value;
	var confirmPassword = document.getElementById("confirmPassword").value;
	var emailId = document.getElementById("emailId").value;
	var mobileNumber = document.getElementById("mobileNumber").value;
	var city = document.getElementById("city").value;
	var balance = document.getElementById("balance").value;

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
	if (password == "") {
		document.getElementById("errorPassword").innerHTML = "*Password is cannot be empty";
		return false;
	}
	else{
		document.getElementById("errorPassword").innerHTML = "<p></p>";
	}

	if (confirmPassword == "") {
		document.getElementById("errorConfirmPassword").innerHTML = "*Please confirm your password";
		return false;
	}
	else {
		document.getElementById("errorLastName").innerHTML = "<p> </p>";

	}
	if (password != confirmPassword) {
		document.getElementById("errorConfirmPassword").innerHTML = "*Password mismatch,Please re-enter your password";
		return false;
	}
	else {
		document.getElementById("errorConfirmPassword").innerHTML = "<p> </p>";

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
	if (balance == 0) {
		document.getElementById("errorBalance").innerHTML = "*Initital Amount cannot be null";
		return false;
	}
	else {
		document.getElementById("errorBalance").innerHTML = "<p> </p>";

	}
	if (balance < 5000) {
		document.getElementById("errorBalance").innerHTML = "*Balance cannot be less than INR: 5,000"
	}
	else {
		document.getElementById("errorAccountType").innerHTML = "<p> </p>";

	}





}


