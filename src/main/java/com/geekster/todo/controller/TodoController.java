package com.geekster.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.todo.constants.ApiPath;
import com.geekster.todo.model.Todo;
import com.geekster.todo.service.TodoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class TodoController {

	@Autowired
	private TodoService userService;

	@PostMapping
	public String addTodo(@Valid @RequestBody Todo todo) {
		return userService.addTodo(todo);
	}

	@GetMapping(ApiPath.GET_ALL_TODOS_API)
	public List<Todo> getAllTodo() {
		return userService.getAllTodos();
	}

	@PutMapping
	public String updateTodo(@Valid @RequestBody Todo todo) {
		return userService.updateTodo(todo);

	}

	@DeleteMapping(ApiPath.DELETE_TODO_API)
	public String deleteTodo(@PathVariable Integer todoId) {
		return userService.deleteTodo(todoId);
	}

}
