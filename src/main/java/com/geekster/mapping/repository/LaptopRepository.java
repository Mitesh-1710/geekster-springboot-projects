package com.geekster.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.mapping.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, String> {
}
