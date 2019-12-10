package com.microservices.BankAccount.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.microservices.BankAccount.app.imple.BankAccountServiceImpl;
import com.microservices.BankAccount.app.model.BankAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bankaccount")
public class BankAccountController {

	@Autowired
	BankAccountServiceImpl cuentabancaria;
	
	@GetMapping("/all")
	public Flux<BankAccount> findAll(){
		return cuentabancaria.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<BankAccount> getById(@PathVariable String id){
		return cuentabancaria.findById(id);
	}
	
	@GetMapping("delete/{id}")
	public Mono<BankAccount>deleteById(@PathVariable String id){
		return cuentabancaria.findById(id)
				.switchIfEmpty(Mono.error(new Exception("Client not found")));
	} 
	@GetMapping("upadate/{id}")
	public Mono<BankAccount> updateClient(@PathVariable String Id) {
		 return cuentabancaria.findById(Id)
		   .flatMap(cuentabancaria::save)
		   .switchIfEmpty(Mono.error(new Exception("bank account not found")));
		}
	
}
