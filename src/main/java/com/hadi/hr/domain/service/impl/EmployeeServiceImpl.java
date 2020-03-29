package com.hadi.hr.domain.service.impl;

import com.hadi.hr.domain.entity.Employee;
import com.hadi.hr.domain.repository.EmployeeRepository;
import com.hadi.hr.domain.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    @Override
    public Employee findEmployeeByDocumentId(String documentId) {
        return employeeRepository.findByDocumentId(documentId);
    }

    @Override
    public Employee hireEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
