package com.geekster.university.event.management.system.constants;

public class UniversityEventManagementSystemConstants {

	private UniversityEventManagementSystemConstants() {

	}

	// Student
	public static final String STUDENT_TABLE_NAME = "Student";
	public static final String FIELD_STUDENT_ID = "student_id";
	public static final String FIELD_STUDENT_FIRST_NAME = "first_name";
	public static final String FIELD_STUDENT_LAST_NAME = "last_name";
	public static final String FIELD_STUDENT_AGE = "age";
	public static final String FIELD_STUDENT_DEPARTMENT = "department";

	public static final int MAX_AGE = 25;
	public static final int MIN_AGE = 18;

	public static final String STUDENT_CREATE_RESPONSE = "Student added sucessfully!";
	public static final String STUDENT_DEPARTMENT_UPDATE_RESPONSE = "Department updated sucessfully!";
	public static final String STUDENT_DELETE_RESPONSE = "Student deleted sucessfully!";
	public static final String STUDENT_GET_RESPONSE = "Student retrived sucessfully!";
	public static final String INVALID_STUDENT_ID_RESPONSE = "Invalid Student Id!";
	public static final String DEPARTMENT_DOES_NOT_EXISTS_RESPONSE = "Department does not exists!";

	// Event
	public static final String EVENT_TABLE_NAME = "Event";
	public static final String FIELD_EVENT_ID = "event_id";
	public static final String FIELD_EVENT_NAME = "event_name";
	public static final String FIELD_LOCATION_OF_EVENT = "location_of_event";
	public static final String FIELD_EVENT_DATE = "event_date";
	public static final String FIELD_EVENT_START_TIME = "start_time";
	public static final String FIELD_EVENT_END_TIME = "end_time";

	public static final String EVENT_CREATE_RESPONSE = "Event added sucessfully!";
	public static final String EVENT_UPDATE_RESPONSE = "Event updated sucessfully!";
	public static final String EVENT_DELETE_RESPONSE = "Event deleted sucessfully!";
	public static final String INVALID_EVENT_ID_RESPONSE = "Invalid Event Id!";

}
