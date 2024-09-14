package com.Peaqock.wikimedia.Consumer.Consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class WikiMediaConsumer {

    @KafkaListener(topics = "wikiTopic", groupId = "myGroup")
    public void consumeMessage(String message){
        log.info(String.format("Consuming the message from wikiTopic topic :: %s",message));
    }
}
