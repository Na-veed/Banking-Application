<%@page import="com.revature.project.banking.model.Customer"%>
<%@page import="com.revature.project.banking.model.RequestTable"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Request</title>
<link rel="stylesheet" href="css/ViewDetails.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script>
function searchValidation(){
	var customerId = document.getElementById("search").value;
	
	if(customerId == ""){
		document.getElementById("errorSearch").innerHTML = "*Please enter the customer Id ";
		return false;
	}
	else{
		document.getElementById("errorSearch").innerHTML = " ";
 	}
}
</script>
</head>
<body>
	<header>
		<br>
		<h3>IMRAN'S BANKING APP</h3>
		<br>
	</header>

	<div class="nav">
		<a href="Home.html">HOME</a> <a href="#">ABOUT US</a> <a href="#">CONTACT</a>
	</div>


	<%
	List<Customer> customerList = (List<Customer>) session.getAttribute("customerList");
	%>
	<br>
	<br>
	<form action="EmployeeViewCustomerByIdServlet">
	<table align="center">
		<tr><th><input type="number" name="customerId" id = "search"></th> <th><input type = "submit" class="searchButtons"
			 onsubmit="return searchValidation()" value = "SEARCH CUSTOMER"></th><th><p id = "errorSearch" style = "color:red"></p></th> <br>
			</table>
		<br>
		<h4>CUSTOMER TABLE</h4>
		<br>
	</form>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th>Customer Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>email Id</th>
				<th>Mobile Number</th>
				<th>City</th>
				<th>accountType</th>
				<th>Account registered date</th>
			</tr>
		</thead>
		<%
		for (int i = 0; i < customerList.size(); i++) {
			Customer customerTable = customerList.get(i);
		%>
		<tr>
			<td><%=customerTable.getCustomerId()%></td>
			<td><%=customerTable.getFirstName()%></td>
			<td><%=customerTable.getLastName()%></td>
			<td><%=customerTable.getEmailId()%></td>
			<td><%=customerTable.getMobileNumber()%></td>
			<td><%=customerTable.getCity()%></td>
			<td><%=customerTable.getAccountType()%></td>
			<td><%=customerTable.getRegisteredDate()%></td>
			<td><a class="linksReject"
				href="EmployeeDeleteCustomerServlet?customerId=<%=customerTable.getCustomerId()%>">DELETE</a>
			<td><a class="links" href="UpdateCustomerServlet?customerId=<%=customerTable.getCustomerId()%>">UPDATE</a>
		</tr>
		<%
		}
		%>

	</table>
	<br>
	<a class="buttons" href="EmployeeHome.html">HOME</a>
	<a class="buttons" href="LogOutEmployeeServlet">LOGOUT</a>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<footer>
		<br>COPYRIGHT@IMRAN<br>
		<br>
	</footer>
</body>
</html>