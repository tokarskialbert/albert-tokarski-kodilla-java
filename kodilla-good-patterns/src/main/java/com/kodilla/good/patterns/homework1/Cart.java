package com.kodilla.good.patterns.homework1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Order> orders = new ArrayList<>();

    public void addProduct(Product product, int quantity){
        orders.add(new Order(product, quantity));
    }

}
