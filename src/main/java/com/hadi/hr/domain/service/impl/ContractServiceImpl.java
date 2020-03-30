package com.hadi.hr.domain.service.impl;

import com.hadi.hr.domain.entity.Employee;
import com.hadi.hr.domain.repository.ContractRepository;
import com.hadi.hr.domain.repository.EmployeeRepository;
import com.hadi.hr.domain.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public void cancelContractByDocumentId(String documentId) {
        Employee employee = employeeRepository.findByDocumentId(documentId);
        contractRepository.deleteByEmployee(employee);
    }
}
