package org.sid.service.repositories;


import java.util.List;

import org.sid.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@RepositoryRestResource
public interface TransactionRepository extends JpaRepository<Transaction,Long>{
	// List<Transaction> findByTransactionId(Long transID);
}

