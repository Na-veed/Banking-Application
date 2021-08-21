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
	<br>
	<br>
	<h4>CUSTOMER REQUESTS</h4>
	<br>

	<%
	List<RequestTable> requestList = (List<RequestTable>) session.getAttribute("requestList");
	%>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th>Request Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>email Id</th>
				<th>Mobile Number</th>
				<th>City</th>
				<th>accountType</th>
				<th>Account request date</th>
			</tr>
		</thead>
		<%
		for (int i = 0; i < requestList.size(); i++) {
			RequestTable requestTable = requestList.get(i);
		%>
		<tr>
			<td><%=requestTable.getRequestId()%></td>
			<td><%=requestTable.getFirstName()%></td>
			<td><%=requestTable.getLastName()%></td>
			<td><%=requestTable.getEmailId()%></td>
			<td><%=requestTable.getMobileNumber()%></td>
			<td><%=requestTable.getCity()%></td>
			<td><%=requestTable.getAccountType()%></td>
			<td><%=requestTable.getRegisteredDate()%></td>
			<td><a class="links"
				href="ApproveCustomerServlet?requestId=<%=requestTable.getRequestId()%>">APPROVE</a></td>
			<td><a class="linksReject"
				href="RejectCustomerServlet?requestId=<%=requestTable.getRequestId()%>">REJECT</a></td>
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
	<footer>
		<br>COPYRIGHT@IMRAN<br> <br>
	</footer>

</body>
</html>