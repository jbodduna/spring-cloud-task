package com.example.cloudtask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CloudTaskApplication.class)
public class CloudTaskApplicationTests {

	@Autowired
	private Sink sink;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(this.sink.input());
	}

}
