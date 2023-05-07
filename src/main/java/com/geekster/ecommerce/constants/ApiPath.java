package com.geekster.ecommerce.constants;

public class ApiPath {

	private ApiPath() {

	}

	public static final String BASE_API = "api/v1/ecommerce";

	// User
	public static final String USER_API_CREATE_USER = "/user";
	public static final String FIELD_USER_ID = "userId";
	public static final String USER_API_USER_ID_PATH_VARIABLE = USER_API_CREATE_USER + "/{"
			+ FIELD_USER_ID + "}";

	// Address
	public static final String ADDRESS_API_CREATE_ADDRESS = "/address";
	
	// Product
	public static final String PRODUCT_API_CREATE_PRODUCT = "/product";
	public static final String PRODUCT_API_GET_ALL_PRODUCT = "/products";
	public static final String FIELD_PRODUCT_ID = "productId";
	public static final String PRODUCT_API_PRODUCT_ID_PATH_VARIABLE = PRODUCT_API_CREATE_PRODUCT + "/{"
			+ FIELD_PRODUCT_ID + "}";
		
	// Order
	public static final String ORDER_API_CREATE_ORDER = "/order";
	public static final String FIELD_ORDER_ID = "orderId";
	public static final String ORDER_API_ORDER_ID_PATH_VARIABLE = ORDER_API_CREATE_ORDER + "/{"
			+ FIELD_ORDER_ID + "}";

}