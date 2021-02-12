package org.sid;

import org.sid.service.repositories.AccountRepository;
import org.sid.service.repositories.TransactionRepository;
import org.sid.service.feign.ClientRestClient;
import org.sid.service.model.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
/*	   @Bean
    CommandLineRunner start(AccountRepository accountRepository,
                            TransactionRepository transactionRepository,
                            ClientRestClient clientRestClient
                            
    ){
        return args ->{

            Client customer = clientRestClient.getCustomerById(1L);
            System.out.println("--------------------------------");
            System.out.println(customer.getId());
            System.out.println(customer.getName());
            System.out.println(customer.getEmail());

        };
}*/
}
