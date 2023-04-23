package com.geekster.restaurant.management.system.constants;

public class ApiPath {

	private ApiPath() {

	}

	public static final String BASE_API = "api/v1/restaurant";
	public static final String CREATE_RESTAURANT_API = "/restaurant";
	public static final String FIELD_RESTAURANT_ID = "restaurantId";
	public static final String GET_RESTAURANT_BY_RESTAURANT_ID_API = "/restaurant/{" + FIELD_RESTAURANT_ID + "}";
	public static final String GET_ALL_RESTAURANT_API = "/restaurants";
	public static final String UPDATE_RESTAURANT_API = "/restaurant";
	public static final String DELETE_RESTAURANT_API = "/restaurant/{" + FIELD_RESTAURANT_ID + "}";

}
