package com.hadi.hr.domain.service;

import com.hadi.hr.domain.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findEmployeeByDocumentId(String documentId);
    Employee hireEmployee(Employee employee);
}
