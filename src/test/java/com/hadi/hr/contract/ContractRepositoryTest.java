package com.hadi.hr.contract;

import com.hadi.hr.boot.HRManagementApplication;
import com.hadi.hr.domain.entity.Employee;
import com.hadi.hr.domain.repository.ContractRepository;
import com.hadi.hr.domain.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Optional;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = HRManagementApplication.class)
public class ContractRepositoryTest {

    @Autowired
    private ContractRepository ContractRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    @Transactional
    public void givenContractRepository_whenDeleteByEmployee_thenOK() {
        Employee employeeBefore = employeeRepository.findById(1L).get();
        ContractRepository.deleteByEmployee(employeeBefore);
        Optional<Employee> employeeAfter = employeeRepository.findById(1L);

        assertEquals(Optional.empty(), employeeAfter);
    }
}
