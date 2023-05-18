package com.geekster.stock.response;

import java.util.List;

import com.geekster.stock.model.Stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StockResponse {

	private String response;
	private List<Stock> stocks;
	
}
