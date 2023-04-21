package com.geekster.user.management.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.user.management.system.constants.UserManagementSystemConstants;
import com.geekster.user.management.system.model.User;
import com.geekster.user.management.system.repository.UserRepository;
import com.geekster.user.management.system.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String addUser(User user) {
		return userRepository.save(user) ? UserManagementSystemConstants.USER_CREATE_RESPONSE
				: UserManagementSystemConstants.DATABASE_ERROR;
	}

	@Override
	public User getUser(Integer userId) {
		return userRepository.findById(userId);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public String updateUser(User user) {
		return userRepository.update(user) ? UserManagementSystemConstants.USER_UPDATE_RESPONSE
				: UserManagementSystemConstants.INVALID_USER_ID;
	}

	@Override
	public String deleteUser(Integer userId) {
		return userRepository.delete(userId) ? UserManagementSystemConstants.USER_DELETE_RESPONSE
				: UserManagementSystemConstants.INVALID_USER_ID;
	}

}
