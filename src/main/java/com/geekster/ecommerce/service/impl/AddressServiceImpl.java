package com.geekster.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.ecommerce.constants.EcommerceConstants;
import com.geekster.ecommerce.model.Address;
import com.geekster.ecommerce.repository.AddressRepository;
import com.geekster.ecommerce.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public String addAddress(Address address) {
		addressRepository.save(address);
		return EcommerceConstants.ADDRESS_CREATE_RESPONSE;
	}

}
