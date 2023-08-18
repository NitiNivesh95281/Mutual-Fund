package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.Investment;

public interface InvestmentRepository extends CrudRepository<Investment, Number>  {

}
