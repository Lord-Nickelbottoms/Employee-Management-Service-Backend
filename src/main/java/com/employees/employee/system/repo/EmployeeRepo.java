package com.employees.employee.system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employees.employee.system.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}