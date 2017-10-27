package com.example.cloudtask.sink.source;

import com.example.cloudtask.aggregator.SampleAggregateApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleSinkApplication.class)
public class SampleSinkApplicationTest {

    @Autowired
    private Sink sink;

    @Test
    public void logSinkTest() {
        Assert.assertNotNull(this.sink.input());
    }

}