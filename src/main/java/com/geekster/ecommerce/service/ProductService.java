package com.geekster.ecommerce.service;

import org.springframework.stereotype.Service;

import com.geekster.ecommerce.model.Product;
import com.geekster.ecommerce.response.ProductResponse;

@Service
public interface ProductService {

	public String addProduct(Product product);

	public String deleteProductById(String productId);

	public ProductResponse getAllProductsByCategory(String category);

}
