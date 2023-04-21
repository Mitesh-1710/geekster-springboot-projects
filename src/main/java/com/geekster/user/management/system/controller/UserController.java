package com.geekster.user.management.system.controller;

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

import com.geekster.user.management.system.constants.ApiPath;
import com.geekster.user.management.system.model.User;
import com.geekster.user.management.system.service.UserService;

@RestController
@RequestMapping(ApiPath.BASE_URL)
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(ApiPath.CREATE_USER_API)
	public String addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@GetMapping(ApiPath.GET_USER_BY_USER_ID_API)
	public User getUser(@PathVariable Integer userId) {
		return userService.getUser(userId);
	}

	@GetMapping(ApiPath.GET_ALL_USER_API)
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@PutMapping(ApiPath.UPDATE_USER_API)
	public String updateUser(@RequestBody User user) {
		return userService.updateUser(user);

	}

	@DeleteMapping(ApiPath.DELETE_USER_API)
	public String deleteUser(@PathVariable Integer userId) {
		return userService.deleteUser(userId);
	}

}
