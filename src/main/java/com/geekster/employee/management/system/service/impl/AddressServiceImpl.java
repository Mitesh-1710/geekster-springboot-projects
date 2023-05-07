package com.geekster.employee.management.system.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.geekster.employee.management.system.constants.EmployeeManagementSystemConstants;
import com.geekster.employee.management.system.model.Address;
import com.geekster.employee.management.system.repository.AddressRepository;
import com.geekster.employee.management.system.response.AddressResponse;
import com.geekster.employee.management.system.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public String addAddress(Address address) {
		addressRepository.save(address);
		return EmployeeManagementSystemConstants.ADDRESS_CREATE_RESPONSE;
	}

	@Override
	public String updateAddressById(String addressId, Address address) {
		Optional<Address> optionalAddress = addressRepository.findById(Long.parseLong(addressId));
		String response = null;
		if (optionalAddress.isPresent()) {
			Address updatedAddress = optionalAddress.get();
			updatedAddress = updatedAddress.toBuilder().street(address.getStreet()).city(address.getCity())
					.state(address.getState()).zipcode(address.getZipcode()).build();
			addressRepository.save(updatedAddress);
			response = EmployeeManagementSystemConstants.ADDRESS_UPDATE_RESPONSE;
		} else {
			response = EmployeeManagementSystemConstants.INVALID_ADDRESS_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public String deleteAddressById(String addressId) {
		Optional<Address> optionalAddress = addressRepository.findById(Long.parseLong(addressId));
		String response = null;
		if (optionalAddress.isPresent()) {
			addressRepository.deleteById(Long.parseLong(addressId));
			response = EmployeeManagementSystemConstants.ADDRESS_DELETE_RESPONSE;
		} else {
			response = EmployeeManagementSystemConstants.INVALID_ADDRESS_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public AddressResponse getAllAddresses() {
		List<Address> addresses = addressRepository.findAll();
		AddressResponse addressResponse = new AddressResponse();
		addressResponse.setAddresses(addresses);
		if (!CollectionUtils.isEmpty(addresses)) {
			addressResponse.setResponse(EmployeeManagementSystemConstants.ADDRESS_GET_ALL_RESPONSE);
		} else {
			addressResponse.setResponse(EmployeeManagementSystemConstants.NO_DATA_FOUND_RESPONSE);
		}
		return addressResponse;
	}

	@Override
	public AddressResponse getAddressById(String addressId) {
		Optional<Address> optionalAddress = addressRepository.findById(Long.parseLong(addressId));
		AddressResponse addressResponse = new AddressResponse();
		if (optionalAddress.isPresent()) {
			List<Address> addresses = new ArrayList<>();
			addresses.add(optionalAddress.get());
			addressResponse.setAddresses(addresses);
			addressResponse.setResponse(EmployeeManagementSystemConstants.ADDRESS_GET_RESPONSE);
		} else {
			addressResponse.setAddresses(null);
			addressResponse.setResponse(EmployeeManagementSystemConstants.INVALID_ADDRESS_ID_RESPONSE);
		}
		return addressResponse;
	}

}
