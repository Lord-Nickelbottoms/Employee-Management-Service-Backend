package com.employees.employee.system.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_number;

    @Column(name="firstname")
    private String firstname;
    private String surname;
    private String email;
    private String address;
    private String department;
    // private String contactNo;

    public Employee() {

    }

    public Employee(int id, String firstname, String lastName, String email, String address,String department /*String contactNo*/) {
        this.employee_number = id;
        this.firstname = firstname;
        this.surname = lastName;
        this.email = email;
        this.address=address;
        this.department = department;
        // this.contactNo = contactNo;
    }

    public int getEmployee_number() {
        return employee_number;
    }

    public void setEmployee_number(int id) {
        this.employee_number = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String name) {
        this.firstname = name;
    }


    /* Surname */
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    /* Email */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /* Department */
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }


    /* Contact Number */
    // public String getContactNo() {
    //     return contactNo;
    // }

    // public void setContactNo(String contactNo) {
    //     this.contactNo = contactNo;
    // }
}
