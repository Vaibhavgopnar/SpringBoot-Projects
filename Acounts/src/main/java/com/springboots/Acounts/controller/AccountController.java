package com.springboots.Acounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboots.Acounts.model.AccountModel;
import com.springboots.Acounts.repository.AccountRepository;

@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	@PostMapping("/accounts")
	public AccountModel getAccountDetails(@RequestBody AccountModel customer) {
		
		AccountModel accounts = accountRepository.findByCustomerID(customer.getCustomerId());
		return accounts;
	}
}
