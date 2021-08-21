<%@page import="com.revature.project.banking.model.Feedback"%>
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
	<h4>CUSTOMER FEEDBACK DETAILS</h4>
	<br>
	<%
	List<Feedback> feedbackList = (List<Feedback>) session.getAttribute("feedBackList");
	%>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th>CUSTOMER ID</th>
				<th>FEEDBACK</th>
			</tr>
		</thead>
		<%
		for (int i = 0; i < feedbackList.size(); i++) {
			Feedback feedbackTable = feedbackList.get(i);
		%>
		<tr>
			<td><%=feedbackTable.getCustomerId()%></td>
			<td><%=feedbackTable.getFeedback()%></td>
		</tr>
	</table>
	<br>

	<%
	}
	%>
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