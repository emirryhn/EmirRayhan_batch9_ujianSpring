package com.example.ujianspringbootweek4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringbootweek4.entity.Company;
import com.example.ujianspringbootweek4.entity.CompanyBudget;
import com.example.ujianspringbootweek4.service.CompanyBudgetService;

@RestController
public class CompanyBudgetController {

	@Autowired
	private CompanyBudgetService companyBudgetService;
	
	@PostMapping("/saveCompaniesBudget")
	public List<CompanyBudget> saveCompaniesBudget(@RequestBody List<CompanyBudget> budget){
		return companyBudgetService.saveCompaniesBudget(budget);
	}
	
	@GetMapping("/findhHighBudget")
	public List<CompanyBudget> findHighBudget(){
		return companyBudgetService.findhHighBudget();
	}
	
}
