package com.geekster.employee.management.system.constants;

public class EmployeeManagementSystemConstants {

	private EmployeeManagementSystemConstants() {

	}

	// Employee
	public static final String EMPLOYEE_TABLE_NAME = "employee";
	public static final String FIELD_EMPLOYEE_ID = "id";
	public static final String FIELD_EMPLOYEE_FIRST_NAME = "first_name";
	public static final String FIELD_EMPLOYEE_LAST_NAME = "last_name";
	public static final String FIELD_EMPLOYEE_ADDRESS = "address";

	public static final String EMPLOYEE_CREATE_RESPONSE = "Employee added sucessfully!";
	public static final String EMPLOYEE_UPDATE_RESPONSE = "Employee updated sucessfully!";
	public static final String EMPLOYEE_DELETE_RESPONSE = "Employee deleted sucessfully!";
	public static final String EMPLOYEE_GET_RESPONSE = "Employee retrived sucessfully!";
	public static final String EMPLOYEE_GET_ALL_RESPONSE = "Employees retrived sucessfully!";
	public static final String INVALID_EMPLOYEE_ID_RESPONSE = "Invalid Employee Id!";
	public static final String NO_DATA_FOUND_RESPONSE = "No data found!";

	// Address
	public static final String ADDRESS_TABLE_NAME = "address";
	public static final String FIELD_ADDRESS_ID = "id";
	public static final String FIELD_ADDRESS_STREET = "street";
	public static final String FIELD_ADDRESS_CITY = "city";
	public static final String FIELD_ADDRESS_STATE = "state";
	public static final String FIELD_ADDRESS_ZIPCODE = "zipcode";

	public static final String ADDRESS_CREATE_RESPONSE = "Address added sucessfully!";
	public static final String ADDRESS_UPDATE_RESPONSE = "Address updated sucessfully!";
	public static final String ADDRESS_DELETE_RESPONSE = "Address deleted sucessfully!";
	public static final String ADDRESS_GET_RESPONSE = "Address retrived sucessfully!";
	public static final String ADDRESS_GET_ALL_RESPONSE = "Addresses retrived sucessfully!";
	public static final String INVALID_ADDRESS_ID_RESPONSE = "Invalid Address Id!";

}
