package com.revature.project.banking.exceptions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorHandlingServlet
 */
public class ErrorHandlerServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ErrorHandlerServlets() {
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
		errorHandler(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		errorHandler(request, response);
	}

	public void errorHandler(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
		if (servletName == null) {
			servletName = "Unknown";
		}
		String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");
		if (requestUri == null) {
			requestUri = "Unknown";
		}

		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		if (statusCode != 500) {
			out.write("<html><head>");
			out.write("<title>Imran Banking</title>");
			out.write("<link rel=\"stylesheet\" href=\"css/Error.css\">");
			out.write("<link\r\n"
					+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n"
					+ "	rel=\"stylesheet\"\r\n"
					+ "	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n"
					+ "	crossorigin=\"anonymous\">");
			out.write("</head><body>");
			out.write("<header>\r\n" + "\r\n" + "		<br>\r\n" + "		<h3>IMRAN'S BANKING APP</h3>\r\n"
					+ "		<br>\r\n" + "		<div class=\"nav\"> \r\n" + "			<a href=\"#\">ABOUT US</a> \r\n"
					+ "			<a href=\"#\">SEARCH</a>\r\n"
					+ "			<a class = \"right\" href=\"Login.html\">LOGIN</a>\r\n" + "		</div>\r\n"
					+ "	</header>");
			out.write("<br><br>");
			out.write("<h4>Error Details</h4>");
			out.write("<br>");
			out.write("<ul>");
			out.write("<li><strong>Error occured with status code: </strong>:" + statusCode + "</li>");
			out.write("<li><strong>Your requested URI is</strong>: </strong>" + requestUri + "</li>");
			out.write("</ul><br>");
			out.write("<p>Sorry, An Error occured, Please try again later");
			out.write("Thank you for your Patience");
		} else {
			out.write("<html><head>");
			out.write("<title>Imran Banking</title>");
			out.write("<link rel=\"stylesheet\" href=\"css/Error.css\">");
			out.write("<link\r\n"
					+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n"
					+ "	rel=\"stylesheet\"\r\n"
					+ "	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n"
					+ "	crossorigin=\"anonymous\">");
			out.write("</head><body>");
			out.write("<header>\r\n" + "\r\n" + "		<br>\r\n" + "		<h3>IMRAN'S BANKING APP</h3>\r\n"
					+ "		<br>\r\n" + "		<div class=\"nav\"> \r\n" + "			<a href=\"#\">ABOUT US</a> \r\n"
					+ "			<a href=\"#\">SEARCH</a>\r\n"
					+ "			<a class = \"right\" href=\"Login.html\">LOGIN</a>\r\n" + "		</div>\r\n"
					+ "	</header>");
			out.write("<br><br>");
			out.write("<h4>Error Details</h4><br>");
			out.write("<ul><li>Servlet Name:" + servletName + "</li>");
			out.write("<li>Exception Name:" + throwable.getClass().getName() + "</li>");
			out.write("<li>Requested URI:" + requestUri + "</li>");
			out.write("<li>Exception Message:" + throwable.getMessage() + "</li>");
			out.write("</ul>");
			out.write("<p>An bad request or action occured, Please try again later...");
			out.write("Thank you for your Patience");
		}

		out.write("<br><br>");
		out.write("<p>Please go to our ");
		out.write("<a href=\"Home.html\">Home Page</a>");
		out.write("<br><br><br><br><br><br><br><br><br><br><br>");
		out.write("<footer>\r\n" + "		<br> <br> COPYRIGHT@IMRAN <br><br>\r\n" + "	</footer>");
		out.write("</body></html>");

	}
}
