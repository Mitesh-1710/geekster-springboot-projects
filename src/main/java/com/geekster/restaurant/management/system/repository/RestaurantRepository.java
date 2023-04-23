package com.geekster.restaurant.management.system.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

import com.geekster.restaurant.management.system.model.Restaurant;

@Repository
public class RestaurantRepository {

	private Map<Integer, Restaurant> restaurantDB = new HashMap<>();

	public boolean save(Restaurant restaurant) {
		restaurantDB.put(restaurant.getRestaurantId(), restaurant);
		return true;
	}

	public Restaurant findById(Integer restaurantId) {
		return restaurantDB.get(restaurantId);
	}

	public List<Restaurant> findAll() {
		return restaurantDB.entrySet().stream().map(Entry::getValue).toList();
	}

	public boolean update(Restaurant restaurant) {
		if (restaurantDB.containsKey(restaurant.getRestaurantId())) {
			restaurantDB.put(restaurant.getRestaurantId(), restaurant);
			return true;
		}
		return false;
	}

	public boolean delete(Integer restaurantId) {
		if (restaurantDB.containsKey(restaurantId)) {
			restaurantDB.remove(restaurantId);
			return true;
		}
		return false;
	}

}
