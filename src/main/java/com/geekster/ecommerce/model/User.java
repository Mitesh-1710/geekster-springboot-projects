package com.geekster.ecommerce.model;

import com.geekster.ecommerce.constants.EcommerceConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
@Table(name = EcommerceConstants.USER_TABLE_NAME)
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = EcommerceConstants.FIELD_USER_ID)
	private Integer id;

	@NotNull
	@Size(min = 3, message = "User name should have at least 3 characters ")
	@Pattern(regexp = "[A-Z][a-zA-Z]*[ ][A-Z][a-zA-Z]*", message = "User name must follow the pattern 'Firstname Lastname'")
	@Column(name = EcommerceConstants.FIELD_USER_NAME)
	private String name;

	@NotNull
	@Email
	@Column(name = EcommerceConstants.FIELD_USER_EMAIL)
	private String email;

	@NotNull
	@Size(min = 8, message = "User password should have at least 8 characters")
	@Column(name = EcommerceConstants.FIELD_USER_PASSWORD)
	private String password;

	@NotNull
	@Min(value = EcommerceConstants.MIN_NUMBER, message = "User phone number should have at least 12 digits")
	@Max(value = EcommerceConstants.MAX_NUMBER, message = "User phone number should not exceed 12 digits")
	@Column(name = EcommerceConstants.FIELD_USER_PHONE_NUMBER)
	private long phoneNumber;

}
