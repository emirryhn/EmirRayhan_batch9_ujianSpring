package com.example.ujianspringbootweek4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringbootweek4.entity.Transaction;
import com.example.ujianspringbootweek4.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	public TransactionService transactionService;
	
	@PostMapping("/saveTransaction")
	public Transaction saveTransaction(@RequestBody Transaction transaction) {
		return transactionService.saveTransaction(transaction);
	}
	
	@GetMapping("/getType/{type}")
	public List<Transaction> getTransactionType(@PathVariable String type){
		return transactionService.getTransactionType(type);
	}
}
