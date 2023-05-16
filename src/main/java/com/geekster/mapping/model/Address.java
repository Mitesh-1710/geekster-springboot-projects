package com.geekster.mapping.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {

	@Column(name="landmark",nullable=false)
    private String landmark;
	
	@Column(name="zipcode",nullable=false)
    private String zipcode;
	
	@Column(name="district",nullable=false)
    private String district;
	
	@Column(name="state",nullable=false)
    private String state;
	
	@Column(name="country",nullable=false)
    private String country;
	
}
