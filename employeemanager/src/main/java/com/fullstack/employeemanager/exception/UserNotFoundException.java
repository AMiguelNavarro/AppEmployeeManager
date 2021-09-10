package com.fullstack.employeemanager.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("User by id " + id + " was not found");
    }
}
