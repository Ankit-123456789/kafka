package com.gigatorb.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Consumer")
    public void consume(String message)
    {
         System.out.println("message Consume= "+message);
    }
}
