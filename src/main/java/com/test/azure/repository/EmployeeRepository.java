package com.test.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.azure.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
