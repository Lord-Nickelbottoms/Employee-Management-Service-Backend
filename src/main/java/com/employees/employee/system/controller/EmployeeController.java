package com.employees.employee.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.employee.system.models.Employee;
import com.employees.employee.system.repo.EmployeeRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<Employee> findOne(Employee employee) {
        return employeeRepo.findById(employee.getEmployee_number());
    }

    // @PostMapping(value = "/employees")
    @PostMapping
    public Employee save(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

    @PutMapping("/{employee_number}")
    public ResponseEntity<String> update(@PathVariable int employee_number, @Validated @NonNull @RequestBody Employee employee) {
        Employee emp = employeeRepo.findById(employee_number).orElseThrow(() -> new IllegalStateException("Employee not found"));
        emp.setFirstname(employee.getFirstname());
        emp.setSurname(employee.getSurname());
        emp.setEmail(employee.getEmail());
        emp.setAddress(employee.getAddress());
        emp.setDepartment(employee.getDepartment());
        employeeRepo.save(emp);
        return new ResponseEntity<String>("Employee successfully updated", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        employeeRepo.deleteById(id);
    }
}