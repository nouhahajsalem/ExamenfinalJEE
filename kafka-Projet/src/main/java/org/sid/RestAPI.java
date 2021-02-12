package org.sid;

import java.util.Date;

import org.sid.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("kafka")
public class RestAPI {
@Autowired
private KafkaTemplate<Integer, Transaction> kafkaTemplate;
private String topic="test13";

@GetMapping("/publish/{message}")
public String publishMessage(@PathVariable String message){ 

	kafkaTemplate.send(topic,new Transaction(1L,33L,new Date(),5500L,message));
	return "Trasaction  Published with succesfuly";
}

}

