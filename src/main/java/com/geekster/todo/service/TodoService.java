package com.geekster.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geekster.todo.model.Todo;

@Service
public interface TodoService {

	public String addTodo(Todo todo);

	public List<Todo> getAllTodos();

	public String updateTodo(Todo todo);

	public String deleteTodo(Integer todoId);

}
