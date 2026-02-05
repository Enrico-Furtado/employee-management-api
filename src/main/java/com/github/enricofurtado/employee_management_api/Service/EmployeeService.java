package com.github.enricofurtado.employee_management_api.Service;

import com.github.enricofurtado.employee_management_api.DTO.EmployeeDTO;
import com.github.enricofurtado.employee_management_api.Mapper.EmployeeMapper;
import com.github.enricofurtado.employee_management_api.Model.EmployeeModel;
import com.github.enricofurtado.employee_management_api.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    private EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    //CREATE EMPLOYEE
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        EmployeeModel employeeModel = employeeMapper.map(employeeDTO);
        employeeModel = employeeRepository.save(employeeModel);
        return employeeMapper.map(employeeModel);
    }

    //DELETE EMPLOYEE
    public void  deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    // LIST EMPLOYEES
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(employeeMapper::map)
                .toList();
    }

    //LIST EMPLOYEE BY ID
    public EmployeeDTO employeeById(Long id){
        return employeeRepository.findById(id)
                .map(employeeMapper::map)
                .orElse(null);
    }

    //UPDATE EMPLOYEE BY ID
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO employee){
        EmployeeModel employeeModel = employeeMapper.map(employee);
        if (employeeRepository.existsById(id)){
            employeeModel.setId(id);
            EmployeeDTO employee_by_id = employeeMapper.map(employeeRepository.save(employeeModel));
            return employee_by_id;
        }
        return null;
    }
}
