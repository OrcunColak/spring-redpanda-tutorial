package com.colak.springredpandatutorial.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {

    private String product;
    private String name;
    private String orderId;
}
