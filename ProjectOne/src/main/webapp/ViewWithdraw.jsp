<%@page import="com.revature.project.banking.model.CustomerWithdraw"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Imran's Banking</title>
<link rel="stylesheet" href="css/ViewDetails.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
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
	<br>
	<h4>CUSTOMER WITHDRAW DETAILS</h4>
	<br>

	<%
	List<CustomerWithdraw> withdrawList = (List<CustomerWithdraw>) session.getAttribute("withdrawList");
	%>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>

				<th>Customer Id</th>
				<th>Amount</th>

			</tr>
		</thead>

		<%
		CustomerWithdraw customerWithdrawList;
		for (int i = 0; i < withdrawList.size(); i++) {
			customerWithdrawList = withdrawList.get(i);
		%>
		<tr>
			<td><%=customerWithdrawList.getWithdrawCustomerId()%></td>
			<td><%=customerWithdrawList.getAmount()%></td>
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
	<footer>
		<br>COPYRIGHT@IMRAN<br> <br>
	</footer>

</body>
</html>