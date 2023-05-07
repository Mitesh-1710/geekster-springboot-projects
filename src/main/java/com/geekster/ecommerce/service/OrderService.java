package com.geekster.ecommerce.service;

import org.springframework.stereotype.Service;

import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.response.OrderResponse;

@Service
public interface OrderService {

	public String addOrder(Order order);

	public OrderResponse getOrderById(String orderId);

}
