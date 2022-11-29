package com.yash.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yash.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

	//Optional<Employee> findById(int employeeId);

}
