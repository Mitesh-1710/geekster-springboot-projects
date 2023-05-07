package com.geekster.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.ecommerce.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
