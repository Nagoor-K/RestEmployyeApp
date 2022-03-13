package com.nagoor.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
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

public class GetAll extends HttpServlet{
	
	/**
   * 
   */
  private static final long serialVersionUID = 784784152275054027L;
  @Inject
	private static EmployeeServe es;
	
	public GetAll() {
		Injector injector=Guice.createInjector(new PersistenceModule());
		es=injector.getInstance(EmployeeServe.class);
	}
	
	protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		List<Employee> list=es.getAllEmployees();
		request.setAttribute("emps", list);
		RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}
//	public List<Employee> all(){
//		return es.getAllEmployees();
//	}
	@Override
    protected void doGet(HttpServletRequest request,
                        HttpServletResponse response)
        throws ServletException, IOException
    {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request,
                        HttpServletResponse response)
        throws ServletException, IOException
    {
        processRequest(request, response);
    }
	
}
