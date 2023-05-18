package com.geekster.stock.constants;

public class ApiPath {

	private ApiPath() {

	}

	public static final String BASE_API = "api/v1/stock";
	public static final String STOCK_CREATE_API = "/stocks";
	public static final String FIELD_STOCK_TYPE = "stockType";
	public static final String FIELD_STOCK_PRICE = "price";
	public static final String FIELD_STOCK_DATE = "date";
	public static final String FIELD_STOCK_CAP_PERCENTAGE = "capPercentage";
	public static final String FIELD_STOCK_MARKET_CAP = "marketCap";
	public static final String FIELD_STOCK_ID = "stockId";
	public static final String FIELD_STOCK_COUNT = "count";
	public static final String STOCK_API_STOCK_TYPE_PATH_VARIABLE = "/stock-type/{" + FIELD_STOCK_TYPE + "}";
	public static final String STOCK_API_GET_STOCKS_PATH_VARIABLE = "/price/{" + FIELD_STOCK_PRICE + "}/date/{" + FIELD_STOCK_DATE + "}";
	public static final String STOCK_API_STOCK_CAP_PERCENTAGE_PATH_VARIABLE = "/cap-percentage/{" + FIELD_STOCK_CAP_PERCENTAGE + "}";
	public static final String STOCK_API_UPDATE_STOCK_PATH_VARIABLES = "/{" + FIELD_STOCK_ID + "}"+"/market-cap/{" + FIELD_STOCK_MARKET_CAP + "}";
	public static final String STOCK_API_STOCK_COUNT_VARIABLE = "/stock-count/{" + FIELD_STOCK_COUNT + "}";
	public static final String STOCK_API_UPDATE_STOCK_BY_TYPE_PATH_VARIABLES = "/{" + FIELD_STOCK_ID + "}"+ STOCK_API_STOCK_TYPE_PATH_VARIABLE;
	public static final String STOCK_API_STOCK_ID_PATH_VARIABLE = "/{" + FIELD_STOCK_ID + "}";
	
}