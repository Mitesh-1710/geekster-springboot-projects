package com.geekster.employee.management.system.model;

import com.geekster.employee.management.system.constants.EmployeeManagementSystemConstants;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = EmployeeManagementSystemConstants.EMPLOYEE_TABLE_NAME)
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = EmployeeManagementSystemConstants.FIELD_EMPLOYEE_ID)
	private Long id;

	@NotNull
	@Size(min = 3, message = "Employee first name should have at least 3 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = EmployeeManagementSystemConstants.FIELD_EMPLOYEE_FIRST_NAME)
	private String firstName;

	@NotNull
	@Size(min = 3, message = "Employee last name should have at least 3 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = EmployeeManagementSystemConstants.FIELD_EMPLOYEE_LAST_NAME)
	private String lastName;

	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = EmployeeManagementSystemConstants.FIELD_EMPLOYEE_ADDRESS, referencedColumnName = EmployeeManagementSystemConstants.FIELD_ADDRESS_ID)
	private Address address;

}
