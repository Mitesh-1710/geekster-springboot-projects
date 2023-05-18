package com.geekster.stock.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.geekster.stock.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

	public List<Stock> findAllByStockType(String stockType);

	public List<Stock> findByStockPriceGreaterThanAndStockRegisteredOnLessThanOrderByStockName(Double price,
			LocalDateTime date);

	@Query(value = "select * from stock where market_cap > :capPercentage", nativeQuery = true)
	public List<Stock> findAllStocksAboveMarketCap(Double capPercentage);

	@Modifying
	@Query(value = "Delete from stock where owner_count <= :clientCount", nativeQuery = true)
	public void deleteStocksBasedOnCount(Integer clientCount);

}
