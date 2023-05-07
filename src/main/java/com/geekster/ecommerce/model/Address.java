package com.geekster.ecommerce.model;

import com.geekster.ecommerce.constants.EcommerceConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = EcommerceConstants.ADDRESS_TABLE_NAME)
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = EcommerceConstants.FIELD_ADDRESS_ID)
	private Integer id;

	@NotNull
	@Size(min = 2, message = "Address name should have at least 2 characters")
	@Column(name = EcommerceConstants.FIELD_ADDRESS_NAME)
	private String name;

	@NotNull
	@Size(min = 2, message = "Address landmark should have at least 2 characters")
	@Column(name = EcommerceConstants.FIELD_ADDRESS_LANDMARK)
	private String landmark;

	@NotNull
	@Min(value = EcommerceConstants.MIN_NUMBER, message = "Address phone number should have at least 12 digits")
	@Max(value = EcommerceConstants.MAX_NUMBER, message = "Address phone number should not exceed 12 digits")
	@Column(name = EcommerceConstants.FIELD_ADDRESS_PHONE_NUMBER)
	private long phoneNumber;

	@NotNull
	@Size(min = 5, message = "Zipcode should have at least 5 characters")
	@Column(name = EcommerceConstants.FIELD_ADDRESS_ZIPCODE)
	private String zipcode;

	@NotNull
	@Column(name = EcommerceConstants.FIELD_ADDRESS_STATE)
	private String state;

	@NotNull
	@OneToOne
	@JoinColumn(name = EcommerceConstants.FIELD_ADDRESS_USER, referencedColumnName = EcommerceConstants.FIELD_USER_ID)
	private User user;
}
