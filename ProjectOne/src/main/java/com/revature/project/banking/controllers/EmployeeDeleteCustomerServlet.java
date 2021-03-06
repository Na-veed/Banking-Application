package com.revature.project.banking.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project.banking.model.Customer;
import com.revature.project.banking.service.EmployeeService;
import com.revature.project.banking.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeDeleteCustomerServlet
 */
public class EmployeeDeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDeleteCustomerServlet() {
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


		int customerId = Integer.parseInt( request.getParameter("customerId"));
		EmployeeService employeeService = new EmployeeServiceImpl();
		boolean result = employeeService.deleteAnCustomerById(customerId);
		
		List<Customer> customerList = employeeService.getAllCustomer();
		HttpSession session = request.getSession();
		session.setAttribute("customerList", customerList);
		if(result) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("View.jsp");
			requestDispatcher.forward(request, response);
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
