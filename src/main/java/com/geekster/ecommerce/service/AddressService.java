package com.geekster.ecommerce.service;

import org.springframework.stereotype.Service;

import com.geekster.ecommerce.model.Address;

@Service
public interface AddressService {

	public String addAddress(Address address);

}
