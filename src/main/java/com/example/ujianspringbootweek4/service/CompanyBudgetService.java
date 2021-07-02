package com.example.ujianspringbootweek4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringbootweek4.entity.Company;
import com.example.ujianspringbootweek4.entity.CompanyBudget;
import com.example.ujianspringbootweek4.repository.CompanyBudgetRepository;

@Service
public class CompanyBudgetService {
	
	@Autowired
	private CompanyBudgetRepository companyBudgetRepository;
	
	public List<CompanyBudget> saveCompaniesBudget(List<CompanyBudget> budget){
		return companyBudgetRepository.saveAll(budget);
	}
	
	public List<CompanyBudget> findhHighBudget(){
		return companyBudgetRepository.findHighBudget();
	}

}
