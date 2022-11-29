package com.spring.service;

import java.util.Set;

import com.spring.model.Employee;

import antlr.collections.List;

public interface EmployeeService {
	


	void saveEmployee(Employee employee);

	void deleteEmployee(Long eid);

	
	  public Employee getEmployee(Long eid);
	 
	public Set<Employee>getEmployee();
	
	public Employee UpdateEmplyoeeRecord(Employee employee);
	
	
	

}
