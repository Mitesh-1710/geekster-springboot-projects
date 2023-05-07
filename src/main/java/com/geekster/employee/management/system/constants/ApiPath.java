package com.geekster.employee.management.system.constants;

public class ApiPath {

	private ApiPath() {

	}

	public static final String BASE_API = "api/v1/employee-management-system";

	// Employee
	public static final String EMPLOYEE_API_CREATE_EMPLOYEE = "/employee";
	public static final String EMPLOYEE_API_GET_ALL_EMPLOYEE = "/employees";
	public static final String FIELD_EMPLOYEE_ID = "employeeId";
	public static final String EMPLOYEE_API_EMPLOYEE_ID_PATH_VARIABLE = EMPLOYEE_API_CREATE_EMPLOYEE + "/{"
			+ FIELD_EMPLOYEE_ID + "}";

	// Address
	public static final String ADDRESS_API_CREATE_ADDRESS = "/address";
	public static final String ADDRESS_API_GET_ALL_ADDRESS = "/addresses";
	public static final String FIELD_ADDRESS_ID = "addressId";
	public static final String ADDRESS_API_ADDRESS_ID_PATH_VARIABLE = ADDRESS_API_CREATE_ADDRESS + "/{"
			+ FIELD_ADDRESS_ID + "}";

}