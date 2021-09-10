package com.fullstack.employeemanager.service;

import com.fullstack.employeemanager.domain.Employee;
import com.fullstack.employeemanager.exception.UserNotFoundException;
import com.fullstack.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Add an employee
     * @param employee
     * @return
     */
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return  employeeRepository.save(employee);
    }

    /**
     * Find all employees
     * @return
     */
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * Update an employee
     * @param employee
     * @return
     */
    public Employee updateEmployee(Employee employee) {
        return  employeeRepository.save(employee);
    }

    /**
     * Delete an employee
     * @param id
     */
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    /**
     * Find an employee by id
     * @param id
     * @return
     */
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }
}
