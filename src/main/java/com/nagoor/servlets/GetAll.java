package com.nagoor.servlets;

import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.nagoor.model.Employee;
import com.nagoor.model.module.PersistenceModule;
import com.nagoor.service.EmployeeService;

public class GetAll {
	
	@Inject
	private static EmployeeService es;
	
	public GetAll() {
		Injector injector=Guice.createInjector(new PersistenceModule());
		es=injector.getInstance(EmployeeService.class);
	}
	
	public List<Employee> all(){
		return es.getAllEmployees();
	}
}
