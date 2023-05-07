package com.geekster.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.ecommerce.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findAllByCategory(String category);

}
