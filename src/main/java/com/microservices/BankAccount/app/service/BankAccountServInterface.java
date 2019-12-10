package com.microservices.BankAccount.app.service;


import com.microservices.BankAccount.app.model.BankAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BankAccountServInterface {

public Flux<BankAccount> findAll();
	
	public Flux<BankAccount>findAllName();
	
	public Mono<BankAccount> findById(String id);
	
	public Mono<BankAccount> save(BankAccount bk);
	
	public Mono<Void> delete(BankAccount cli);
}

