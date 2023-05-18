package com.geekster.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.todo.constants.TodoConstants;
import com.geekster.todo.model.Todo;
import com.geekster.todo.repository.TodoRepository;
import com.geekster.todo.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository userRepository;

	@Override
	public String addTodo(Todo todo) {
		return userRepository.save(todo) ? TodoConstants.TODO_CREATE_RESPONSE : TodoConstants.DATABASE_ERROR;
	}

	@Override
	public List<Todo> getAllTodos() {
		return userRepository.findAll();
	}

	@Override
	public String updateTodo(Todo todo) {
		return userRepository.update(todo) ? TodoConstants.TODO_UPDATE_RESPONSE : TodoConstants.INVALID_TODO_ID;
	}

	@Override
	public String deleteTodo(Integer todoId) {
		return userRepository.delete(todoId) ? TodoConstants.TODO_DELETE_RESPONSE : TodoConstants.INVALID_TODO_ID;
	}

}
