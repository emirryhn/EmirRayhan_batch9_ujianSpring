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
@Table(name= "transactions")
public class Transaction {
	
	@Id
	@GeneratedValue
	private int transaction_id;
	private String type;
	private int user_id;
	private int company_id;
	private int amount;
//	private date transaction_date;

}
