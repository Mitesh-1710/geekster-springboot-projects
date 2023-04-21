package com.geekster.user.management.system.constants;

public class ApiPath {

	private ApiPath() {

	}

	public static final String BASE_URL = "api/v1/user";
	public static final String CREATE_USER_API = "/addUser";
	public static final String FIELD_USER_ID = "userId";
	public static final String GET_USER_BY_USER_ID_API = "/getUser/{" + FIELD_USER_ID + "}";
	public static final String GET_ALL_USER_API = "/getAllUser";
	public static final String UPDATE_USER_API = "/updateUserInfo";
	public static final String DELETE_USER_API = "/deleteUser/{" + FIELD_USER_ID + "}";

}
