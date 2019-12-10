package com.microservices.BankAccount.app.model;

import org.springframework.data.annotation.Id;
//import com.microservice.Clients.model.Client;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "bankaccount")
public class BankAccount {
	
	@Id
	private String id;

	@Field("numcuenta")
	private String numcuenta;

	@Field("name")
	private Object client;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumcuenta() {
		return numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	public Object getClient() {
		return client;
	}

	public void setClient(Object client) {
		this.client = client;
	}

	
}
