package com.example.cloudtask.orders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(Barista.class)
public class StreamsOrderApplication {
    Logger logger = LoggerFactory.getLogger(StreamsOrderApplication.class);

    public static void main(String [] args) {
        SpringApplication.run(StreamsOrderApplication.class, args);
    }

    @StreamListener(Barista.INPUT)
	public void processOrder(Object order) {
        logger.info("received orders: " + order);
    }

}
