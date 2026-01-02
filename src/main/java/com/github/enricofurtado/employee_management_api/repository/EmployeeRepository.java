package com.github.enricofurtado.employee_management_api.repository;

import com.github.enricofurtado.employee_management_api.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
