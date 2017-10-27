package com.example.cloudtask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
public class CloudTaskApplication {
	Logger Log = LoggerFactory.getLogger(CloudTaskApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudTaskApplication.class, args);
	}



}
