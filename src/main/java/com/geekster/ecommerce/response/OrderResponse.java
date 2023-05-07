package com.geekster.ecommerce.response;

import java.util.List;

import com.geekster.ecommerce.model.Order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {

	private String response;
	private List<Order> orders;

}
