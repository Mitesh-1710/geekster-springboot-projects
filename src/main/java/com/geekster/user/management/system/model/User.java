package com.geekster.user.management.system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

	private Integer userId;
	private String userName;
	private String address;
	private Integer phoneNumber;

}
