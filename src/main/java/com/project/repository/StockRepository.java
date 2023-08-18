package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer> {

}
