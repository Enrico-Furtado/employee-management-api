package com.github.enricofurtado.employee_management_api.Mapper;

import com.github.enricofurtado.employee_management_api.DTO.EmployeeDTO;
import com.github.enricofurtado.employee_management_api.Model.EmployeeModel;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public EmployeeModel map(EmployeeDTO employeeDTO) {
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setId(employeeDTO.getId());
        employeeModel.setName(employeeDTO.getName());
        employeeModel.setEmail(employeeDTO.getEmail());
        employeeModel.setPhone(employeeDTO.getPhone());
        employeeModel.setEmploymentType(employeeDTO.getEmploymentType());
        employeeModel.setJobTitle(employeeDTO.getJobTitle());
        employeeModel.setDepartment(employeeDTO.getDepartment());
        employeeModel.setSalary(employeeDTO.getSalary());
        employeeModel.setAdmissionDate(employeeDTO.getAdmissionDate());
        employeeModel.setActive(employeeDTO.getActive());
        employeeModel.setProject(employeeDTO.getProject());

        return employeeModel;

    }

    public EmployeeDTO map(EmployeeModel employeeModel) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employeeModel.getId());
        employeeDTO.setName(employeeModel.getName());
        employeeDTO.setEmail(employeeModel.getEmail());
        employeeDTO.setPhone(employeeModel.getPhone());
        employeeDTO.setEmploymentType(employeeModel.getEmploymentType());
        employeeDTO.setJobTitle(employeeModel.getJobTitle());
        employeeDTO.setDepartment(employeeModel.getDepartment());
        employeeDTO.setSalary(employeeModel.getSalary());
        employeeDTO.setAdmissionDate(employeeModel.getAdmissionDate());
        employeeDTO.setActive(employeeModel.getActive());
        employeeDTO.setProject(employeeModel.getProject());

        return employeeDTO;
    }
}
