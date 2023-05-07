package com.geekster.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.ecommerce.constants.ApiPath;
import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.response.OrderResponse;
import com.geekster.ecommerce.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping(ApiPath.ORDER_API_CREATE_ORDER)
	public String addOrder(@Valid @RequestBody Order order) {
		return orderService.addOrder(order);
	}

	@GetMapping(ApiPath.ORDER_API_ORDER_ID_PATH_VARIABLE)
	public OrderResponse getOrderById(@PathVariable String orderId) {
		return orderService.getOrderById(orderId);
	}

}
