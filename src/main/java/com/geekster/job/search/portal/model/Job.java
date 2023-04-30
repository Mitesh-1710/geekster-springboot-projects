package com.geekster.job.search.portal.model;

import java.time.LocalDate;

import com.geekster.job.search.portal.constants.JobSearchPortalConstants;
import com.geekster.job.search.portal.enums.JobType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = JobSearchPortalConstants.JOB_TABLE_NAME)
@Entity
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = JobSearchPortalConstants.FIELD_JOB_ID)
	private Long id;

	@NotNull
	@Size(min = 5, message = "Job title should have at least 5 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*[ ][A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = JobSearchPortalConstants.FIELD_JOB_TITLE)
	private String title;

	@NotNull
	@Size(min = 12, message = "Job description should have at least 12 characters")
	@Column(name = JobSearchPortalConstants.FIELD_JOB_DESCRIPTION)
	private String description;

	@NotNull
	@Size(min = 12, message = "Job location should have at least 12 characters")
	@Column(name = JobSearchPortalConstants.FIELD_JOB_LOCATION)
	private String location;

	@NotNull
	@Column(name = JobSearchPortalConstants.FIELD_JOB_SALARY)
	private Double salary;

	@NotNull
	@Size(min = 3, message = "Company name should have at least 5 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = JobSearchPortalConstants.FIELD_JOB_COMPANY_NAME)
	private String companyName;

	@NotNull
	@Size(min = 5, message = "Employer name should have at least 5 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*[ ][A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = JobSearchPortalConstants.FIELD_JOB_EMPLOYER_NAME)
	private String employerName;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = JobSearchPortalConstants.FIELD_JOB_TYPE)
	private JobType jobType;

	@NotNull
	@Column(name = JobSearchPortalConstants.FIELD_JOB_APPLIED_DATE)
	private LocalDate appliedDate;

}
