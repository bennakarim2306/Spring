package com.example.demo.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {

    @KafkaListener(topics = "myTopic",groupId = "baeldung")
    public void receive(String message) {
        System.out.println("received message: " + message);
    }

}
