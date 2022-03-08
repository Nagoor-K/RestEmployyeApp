package com.nagoor.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagoor.model.Employee;
import com.nagoor.service.EmployeeService;

public class addEmployee extends HttpServlet{

  /**
   * 
   */
  private static final long serialVersionUID = 7344293385957910617L; 
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      int id=Integer.parseInt(req.getParameter("eid"));
      String name=req.getParameter("name");
      int age=Integer.parseInt(req.getParameter("age"));
      long salary=Long.parseLong(req.getParameter("salary"));
      
      Employee emp=new Employee(id,name,age,salary);
      EmployeeService es=new EmployeeService();
      Employee em=es.addEmployee(emp);
      long eid=em.getId();
      resp.setContentType("text/html");  
	  PrintWriter out=resp.getWriter();  
	  out.print("<h2> Employee  Added Successfully </h2>");
	  out.print("<a href='/RestEmployeeApp'>\n"
		         + "        <button class=GetAll>\n"
		         + "            Main Menu\n"
		         + "        </button>\n"
		         + "   </a>");
	  out.print("<br>");
	  out.print("<a href='/RestEmployeeApp/rest/employee/getall'>\n"
			      + "        <button class=\"GetAll\">\n"
			      + "           Show All Employees\n"
			      + "        </button>\n"
			      + "  </a>");
	  
      
      
  }
  
	
}
