package com.geekster.employee.management.system.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.geekster.employee.management.system.constants.EmployeeManagementSystemConstants;
import com.geekster.employee.management.system.model.Address;
import com.geekster.employee.management.system.model.Employee;
import com.geekster.employee.management.system.repository.AddressRepository;
import com.geekster.employee.management.system.repository.EmployeeRepository;
import com.geekster.employee.management.system.response.EmployeeResponse;
import com.geekster.employee.management.system.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public String addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return EmployeeManagementSystemConstants.EMPLOYEE_CREATE_RESPONSE;
	}

	@Override
	public String updateEmployeeById(String employeeId, Employee employee) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(Long.parseLong(employeeId));
		String response = null;
		if (optionalEmployee.isPresent()) {
			Employee updatedEmployee = optionalEmployee.get();
			Address updatedAddress = updatedEmployee.getAddress();
			updatedAddress = updatedAddress.toBuilder().city(employee.getAddress().getCity())
					.street(employee.getAddress().getStreet()).state(employee.getAddress().getState())
					.zipcode(employee.getAddress().getZipcode()).build();
			updatedEmployee = updatedEmployee.toBuilder().firstName(employee.getFirstName())
					.lastName(employee.getLastName()).address(updatedAddress).build();
			employeeRepository.save(updatedEmployee);
			response = EmployeeManagementSystemConstants.EMPLOYEE_UPDATE_RESPONSE;
		} else {
			response = EmployeeManagementSystemConstants.INVALID_EMPLOYEE_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public String deleteEmployeeById(String employeeId) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(Long.parseLong(employeeId));
		String response = null;
		if (optionalEmployee.isPresent()) {
			employeeRepository.deleteById(Long.parseLong(employeeId));
			addressRepository.deleteById(optionalEmployee.get().getAddress().getId());
			response = EmployeeManagementSystemConstants.EMPLOYEE_DELETE_RESPONSE;
		} else {
			response = EmployeeManagementSystemConstants.INVALID_EMPLOYEE_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public EmployeeResponse getAllEmployees() {
		List<Employee> jobs = employeeRepository.findAll();
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setEmployees(jobs);
		if (!CollectionUtils.isEmpty(jobs)) {
			employeeResponse.setResponse(EmployeeManagementSystemConstants.EMPLOYEE_GET_ALL_RESPONSE);
		} else {
			employeeResponse.setResponse(EmployeeManagementSystemConstants.NO_DATA_FOUND_RESPONSE);
		}
		return employeeResponse;
	}

	@Override
	public EmployeeResponse getEmployeeById(String employeeId) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(Long.parseLong(employeeId));
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if (optionalEmployee.isPresent()) {
			List<Employee> employees = new ArrayList<>();
			employees.add(optionalEmployee.get());
			employeeResponse.setEmployees(employees);
			employeeResponse.setResponse(EmployeeManagementSystemConstants.EMPLOYEE_GET_RESPONSE);
		} else {
			employeeResponse.setEmployees(null);
			employeeResponse.setResponse(EmployeeManagementSystemConstants.INVALID_EMPLOYEE_ID_RESPONSE);
		}
		return employeeResponse;
	}

}
