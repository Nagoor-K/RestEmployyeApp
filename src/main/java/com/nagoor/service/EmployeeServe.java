package com.nagoor.service;

import java.util.List;

import com.nagoor.model.Employee;

public interface EmployeeServe {
	
	List<Employee> getAllEmployees();
	
	Employee addEmployee(Employee emp);
	
	Employee updateEmployee(Employee emp);
	
}
