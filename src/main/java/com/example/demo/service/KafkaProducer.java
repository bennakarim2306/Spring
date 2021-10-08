package com.example.demo.service;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Component
public class KafkaProducer {

    @Value("${kafka.topic}")
    private String TOPIC;

    private KafkaTemplate<String, String> kafkaTemplate = new KafkaTemplate<>(producerFactory());


    public KafkaProducer() {
    }

    public void send(String message) {
        System.out.println("Producer sending msg: " + message + " for Topic " + TOPIC);
        System.out.println("KafkaTemplate is: " + kafkaTemplate.toString());
        this.kafkaTemplate.send(TOPIC, message);
        System.out.println("Sending DONE");
    }

    public ProducerFactory<String, String> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    private Map<String,Object> producerConfigs () {
        Map<String,Object> props = new HashMap<>();
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        return props;
    }
}