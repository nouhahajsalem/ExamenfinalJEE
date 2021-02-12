package org.sid.service.web;

import org.sid.service.repositories.AccountRepository;
import org.sid.service.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.sid.entities.Account;
import org.sid.service.feign.ClientRestClient;
@RestController
public class AccountControler {
	@Autowired
    private AccountRepository accountRepository;
	private TransactionRepository transactionRepository;
	
	@Autowired
	 private ClientRestClient clientRestController;
	
	
/*	 @GetMapping("/accounts/full/{id}")
	    public Account getBill(@PathVariable(name = "id") Long id){
	        Account account=accountRepository.findById(id).get();
	        account.setClient(clientRestController.getClientById(account.getClientID()));
	        account.setTransactions(transactionRepository.findByTransactionId(id));
	        return account;
	    }*/
}



