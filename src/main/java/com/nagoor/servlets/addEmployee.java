package com.nagoor.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.nagoor.model.Employee;
import com.nagoor.model.module.PersistenceModule;
import com.nagoor.service.EmployeeServe;
import com.nagoor.service.EmployeeService;

public class addEmployee extends HttpServlet{

  /**
   * 
   */
	@Inject
	private static EmployeeServe es;
	
	public addEmployee(){
		Injector injector = Guice.createInjector(new PersistenceModule());
		es = injector.getInstance(EmployeeServe.class);
	}
	
  private static final long serialVersionUID = 7344293385957910617L; 
  
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      int id=Integer.parseInt(req.getParameter("eid"));
      String name=req.getParameter("name");
      int age=Integer.parseInt(req.getParameter("age"));
      long salary=Long.parseLong(req.getParameter("salary"));
      Employee emp=new Employee(id,name,age,salary);
      es.addEmployee(emp);
      resp.sendRedirect("/RestEmployeeApp");
      
  }
  
	
}
