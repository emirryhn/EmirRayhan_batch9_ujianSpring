package com.example.ujianspringbootweek4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ujianspringbootweek4.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

	@Query(value= "SELECT * FROM `company` where company_address= ?1 ", nativeQuery = true)
	public List<Company> findCompanyByAddress(String company_address);
	
	
}
