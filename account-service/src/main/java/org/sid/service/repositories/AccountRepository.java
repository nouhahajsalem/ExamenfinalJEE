package org.sid.service.repositories;

import java.util.List;

import org.sid.entities.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sun.image.codec.jpeg.JPEGDecodeParam;
@RepositoryRestResource
public interface AccountRepository extends JpaRepository<Account,Long> {
	
}


