package com.microservices.BankAccount.app.imple;

import org.springframework.stereotype.Service;

import com.microservices.BankAccount.app.model.BankAccount;
import com.microservices.BankAccount.app.service.BankAccountServInterface;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BankAccountServiceImpl implements BankAccountServInterface {

	@Override
	public Flux<BankAccount> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<BankAccount> findAllName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<BankAccount> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<BankAccount> save(BankAccount bk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> delete(BankAccount cli) {
		// TODO Auto-generated method stub
		return null;
	}

}
