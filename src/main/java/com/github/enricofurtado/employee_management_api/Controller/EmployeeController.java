package com.github.enricofurtado.employee_management_api.Controller;


import com.github.enricofurtado.employee_management_api.DTO.EmployeeDTO;
import com.github.enricofurtado.employee_management_api.Model.EmployeeModel;
import com.github.enricofurtado.employee_management_api.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public EmployeeDTO employeeCreate(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createEmployee(employeeDTO);
    }

    @GetMapping("/list")
    public List<EmployeeDTO> employeeList() {
        List<EmployeeDTO> employees = employeeService.getAllEmployees();
        return employees;
    }

    @GetMapping("/list/{id}")
    public EmployeeDTO employeeListId(@PathVariable Long id){
        EmployeeDTO employee = employeeService.employeeById(id);
        return employee;
    }

    @PutMapping("/update/{id}")
    public EmployeeDTO employeeUpdate(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO){
        EmployeeDTO employee = employeeService.updateEmployee(id, employeeDTO);
        return employee;
    }

    @DeleteMapping("/delete/{id}")
    public String employeeDelete(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return "Employee deleted";
    }
}
