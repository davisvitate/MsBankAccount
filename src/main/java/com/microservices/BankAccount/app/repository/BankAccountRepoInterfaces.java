package com.microservices.BankAccount.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.BankAccount.app.model.BankAccount;

@Repository
public interface BankAccountRepoInterfaces extends ReactiveMongoRepository<BankAccount, String>{
	

}
