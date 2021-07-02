package com.example.ujianspringbootweek4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringbootweek4.entity.Company;
import com.example.ujianspringbootweek4.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> saveCompanies(List<Company> company){
		return companyRepository.saveAll(company);
	}
	
	public List<Company> findCompanyByAddress(String company_address){
		return companyRepository.findCompanyByAddress(company_address);
	}
	
	
}
