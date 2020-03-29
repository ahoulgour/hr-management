package com.hadi.hr.domain.repository;

import com.hadi.hr.domain.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByDocumentId(String documentId);
}
