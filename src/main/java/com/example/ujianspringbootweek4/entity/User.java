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
@Table(name= "users")
public class User {
	
	@Id
	@GeneratedValue
	private int user_id;
	private String user_name;
	private String email;
	private String instagram;
	private String company_id;

}
