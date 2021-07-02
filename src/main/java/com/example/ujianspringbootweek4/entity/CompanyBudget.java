package com.example.ujianspringbootweek4.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "company_budget")
public class CompanyBudget {
	
	@Id
	@GeneratedValue
	private int company_budget_id;
	private int company_id;
	private int amount;

}
