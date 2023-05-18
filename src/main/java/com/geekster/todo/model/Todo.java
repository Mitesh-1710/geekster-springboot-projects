package com.geekster.todo.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Todo {

	@NotNull
	private Integer todoId;

	@NotNull
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String todoName;

	@NotNull
	private boolean todoStatus;

}
