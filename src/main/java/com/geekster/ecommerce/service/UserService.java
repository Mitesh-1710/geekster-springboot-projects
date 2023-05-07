package com.geekster.ecommerce.service;

import org.springframework.stereotype.Service;

import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.response.UserResponse;

@Service
public interface UserService {

	public String addUser(User user);

	public UserResponse getUserById(String userId);

}
