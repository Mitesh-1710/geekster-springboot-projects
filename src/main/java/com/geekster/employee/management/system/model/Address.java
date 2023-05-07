package com.geekster.employee.management.system.model;

import com.geekster.employee.management.system.constants.EmployeeManagementSystemConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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
@Table(name = EmployeeManagementSystemConstants.ADDRESS_TABLE_NAME)
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = EmployeeManagementSystemConstants.FIELD_ADDRESS_ID)
	private Long id;

	@NotNull
	@Column(name = EmployeeManagementSystemConstants.FIELD_ADDRESS_STREET)
	private String street;

	@NotNull
	@Column(name = EmployeeManagementSystemConstants.FIELD_ADDRESS_CITY)
	private String city;

	@NotNull
	@Column(name = EmployeeManagementSystemConstants.FIELD_ADDRESS_STATE)
	private String state;

	@NotNull
	@Size(min = 5, message = "Zipcode should have at least 5 characters")
	@Column(name = EmployeeManagementSystemConstants.FIELD_ADDRESS_ZIPCODE)
	private String zipcode;
}
