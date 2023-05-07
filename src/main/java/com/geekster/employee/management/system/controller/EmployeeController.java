package com.geekster.employee.management.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.employee.management.system.constants.ApiPath;
import com.geekster.employee.management.system.model.Employee;
import com.geekster.employee.management.system.response.EmployeeResponse;
import com.geekster.employee.management.system.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(ApiPath.EMPLOYEE_API_CREATE_EMPLOYEE)
	public String addEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PutMapping(ApiPath.EMPLOYEE_API_EMPLOYEE_ID_PATH_VARIABLE)
	public String updateEmployeeById(@PathVariable String employeeId, @Valid @RequestBody Employee employee) {
		return employeeService.updateEmployeeById(employeeId, employee);
	}

	@DeleteMapping(ApiPath.EMPLOYEE_API_EMPLOYEE_ID_PATH_VARIABLE)
	public String deleteEmployeeById(@PathVariable String employeeId) {
		return employeeService.deleteEmployeeById(employeeId);
	}

	@GetMapping(ApiPath.EMPLOYEE_API_GET_ALL_EMPLOYEE)
	public EmployeeResponse getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping(ApiPath.EMPLOYEE_API_EMPLOYEE_ID_PATH_VARIABLE)
	public EmployeeResponse getEmployeeById(@PathVariable String employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}

}
