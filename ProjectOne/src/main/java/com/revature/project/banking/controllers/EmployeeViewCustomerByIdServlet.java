package com.revature.project.banking.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class EmployeeViewCustomerByIdServlet
 */
public class EmployeeViewCustomerByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeViewCustomerByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		//int customerId = session.getAttribute("customerId");
		int customerId = Integer.parseInt(request.getParameter("customerId")); 
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.getCustomerById(customerId);
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer);
		session.setAttribute("customerList", customerList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewCustomerAccount.jsp");
		requestDispatcher.forward(request, response); 
	}



}
