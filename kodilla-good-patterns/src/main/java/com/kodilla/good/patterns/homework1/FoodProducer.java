package com.kodilla.good.patterns.homework1;

import java.util.Map;

public interface FoodProducer {
    String getProducerInfo();
    Map<Product, Integer> getAvailableProducts();
}
