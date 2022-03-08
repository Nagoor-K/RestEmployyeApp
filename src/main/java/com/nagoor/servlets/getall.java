package com.nagoor.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagoor.model.Employee;
import com.nagoor.service.EmployeeService;


public class getall extends HttpServlet{

  /**
   * 
   */
  private static final long serialVersionUID = 2859009569424998462L;
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
     EmployeeService es=new EmployeeService();
     List<Employee> list=es.getAllEmployees();
     PrintWriter out=resp.getWriter();
     resp.setContentType("text/html"); 
     out.println("<html><body>");
     out.println("<table border=1");  
     out.println("<tr><th>EmpId</th><th>EmpName</th><th>Age</th><th>Salary</th><th>Update Link</th><tr>");  
     for(Employee emp: list) {
    	 long id=emp.getId();
    	 String name=emp.getName();
    	 int age=emp.getAge();
    	 long salary=emp.getSalary();
    	 out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + age + "</td><td>" + salary + "</td><td>" + "<a href='/RestEmployeeApp/addemployee.jsp'> Add Employee</a>" + "</td></tr>");  
     }
     out.println("</table>");  
     out.println("</html></body>");  
     out.print("<a href='/RestEmployeeApp'> Main Menu </a>");
     out.print("<br>");
	  out.print("<a href='/RestEmployeeApp/addemployee.jsp'> Add Employee</a>");
     
     
     
  }
	
}
