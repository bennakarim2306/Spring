package com.example.demo.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;


@Service
public class KafkaConsumer {

    public CountDownLatch getLatch() {
        return latch;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    private CountDownLatch latch = new CountDownLatch(1);


    @KafkaListener(topics = "${kafka.topic}",groupId = "baeldung")
    public void receive(String message) {
        System.out.println("received message: " + message);
    }

}
