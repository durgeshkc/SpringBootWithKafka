package com.stackroute.kafka.springbootwithkafkaconsumer.listener;

import com.stackroute.kafka.springbootwithkafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example_string", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


//    @KafkaListener(topics = "Kafka_Example_json_trial", groupId = "group_json",
//            containerFactory = "userKafkaListenerFactory")
//    public void consumeJson(User user) {
//        System.out.println("Consumed JSON Message: " + user);
//    }
}