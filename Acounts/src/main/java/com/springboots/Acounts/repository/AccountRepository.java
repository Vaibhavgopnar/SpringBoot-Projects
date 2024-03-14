package com.springboots.Acounts.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboots.Acounts.model.AccountModel;

public interface AccountRepository extends CrudRepository<AccountModel, Long> {

	AccountModel findByCustomerID(int customerId);
}
