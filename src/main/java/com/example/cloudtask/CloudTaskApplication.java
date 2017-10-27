package com.example.cloudtask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding({Sink.class, Barista.class})
public class CloudTaskApplication {
	Logger Log = LoggerFactory.getLogger(CloudTaskApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudTaskApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void logSink(Object input){
		Log.info("received message123s :" + input);
	}

//	@StreamListener(Barista.INPUT)
//	public void processOrder(Object order){
//		Log.info("received orders: " + order);
//	}

//	@StreamListener
//	@Output("hotDrinks")
//	public void receiveOrders(@Input(Barista.INPUT) Flux input,
//							  @Output("hotOrders")FluxSender output){
//		// return input.map(s -> s.toUpperCase());
//		output.send(input.map(s -> s.toUpperCase()));
//	}

}
