package org.sid.service.feign;

import org.sid.service.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="Client-SERVICE")
public interface ClientRestClient {
	
	@RequestMapping(method = RequestMethod.GET, value="/clients/{id}", produces = "application/json")
    Client getClientById(@PathVariable("id") Long id);

}

