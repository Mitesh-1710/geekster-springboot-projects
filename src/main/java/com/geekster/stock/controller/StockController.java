package com.geekster.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.stock.constants.ApiPath;
import com.geekster.stock.model.Stock;
import com.geekster.stock.response.StockResponse;
import com.geekster.stock.service.StockService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class StockController {

	@Autowired
	private StockService studentService;

	@PostMapping(ApiPath.STOCK_CREATE_API)
	public String addStocks(@Valid @RequestBody List<Stock> stocks) {
		return studentService.addStocks(stocks);
	}

	@GetMapping(ApiPath.STOCK_API_STOCK_TYPE_PATH_VARIABLE)
	public StockResponse getStocksByType(@PathVariable String stockType) {
		return studentService.getStocksByType(stockType);
	}

	@GetMapping(ApiPath.STOCK_API_GET_STOCKS_PATH_VARIABLE)
	public StockResponse getStocksAbovePriceAndLowerDate(@PathVariable Double price, @PathVariable String date) {
		return studentService.getStocksAbovePriceAndLowerDate(price, date);
	}

	@GetMapping(ApiPath.STOCK_API_STOCK_CAP_PERCENTAGE_PATH_VARIABLE)
	public StockResponse getAllStocksAboveMarketCap(@PathVariable Double capPercentage) {
		return studentService.getAllStocksAboveMarketCap(capPercentage);
	}

	@PutMapping(ApiPath.STOCK_API_UPDATE_STOCK_PATH_VARIABLES)
	public String updateMarketCap(@PathVariable Integer stockId,@PathVariable Double marketCap) {
		return studentService.updateMarketCap(marketCap, stockId);
	}

	@DeleteMapping(ApiPath.STOCK_API_STOCK_COUNT_VARIABLE)
	public String deleteStocksBasedOnCount(@PathVariable Integer count) {
		return studentService.deleteStocksBasedOnCount(count);
	}

	@PutMapping(ApiPath.STOCK_API_UPDATE_STOCK_BY_TYPE_PATH_VARIABLES)
	public String updateTypeById (@PathVariable Integer stockId , @PathVariable String stockType) {
		return studentService.updateTypeById(stockType, stockId);
	}

	@PutMapping(ApiPath.STOCK_API_STOCK_ID_PATH_VARIABLE)
	public String updateStockById(@PathVariable Integer stockId, @Valid @RequestBody Stock stock) {
		return studentService.updateStockById(stockId, stock);
	}

}
