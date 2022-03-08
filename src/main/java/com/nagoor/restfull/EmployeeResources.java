package com.nagoor.restfull;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nagoor.model.Employee;
import com.nagoor.service.EmployeeService;

@Path("/employee")
public class EmployeeResources {
	
	EmployeeService employeeService=new EmployeeService();
	
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getAllEmp() {
		return employeeService.getAllEmployees();
	}
	
	@POST
	@Path("/addEmployee")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee addEmp(Employee emp) {
		return employeeService.addEmployee(emp);
	}
	
	@PUT
	@Path("/{emp}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee updateEmp(Employee emp) {
		return employeeService.updateEmployee(emp);
	}
	
}
