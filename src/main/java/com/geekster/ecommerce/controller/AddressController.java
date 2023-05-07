package com.geekster.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.ecommerce.constants.ApiPath;
import com.geekster.ecommerce.model.Address;
import com.geekster.ecommerce.service.AddressService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class AddressController {

	@Autowired
	private AddressService addressService;

	@PostMapping(ApiPath.ADDRESS_API_CREATE_ADDRESS)
	public String addAddress(@Valid @RequestBody Address address) {
		return addressService.addAddress(address);
	}

}
