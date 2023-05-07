package com.geekster.ecommerce.model;

import com.geekster.ecommerce.constants.EcommerceConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = EcommerceConstants.PRODUCT_TABLE_NAME)
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = EcommerceConstants.FIELD_PRODUCT_ID)
	private Integer id;

	@NotNull
	@Size(min = 3, message = "Product name should have at least 3 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = EcommerceConstants.FIELD_PRODUCT_NAME)
	private String name;

	@NotNull
	@Column(name = EcommerceConstants.FIELD_PRODUCT_PRICE)
	private Integer price;

	@NotNull
	@Size(min = 10, message = "Product description should have at least 10 characters")
	@Column(name = EcommerceConstants.FIELD_PRODUCT_DESCRIPTION)
	private String description;

	@NotNull
	@Size(min = 3, message = "Product category should have at least 3 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = EcommerceConstants.FIELD_PRODUCT_CATEGORY)
	private String category;

	@NotNull
	@Size(min = 3, message = "Product brand should have at least 3 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = EcommerceConstants.FIELD_PRODUCT_BRAND)
	private String brand;

}
