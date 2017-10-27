package com.example.cloudtask.aggregator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;

@SpringBootApplication
@EnableBinding(Processor.class)
public class ProcessorApplication {
    Logger loggger = LoggerFactory.getLogger(ProcessorApplication.class);

    @Transformer(inputChannel = "testAggregator", outputChannel = "testAggregator")
    public String loggerSink(String payload) {
        loggger.info("processor being invoked");
        return payload.toUpperCase();
    }
}
