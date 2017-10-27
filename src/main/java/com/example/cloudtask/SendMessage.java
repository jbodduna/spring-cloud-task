package com.example.cloudtask;


import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

public class SendMessage {
    private Source source;

    public SendMessage(Source source) {
        this.source = source;
    }

    public void sayHello(String name) {
        source.output().send(MessageBuilder.withPayload(name).build());
    }

}
