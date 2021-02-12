package org.sid.demo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.sid.model.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.json.JsonMapper;
@Service


public class KafkaConsumer {
@KafkaListener(topics = "test13",groupId = "sample_consumer")
public void onMessage(ConsumerRecord<String,String> message)throws Exception{
	Transaction employe=employee(message.value());
	System.out.println("Receiving message key=>"+message.key()+"" +
" , Value=>"+employe.toString());
}


private Transaction employee(String jsonEmploye) throws Exception {
	JsonMapper jsonMapper=new JsonMapper();
	Transaction employe=jsonMapper.readValue(jsonEmploye,Transaction.class);
    return employe;
}
}
