package com.example.ujianspringbootweek4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringbootweek4.entity.Company;
import com.example.ujianspringbootweek4.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/saveCompanies")
	public List<Company> saveCompanies(@RequestBody List<Company> company){
		return companyService.saveCompanies(company);
	}
	
	@GetMapping("/findCompany/{company_address}")
	public List<Company> findCompanyByAddress(@PathVariable String company_address){
		return companyService.findCompanyByAddress(company_address);
	}
	
}
