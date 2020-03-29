package com.hadi.hr.domain.mapper;

import com.hadi.hr.application.payload.request.EmployeeRequestPayload;
import com.hadi.hr.domain.dto.ReferentialDto;
import com.hadi.hr.domain.entity.Department;
import com.hadi.hr.domain.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee employeeRequestPayloadToEmployee(EmployeeRequestPayload employeeRequestPayload);
    Department map(ReferentialDto value);
}