package com.kodilla.good.patterns.homework1;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements FoodProducer, FoodProvider {
    static Map<Product, Integer> products = new HashMap<>();

    public String getProducerInfo() {
        return "ExtraFoodShop company";
    }

    public Map<Product, Integer> getAvailableProducts() {
        return products;
    }

    @Override
    public void process(Cart cart) {

    }
}
