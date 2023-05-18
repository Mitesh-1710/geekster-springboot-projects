package com.geekster.stock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geekster.stock.model.Stock;
import com.geekster.stock.response.StockResponse;

@Service
public interface StockService {

	public String addStocks(List<Stock> stocks);
	
	public StockResponse getStocksByType(String stockType);

	public StockResponse getStocksAbovePriceAndLowerDate(Double price, String date);
	
	public StockResponse getAllStocksAboveMarketCap(Double capPercentage) ;

	public String updateMarketCap(Double marketCap, Integer stockId);
	
	public String deleteStocksBasedOnCount(Integer count);
	
	public String updateTypeById(String stockType, Integer stockId);
	
	public String updateStockById(Integer id, Stock stock);



}
