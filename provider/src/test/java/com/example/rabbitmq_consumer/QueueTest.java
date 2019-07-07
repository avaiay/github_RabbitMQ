package com.example.rabbitmq_consumer;

import com.example.rabbitmq_provider.RabbitmqApplication;
import com.example.rabbitmq_provider.bean.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= RabbitmqApplication.class)
public class QueueTest {

    @Autowired
    private Sender sender;

    @Test
    public void test() throws Exception{
        while (true){
            Thread.sleep(1000);
            this.sender.send("hello rabbitmq_consumer");
        }

    }
}