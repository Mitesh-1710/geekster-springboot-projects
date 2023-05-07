package com.geekster.ecommerce.constants;

public class EcommerceConstants {

	private EcommerceConstants() {

	}

	public static final String NO_DATA_FOUND_RESPONSE = "No data found!";
	
	// User
	public static final String USER_TABLE_NAME = "user";
	public static final String FIELD_USER_ID = "id";
	public static final String FIELD_USER_NAME = "name";
	public static final String FIELD_USER_EMAIL = "email";
	public static final String FIELD_USER_PASSWORD = "password";
	public static final String FIELD_USER_PHONE_NUMBER = "phone_number";
	
	public static final long MAX_NUMBER = 999999999999l;
	public static final long MIN_NUMBER = 111111111111l;

	public static final String USER_CREATE_RESPONSE = "User added sucessfully!";
	public static final String USER_GET_RESPONSE = "User retrived sucessfully!";
	public static final String INVALID_USER_ID_RESPONSE = "Invalid User Id!";

	// Product
	public static final String PRODUCT_TABLE_NAME = "product";
	public static final String FIELD_PRODUCT_ID = "id";
	public static final String FIELD_PRODUCT_NAME = "name";
	public static final String FIELD_PRODUCT_PRICE = "price";
	public static final String FIELD_PRODUCT_DESCRIPTION = "description";
	public static final String FIELD_PRODUCT_CATEGORY = "category";
	public static final String FIELD_PRODUCT_BRAND = "brand";

	public static final String PRODUCT_CREATE_RESPONSE = "Product added sucessfully!";
	public static final String PRODUCT_GET_ALL_RESPONSE = "Products retrived sucessfully!";
	public static final String PRODUCT_DELETE_RESPONSE = "Product deleted sucessfully!";
	public static final String INVALID_PRODUCT_ID_RESPONSE = "Invalid Product Id!";

	// Address
	public static final String ADDRESS_TABLE_NAME = "address";
	public static final String FIELD_ADDRESS_ID = "id";
	public static final String FIELD_ADDRESS_NAME = "name";
	public static final String FIELD_ADDRESS_LANDMARK = "landmark";
	public static final String FIELD_ADDRESS_PHONE_NUMBER = "phone_number";
	public static final String FIELD_ADDRESS_ZIPCODE = "zipcode";
	public static final String FIELD_ADDRESS_STATE = "state";
	public static final String FIELD_ADDRESS_USER = "user_id";

	public static final String ADDRESS_CREATE_RESPONSE = "Address added sucessfully!";

	// Order
	public static final String ORDER_TABLE_NAME = "[order]";
	public static final String FIELD_ORDER_ID = "id";
	public static final String FIELD_ORDER_USER = "user_id";
	public static final String FIELD_ORDER_PRODUCT = "product_id";
	public static final String FIELD_ORDER_ADDRESS = "address_id";
	public static final String FIELD_ORDER_PRODUCT_QUANTITY = "product_quantity";

	public static final String ORDER_CREATE_RESPONSE = "Order added sucessfully!";
	public static final String ORDER_GET_RESPONSE = "Order retrived sucessfully!";
	public static final String INVALID_ORDER_ID_RESPONSE = "Invalid Order Id!";


}
