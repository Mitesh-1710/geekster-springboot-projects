package com.geekster.user.management.system.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

import com.geekster.user.management.system.model.User;

@Repository
public class UserRepository {

	private Map<Integer, User> users = new HashMap<>();

	public boolean save(User user) {
		users.put(user.getUserId(), user);
		return true;
	}

	public User findById(Integer userId) {
		return users.get(userId);
	}

	public List<User> findAll() {
		return users.entrySet().stream().map(Entry::getValue).toList();
	}

	public boolean update(User user) {
		if (users.containsKey(user.getUserId())) {
			users.put(user.getUserId(), user);
			return true;
		}
		return false;
	}

	public boolean delete(Integer userId) {
		if (users.containsKey(userId)) {
			users.remove(userId);
			return true;
		}
		return false;
	}

}
