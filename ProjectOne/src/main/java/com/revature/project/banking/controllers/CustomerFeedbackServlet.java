package com.revature.project.banking.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project.banking.model.Feedback;
import com.revature.project.banking.service.CustomerService;
import com.revature.project.banking.service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerFeedbackServlet
 */
public class CustomerFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerFeedbackServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int customerId = Integer.parseInt((String)session.getAttribute("customerId"));
		CustomerService customerService = new CustomerServiceImpl();
		Feedback feedback = new Feedback();
		feedback.setCustomerId(customerId);
		customerService.addFeedback(feedback);

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		out.write("<html><head>");
		out.write("<title>Imran Banking</title>");
		out.write("<link rel=\"stylesheet\" href=\"css/DeleteCustomer.css\">");
		out.write(
				"<link\r\n" + "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n"
						+ "	rel=\"stylesheet\"\r\n"
						+ "	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n"
						+ "	crossorigin=\"anonymous\">");
		out.write("</head><body>");
		out.write("<header>\r\n" + "\r\n" + "		<br>\r\n" + "		<h3>IMRAN'S BANKING APP</h3>\r\n"
				+ "		<br>\r\n" + "		<div class=\"nav\"> \r\n" + "			<a href=\"#\">HOME</a> \r\n"
				+ "			<a href=\"AboutUs.html\">ABOUT US</a>\r\n"
				+ "			<a class = \"right\" href=\"Contact.html\">CONTACT</a>\r\n"
				+ " <a href = \"RegisterCustomer.html\">SIGN UP</a>" + "<a href = \"Login.html\">Login</a>"
				+ "		</div>\r\n" + "	</header>");
		out.write("<br><br>");
		out.write("<h4>Feedback saved Successfully for " + customerId + "</h4>");
		out.write("<br><p>Thank You for your valuable time and feedback<br>");
		out.write("<p>Please go to our sign up page </p><a href = \"RegisterCustomer.html\">Sign up</a>");
		out.write("<br><br><br><br><br><br><br><br><br><br><br><br>");
		out.write("<footer>" + "		<br>COPYRIGHT@IMRAN<br><br>" + "	</footer>");
		out.write("</body></html>");
	}

}
