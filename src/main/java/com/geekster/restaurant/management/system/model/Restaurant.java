package com.geekster.restaurant.management.system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Restaurant {

	private Integer restaurantId;
	private String restaurantName;
	private String restaurantCode;
	private String address;
	private Integer phoneNumber;
	private Integer totalStaff;
	private String specialty;
	private String rating;
	private String openTime;
	private String closeTime;
	private String restaurantWebsite;

}
