package com.employees.employee.system.exception;


//This is a custom exception that extends RunTimeException that will be thrown when a user exists
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
