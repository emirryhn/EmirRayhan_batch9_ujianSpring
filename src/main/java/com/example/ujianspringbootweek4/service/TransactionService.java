package com.example.ujianspringbootweek4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringbootweek4.entity.Transaction;
import com.example.ujianspringbootweek4.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
		
	}
	
	public List<Transaction> getTransactionType(String type){
		return transactionRepository.getTransactionType(type);
	}
	
	
}
