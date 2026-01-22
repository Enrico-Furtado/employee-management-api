package com.github.enricofurtado.employee_management_api.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @PostMapping("/create")
    public String employeeCreate(){
        return "Employee created";
    }

    @GetMapping("/list")
    public String employeeList() {
        return "list";
    }

    @GetMapping("/list/{id}")
    public String employeeList(@PathVariable String id){
        return "list";
    }

    @PutMapping
    public String employeeUpdate(){
        return "Employee updated";
    }

    @DeleteMapping
    public String employeeDelete(@RequestParam String id){
        return "Employee deleted";
    }
}
