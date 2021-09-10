package com.fullstack.employeemanager.repository;

import com.fullstack.employeemanager.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
