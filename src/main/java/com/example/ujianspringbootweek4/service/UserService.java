package com.example.ujianspringbootweek4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ujianspringbootweek4.entity.User;
import com.example.ujianspringbootweek4.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> saveUsers(List<User> user){
		return userRepository.saveAll(user);
		
	}
	
	public List<User> getUserByCompanyId(int company_id) {
		return userRepository.findUserByCompanyid(company_id);
	}
	
	public List<User> findByName(String user_name){
		return userRepository.findByName(user_name);
	}
	
}
