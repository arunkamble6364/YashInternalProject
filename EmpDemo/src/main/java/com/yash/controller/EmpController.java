package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Employee;
import com.yash.service.EmpService;

@RestController
@RequestMapping("emp")
@CrossOrigin("*")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping
	public List<Employee> GetEmployeectrl()
	{
		return empService.GetEmployee();
	}
	
	@GetMapping("/{employeeId}")
	public Employee GetEmployeeByIDCtrl(@PathVariable int employeeId)
	{
		return empService.GetEmployeeByID(employeeId);
		
	}
	
	@PostMapping
	public Employee AddEmpRecordCtrl(@RequestBody Employee employee)
	{
		return empService.SaveEmployeeDetailes(employee);
	}
	
	
	
	  @PutMapping 
	  public Employee UpdateEmpRecordCtrl(@RequestBody Employee employee) {
		  
		  return empService.UpdateEmplyoeeRecord(employee); 
		  }
	 
	@DeleteMapping("/{employeeId}")
	public String DeleteEmpRecord(@PathVariable int employeeId)
	{
		return empService.DeleteEmployeeRecord(employeeId);	
	}
	
	
	

}
