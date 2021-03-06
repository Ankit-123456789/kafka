package com.gigatorb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
     private KafkaTemplate<String,String> kafkaTemplate;
     String KafkaTopic="Kafka_Consumer";

     public void send(String message) {
        kafkaTemplate.send(KafkaTopic,message);
    }

}