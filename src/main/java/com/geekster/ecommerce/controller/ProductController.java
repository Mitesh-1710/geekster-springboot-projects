package com.geekster.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.ecommerce.constants.ApiPath;
import com.geekster.ecommerce.model.Product;
import com.geekster.ecommerce.response.ProductResponse;
import com.geekster.ecommerce.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(ApiPath.PRODUCT_API_CREATE_PRODUCT)
	public String addProduct(@Valid @RequestBody Product product) {
		return productService.addProduct(product);
	}

	@DeleteMapping(ApiPath.PRODUCT_API_PRODUCT_ID_PATH_VARIABLE)
	public String deleteProductById(@PathVariable String productId) {
		return productService.deleteProductById(productId);
	}

	@GetMapping(ApiPath.PRODUCT_API_GET_ALL_PRODUCT)
	public ProductResponse getAllProductsByCategory(@RequestParam String category) {
		return productService.getAllProductsByCategory(category);
	}

}
