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
@Table(name= "company")
public class Company {
	
	@Id
	@GeneratedValue
	private int company_id;
	private String company_name;
	private String company_address;

}
