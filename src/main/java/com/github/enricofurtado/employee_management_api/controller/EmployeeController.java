package com.github.enricofurtado.employee_management_api.controller;

import com.github.enricofurtado.employee_management_api.entity.Employee;
import com.github.enricofurtado.employee_management_api.repository.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {


    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<>(employeeRepository.findAll(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeRepository.save(employee),HttpStatus.CREATED);
    }
}
