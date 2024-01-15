package com.colak.springredpandatutorial.service.producer;

import com.colak.springredpandatutorial.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoffeeShopServiceTest {

    @Autowired
    private CoffeeShopService coffeeShopService;

    @Test
    void sendOrder() {
        Order order = new Order();
        order.setOrderId("1");
        order.setName("order1");
        order.setProduct("product1");
        coffeeShopService.sendOrder(order);
    }

}
