<%@page import="com.revature.project.banking.model.CustomerWithdraw"%>
<%@page import="com.revature.project.banking.model.CustomerDeposit"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Imran Banking</title>
<link rel="stylesheet" href="css/ViewDetails.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script>
	function searchValidation() {
		var customerId = document.getElementById("search").value;

		if (customerId == "") {
			document.getElementById("errorSearch").innerHTML = "*Please enter the customer Id ";
			return false;
		} else {
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
		<a href="EmployeeHome.html">HOME</a> <a href="AboutUs.html">ABOUT
			US</a> <a href="Contact.html">CONTACT</a>
	</div>
	<br>
	<form action="EmployeeGetDepositById">
		<table align="center">
			<tr>
				<th><input type="number" name="customerId" id="search"></th>
				<th><input type="submit" class="searchButtons"
					onsubmit="return searchValidation()" value="SEARCH CUSTOMER"></th>
				<th><p id="errorSearch" style="color: red"></p></th>
		</table>
	</form>
	<br>
	<br>
	<h4>CUSTOMER DEPOSIT DETAILS</h4>
	<br>

	<%
	List<CustomerDeposit> depositList = (List<CustomerDeposit>)session.getAttribute("depositList");
	%>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>

				<th>Customer Id</th>
				<th>Amount</th>

			</tr>
		</thead>

		<%
		CustomerDeposit customerDeposit;
		for (int i = 0; i <= depositList.size(); i++) {
			customerDeposit = depositList.get(i);
		%>
		<tr>
			<td><%=customerDeposit.getDepositCustomerId()%></td>
			<td><%=customerDeposit.getAmount()%></td>
		</tr>
	</table>

	<%
	}
	%>
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
	<footer>
		<br>COPYRIGHT@IMRAN<br> <br>
	</footer>

</body>
</html>