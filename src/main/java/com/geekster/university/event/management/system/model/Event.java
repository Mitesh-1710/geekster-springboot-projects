package com.geekster.university.event.management.system.model;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geekster.university.event.management.system.constants.UniversityEventManagementSystemConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = UniversityEventManagementSystemConstants.EVENT_TABLE_NAME)
@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = UniversityEventManagementSystemConstants.FIELD_EVENT_ID)
	private Integer eventId;

	@NotEmpty
	@Size(min = 2, message = "event name should have at least 2 characters")
	@Column(name = UniversityEventManagementSystemConstants.FIELD_EVENT_NAME)
	private String eventName;

	@NotEmpty
	@Size(min = 3, message = "location of event name should have at least 3 characters")
	@Column(name = UniversityEventManagementSystemConstants.FIELD_LOCATION_OF_EVENT)
	private String locationOfEvent;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	@Column(name = UniversityEventManagementSystemConstants.FIELD_EVENT_DATE)
	private LocalDate date;

	@NotNull
	@JsonFormat(pattern = "HH:mm:ss", shape = JsonFormat.Shape.STRING)
	@Column(name = UniversityEventManagementSystemConstants.FIELD_EVENT_START_TIME)
	private LocalTime startTime;

	@NotNull
	@JsonFormat(pattern = "HH:mm:ss", shape = JsonFormat.Shape.STRING)
	@Column(name = UniversityEventManagementSystemConstants.FIELD_EVENT_END_TIME)
	private LocalTime endTime;

}
