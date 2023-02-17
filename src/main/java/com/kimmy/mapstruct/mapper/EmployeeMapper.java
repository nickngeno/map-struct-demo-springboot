package com.kimmy.mapstruct.mapper;

import com.kimmy.mapstruct.model.Employee;
import com.kimmy.mapstruct.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
public interface EmployeeMapper {

    @Mapping(target="id", source = "dto.employeeId")
    @Mapping(target="name", source = "dto.employeeName")
    Employee toEmployee(EmployeeDTO dto);
    @Mapping(target="employeeId", source="employee.id")
    @Mapping(target="employeeName", source="employee.name")
    EmployeeDTO toEmployeeDto(Employee employee);
}
