package com.nagoor.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagoor.model.Employee;
import com.nagoor.service.EmployeeService;

public class updateEmployee extends HttpServlet{

  /**
   * 
   */
  private static final long serialVersionUID = -8162613002432407062L;
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse resp)throws ServletException, IOException {
	  EmployeeService es=new EmployeeService();
	  ServletContext servletcontext = getServletContext();
	  Employee emp=(Employee)servletcontext.getAttribute("emp");
	  servletcontext.setAttribute("emp", emp);
	  
  }
	
}
