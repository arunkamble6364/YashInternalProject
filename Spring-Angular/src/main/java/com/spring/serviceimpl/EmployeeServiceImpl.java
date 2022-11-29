 package com.spring.serviceimpl;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Employee;
import com.spring.repo.EmployeeRepository;
import com.spring.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository EmpRepo;

	public void saveEmployee(Employee employee)
	{
		EmpRepo.save(employee); 
	}

	

	public void deleteEmployee(Long eid)
	{
		EmpRepo.deleteById(eid);
	}



	
	 @Override public Employee getEmployee(Long eid) { return
	 EmpRepo.findById(eid).get(); }
	 


	@Override
	public Set<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<Employee>(this.EmpRepo.findAll());
	}



	 public Employee UpdateEmplyoeeRecord(Employee employee) {
		  //Employee emp =
		  Employee emp =EmpRepo.findById(employee.getEid()).orElse(null);
	  emp.setTotal_year_of_exp(employee.getTotal_year_of_exp());
	  emp.setProject_Status(employee.getProject_Status());
	  emp.setProjectname(employee.getProjectname());
	  emp.setLast_working_date(employee.getLast_working_date());
	  emp.setEmailId(employee.getEmailId());
	  emp.setBase_location(employee.getBase_location());
	  emp.setPreffered_location(employee.getPreffered_location());
	  emp.setCtc(employee.getCtc());
	  emp.setDate_of_joining(employee.getDate_of_joining()); return
			  EmpRepo.save(emp); }
	 
	
		 
	



	

	

	

}
