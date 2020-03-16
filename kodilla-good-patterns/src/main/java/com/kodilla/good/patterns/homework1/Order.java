package com.kodilla.good.patterns.homework1;

import java.util.Map;
import java.util.Scanner;

public class Order {
    FoodProducer foodProducer;
    Product product;
    int productQuantity;

    public Order(FoodProducer foodProducer, Product product, int productQuantity) {
        this.foodProducer = foodProducer;
        this.product = product;
        this.productQuantity = productQuantity;
    }
}
