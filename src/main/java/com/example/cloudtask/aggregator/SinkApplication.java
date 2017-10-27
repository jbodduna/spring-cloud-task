package com.example.cloudtask.aggregator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SinkApplication {
    private Logger logger = LoggerFactory.getLogger(SinkApplication.class);

    @ServiceActivator(inputChannel = "testAggregator")
    public void logSink(Object payload){
        logger.info("Recieved - " + payload);
    }
}
