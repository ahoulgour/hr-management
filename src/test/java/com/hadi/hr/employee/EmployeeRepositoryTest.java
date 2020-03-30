package com.hadi.hr.employee;


import com.hadi.hr.boot.HRManagementApplication;
import com.hadi.hr.domain.entity.Employee;
import com.hadi.hr.domain.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HRManagementApplication.class)
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void givenEmployeeRepository_whenFindAll_thenOK() {
        Iterable<Employee> employees = employeeRepository.findAll();

        assertNotNull(employees);
    }

    @Test
    public void givenEmployeeRepository_whenFindByDocumentId_thenOK() {
        Employee employee = employeeRepository.findByDocumentId("000022");

        assertNotNull(employee);
    }
}
