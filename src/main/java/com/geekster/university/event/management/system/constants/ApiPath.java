package com.geekster.university.event.management.system.constants;

public class ApiPath {

	private ApiPath() {

	}

	public static final String BASE_API = "api/v1/university-event-management";
	public static final String EVENT_API = "/event";
	public static final String FIELD_EVENT_ID = "eventId";
	public static final String FIELD_DATE = "date";
	public static final String EVENT_API_EVENT_ID_PATH_VARIABLE = EVENT_API + "/{" + FIELD_EVENT_ID + "}";
	public static final String EVENT_API_DATE_PATH_VARIABLE = EVENT_API + "/date/{" + FIELD_DATE + "}";
	public static final String STUDENT_API = "/student";
	public static final String GET_ALL_STUDENT_API = "/students";
	public static final String FIELD_STUDENT_ID = "studentId";
	public static final String STUDENT_API_STUDENT_ID_PATH_VARIABLE = STUDENT_API + "/{" + FIELD_STUDENT_ID + "}";
	
}