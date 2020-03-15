package com.kodilla.good.patterns.homework1;

public class Order {
    Product product;
    int productQuantity;

    public Order(Product product, int productQuantity) {
        this.product = product;
        this.productQuantity = productQuantity;
    }
}