package com.kodilla.good.patterns.homework1;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements FoodProducer {
    static Map<Product, Integer> products = new HashMap<>();

    public String getProducerInfo() {
        return "ExtraFoodShop Company";
    }

    public Map<Product, Integer> getAvailableProducts() {
        return products;
    }
}
