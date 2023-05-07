package com.geekster.employee.management.system.service;

import org.springframework.stereotype.Service;

import com.geekster.employee.management.system.model.Employee;
import com.geekster.employee.management.system.response.EmployeeResponse;

@Service
public interface EmployeeService {

	public String addEmployee(Employee employee);

	public String updateEmployeeById(String employeeId, Employee employee);

	public String deleteEmployeeById(String employeeId);

	public EmployeeResponse getAllEmployees();

	public EmployeeResponse getEmployeeById(String employeeId);

}
