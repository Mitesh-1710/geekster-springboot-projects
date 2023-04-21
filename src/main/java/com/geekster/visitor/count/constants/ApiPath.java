package com.geekster.visitor.count.constants;

public class ApiPath {

	private ApiPath() {

	}

	public static final String BASE_URL = "api/v1/visitor-count-app";
	public static final String GET_VISITOR_COUNT_API = "/count";
	public static final String FIELD_USERNAME = "username";
	public static final String GET_HIT_COUNT_BY_USERNAME_API = "/username/{" + FIELD_USERNAME + "}/count";

}
