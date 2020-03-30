package com.hadi.hr.domain.repository;

import com.hadi.hr.domain.entity.Contract;
import com.hadi.hr.domain.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends CrudRepository<Contract, Long> {

    void deleteByEmployee(Employee employee);
}
