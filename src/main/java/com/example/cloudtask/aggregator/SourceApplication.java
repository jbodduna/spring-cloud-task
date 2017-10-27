package com.example.cloudtask.aggregator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@EnableBinding(Source.class)
public class SourceApplication {

    @Bean
    @InboundChannelAdapter(value = "testAggregator")
    public MessageSource<String> timerMessageSource() {
        return () -> new GenericMessage<>("Source:" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    }

}
