package com.nagoor.model.module;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.AbstractModule;
import com.nagoor.service.EmployeeServe;
import com.nagoor.service.EmployeeService;

public class PersistenceModule extends AbstractModule{
	@Override
	  protected void configure() {
		bind(EntityManagerFactory.class).toInstance(Persistence.createEntityManagerFactory("Eclipselink_JPA"));
		bind(EmployeeServe.class).to(EmployeeService.class);
	}
}
