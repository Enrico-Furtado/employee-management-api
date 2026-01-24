package com.github.enricofurtado.employee_management_api.Service;

import com.github.enricofurtado.employee_management_api.Model.EmployeeModel;
import com.github.enricofurtado.employee_management_api.Repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //CREATE EMPLOYEE
    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    //DELETE EMPLOYEE
    public void  deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    //LIST EMPLOYEES
    public List<EmployeeModel> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //LIST EMPLOYEE BY ID
    public EmployeeModel employeeById(Long id){
        Optional<EmployeeModel> employeeById = employeeRepository.findById(id);
            return employeeById.orElse(null);
    }

    //UPDATE EMPLOYEE BY ID
    public EmployeeModel updateEmployee(Long id, EmployeeModel employeeModel){
        if (employeeRepository.existsById(id)){
            employeeModel.setId(id);
            return employeeRepository.save(employeeModel);
        }
        return null;
    }
}
