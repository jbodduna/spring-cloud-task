package com.example.cloudtask.orders;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.MessageBuilder;

public interface Barista {
    String INPUT = "orders";

    @Input
    SubscribableChannel orders();

    @Output
    MessageChannel hotDrinks();

    @Output
    MessageChannel coldDrinks();

    class SendMessage {
        private Source source;

        public SendMessage(Source source) {
            this.source = source;
        }

        public void sayHello(String name) {
            source.output().send(MessageBuilder.withPayload(name).build());
        }

    }
}
