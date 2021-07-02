package com.example.ujianspringbootweek4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ujianspringbootweek4.entity.CompanyBudget;

@Repository
public interface CompanyBudgetRepository extends JpaRepository<CompanyBudget, Integer>{

	@Query(value = "SELECT * FROM `company_budget` where amount > 5000000;", nativeQuery = true)
	public List<CompanyBudget> findHighBudget();
}
