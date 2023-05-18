package com.geekster.stock.model;

import java.time.LocalDateTime;

import com.geekster.stock.constants.StockConstants;
import com.geekster.stock.enums.StockType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = StockConstants.STOCK_TABLE_NAME)
@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = StockConstants.STOCK_ID)
	private Integer stockId;

	@NotEmpty
	@Size(min = 2, message = "Stock name should have at least 2 characters")
	@Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First letter should be capital")
	@Column(name = StockConstants.STOCK_NAME)
	private String stockName;

	@NotNull
	@Column(name = StockConstants.STOCK_PRICE)
	private Double stockPrice;

	@NotNull
	@Column(name = StockConstants.STOCK_OWNER_COUNT)
	private Integer stockOwnerCount;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = StockConstants.STOCK_TYPE)
	private StockType stockType;

	@NotNull
	@Column(name = StockConstants.STOCK_MARKET_CAP)
	private Double stockMarketCap;

	@NotNull
	@Column(name = StockConstants.STOCK_REGISTERED_ON)
	private LocalDateTime stockRegisteredOn;

}
