package com.geekster.restaurant.management.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.restaurant.management.system.constants.RestaurantConstants;
import com.geekster.restaurant.management.system.model.Restaurant;
import com.geekster.restaurant.management.system.repository.RestaurantRepository;
import com.geekster.restaurant.management.system.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;

	@Override
	public String addRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant) ? RestaurantConstants.RESTAURANT_CREATE_RESPONSE
				: RestaurantConstants.DATABASE_ERROR;
	}

	@Override
	public Restaurant getRestaurant(Integer restaurantId) {
		return restaurantRepository.findById(restaurantId);
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		return restaurantRepository.findAll();
	}

	@Override
	public String updateRestaurant(Restaurant restaurant) {
		return restaurantRepository.update(restaurant) ? RestaurantConstants.RESTAURANT_UPDATE_RESPONSE
				: RestaurantConstants.INVALID_RESTAURANT_ID;
	}

	@Override
	public String deleteRestaurant(Integer restaurantId) {
		return restaurantRepository.delete(restaurantId) ? RestaurantConstants.RESTAURANT_DELETE_RESPONSE
				: RestaurantConstants.INVALID_RESTAURANT_ID;
	}

}
