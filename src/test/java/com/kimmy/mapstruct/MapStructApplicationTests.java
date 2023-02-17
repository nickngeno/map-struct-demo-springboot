package com.kimmy.mapstruct;

import com.kimmy.mapstruct.mapper.EmployeeMapper;
import com.kimmy.mapstruct.model.Employee;
import com.kimmy.mapstruct.model.EmployeeDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MapStructApplicationTests {


    @Test
    void contextLoads() {
    }

    @Test
    void givenAnEmployeeReturnEmployeeDto() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Nick");
        EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

        EmployeeDTO employeeDTO = mapper.toEmployeeDto(employee);

        Assertions.assertEquals(employeeDTO.getEmployeeId() , employee.getId());
        Assertions.assertEquals(employeeDTO.getEmployeeName() , employee.getName());
    }
    @Test
    void givenAnEmployeeDtoReturnEmployee() {
        EmployeeDTO employeeDto = new EmployeeDTO();
        employeeDto.setEmployeeId(2);
        employeeDto.setEmployeeName("vik");

        EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

        Employee employee = mapper.toEmployee(employeeDto);

        Assertions.assertEquals( 2,  employee.getId());
        Assertions.assertEquals("vik" , employee.getName());
    }
}
