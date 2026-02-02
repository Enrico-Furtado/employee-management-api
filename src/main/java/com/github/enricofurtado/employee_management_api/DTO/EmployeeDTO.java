package com.github.enricofurtado.employee_management_api.DTO;

import com.github.enricofurtado.employee_management_api.Enums.Department;
import com.github.enricofurtado.employee_management_api.Enums.EmploymentType;
import com.github.enricofurtado.employee_management_api.Enums.JobTitle;
import com.github.enricofurtado.employee_management_api.Model.ProjectModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private EmploymentType employmentType;
    private JobTitle jobTitle;
    private Department department;
    private BigDecimal salary;
    private LocalDate admissionDate;
    private Boolean active;
    private ProjectModel project;

}
