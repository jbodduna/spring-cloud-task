package com.example.cloudtask.aggregator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.aggregate.AggregateApplicationBuilder;

@SpringBootApplication
public class SampleAggregateApplication {

    public static void main(String [] args) {
        new AggregateApplicationBuilder()
               .from(SourceApplication.class).args("--fixedDelay=5000")
               .via(ProcessorApplication.class).namespace("processor-1")
               .to(SinkApplication.class).args("--debug=true")
               .run(args);
    }
}
