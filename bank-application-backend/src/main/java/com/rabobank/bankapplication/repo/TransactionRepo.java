package com.rabobank.bankapplication.repo;

import com.rabobank.bankapplication.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
    List<Transaction> findTransactionsByAccountId(Long accountId);
}
