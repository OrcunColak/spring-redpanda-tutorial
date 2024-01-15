package com.colak.springredpandatutorial.controller.producer;

import com.colak.springredpandatutorial.model.Order;
import com.colak.springredpandatutorial.service.producer.CoffeeShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/coffeeshop")
public class CoffeeShopController {

    private final CoffeeShopService coffeeshopService;

    @PostMapping("/orders")
    public String sendOrder(@RequestBody Order order) {
        try {
            coffeeshopService.sendOrder(order);
            return "\nOrder sent: " + order.toString();
        } catch (Exception e) {
            return "\nException: " + e.getMessage();
        }
    }
}
