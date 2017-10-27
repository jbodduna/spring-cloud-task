package com.example.cloudtask.sink.source;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SampleSinkApplication {
    Logger logger = LoggerFactory.getLogger(SampleSinkApplication.class);

    public static void main(String [] args) {
        SpringApplication.run(SampleSinkApplication.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void logSink(Object input){
        logger.info("received message123s :" + input);
    }

}
