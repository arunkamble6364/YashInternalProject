package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entity.Employee;

import com.yash.repo.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepository;
	
	public List<Employee> GetEmployee()
	{
		List<Employee> employees = empRepository.findAll();
		return employees;
		
	}
	
	public Employee GetEmployeeByID(int employeeId)
	{
		return empRepository.findById(employeeId).orElse(null);
 	}
	
	
	public Employee SaveEmployeeDetailes(Employee employee)
	{
		return empRepository.save(employee);
	}
	
	public String DeleteEmployeeRecord(int employeeId)
	{
		empRepository.deleteById(employeeId);
		return "Employee Is Removed!! " +employeeId;
		
	}
	
	
	  public Employee UpdateEmplyoeeRecord(Employee employee) {
		  //Employee emp =
	  /*empRepository.findById(employee.getEmployee_id()).orElse(null);*/ 
		  Employee emp =empRepository.findById(employee.getId()).orElse(null);
	  emp.setTotal_experience(employee.getTotal_experience());
	  emp.setProject_allocated(employee.getProject_allocated());
	  emp.setProject_name(employee.getProject_name());
	  emp.setLworking_date(employee.getLworking_date());
	  emp.setInterests(employee.getInterests());
	  emp.setYashemail_address(employee.getYashemail_address());
	  emp.setMobile_no(employee.getMobile_no());
	  emp.setYash_base_location(employee.getYash_base_location());
	  emp.setPreferedlocation(employee.getPreferedlocation());
	  emp.setCtc(employee.getCtc());
	  emp.setDate_of_joining(employee.getDate_of_joining()); return
	  empRepository.save(emp); }
	 
	
	

}
