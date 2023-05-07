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
import jakarta.validation.constraints.NotNull;
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
@Table(name = EcommerceConstants.ORDER_TABLE_NAME)
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = EcommerceConstants.FIELD_ORDER_ID)
	private Integer id;

	@NotNull
	@OneToOne
	@JoinColumn(name = EcommerceConstants.FIELD_ORDER_USER, referencedColumnName = EcommerceConstants.FIELD_USER_ID)
	private User user;

	@NotNull
	@OneToOne
	@JoinColumn(name = EcommerceConstants.FIELD_ORDER_ADDRESS, referencedColumnName = EcommerceConstants.FIELD_ADDRESS_ID)
	private Address address;

	@NotNull
	@OneToOne
	@JoinColumn(name = EcommerceConstants.FIELD_ORDER_PRODUCT, referencedColumnName = EcommerceConstants.FIELD_PRODUCT_ID)
	private Product product;

	@NotNull
	@Column(name = EcommerceConstants.FIELD_ORDER_PRODUCT_QUANTITY)
	private Integer productQuantity;

}
