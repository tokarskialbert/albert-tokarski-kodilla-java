package com.kodilla.good.patterns.homework1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Order> orders = new ArrayList<>();

    public void addProduct(FoodProducer foodProducer, Product product, int quantity){
        orders.add(new Order(foodProducer, product, quantity));
    }

    public void processCart() {
        System.out.println("Realizacja zamowienia!");
    }

}
