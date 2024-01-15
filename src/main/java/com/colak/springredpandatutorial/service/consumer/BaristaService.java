package com.colak.springredpandatutorial.service.consumer;

import com.colak.springredpandatutorial.config.Constants;
import com.colak.springredpandatutorial.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BaristaService {

    @KafkaListener(topics = Constants.TOPIC, groupId = Constants.GROUP_ID)
    public void process(Order order) {
        log.info("Order received {}" , order);
    }
}
