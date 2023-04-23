package com.geekster.restaurant.management.system.controller;

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

import com.geekster.restaurant.management.system.constants.ApiPath;
import com.geekster.restaurant.management.system.model.Restaurant;
import com.geekster.restaurant.management.system.service.RestaurantService;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@PostMapping(ApiPath.CREATE_RESTAURANT_API)
	public String addRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.addRestaurant(restaurant);
	}

	@GetMapping(ApiPath.GET_RESTAURANT_BY_RESTAURANT_ID_API)
	public Restaurant getRestaurant(@PathVariable Integer restaurantId) {
		return restaurantService.getRestaurant(restaurantId);
	}

	@GetMapping(ApiPath.GET_ALL_RESTAURANT_API)
	public List<Restaurant> getAllRestaurants() {
		return restaurantService.getAllRestaurants();
	}

	@PutMapping(ApiPath.UPDATE_RESTAURANT_API)
	public String updateRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.updateRestaurant(restaurant);

	}

	@DeleteMapping(ApiPath.DELETE_RESTAURANT_API)
	public String deleteRestaurant(@PathVariable Integer restaurantId) {
		return restaurantService.deleteRestaurant(restaurantId);
	}

}
