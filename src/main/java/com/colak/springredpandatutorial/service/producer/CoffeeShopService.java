package com.colak.springredpandatutorial.service.producer;

import com.colak.springredpandatutorial.config.Constants;
import com.colak.springredpandatutorial.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CoffeeShopService {

    private final KafkaTemplate<String, Order> kafkaTemplate;

    public void sendOrder(Order order) {
        kafkaTemplate.send(Constants.TOPIC, order.getOrderId(), order);
    }
}
