package com.geekster.ecommerce.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.ecommerce.constants.EcommerceConstants;
import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.repository.OrderRepository;
import com.geekster.ecommerce.response.OrderResponse;
import com.geekster.ecommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public String addOrder(Order order) {
		orderRepository.save(order);
		return EcommerceConstants.ORDER_CREATE_RESPONSE;
	}

	@Override
	public OrderResponse getOrderById(String orderId) {
		Optional<Order> optionalOrder = orderRepository.findById(Integer.parseInt(orderId));
		OrderResponse orderResponse = new OrderResponse();
		if (optionalOrder.isPresent()) {
			List<Order> orders = new ArrayList<>();
			orders.add(optionalOrder.get());
			orderResponse.setOrders(orders);
			orderResponse.setResponse(EcommerceConstants.ORDER_GET_RESPONSE);
		} else {
			orderResponse.setOrders(null);
			orderResponse.setResponse(EcommerceConstants.INVALID_ORDER_ID_RESPONSE);
		}
		return orderResponse;
	}

}
