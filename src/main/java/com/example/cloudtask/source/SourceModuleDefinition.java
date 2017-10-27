package com.example.cloudtask.source;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@EnableBinding(Source.class)
public class SourceModuleDefinition {

    @Bean
    public MessageSource<String> timerMessageSource() {
        return () -> new GenericMessage<String>("new message :" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
