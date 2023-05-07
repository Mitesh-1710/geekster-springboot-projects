package com.geekster.employee.management.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.employee.management.system.constants.ApiPath;
import com.geekster.employee.management.system.model.Address;
import com.geekster.employee.management.system.response.AddressResponse;
import com.geekster.employee.management.system.service.AddressService;

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

	@PutMapping(ApiPath.ADDRESS_API_ADDRESS_ID_PATH_VARIABLE)
	public String updateAddressById(@PathVariable String addressId, @Valid @RequestBody Address address) {
		return addressService.updateAddressById(addressId, address);
	}

	@DeleteMapping(ApiPath.ADDRESS_API_ADDRESS_ID_PATH_VARIABLE)
	public String deleteAddressById(@PathVariable String addressId) {
		return addressService.deleteAddressById(addressId);
	}

	@GetMapping(ApiPath.ADDRESS_API_GET_ALL_ADDRESS)
	public AddressResponse getAllAddresses() {
		return addressService.getAllAddresses();
	}

	@GetMapping(ApiPath.ADDRESS_API_ADDRESS_ID_PATH_VARIABLE)
	public AddressResponse getAddressById(@PathVariable String addressId) {
		return addressService.getAddressById(addressId);
	}

}
