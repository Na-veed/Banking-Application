package com.revature.project.banking.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project.banking.model.Customer;
import com.revature.project.banking.service.CustomerService;
import com.revature.project.banking.service.CustomerServiceImpl;

/**
 * Servlet implementation class UpdateCustomerServlet
 */
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateCustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailId = request.getParameter("emailId");
		String mobileNumber = request.getParameter("mobileNumber");
		String city = request.getParameter("city");
		String accountType = request.getParameter("accountType");
		HttpSession session = request.getSession();
		int customerId = Integer.parseInt((String)session.getAttribute("customerId"));
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmailId(emailId);
		customer.setMobileNumber(mobileNumber);
		customer.setCity(city);
		customer.setAccountType(accountType);

		CustomerService customerService = new CustomerServiceImpl();
		boolean result = customerService.updateCustomer(customer);

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if (result) {
			out.write("<html><head>");
			out.write("<title>Imran Banking</title>");
			out.write("<link rel=\"stylesheet\" href=\"css/AccountDetails.css\">");
			out.write("<link\r\n"
					+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n"
					+ "	rel=\"stylesheet\"\r\n"
					+ "	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n"
					+ "	crossorigin=\"anonymous\">");
			out.write("</head><body>");
			out.write("<header>\r\n" + "\r\n" + "		<br>\r\n" + "		<h3>IMRAN'S BANKING APP</h3>\r\n"
					+ "		<br>\r\n" + "		<div class=\"nav\"> \r\n"
					+ "			<a href=\"Home.html\">HOME</a> \r\n" + "			<a href=\"#\">ABOUT US</a>\r\n"
					+ "			<a class = \"right\" href=\"Contact.html\">CONTACT</a>\r\n" + "		</div>\r\n"
					+ "	</header>");

			out.write("<br><br>");
			out.write("<h4>CUSTOMER UPDATE SUCCESS</h4>");
			out.write("<br><br>");
			out.write("<h5>Customer Details updated for customer Id: " + customerId + " successfully");

			out.write(
					"<br><br><a class = \"buttons\" href = \"ViewBalanceServlet\">VIEW BALANCE</a><a class = \"buttons\" href = \"Home.html\">HOME</a>");

			out.write("<br><br><br><br><br><br><br><br><br><br><br><br>");
			out.write("<footer>" + "		<br>COPYRIGHT@IMRAN<br><br>" + "	</footer>");
			out.write("</body></html>");
		}
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("ErrorHandlerServlets");
			requestDispatcher.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

}
