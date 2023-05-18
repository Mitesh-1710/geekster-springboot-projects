package com.geekster.todo.constants;

public class ApiPath {

	private ApiPath() {

	}

	public static final String BASE_API = "api/v1/todo";
	public static final String FIELD_TODO_ID = "todoId";
	public static final String GET_ALL_TODOS_API = "/todos";
	public static final String DELETE_TODO_API = "/{" + FIELD_TODO_ID + "}";

}
