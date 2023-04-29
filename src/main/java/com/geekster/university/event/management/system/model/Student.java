package com.geekster.university.event.management.system.model;

import com.geekster.university.event.management.system.constants.UniversityEventManagementSystemConstants;
import com.geekster.university.event.management.system.enums.Department;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = UniversityEventManagementSystemConstants.STUDENT_TABLE_NAME)
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = UniversityEventManagementSystemConstants.FIELD_STUDENT_ID)
	private Integer studentId;

	@NotEmpty
	@Size(min = 2, message = "student's first name should have at least 2 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = UniversityEventManagementSystemConstants.FIELD_STUDENT_FIRST_NAME)
	private String firstName;

	@NotEmpty
	@Size(min = 2, message = "student's last name should have at least 2 characters")
	@Column(name = UniversityEventManagementSystemConstants.FIELD_STUDENT_LAST_NAME)
	private String lastName;

	@NotNull
	@Min(value = UniversityEventManagementSystemConstants.MIN_AGE, message = "student's age must be between 18-25")
	@Max(value = UniversityEventManagementSystemConstants.MAX_AGE, message = "student's age must be between 18-25")
	@Column(name = UniversityEventManagementSystemConstants.FIELD_STUDENT_AGE)
	private Integer age;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = UniversityEventManagementSystemConstants.FIELD_STUDENT_DEPARTMENT)
	private Department department;

}
