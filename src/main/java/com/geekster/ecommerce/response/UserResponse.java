package com.geekster.ecommerce.response;

import java.util.List;

import com.geekster.ecommerce.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

	private String response;
	private List<User> users;
	
}
