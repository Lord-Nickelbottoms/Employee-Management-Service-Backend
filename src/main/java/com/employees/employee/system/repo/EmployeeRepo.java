package com.employees.employee.system.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employees.employee.system.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    // @Query("SELECT a FROM Employee WHERE CONCAT(a.firstname, '',a.surname,'', a.email,'',a.department,'',a.employee_number")
    // List<Employee>searchEmployees(String value);

}