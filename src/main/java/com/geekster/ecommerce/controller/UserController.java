package com.geekster.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.ecommerce.constants.ApiPath;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.response.UserResponse;
import com.geekster.ecommerce.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(ApiPath.USER_API_CREATE_USER)
	public String addUser(@Valid @RequestBody User user) {
		return userService.addUser(user);
	}

	@GetMapping(ApiPath.USER_API_USER_ID_PATH_VARIABLE)
	public UserResponse getUserById(@PathVariable String userId) {
		return userService.getUserById(userId);
	}

}
