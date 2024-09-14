package com.Peaqock.wikimedia.Producer.Rest;


import com.Peaqock.wikimedia.Producer.Stream.WikiMediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class WikimediaController {

    private final WikiMediaStreamConsumer wikiMediaStreamConsumer;

    @GetMapping
    public void startPublishing(){
        wikiMediaStreamConsumer.consumeStreamAdPublish();
    }
}
