package com.geekster.restaurant.management.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geekster.restaurant.management.system.model.Restaurant;

@Service
public interface RestaurantService {

	public String addRestaurant(Restaurant restaurant);

	public Restaurant getRestaurant(Integer restaurantId);

	public List<Restaurant> getAllRestaurants();

	public String updateRestaurant(Restaurant restaurant);

	public String deleteRestaurant(Integer userId);

}
