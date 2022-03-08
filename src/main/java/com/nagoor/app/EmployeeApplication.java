package com.nagoor.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.nagoor.restfull.EmployeeResources;

public class EmployeeApplication extends Application{
	private Set<Object> singletons = new HashSet<Object>();

	public EmployeeApplication() {
		singletons.add(new EmployeeResources());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
