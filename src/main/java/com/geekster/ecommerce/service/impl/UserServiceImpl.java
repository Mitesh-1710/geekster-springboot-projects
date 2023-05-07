package com.geekster.ecommerce.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.ecommerce.constants.EcommerceConstants;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.repository.UserRepository;
import com.geekster.ecommerce.response.UserResponse;
import com.geekster.ecommerce.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository employeeRepository;

	@Override
	public String addUser(User user) {
		employeeRepository.save(user);
		return EcommerceConstants.USER_CREATE_RESPONSE;
	}

	@Override
	public UserResponse getUserById(String userId) {
		Optional<User> optionalUser = employeeRepository.findById(Integer.parseInt(userId));
		UserResponse userResponse = new UserResponse();
		if (optionalUser.isPresent()) {
			List<User> users = new ArrayList<>();
			users.add(optionalUser.get());
			userResponse.setUsers(users);
			userResponse.setResponse(EcommerceConstants.USER_GET_RESPONSE);
		} else {
			userResponse.setUsers(null);
			userResponse.setResponse(EcommerceConstants.INVALID_USER_ID_RESPONSE);
		}
		return userResponse;
	}

}
