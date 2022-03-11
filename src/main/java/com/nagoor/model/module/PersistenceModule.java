package com.nagoor.model.module;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.AbstractModule;
import com.nagoor.restfull.EmployeeResources;
import com.nagoor.service.EmployeeServe;
import com.nagoor.service.EmployeeService;
import com.nagoor.servlets.addEmployee;

public class PersistenceModule extends AbstractModule{
	@Override
	  protected void configure() {
		bind(EntityManagerFactory.class).toInstance(Persistence.createEntityManagerFactory("Eclipselink_JPA"));
		bind(EmployeeServe.class).to(EmployeeService.class);
	}
}
