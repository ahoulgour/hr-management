package com.hadi.hr.application.controller;

import com.hadi.hr.domain.service.ContractService;
import com.hadi.hr.domain.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/contracts")
public class ContractController {

    @Autowired
    private ContractService contractService;


    @DeleteMapping("/{documentId}")
    public ResponseEntity<String> fireEmployee(@PathVariable String documentId) {
        contractService.cancelContractByDocumentId(documentId);
        return ok().body(documentId);
    }
}
