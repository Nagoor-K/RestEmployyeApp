package com.nagoor.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
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
  protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException, ServletException {
     EmployeeService es=new EmployeeService();
     List<Employee> list=es.getAllEmployees();
     PrintWriter out=resp.getWriter();
     resp.setContentType("text/html"); 
     out.println("<html><head><style>\n"
         + "        .GetAll {\n"
         + "            background-color: white;\n"
         + "            border: 2px solid black;\n"
         + "            color: green;\n"
         + "            padding: 5px 10px;\n"
         + "            text-align: center;\n"
         + "            display: inline-block;\n"
         + "            font-size: 20px;\n"
         + "            margin: 10px 30px;\n"
         + "            cursor: pointer;\n"
         + "        }\n"
         + "    </style></head><body>");
     out.println("<table border=1");  
     out.println("<tr><th>EmpId</th><th>EmpName</th><th>Age</th><th>Salary</th><th>Update Link</th><tr>");  
     for(Employee emp: list) {
    	 long id=emp.getId();
    	 String name=emp.getName();
    	 int age=emp.getAge();
    	 long salary=emp.getSalary();
    	 //request.setAttribute("emp", emp);
    	 request.setAttribute("dummy", emp);
    	 RequestDispatcher rd = request.getRequestDispatcher("addemployee.jsp");
//    	 rd.forward(request, resp);
    	 out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + age + "</td><td>" + salary + "</td><td>" + "<a href='/RestEmployeeApp/addemployee.jsp'> Edit Employee</a>" + "</td></tr>");  
     }
     out.println("</table>");  
     out.println("</html></body>");  
     out.print("<a href='/RestEmployeeApp'>\n"
         + "        <button class=GetAll>\n"
         + "            Main Menu\n"
         + "        </button>\n"
         + "   </a>");
     out.print("<br>");
	  out.print("<a href='/RestEmployeeApp/addemployee.jsp'>\n"
	      + "        <button class=\"GetAll\">\n"
	      + "            Add Employee\n"
	      + "        </button>\n"
	      + "  </a>");
     
     
     
  }
	
}
