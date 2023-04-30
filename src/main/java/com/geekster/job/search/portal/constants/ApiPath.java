package com.geekster.job.search.portal.constants;

public class ApiPath {

	private ApiPath() {

	}

	public static final String BASE_API = "api/v1/job-search-portal";

	public static final String JOB_API_CREATE_JOB = "/job";
	public static final String JOB_API_GET_ALL_JOBS = "/jobs";
	public static final String FIELD_JOB_ID = "jobId";
	public static final String FIELD_TITLE = "title";
	public static final String FIELD_SALARY = "salary";
	public static final String FIELD_APPLIED_DATE = "appliedDate";
	public static final String FIELD_KEYWORD = "keyword";
	public static final String JOB_API_JOB_ID_PATH_VARIABLE = JOB_API_CREATE_JOB + "/{" + FIELD_JOB_ID + "}";
	public static final String JOB_API_TITLE_PATH_VARIABLE = JOB_API_CREATE_JOB + "/title/{" + FIELD_TITLE + "}";
	public static final String JOB_API_SALARY_PATH_VARIABLE = JOB_API_CREATE_JOB + "/salary/{" + FIELD_SALARY + "}";
	public static final String JOB_API_APPLIED_DATE_PATH_VARIABLE = JOB_API_CREATE_JOB + "/applied-date/{" + FIELD_APPLIED_DATE
			+ "}";
	public static final String JOB_API_KEYWORD_PATH_VARIABLE = JOB_API_CREATE_JOB + "/keyword/{" + FIELD_KEYWORD + "}";

}