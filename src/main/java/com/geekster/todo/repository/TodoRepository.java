package com.geekster.todo.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

import com.geekster.todo.model.Todo;

@Repository
public class TodoRepository {

	private Map<Integer, Todo> todos = new HashMap<>();

	public boolean save(Todo todo) {
		todos.put(todo.getTodoId(), todo);
		return true;
	}

	public List<Todo> findAll() {
		return todos.entrySet().stream().map(Entry::getValue).toList();
	}

	public boolean update(Todo todo) {
		if (todos.containsKey(todo.getTodoId())) {
			todos.put(todo.getTodoId(), todo);
			return true;
		}
		return false;
	}

	public boolean delete(Integer todoId) {
		if (todos.containsKey(todoId)) {
			todos.remove(todoId);
			return true;
		}
		return false;
	}

}
