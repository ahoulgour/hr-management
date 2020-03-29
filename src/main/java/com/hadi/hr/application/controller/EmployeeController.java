package com.hadi.hr.application.controller;

import com.hadi.hr.application.payload.request.EmployeeRequestPayload;
import com.hadi.hr.domain.entity.Employee;
import com.hadi.hr.domain.mapper.EmployeeMapper;
import com.hadi.hr.domain.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity<List<Employee>> findAllEmployees() {
        return ok().body(employeeService.findAll());
    }

    @GetMapping("/{documentId}")
    public ResponseEntity<Employee> findEmployeeByDocumentId(@PathVariable String documentId) {
        return ok().body(employeeService.findEmployeeByDocumentId(documentId));
    }

    @PostMapping("/")
    public ResponseEntity<Employee> hireEmployee(@RequestBody EmployeeRequestPayload employeePayload) {
        return ok().body(employeeService.hireEmployee(EmployeeMapper.INSTANCE.employeeRequestPayloadToEmployee(employeePayload)));
    }
}

