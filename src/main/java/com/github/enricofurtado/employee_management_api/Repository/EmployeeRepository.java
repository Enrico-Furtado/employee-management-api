package com.github.enricofurtado.employee_management_api.Repository;

import com.github.enricofurtado.employee_management_api.Model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
}
