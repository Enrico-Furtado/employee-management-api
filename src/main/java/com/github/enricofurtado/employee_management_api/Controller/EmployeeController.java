package com.github.enricofurtado.employee_management_api.Controller;


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
    public EmployeeModel employeeCreate(@RequestBody EmployeeModel employeeModel){
        EmployeeModel employee = employeeService.createEmployee(employeeModel);
        return employee;
    }

    @GetMapping("/list")
    public List<EmployeeModel> employeeList() {
        List<EmployeeModel> employees = employeeService.getAllEmployees();
        return employees;
    }

    @GetMapping("/list/{id}")
    public EmployeeModel employeeList(@PathVariable Long id){
        EmployeeModel employee = employeeService.employeeById(id);
        return employee;
    }

    @PutMapping("/update/{id}")
    public EmployeeModel employeeUpdate(@PathVariable Long id, @RequestBody EmployeeModel employeeModel){
        EmployeeModel employee = employeeService.updateEmployee(id, employeeModel);
        return employee;
    }

    @DeleteMapping("/delete/{id}")
    public String employeeDelete(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return "Employee deleted";
    }
}
