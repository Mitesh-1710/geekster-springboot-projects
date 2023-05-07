package com.geekster.employee.management.system.service;

import org.springframework.stereotype.Service;

import com.geekster.employee.management.system.model.Address;
import com.geekster.employee.management.system.response.AddressResponse;

@Service
public interface AddressService {

	public String addAddress(Address address);

	public String updateAddressById(String addressId, Address address);

	public String deleteAddressById(String addressId);

	public AddressResponse getAllAddresses();

	public AddressResponse getAddressById(String addressId);

}
