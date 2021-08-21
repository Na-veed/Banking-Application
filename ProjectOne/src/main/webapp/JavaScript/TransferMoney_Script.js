function transferMoneyValidation(){
	var receiverId = document.getElementById("receiverId").value;
	var amount = document.getElementById("amount").value;
	
	if(receiverId == ""){
		document.getElementById("errorReceiverId").innerHTML = "*Please enter an Customer Id";
		return false;
	}
	else{
		document.getElementById("errorReceiverId").innerHTML = " ";
	}
	if(amount == ""){
		document.getElementById("errorAmount").innerHTML = "*Please enter the amount";
		return false;
	}
	else{
		document.getElementById("errorAmount").innerHTML = " ";
	}
}