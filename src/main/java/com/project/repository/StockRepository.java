package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer> {
	
	@Query("SELECT s FROM Stock s WHERE TO_CHAR(s.stockId) LIKE '%1'")
	List<Stock> findStocksByCustomQuery();

}
