package com.example.ujianspringbootweek4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ujianspringbootweek4.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {


	@Query(value="SELECT * FROM transactions WHERE type = ?1", nativeQuery = true)
	public List<Transaction> getTransactionType(String type);
}
