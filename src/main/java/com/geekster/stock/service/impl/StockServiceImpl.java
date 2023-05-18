package com.geekster.stock.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.stock.constants.StockConstants;
import com.geekster.stock.enums.StockType;
import com.geekster.stock.model.Stock;
import com.geekster.stock.repository.StockRepository;
import com.geekster.stock.response.StockResponse;
import com.geekster.stock.service.StockService;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;

	@Override
	public String addStocks(List<Stock> stocks) {
		stockRepository.saveAll(stocks);
		return StockConstants.STOCK_CREATE_RESPONSE;
	}

	@Override
	public StockResponse getStocksByType(String stockType) {
		StockResponse stockResponse = new StockResponse();
		List<Stock> stocks = stockRepository.findAllByStockType(stockType);
		stockResponse.setStocks(stocks);
		if (stocks.isEmpty()) {
			stockResponse.setResponse(StockConstants.DATA_NOT_FOUND_RESPONSE);
		} else {
			stockResponse.setResponse(StockConstants.STOCK_GET_ALL_RESPONSE);
		}
		return stockResponse;
	}

	@Override
	public StockResponse getStocksAbovePriceAndLowerDate(Double price, String date) {
		LocalDateTime parsedDate = LocalDateTime.parse(date);
		List<Stock> stocks = stockRepository
				.findByStockPriceGreaterThanAndStockRegisteredOnLessThanOrderByStockName(price, parsedDate);
		StockResponse stockResponse = new StockResponse();
		stockResponse.setStocks(stocks);
		if (stocks.isEmpty()) {
			stockResponse.setResponse(StockConstants.DATA_NOT_FOUND_RESPONSE);
		} else {
			stockResponse.setResponse(StockConstants.STOCK_GET_ALL_RESPONSE);
		}
		return stockResponse;
	}

	@Override
	public StockResponse getAllStocksAboveMarketCap(Double capPercentage) {
		List<Stock> stocks = stockRepository.findAllStocksAboveMarketCap(capPercentage);
		StockResponse stockResponse = new StockResponse();
		stockResponse.setStocks(stocks);
		if (stocks.isEmpty()) {
			stockResponse.setResponse(StockConstants.DATA_NOT_FOUND_RESPONSE);
		} else {
			stockResponse.setResponse(StockConstants.STOCK_GET_ALL_RESPONSE);
		}
		return stockResponse;
	}

	@Override
	public String updateMarketCap(Double marketCap, Integer stockId) {
		String response = "";
		Optional<Stock> optionalStock = stockRepository.findById(stockId);
		if (optionalStock.isPresent()) {
			Stock stock = optionalStock.get();
			stock.setStockMarketCap(marketCap);
			stockRepository.save(stock);
			response = StockConstants.STOCK_UPDATE_RESPONSE;
		} else {
			response = StockConstants.INVALID_STOCK_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public String deleteStocksBasedOnCount(Integer count) {
		stockRepository.deleteStocksBasedOnCount(count);
		return StockConstants.STOCK_DELETE_RESPONSE;
	}

	@Override
	public String updateTypeById(String stockType, Integer stockId) {
		Optional<Stock> optionalStock = stockRepository.findById(stockId);
		String response = null;
		if (EnumUtils.isValidEnum(StockType.class, stockType)) {
			if (optionalStock.isPresent()) {
				Stock stock = optionalStock.get();
				stock.setStockType(StockType.valueOf(stockType));
				stockRepository.save(stock);
				response = StockConstants.STOCK_UPDATE_RESPONSE;
			} else {
				response = StockConstants.INVALID_STOCK_ID_RESPONSE;
			}
		} else {
			response = StockConstants.STOCK_TYPE_DOES_NOT_EXISTS_RESPONSE;
		}
		return response;
	}

	@Override
	public String updateStockById(Integer stockId, Stock stock) {
		String response = "";
		Optional<Stock> optionalStock = stockRepository.findById(stockId);
		if (optionalStock.isPresent()) {
			Stock updatedStock = optionalStock.get();
			updatedStock.setStockMarketCap(stock.getStockMarketCap());
			updatedStock.setStockName(stock.getStockName());
			updatedStock.setStockOwnerCount(stock.getStockOwnerCount());
			updatedStock.setStockPrice(stock.getStockPrice());
			updatedStock.setStockRegisteredOn(stock.getStockRegisteredOn());
			updatedStock.setStockType(stock.getStockType());
			stockRepository.save(stock);
			response = StockConstants.STOCK_UPDATE_RESPONSE;
		} else {
			response = StockConstants.INVALID_STOCK_ID_RESPONSE;
		}
		return response;
	}

}
