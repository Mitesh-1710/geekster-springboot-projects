package com.geekster.user.management.system.model;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geekster.user.management.system.constants.UserManagementSystemConstants;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

	@NotNull
	private Integer userId;

	@NotEmpty
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String userName;

	@NotEmpty
	@Size(min = 12, message = "user address should have at least 12 characters")
	private String address;

	@NotNull
	@Min(value = 1111111111, message = "user phone number should have at least 10 digits")
	@Max(value = UserManagementSystemConstants.MAX_NUMBER, message = "user phone number should not exceed 10 digits")
	private long phoneNumber;

	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate dateOfBirth;

	@NotEmpty
	@Email
	private String email;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate dateOfRegistration;

	@NotNull
	@JsonFormat(pattern = "HH:mm:ss", shape = JsonFormat.Shape.STRING)
	private LocalTime timeOfRegistration;

}
