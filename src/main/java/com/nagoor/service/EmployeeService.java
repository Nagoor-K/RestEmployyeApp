package com.nagoor.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.nagoor.model.Employee;
import com.nagoor.model.module.PersistenceModule;

public class EmployeeService{
	@Inject
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	public EmployeeService() {
		Injector injector = Guice.createInjector(new PersistenceModule());
		emf = injector.getInstance(EntityManagerFactory.class);
	}
	public List<Employee> getAllEmployees(){
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createQuery("SELECT emp FROM Employee emp");
		List<Employee> l=(List<Employee>)query.getResultList();
//		long count=(long) query.getSingleResult();
//		for(long i=0;i<count;i++) {
//			l.add(em.find(Employee.class, i));
//		}
		return l;
	}
	
	public Employee addEmployee(Employee emp) {
		em=emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
		em.close();
		return emp;
	}
	
	public Employee updateEmployee(Employee emp) {
		em=emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
		em.close();
		return emp;
	}
}
