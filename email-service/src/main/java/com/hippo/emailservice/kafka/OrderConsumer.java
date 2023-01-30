package com.hippo.emailservice.kafka;

import com.hippo.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);
    @KafkaListener(
            topics="${spring.kafka.topic.name}",
            groupId="${spring.kafka.consumer.group-id}"
    )
    public void consumer(OrderEvent event){
        LOGGER.info(String.format(">>> ORDER event recieved in emailService => \n\t%s",event.toString()));

        // send an email to the customer

    }
}