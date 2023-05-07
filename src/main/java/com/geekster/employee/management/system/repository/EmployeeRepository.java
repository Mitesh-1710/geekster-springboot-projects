package com.geekster.employee.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.employee.management.system.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
