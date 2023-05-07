package com.geekster.employee.management.system.response;

import java.util.List;

import com.geekster.employee.management.system.model.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {

	private String response;
	private List<Address> addresses;

}
