package com.example.demo.controller;

import com.example.demo.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {


    @Autowired
    private KafkaProducer producer;

    @PostMapping(value="/post")
    public void sendMessage(@RequestParam("msg") String msg) {
        System.out.println("Controller received msg + " + msg);
        producer.send(msg);
    }
}
