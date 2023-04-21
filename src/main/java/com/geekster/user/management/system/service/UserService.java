package com.geekster.user.management.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geekster.user.management.system.model.User;

@Service
public interface UserService {

	public String addUser(User user);

	public User getUser(Integer userId);

	public List<User> getAllUser();

	public String updateUser(User user);

	public String deleteUser(Integer userId);

}
