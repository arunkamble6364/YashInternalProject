package com.spring.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Employee;
import com.spring.repo.EmployeeRepository;
import com.spring.service.EmployeeService;


@RestController
@RequestMapping("/employee")

@ComponentScan("com.spring.service")
@CrossOrigin(origins="http://localhost:4200")// this will enable the request from a parituclar port or ip address
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	

	@PostMapping("/")
	public void registerEmployee(@RequestBody Employee employee) {
		System.out.println("start");

		this.employeeService.saveEmployee(employee);
		
	}
	

	 @DeleteMapping("/{eid}")
	    public void deleteUser(@PathVariable("eid") Long eid) {
	        this.employeeService.deleteEmployee(eid);
	    }	
	 
		
		  @GetMapping("/{eid}") 
		  public Employee getEmployee(@PathVariable("eid") Long
		  eId) {
		  
		  return this.employeeService.getEmployee(eId); }
		
	 
	 @GetMapping("/")
	 public ResponseEntity<?> getEmployee(){
		return ResponseEntity.ok(this.employeeService.getEmployee());
		 
		  
		 
	 }
	 @PutMapping 
	  public Employee updateEmployee(@PathVariable Long id, Employee employee) {
		  
		  return employeeService.UpdateEmplyoeeRecord(employee); 
		  }
	
	 
	 
	 
}

