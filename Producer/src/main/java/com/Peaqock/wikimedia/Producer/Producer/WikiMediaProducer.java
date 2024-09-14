package com.Peaqock.wikimedia.Producer.Producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikiMediaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg){
        //log.info(String.format("Sending message to ImaMz::%s",msg));
        kafkaTemplate.send("wikiTopic",msg);
    }
}
