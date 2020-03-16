package com.kodilla.good.patterns.homework1;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements FoodProducer{
    static Map<Product, Integer> products = new HashMap<>();

    @Override
    public String getProducerInfo() {
        return "GlutenFreeShop Company";
    }

    @Override
    public Map<Product, Integer> getAvailableProducts() {
        return products;
    }
}
