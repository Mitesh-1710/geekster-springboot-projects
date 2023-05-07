package com.geekster.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.geekster.ecommerce.constants.EcommerceConstants;
import com.geekster.ecommerce.model.Product;
import com.geekster.ecommerce.repository.ProductRepository;
import com.geekster.ecommerce.response.ProductResponse;
import com.geekster.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public String addProduct(Product product) {
		productRepository.save(product);
		return EcommerceConstants.PRODUCT_CREATE_RESPONSE;
	}

	@Override
	public String deleteProductById(String productId) {
		Optional<Product> optionalEmployee = productRepository.findById(Integer.parseInt(productId));
		String response = null;
		if (optionalEmployee.isPresent()) {
			productRepository.deleteById(Integer.parseInt(productId));
			response = EcommerceConstants.PRODUCT_DELETE_RESPONSE;
		} else {
			response = EcommerceConstants.INVALID_PRODUCT_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public ProductResponse getAllProductsByCategory(String category) {
		List<Product> products = productRepository.findAllByCategory(category);
		ProductResponse productResponse = new ProductResponse();
		productResponse.setProducts(products);
		if (!CollectionUtils.isEmpty(products)) {
			productResponse.setResponse(EcommerceConstants.PRODUCT_GET_ALL_RESPONSE);
		} else {
			productResponse.setResponse(EcommerceConstants.NO_DATA_FOUND_RESPONSE);
		}
		return productResponse;
	}

}
